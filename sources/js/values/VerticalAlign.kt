@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface VerticalAlign : CssValue {

	public companion object {

		public val baseline: VerticalAlign = VerticalAlign("baseline")
		public val bottom: VerticalAlign = VerticalAlign("bottom")
		public val middle: VerticalAlign = VerticalAlign("middle")
		public val sub: VerticalAlign = VerticalAlign("sub")
		public val `super`: VerticalAlign = VerticalAlign("super")
		public val textBottom: VerticalAlign = VerticalAlign("text-bottom")
		public val textTop: VerticalAlign = VerticalAlign("text-top")
		public val top: VerticalAlign = VerticalAlign("top")
	}
}


private class VerticalAlignImpl(value: String) : CssValueBase(value), VerticalAlign


@Suppress("FunctionName")
public fun VerticalAlign(value: String): VerticalAlign =
	VerticalAlignImpl(value)


public inline fun CssDeclarationBlockBuilder.verticalAlign(value: VerticalAlign) {
	property(CssProperty.verticalAlign, value)
}


public inline fun CssDeclarationBlockBuilder.verticalAlign(value: GlobalValue) {
	property(CssProperty.verticalAlign, value)
}


public inline fun CssDeclarationBlockBuilder.verticalAlign(value: CustomCssProperty<out VerticalAlign>) {
	property(CssProperty.verticalAlign, value)
}


public inline val CssProperty.Companion.verticalAlign: CssProperty get() = CssProperty("vertical-align")
