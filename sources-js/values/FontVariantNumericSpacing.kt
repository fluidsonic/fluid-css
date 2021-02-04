@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontVariantNumericSpacing : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val proportionalNums: FontVariantNumericSpacing
			get() = unsafe("proportional-nums")

		@CssDsl
		public inline val tabularNums: FontVariantNumericSpacing
			get() = unsafe("tabular-nums")


		public inline fun unsafe(value: String): FontVariantNumericSpacing =
			CssValue.unsafe(value)
	}
}
