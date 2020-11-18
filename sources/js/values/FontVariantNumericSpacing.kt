@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericSpacing : CssValue {

	public companion object {

		public val proportionalNums: FontVariantNumericSpacing = FontVariantNumericSpacing("proportional-nums")
		public val tabularNums: FontVariantNumericSpacing = FontVariantNumericSpacing("tabular-nums")
	}
}


private class FontVariantNumericSpacingImpl(value: String) : CssValueImpl(value), FontVariantNumericSpacing


@Suppress("FunctionName")
public fun FontVariantNumericSpacing(value: String): FontVariantNumericSpacing =
	FontVariantNumericSpacingImpl(value)
