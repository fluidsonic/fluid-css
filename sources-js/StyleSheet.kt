@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.reflect.*
import kotlinx.browser.*
import org.w3c.dom.*


/** Convenience alias for [CssDeclarationBlockBuilder.Hierarchical]. */
public typealias StyleBuilder = CssDeclarationBlockBuilder.Hierarchical


/** Base class for injectable CSS stylesheets. */
public abstract class StyleSheet(
	@PublishedApi
	internal val name: String? = null,
) {

	private val pendingStyles: Array<StyleBuilder .() -> Unit> = arrayOf()

	internal val pendingRawStyles: Array<() -> String> = arrayOf()


	@PublishedApi
	internal fun add(build: StyleBuilder.() -> Unit) {
		pendingStyles.push(build)
	}


	/** Defines a `@font-face` rule within this stylesheet. */
	@CssDsl
	public inline fun fontFace(noinline build: FontFaceBuilder.() -> Unit) {
		add(build)
	}


	/** Defines global (unscoped) styles within this stylesheet. */
	@CssDsl
	public inline fun global(noinline build: StyleBuilder.() -> Unit) {
		add(build)
	}


	/** Injects all pending styles into the document as a `<style>` element. */
	public fun inject() {
		if (pendingRawStyles.isEmpty() && pendingStyles.isEmpty())
			return

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

		if (css.isEmpty())
			return

		val style = document.createElement("style").unsafeCast<HTMLStyleElement>()
		securityNonce?.let { style.setAttribute("nonce", it) }
		if (!isProduction())
			name?.let { style.dataset["name"] = it }

		style.appendChild(document.createTextNode(css))

		val head = checkNotNull(document.head)
		head.insertAfter(style, head.children.lastOrNull { it.tagName == "STYLE" })
	}


	/** Defines a `@keyframes` animation and returns a delegate that provides the animation name. */
	@CssDsl
	public inline fun keyframes(noinline build: KeyframesBuilder.() -> Unit): Style.KeyframeDelegate =
		build.unsafeCast<Style.KeyframeDelegate>()


	/** Creates a CSS class name marker without any associated styles. */
	@CssDsl
	public inline fun marker(): Style.MarkerDelegate =
		0.unsafeCast<Style.MarkerDelegate>()


	/** Defines a scoped CSS style and returns a delegate that provides the generated class name. */
	@CssDsl
	public inline fun style(noinline build: StyleBuilder.() -> Unit): Style.Delegate =
		build.unsafeCast<Style.Delegate>()
}


/** Represents a generated CSS class name or keyframes name. */
public external interface Style {

	/** Property delegate that registers a scoped style and provides its class name. */
	public interface Delegate

	/** Property delegate that registers a `@keyframes` animation and provides its name. */
	public interface KeyframeDelegate

	/** Property delegate that generates a class name without associated styles. */
	public interface MarkerDelegate
}


/** Returns the generated CSS class or keyframes name. */
public inline operator fun Style.getValue(thisRef: StyleSheet, property: KProperty<*>): String =
	unsafeCast<String>()


/** Registers the scoped style with a generated class name and returns a [Style] delegate. */
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


/** Registers the `@keyframes` animation with a generated name and returns a [Style] delegate. */
public inline operator fun Style.KeyframeDelegate.provideDelegate(thisRef: StyleSheet, property: KProperty<*>): Style {
	val name = when {
		isProduction() -> generateClassName()
		else -> thisRef.generateClassName(property.name)
	}

	thisRef.add(name = name, build = unsafeCast<KeyframesBuilder.() -> Unit>())

	return name.unsafeCast<Style>()
}


/** Generates a class name without registering any styles and returns a [Style] delegate. */
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
}


@PublishedApi
internal fun StyleSheet.add(name: String, build: KeyframesBuilder.() -> Unit) {
	pendingRawStyles.push { CssPrinter.default().print(with(KeyframesBuilder.default(name = name).apply(build)) { Unit.build() }) }
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


private val stylis = Stylis()
