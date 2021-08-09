@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface LetterSpacing : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : LetterSpacing, CssVariable<LetterSpacing>
}


@CssDsl
public inline val LetterSpacing.Companion.normal: LetterSpacing
	get() = unsafe("normal")


public inline fun LetterSpacing.Companion.unsafe(value: String): LetterSpacing =
	CssValue.unsafe(value)


public inline fun LetterSpacing.Companion.variable(name: String): LetterSpacing.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.letterSpacing(value: LetterSpacing) {
	property(letterSpacing, value)
}


@Suppress("unused")
public inline val CssProperties.letterSpacing: CssProperty<LetterSpacing>
	get() = CssProperty.unsafe("letter-spacing")
