@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextDecorationThickness : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextDecorationThickness, CssVariable<TextDecorationThickness>
}


@CssDsl
public inline val TextDecorationThickness.Companion.auto: TextDecorationThickness
	get() = unsafe("auto")


@CssDsl
public inline val TextDecorationThickness.Companion.fromFont: TextDecorationThickness
	get() = unsafe("from-font")


public inline fun TextDecorationThickness.Companion.unsafe(value: String): TextDecorationThickness =
	CssValue.unsafe(value)


public inline fun TextDecorationThickness.Companion.variable(name: String): TextDecorationThickness.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: TextDecorationThickness) {
	property(textDecorationThickness, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationThickness: CssProperty<TextDecorationThickness>
	get() = CssProperty.unsafe("text-decoration-thickness")
