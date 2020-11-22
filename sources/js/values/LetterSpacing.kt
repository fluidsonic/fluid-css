@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LetterSpacing : CssValue, Internal {

	public companion object {

		@CssDsl
		public val normal: LetterSpacing = raw("normal")


		public fun raw(value: String): LetterSpacing =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : LetterSpacing, CssVariable<LetterSpacing>
}


@CssDsl
public fun CssDeclarationBlockBuilder.letterSpacing(value: LetterSpacing) {
	property(letterSpacing, value)
}


@Suppress("unused")
public val CssProperties.letterSpacing: CssProperty<LetterSpacing>
	get() = CssProperty("letter-spacing")
