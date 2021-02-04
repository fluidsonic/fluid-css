@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface TextDecorationLine : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: TextDecorationLine
			get() = unsafe("none")


		@CssDsl
		public inline val lineThrough: TextDecorationLine
			get() = unsafe("line-through")

		@CssDsl
		public inline val overline: TextDecorationLine
			get() = unsafe("overline")

		@CssDsl
		public inline val underline: TextDecorationLine
			get() = unsafe("underline")


		public inline fun unsafe(value: String): TextDecorationLine =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextDecorationLine, CssVariable<TextDecorationLine>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLine) {
	property(textDecorationLine, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationLine: CssProperty<TextDecorationLine>
	get() = CssProperty.unsafe("text-decoration-line")
