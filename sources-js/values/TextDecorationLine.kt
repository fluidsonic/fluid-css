@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface TextDecorationLine : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextDecorationLine, CssVariable<TextDecorationLine>
}


@CssDsl
public inline val TextDecorationLine.Companion.none: TextDecorationLine
	get() = unsafe("none")


@CssDsl
public inline val TextDecorationLine.Companion.lineThrough: TextDecorationLine
	get() = unsafe("line-through")

@CssDsl
public inline val TextDecorationLine.Companion.overline: TextDecorationLine
	get() = unsafe("overline")

@CssDsl
public inline val TextDecorationLine.Companion.underline: TextDecorationLine
	get() = unsafe("underline")


public inline fun TextDecorationLine.Companion.unsafe(value: String): TextDecorationLine =
	CssValue.unsafe(value)


public inline fun TextDecorationLine.Companion.variable(name: String): TextDecorationLine.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLine) {
	property(textDecorationLine, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationLine: CssProperty<TextDecorationLine>
	get() = CssProperty.unsafe("text-decoration-line")
