@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecorationStyle : CssValue, Internal {

	public companion object {

		@CssDsl
		public val dashed: TextDecorationStyle = raw("dashed")

		@CssDsl
		public val dotted: TextDecorationStyle = raw("dotted")

		@CssDsl
		public val double: TextDecorationStyle = raw("double")

		@CssDsl
		public val solid: TextDecorationStyle = raw("solid")

		@CssDsl
		public val wavy: TextDecorationStyle = raw("wavy")


		public fun raw(value: String): TextDecorationStyle =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TextDecorationStyle, CssVariable<TextDecorationStyle>
}


@CssDsl
public fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyle) {
	property(textDecorationStyle, value)
}


@Suppress("unused")
public val CssProperties.textDecorationStyle: CssProperty<TextDecorationStyle>
	get() = CssProperty("text-decoration-style")
