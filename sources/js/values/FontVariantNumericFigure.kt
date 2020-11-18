@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericFigure : CssValue {

	public companion object {

		public val liningNums: FontVariantNumericFigure = FontVariantNumericFigure("lining-nums")
		public val oldstyleNums: FontVariantNumericFigure = FontVariantNumericFigure("oldstyle-nums")
	}
}


private class FontVariantNumericFigureImpl(value: String) : CssValueBase(value), FontVariantNumericFigure


@Suppress("FunctionName")
public fun FontVariantNumericFigure(value: String): FontVariantNumericFigure =
	FontVariantNumericFigureImpl(value)
