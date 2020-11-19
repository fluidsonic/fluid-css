@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface SizeLimit : CssValue, Internal {

	public companion object {

		@CssDsl
		public val maxContent: SizeLimit = raw("max-content")

		@CssDsl
		public val minContent: SizeLimit = raw("min-content")

		@CssDsl
		public val none: SizeLimit = raw("none")


		@CssDsl
		public fun fitContent(height: LengthOrPercentage): SizeLimit =
			raw("fit-content($height)")


		public fun raw(value: String): SizeLimit =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : SizeLimit, CssVariable<SizeLimit>
}
