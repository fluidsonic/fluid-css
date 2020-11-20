@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface VerticalAlign : CssValue, Internal {

	public companion object {

		@CssDsl
		public val baseline: VerticalAlign = raw("baseline")

		@CssDsl
		public val bottom: VerticalAlign = raw("bottom")

		@CssDsl
		public val middle: VerticalAlign = raw("middle")

		@CssDsl
		public val sub: VerticalAlign = raw("sub")

		@CssDsl
		public val `super`: VerticalAlign = raw("super")

		@CssDsl
		public val textBottom: VerticalAlign = raw("text-bottom")

		@CssDsl
		public val textTop: VerticalAlign = raw("text-top")

		@CssDsl
		public val top: VerticalAlign = raw("top")


		public fun raw(value: String): VerticalAlign =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : VerticalAlign, CssVariable<VerticalAlign>
}


@CssDsl
public fun CssDeclarationBlockBuilder.verticalAlign(value: VerticalAlign) {
	property(verticalAlign, value)
}


@Suppress("unused")
public val CssProperties.verticalAlign: CssProperty<VerticalAlign>
	get() = CssProperty("vertical-align")
