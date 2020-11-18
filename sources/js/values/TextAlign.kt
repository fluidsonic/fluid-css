@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextAlignOrGlobal : CssValue
public interface TextAlign : TextAlignOrGlobal {

	public companion object {

		public val center: TextAlign = TextAlign("center")
		public val end: TextAlign = TextAlign("end")
		public val justify: TextAlign = TextAlign("justify")
		public val left: TextAlign = TextAlign("left")
		public val matchParent: TextAlign = TextAlign("match-parent")
		public val right: TextAlign = TextAlign("right")
		public val start: TextAlign = TextAlign("start")
	}
}


private class TextAlignImpl(value: String) : CssValueBase(value), TextAlign


@Suppress("FunctionName")
public fun TextAlign(value: String): TextAlign =
	TextAlignImpl(value)


public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlign) {
	property(CssProperty.textAlign, value)
}


public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlignOrGlobal) {
	property(CssProperty.textAlign, value)
}


public inline fun CssDeclarationBlockBuilder.textAlign(value: GlobalValue) {
	property(CssProperty.textAlign, value)
}


public inline fun CssDeclarationBlockBuilder.textAlign(value: CustomCssProperty<out TextAlignOrGlobal>) {
	property(CssProperty.textAlign, value)
}


public inline val CssProperty.Companion.textAlign: CssProperty get() = CssProperty("text-align")
