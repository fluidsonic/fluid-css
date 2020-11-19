@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexBasis : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: FlexBasis = raw("auto")


		@CssDsl
		public val content: FlexBasis = raw("content")

		@CssDsl
		public val fill: FlexBasis = raw("fill")

		@CssDsl
		public val fitContent: FlexBasis = raw("fit-content")

		@CssDsl
		public val maxContent: FlexBasis = raw("max-content")

		@CssDsl
		public val minContent: FlexBasis = raw("min-content")


		public fun raw(value: String): FlexBasis =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FlexBasis, CssVariable<FlexBasis>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasis) {
	property(flexBasis, value)
}


@Suppress("unused")
public inline val CssProperties.flexBasis: CssProperty<FlexBasis>
	get() = CssProperty("flex-basis")
