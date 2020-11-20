@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexDirection : CssValue, Internal {

	public companion object {

		@CssDsl
		public val column: FlexDirection = raw("column")

		@CssDsl
		public val columnReverse: FlexDirection = raw("column-reverse")

		@CssDsl
		public val row: FlexDirection = raw("row")

		@CssDsl
		public val rowReverse: FlexDirection = raw("row-reverse")


		public fun raw(value: String): FlexDirection =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FlexDirection, CssVariable<FlexDirection>
}


@CssDsl
public fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirection) {
	property(flexDirection, value)
}


@Suppress("unused")
public val CssProperties.flexDirection: CssProperty<FlexDirection>
	get() = CssProperty("flex-direction")
