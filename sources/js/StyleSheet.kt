package io.fluidsonic.css

import kotlinx.browser.*
import kotlinx.css.*
import org.w3c.dom.*
import kotlin.properties.*
import kotlin.reflect.*


public abstract class StyleSheet(
	private val name: String? = null,
) {

	private val pendingStyles = mutableListOf<Style>()

	public var isInjected: Boolean = false
		private set


	public open fun generateClassName(sheetName: String?, styleName: String?): String =
		generateDefaultClassName(sheetName, styleName)


	public open fun globalStyle(build: CSSBuilder.() -> Unit): Style.Global =
		LazyGlobalStyle(
			build = build,
			sheet = this@StyleSheet
		)
			.also(pendingStyles::add)


	public open fun inject() {
		if (isInjected)
			return

		val head = document.head ?: return

		isInjected = true

		val css = CSSBuilder(allowClasses = false)
			.apply {
				for (style in pendingStyles)
					style.injectTo(this)
			}
			.toString()
			.let { stylis("", it) }

		pendingStyles.clear()

		val style = document.createElement("style") as HTMLStyleElement
		if (js("process.env.NODE_ENV !== 'production'") as Boolean && name != null)
			style.dataset["name"] = name

		style.appendChild(document.createTextNode(css))

		head.insertAfter(style, head.children.lastOrNull { it.tagName == "STYLE" })
	}


	public open fun marker(): PropertyDelegateProvider<StyleSheet, Style.Local> =
		style {}


	public open fun style(build: CSSBuilder.() -> Unit): PropertyDelegateProvider<StyleSheet, Style.Local> =
		PropertyDelegateProvider<StyleSheet, Style.Local> { _, property ->
			check(!isInjected) { "Cannot add more styles after the stylesheet has been injected." }

			LazyLocalStyle(
				build = build,
				className = generateClassName(sheetName = name, styleName = property.name),
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


		public fun generateDefaultClassName(sheetName: String?, styleName: String?): String {
			if (js("process.env.NODE_ENV === 'production'") as Boolean)
				return "_${nextId++}"

			return buildString {
				append("_")
				append(nextId++)
				append("-")
				append(sheetName ?: "unnamed")
				append("-")
				append(styleName ?: "unnamed")
			}
		}
	}
}


public interface Style {

	public fun inject()
	public fun injectTo(builder: CSSBuilder)


	public companion object;


	public interface Global : Style


	public interface Local : Style, ReadOnlyProperty<StyleSheet, String> {

		public val className: String

		override fun toString(): String
	}
}


private class LazyGlobalStyle(
	private var build: (CSSBuilder.() -> Unit)?,
	private val sheet: StyleSheet,
) : Style.Global {

	override fun inject() =
		sheet.inject()


	override fun injectTo(builder: CSSBuilder) {
		build?.invoke(builder)
		build = null
	}


	override fun toString() =
		"<global>"
}


private class LazyLocalStyle(
	private var build: (CSSBuilder.() -> Unit)?,
	override val className: String,
	private val sheet: StyleSheet,
) : Style.Local {

	override fun getValue(thisRef: StyleSheet, property: KProperty<*>): String =
		toString()


	override fun inject() =
		sheet.inject()


	override fun injectTo(builder: CSSBuilder) {
		val build = build ?: return
		this.build = null

		with(builder) {
			".$className"(build)
		}
	}


	override fun toString(): String {
		inject()

		return className
	}
}
