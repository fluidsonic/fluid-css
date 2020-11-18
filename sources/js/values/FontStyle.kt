@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontStyleOrGlobal : CssValue
public interface FontStyle : FontStyleOrGlobal {

	public companion object {

		public val italic: FontStyle = FontStyle("italic")
		public val normal: FontStyle = FontStyle("normal")
		public val oblique: FontStyle = FontStyle("oblique")

		public fun oblique(angle: Angle): FontStyle =
			FontStyle("oblique $angle")
	}
}


private class FontStyleImpl(value: String) : CssValueBase(value), FontStyle


@Suppress("FunctionName")
public fun FontStyle(value: String): FontStyle =
	FontStyleImpl(value)


public inline fun CssDeclarationBlockBuilder.fontStyle(value: FontStyle) {
	property(CssProperty.fontStyle, value)
}


public inline fun CssDeclarationBlockBuilder.fontStyle(value: FontStyleOrGlobal) {
	property(CssProperty.fontStyle, value)
}


public inline fun CssDeclarationBlockBuilder.fontStyle(value: GlobalValue) {
	property(CssProperty.fontStyle, value)
}


public inline fun CssDeclarationBlockBuilder.fontStyle(value: CustomCssProperty<out FontStyleOrGlobal>) {
	property(CssProperty.fontStyle, value)
}


public inline val CssProperty.Companion.fontStyle: CssProperty get() = CssProperty("font-style")
