@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontStyle : CssValue, Internal {

	public companion object {

		@CssDsl
		public val italic: FontStyle = raw("italic")

		@CssDsl
		public val normal: FontStyle = raw("normal")

		@CssDsl
		public val oblique: FontStyle = raw("oblique")


		@CssDsl
		public fun oblique(angle: Angle): FontStyle =
			raw("oblique $angle")


		public fun raw(value: String): FontStyle =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FontStyle, CssVariable<FontStyle>
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontStyle(value: FontStyle) {
	property(fontStyle, value)
}


@Suppress("unused")
public val CssProperties.fontStyle: CssProperty<FontStyle>
	get() = CssProperty("font-style")
