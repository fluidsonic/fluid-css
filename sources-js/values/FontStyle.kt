@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontStyle : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : FontStyle, CssVariable<FontStyle>
}


@CssDsl
public inline val FontStyle.Companion.italic: FontStyle
	get() = unsafe("italic")

@CssDsl
public inline val FontStyle.Companion.normal: FontStyle
	get() = unsafe("normal")

@CssDsl
public inline val FontStyle.Companion.oblique: FontStyle
	get() = unsafe("oblique")


@CssDsl
public inline fun FontStyle.Companion.oblique(angle: Angle): FontStyle =
	unsafe("oblique $angle")


public inline fun FontStyle.Companion.unsafe(value: String): FontStyle =
	CssValue.unsafe(value)


public inline fun FontStyle.Companion.variable(name: String): FontStyle.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontStyle(value: FontStyle) {
	property(fontStyle, value)
}


@Suppress("unused")
public inline val CssProperties.fontStyle: CssProperty<FontStyle>
	get() = CssProperty.unsafe("font-style")
