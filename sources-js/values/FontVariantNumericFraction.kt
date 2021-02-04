@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontVariantNumericFraction : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val diagonalFractions: FontVariantNumericFraction
			get() = unsafe("diagonal-fractions")

		@CssDsl
		public inline val stackedFractions: FontVariantNumericFraction
			get() = unsafe("stacked-fractions")


		public inline fun unsafe(value: String): FontVariantNumericFraction =
			CssValue.unsafe(value)
	}
}
