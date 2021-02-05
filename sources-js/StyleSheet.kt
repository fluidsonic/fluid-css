@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.properties.*
import kotlin.reflect.*
import kotlinx.browser.*
import org.w3c.dom.*


public typealias StyleBuilder = CssDeclarationBlockBuilder.Hierarchical


public abstract class StyleSheet(
	@PublishedApi
	internal val name: String? = null,
) {

	private var injectionPending = false
	private val pendingStyles: Array<StyleBuilder .() -> Unit> = arrayOf()

	internal val pendingRawStyles: Array<() -> String> = arrayOf()


	@PublishedApi
	internal fun add(build: StyleBuilder.() -> Unit) {
		pendingStyles.push(build)

		queueInjection()
	}


	@CssDsl
	public inline fun fontFace(noinline build: FontFaceBuilder.() -> Unit) {
		add(build)
	}


	@CssDsl
	public inline fun global(noinline build: StyleBuilder.() -> Unit) {
		add(build)
	}


	@CssDsl
	public inline fun keyframes(noinline build: KeyframesBuilder.() -> Unit): Style.KeyframeDelegate =
		build.unsafeCast<Style.KeyframeDelegate>()


	private fun inject() {
		injectionPending = false

		val head = document.head ?: return

		val css = CssDeclarationBlockBuilder.default()
			.apply {
				for (style in pendingStyles)
					style()
			}
			.let { CssPrinter.default().print(with(it) { Unit.build() }) }
			.let { styles ->
				if (pendingRawStyles.isNotEmpty())
					buildString {
						for (style in pendingRawStyles)
							append(style())

						append(styles)
					}
				else
					styles
			}
			.let { stylis("", it) }

		pendingRawStyles.clear()
		pendingStyles.clear()

		if (css.isNotEmpty()) {
			val style = document.createElement("style").unsafeCast<HTMLStyleElement>()
			securityNonce?.let { style.setAttribute("nonce", it) }
			if (!isProduction())
				name?.let { style.dataset["name"] = it }

			style.appendChild(document.createTextNode(css))

			head.insertAfter(style, head.children.lastOrNull { it.tagName == "STYLE" })
		}
	}


	@CssDsl
	public inline fun marker(): Style.MarkerDelegate =
		0.unsafeCast<Style.MarkerDelegate>()


	internal fun queueInjection() {
		if (injectionPending)
			return

		injectionPending = true

		window.requestAnimationFrame { inject() }
	}


	@CssDsl
	public inline fun style(build: StyleBuilder.() -> Unit): Style.Delegate =
		build.unsafeCast<Style.Delegate>()
}


public external interface Style {

	public interface Delegate
	public interface KeyframeDelegate
	public interface MarkerDelegate
}


public inline operator fun Style.getValue(thisRef: StyleSheet, property: KProperty<*>): String =
	unsafeCast<String>()


public inline operator fun Style.Delegate.provideDelegate(thisRef: StyleSheet, property: KProperty<*>): Style {
	val name = when {
		isProduction() -> generateClassName()
		else -> thisRef.generateClassName(property.name)
	}

	val build = unsafeCast<StyleBuilder.() -> Unit>()

	thisRef.add {
		".$name"(build)
	}

	return name.unsafeCast<Style>()
}


public inline operator fun Style.KeyframeDelegate.provideDelegate(thisRef: StyleSheet, property: KProperty<*>): Style {
	val name = when {
		isProduction() -> generateClassName()
		else -> thisRef.generateClassName(property.name)
	}

	thisRef.add(name = name, build = unsafeCast<KeyframesBuilder.() -> Unit>())

	return name.unsafeCast<Style>()
}


public inline operator fun Style.MarkerDelegate.provideDelegate(thisRef: StyleSheet, property: KProperty<*>): Style =
	when {
		isProduction() -> generateClassName()
		else -> thisRef.generateClassName(property.name)
	}.unsafeCast<Style>()


private var nextId = 1


@PublishedApi
internal fun generateClassName(): String =
	"_${nextId++}"


@PublishedApi
internal fun StyleSheet.add(build: FontFaceBuilder.() -> Unit) {
	pendingRawStyles.push { CssPrinter.default().print(with(FontFaceBuilder.default().apply(build)) { Unit.build() }) }

	queueInjection()
}


@PublishedApi
internal fun StyleSheet.add(name: String, build: KeyframesBuilder.() -> Unit) {
	pendingRawStyles.push { CssPrinter.default().print(with(KeyframesBuilder.default(name = name).apply(build)) { Unit.build() }) }

	queueInjection()
}


@PublishedApi
internal fun StyleSheet.generateClassName(displayName: String): String =
	buildString {
		append("_")
		append(nextId++)
		append("-")
		append(this@generateClassName.name ?: "unnamed")
		append("-")
		append(displayName)
	}


private val stylis = run {
	js("Stylis = Stylis.default") // https://youtrack.jetbrains.com/issue/KT-41650

	Stylis()
}
