@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION",
)

package io.fluidsonic.css


public external interface TextTransform : CssValue {

	public companion object {

		@CssDsl
		public inline val capitalize: TextTransform
			get() = unsafe("capitalize")

		@CssDsl
		public inline val fullSizeKana: TextTransform
			get() = unsafe("full-size-kana")

		@CssDsl
		public inline val fullWidth: TextTransform
			get() = unsafe("full-width")

		@CssDsl
		public inline val lowercase: TextTransform
			get() = unsafe("lowercase")

		@CssDsl
		public inline val none: TextTransform
			get() = unsafe("none")

		@CssDsl
		public inline val uppercase: TextTransform
			get() = unsafe("uppercase")


		public inline fun unsafe(value: String): TextTransform =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextTransform, CssVariable<TextTransform>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textTransform(value: TextTransform) {
	property(textTransform, value)
}


@Suppress("unused")
public inline val CssProperties.textTransform: CssProperty<TextTransform>
	get() = CssProperty.unsafe("text-transform")
