@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface Content : CssValue {

	public companion object {

		public fun counter(name: String): Content =
			Content("counter($name)")


		public fun string(value: String): Content =
			Content("'$value'") // FIXME escaping
	}
}


private class ContentImpl(value: String) : CssValueImpl(value), Content


@Suppress("FunctionName")
public fun Content(value: String): Content =
	ContentImpl(value)


public inline fun CssDeclarationBlockBuilder.content(value: Content) {
	property(CssProperty.content, value)
}


public inline fun CssDeclarationBlockBuilder.content(value: GlobalValue) {
	property(CssProperty.content, value)
}


public inline fun CssDeclarationBlockBuilder.content(value: String = "") {
	content(Content.string(value))
}


public inline fun CssDeclarationBlockBuilder.content(value: CustomCssProperty<out Content>) {
	property(CssProperty.content, value)
}


public inline val CssProperty.Companion.content: CssProperty get() = CssProperty("content")
