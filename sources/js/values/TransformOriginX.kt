@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOriginX : CssValue, Internal {

	public companion object {

		@CssDsl
		public val center: TransformOriginX = raw("center")

		@CssDsl
		public val left: TransformOriginX = raw("left")

		@CssDsl
		public val right: TransformOriginX = raw("right")


		public fun raw(value: String): TransformOriginX =
			GenericValue(value)
	}
}
