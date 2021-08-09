@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextDecorationStyle : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextDecorationStyle, CssVariable<TextDecorationStyle>
}


@CssDsl
public inline val TextDecorationStyle.Companion.dashed: TextDecorationStyle
	get() = unsafe("dashed")

@CssDsl
public inline val TextDecorationStyle.Companion.dotted: TextDecorationStyle
	get() = unsafe("dotted")

@CssDsl
public inline val TextDecorationStyle.Companion.double: TextDecorationStyle
	get() = unsafe("double")

@CssDsl
public inline val TextDecorationStyle.Companion.solid: TextDecorationStyle
	get() = unsafe("solid")

@CssDsl
public inline val TextDecorationStyle.Companion.wavy: TextDecorationStyle
	get() = unsafe("wavy")


public inline fun TextDecorationStyle.Companion.unsafe(value: String): TextDecorationStyle =
	CssValue.unsafe(value)


public inline fun TextDecorationStyle.Companion.variable(name: String): TextDecorationStyle.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyle) {
	property(textDecorationStyle, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationStyle: CssProperty<TextDecorationStyle>
	get() = CssProperty.unsafe("text-decoration-style")
