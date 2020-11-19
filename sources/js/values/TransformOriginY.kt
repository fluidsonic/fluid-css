@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOriginY : CssValue, Internal {

	public companion object {

		@CssDsl
		public val bottom: TransformOriginY = raw("bottom")

		@CssDsl
		public val center: TransformOriginY = raw("center")

		@CssDsl
		public val top: TransformOriginY = raw("top")


		public fun raw(value: String): TransformOriginY =
			GenericValue(value)
	}
}
