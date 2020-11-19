@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Size : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Size = raw("auto")

		@CssDsl
		public val maxContent: Size = raw("max-content")

		@CssDsl
		public val minContent: Size = raw("min-content")


		@CssDsl
		public fun fitContent(height: LengthOrPercentage): Size =
			raw("fit-content($height)")


		public fun raw(value: String): Size =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Size, CssVariable<Size>
}
