@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TransformOriginX : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val center: TransformOriginX
			get() = unsafe("center")

		@CssDsl
		public inline val left: TransformOriginX
			get() = unsafe("left")

		@CssDsl
		public inline val right: TransformOriginX
			get() = unsafe("right")


		public inline fun unsafe(value: String): TransformOriginX =
			CssValue.unsafe(value)
	}
}
