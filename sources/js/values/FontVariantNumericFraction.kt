@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericFraction : CssValue, Internal {

	public companion object {

		@CssDsl
		public val diagonalFractions: FontVariantNumericFraction = raw("diagonal-fractions")

		@CssDsl
		public val stackedFractions: FontVariantNumericFraction = raw("stacked-fractions")


		public fun raw(value: String): FontVariantNumericFraction =
			GenericValue(value)
	}
}
