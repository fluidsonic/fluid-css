@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `letter-spacing` value. */
@JsName("0;0")
public external interface LetterSpacing : CssValue {

	public companion object;


	/** A [LetterSpacing] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : LetterSpacing, CssVariable<LetterSpacing>
}


/** The CSS `normal` letter-spacing value. */
@CssDsl
public inline val LetterSpacing.Companion.normal: LetterSpacing
	get() = unsafe("normal")


/** Creates a [LetterSpacing] from an unchecked string [value]. */
public inline fun LetterSpacing.Companion.unsafe(value: String): LetterSpacing =
	CssValue.unsafe(value)


/** Creates a [LetterSpacing] backed by a CSS variable with the given [name]. */
public inline fun LetterSpacing.Companion.variable(name: String): LetterSpacing.Variable =
	CssVariable.unsafe(name)


/** Sets the `letter-spacing` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.letterSpacing(value: LetterSpacing) {
	property(letterSpacing, value)
}


/** The `letter-spacing` CSS property. */
@Suppress("unused")
public inline val CssProperties.letterSpacing: CssProperty<LetterSpacing>
	get() = CssProperty.unsafe("letter-spacing")
