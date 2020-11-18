@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericFraction : CssValue {

	public companion object {

		public val diagonalFractions: FontVariantNumericFraction = FontVariantNumericFraction("diagonal-fractions")
		public val stackedFractions: FontVariantNumericFraction = FontVariantNumericFraction("stacked-fractions")
	}
}


private class FontVariantNumericFractionImpl(value: String) : CssValueImpl(value), FontVariantNumericFraction


@Suppress("FunctionName")
public fun FontVariantNumericFraction(value: String): FontVariantNumericFraction =
	FontVariantNumericFractionImpl(value)
