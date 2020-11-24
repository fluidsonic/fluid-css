package io.fluidsonic.css

import kotlin.properties.*
import kotlin.reflect.*
import kotlinx.browser.*
import org.w3c.dom.*


public typealias StyleBuilder = CssDeclarationBlockBuilder.Hierarchical


public abstract class StyleSheet(
	private val name: String? = null,
) {

	private val pendingFontFaces = mutableListOf<() -> String>()
	private val pendingKeyframes = mutableListOf<() -> String>()
	private val pendingStyles = mutableListOf<Style>()

	public var isInjected: Boolean = false
		private set


	@CssDsl
	public open fun fontFace(declarations: FontFaceBuilder.() -> Unit) {
		pendingFontFaces += { CssPrinter.default().print(with(FontFaceBuilder.default().apply(declarations)) { Unit.build() }) }
	}


	public open fun generateClassName(sheetName: String?, localName: String?): String =
		generateDefaultName(sheetName, localName)


	public open fun generateKeyframeName(sheetName: String?, localName: String?): String =
		generateDefaultName(sheetName, localName)


	@CssDsl
	public open fun global(build: StyleBuilder.() -> Unit): Style.Global =
		LazyGlobalStyle(
			build = build,
			sheet = this@StyleSheet
		)
			.also(pendingStyles::add)


	@CssDsl
	public open fun keyframes(build: KeyframesBuilder.() -> Unit): PropertyDelegateProvider<StyleSheet, ReadOnlyProperty<StyleSheet, String>> =
		PropertyDelegateProvider { _, property ->
			check(!isInjected) { "Cannot add more keyframes after the stylesheet has been injected." }

			val name = generateDefaultName(sheetName = name, localName = property.name)

			pendingKeyframes += { CssPrinter.default().print(with(KeyframesBuilder.default(name = name).apply(build)) { Unit.build() }) }

			ReadOnlyProperty { _, _ -> name }
		}


	public open fun inject() {
		if (isInjected)
			return

		val head = document.head ?: return

		isInjected = true

		val css = CssDeclarationBlockBuilder.default()
			.apply {
				for (style in pendingStyles)
					style.injectTo(this)
			}
			.let { CssPrinter.default().print(with(it) { Unit.build() }) }
			.let { styles ->
				if (pendingFontFaces.isNotEmpty() || pendingKeyframes.isNotEmpty())
					buildString {
						for (fontFace in pendingFontFaces)
							append(fontFace())

						for (keyframe in pendingKeyframes)
							append(keyframe())

						append(styles)
					}
				else
					styles
			}
			.let { stylis("", it) }

		pendingKeyframes.clear()
		pendingStyles.clear()

		val style = document.createElement("style").unsafeCast<HTMLStyleElement>()
		if (js("process.env.NODE_ENV !== 'production'").unsafeCast<Boolean>() && name != null)
			style.dataset["name"] = name

		style.appendChild(document.createTextNode(css))

		head.insertAfter(style, head.children.lastOrNull { it.tagName == "STYLE" })
	}


	@CssDsl
	public open fun marker(): PropertyDelegateProvider<StyleSheet, Style.Local> =
		style {}


	@CssDsl
	public open fun style(build: StyleBuilder.() -> Unit): PropertyDelegateProvider<StyleSheet, Style.Local> =
		PropertyDelegateProvider { _, property ->
			check(!isInjected) { "Cannot add more styles after the stylesheet has been injected." }

			LazyLocalStyle(
				build = build,
				className = generateClassName(sheetName = name, localName = property.name),
				sheet = this@StyleSheet
			)
				.also(pendingStyles::add)
		}


	public companion object {

		private var nextId = 1
		private val stylis = run {
			js("Stylis = Stylis.default") // https://youtrack.jetbrains.com/issue/KT-41650

			Stylis()
		}


		public fun generateDefaultName(sheetName: String?, localName: String?): String {
			if (js("process.env.NODE_ENV === 'production'").unsafeCast<Boolean>())
				return "_${nextId++}"

			return buildString {
				append("_")
				append(nextId++)
				append("-")
				append(sheetName ?: "unnamed")
				append("-")
				append(localName ?: "unnamed")
			}
		}
	}
}


public interface Style {

	public fun inject()
	public fun injectTo(builder: StyleBuilder)


	public companion object;


	public interface Global : Style


	public interface Local : Style, ReadOnlyProperty<StyleSheet, String> {

		public val className: String

		override fun toString(): String
	}
}


private class LazyGlobalStyle(
	private var build: (StyleBuilder.() -> Unit)?,
	private val sheet: StyleSheet,
) : Style.Global {

	override fun inject() =
		sheet.inject()


	override fun injectTo(builder: StyleBuilder) {
		build?.invoke(builder)
		build = null
	}


	override fun toString() =
		"<global>"
}


private class LazyLocalStyle(
	private var build: (StyleBuilder.() -> Unit)?,
	override val className: String,
	private val sheet: StyleSheet,
) : Style.Local {

	override fun getValue(thisRef: StyleSheet, property: KProperty<*>): String =
		toString()


	override fun inject() =
		sheet.inject()


	override fun injectTo(builder: StyleBuilder) {
		val build = build ?: return
		this.build = null

		with(builder) {
			".$className" {
				build()
			}
		}
	}


	override fun toString(): String {
		inject()

		return className
	}
}
