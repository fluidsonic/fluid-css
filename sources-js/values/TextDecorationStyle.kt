@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TextDecorationStyle : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val dashed: TextDecorationStyle
			get() = unsafe("dashed")

		@CssDsl
		public inline val dotted: TextDecorationStyle
			get() = unsafe("dotted")

		@CssDsl
		public inline val double: TextDecorationStyle
			get() = unsafe("double")

		@CssDsl
		public inline val solid: TextDecorationStyle
			get() = unsafe("solid")

		@CssDsl
		public inline val wavy: TextDecorationStyle
			get() = unsafe("wavy")


		public inline fun unsafe(value: String): TextDecorationStyle =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextDecorationStyle, CssVariable<TextDecorationStyle>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyle) {
	property(textDecorationStyle, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationStyle: CssProperty<TextDecorationStyle>
	get() = CssProperty.unsafe("text-decoration-style")
