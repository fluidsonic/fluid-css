@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface LetterSpacing : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val normal: LetterSpacing
			get() = unsafe("normal")


		public inline fun unsafe(value: String): LetterSpacing =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : LetterSpacing, CssVariable<LetterSpacing>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.letterSpacing(value: LetterSpacing) {
	property(letterSpacing, value)
}


@Suppress("unused")
public inline val CssProperties.letterSpacing: CssProperty<LetterSpacing>
	get() = CssProperty.unsafe("letter-spacing")
