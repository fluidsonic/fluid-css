@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontSizeOrGlobal : CssValue
public interface FontSize : FontSizeOrGlobal {

	public companion object {

		public val xxSmall: FontSize = FontSize("xx-small")
		public val xSmall: FontSize = FontSize("x-small")
		public val small: FontSize = FontSize("small")
		public val medium: FontSize = FontSize("medium")
		public val large: FontSize = FontSize("large")
		public val xLarge: FontSize = FontSize("x-large")
		public val xxLarge: FontSize = FontSize("xx-large")
		public val xxxLarge: FontSize = FontSize("xxx-large")
	}
}


private class FontSizeImpl(value: String) : CssValueBase(value), FontSize


@Suppress("FunctionName")
public fun FontSize(value: String): FontSize =
	CssValue(value, ::FontSizeImpl)


public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSize) {
	property(CssProperty.fontSize, value)
}


public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSizeOrGlobal) {
	property(CssProperty.fontSize, value)
}


public inline fun CssDeclarationBlockBuilder.fontSize(value: GlobalValue) {
	property(CssProperty.fontSize, value)
}


public inline fun CssDeclarationBlockBuilder.fontSize(value: CustomCssProperty<out FontSizeOrGlobal>) {
	property(CssProperty.fontSize, value)
}


public inline val CssProperty.Companion.fontSize: CssProperty get() = CssProperty("font-size")
