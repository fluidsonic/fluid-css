@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface TextDecorationLine : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: TextDecorationLine = raw("none")


		@CssDsl
		public val lineThrough: TextDecorationLine = raw("line-through")

		@CssDsl
		public val overline: TextDecorationLine = raw("overline")

		@CssDsl
		public val underline: TextDecorationLine = raw("underline")


		public fun raw(value: String): TextDecorationLine =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TextDecorationLine, CssVariable<TextDecorationLine>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLine) {
	property(textDecorationLine, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationLine: CssProperty<TextDecorationLine>
	get() = CssProperty("text-decoration-line")
