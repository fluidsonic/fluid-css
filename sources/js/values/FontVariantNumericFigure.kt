@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontVariantNumericFigure : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val liningNums: FontVariantNumericFigure
			get() = unsafe("lining-nums")

		@CssDsl
		public inline val oldstyleNums: FontVariantNumericFigure
			get() = unsafe("oldstyle-nums")


		public inline fun unsafe(value: String): FontVariantNumericFigure =
			CssValue.unsafe(value)
	}
}
