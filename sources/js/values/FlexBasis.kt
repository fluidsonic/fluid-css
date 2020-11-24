@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FlexBasis : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: FlexBasis
			get() = unsafe("auto")


		@CssDsl
		public inline val content: FlexBasis
			get() = unsafe("content")

		@CssDsl
		public inline val fill: FlexBasis
			get() = unsafe("fill")

		@CssDsl
		public inline val fitContent: FlexBasis
			get() = unsafe("fit-content")

		@CssDsl
		public inline val maxContent: FlexBasis
			get() = unsafe("max-content")

		@CssDsl
		public inline val minContent: FlexBasis
			get() = unsafe("min-content")


		public inline fun unsafe(value: String): FlexBasis =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FlexBasis, CssVariable<FlexBasis>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasis) {
	property(flexBasis, value)
}


@Suppress("unused")
public inline val CssProperties.flexBasis: CssProperty<FlexBasis>
	get() = CssProperty.unsafe("flex-basis")
