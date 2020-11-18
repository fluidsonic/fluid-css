@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecorationStyleOrGlobal : CssValue
public interface TextDecorationStyle : TextDecorationStyleOrGlobal {

	public companion object {

		public val dashed: TextDecorationStyle = TextDecorationStyle("dashed")
		public val dotted: TextDecorationStyle = TextDecorationStyle("dotted")
		public val double: TextDecorationStyle = TextDecorationStyle("double")
		public val solid: TextDecorationStyle = TextDecorationStyle("solid")
		public val wavy: TextDecorationStyle = TextDecorationStyle("wavy")
	}
}


private class TextDecorationStyleImpl(value: String) : CssValueBase(value), TextDecorationStyle


@Suppress("FunctionName")
public fun TextDecorationStyle(value: String): TextDecorationStyle =
	TextDecorationStyleImpl(value)


public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyle) {
	property(CssProperty.textDecorationStyle, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyleOrGlobal) {
	property(CssProperty.textDecorationStyle, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: GlobalValue) {
	property(CssProperty.textDecorationStyle, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: CustomCssProperty<out TextDecorationStyleOrGlobal>) {
	property(CssProperty.textDecorationStyle, value)
}


public inline val CssProperty.Companion.textDecorationStyle: CssProperty get() = CssProperty("text-decoration-style")
