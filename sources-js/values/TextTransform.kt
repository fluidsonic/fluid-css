@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextTransform : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextTransform, CssVariable<TextTransform>
}


@CssDsl
public inline val TextTransform.Companion.capitalize: TextTransform
	get() = unsafe("capitalize")

@CssDsl
public inline val TextTransform.Companion.fullSizeKana: TextTransform
	get() = unsafe("full-size-kana")

@CssDsl
public inline val TextTransform.Companion.fullWidth: TextTransform
	get() = unsafe("full-width")

@CssDsl
public inline val TextTransform.Companion.lowercase: TextTransform
	get() = unsafe("lowercase")

@CssDsl
public inline val TextTransform.Companion.none: TextTransform
	get() = unsafe("none")

@CssDsl
public inline val TextTransform.Companion.uppercase: TextTransform
	get() = unsafe("uppercase")


public inline fun TextTransform.Companion.unsafe(value: String): TextTransform =
	CssValue.unsafe(value)


public inline fun TextTransform.Companion.variable(name: String): TextTransform.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textTransform(value: TextTransform) {
	property(textTransform, value)
}


@Suppress("unused")
public inline val CssProperties.textTransform: CssProperty<TextTransform>
	get() = CssProperty.unsafe("text-transform")
