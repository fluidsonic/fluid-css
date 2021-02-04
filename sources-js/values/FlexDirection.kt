@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FlexDirection : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val column: FlexDirection
			get() = unsafe("column")

		@CssDsl
		public inline val columnReverse: FlexDirection
			get() = unsafe("column-reverse")

		@CssDsl
		public inline val row: FlexDirection
			get() = unsafe("row")

		@CssDsl
		public inline val rowReverse: FlexDirection
			get() = unsafe("row-reverse")


		public inline fun unsafe(value: String): FlexDirection =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FlexDirection, CssVariable<FlexDirection>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirection) {
	property(flexDirection, value)
}


@Suppress("unused")
public inline val CssProperties.flexDirection: CssProperty<FlexDirection>
	get() = CssProperty.unsafe("flex-direction")
