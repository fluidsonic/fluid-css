@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericFigure : CssValue, Internal {

	public companion object {

		@CssDsl
		public val liningNums: FontVariantNumericFigure = raw("lining-nums")

		@CssDsl
		public val oldstyleNums: FontVariantNumericFigure = raw("oldstyle-nums")


		public fun raw(value: String): FontVariantNumericFigure =
			GenericValue(value)
	}
}
