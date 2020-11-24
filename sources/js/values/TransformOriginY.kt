@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TransformOriginY : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val bottom: TransformOriginY
			get() = unsafe("bottom")

		@CssDsl
		public inline val center: TransformOriginY
			get() = unsafe("center")

		@CssDsl
		public inline val top: TransformOriginY
			get() = unsafe("top")


		public inline fun unsafe(value: String): TransformOriginY =
			CssValue.unsafe(value)
	}
}
