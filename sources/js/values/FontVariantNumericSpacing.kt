@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericSpacing : CssValue, Internal {

	public companion object {

		@CssDsl
		public val proportionalNums: FontVariantNumericSpacing = raw("proportional-nums")

		@CssDsl
		public val tabularNums: FontVariantNumericSpacing = raw("tabular-nums")


		public fun raw(value: String): FontVariantNumericSpacing =
			GenericValue(value)
	}
}
