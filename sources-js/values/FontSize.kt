@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontSize : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : FontSize, CssVariable<FontSize>
}


@CssDsl
public inline val FontSize.Companion.xxSmall: FontSize
	get() = unsafe("xx-small")

@CssDsl
public inline val FontSize.Companion.xSmall: FontSize
	get() = unsafe("x-small")

@CssDsl
public inline val FontSize.Companion.small: FontSize
	get() = unsafe("small")

@CssDsl
public inline val FontSize.Companion.medium: FontSize
	get() = unsafe("medium")

@CssDsl
public inline val FontSize.Companion.large: FontSize
	get() = unsafe("large")

@CssDsl
public inline val FontSize.Companion.xLarge: FontSize
	get() = unsafe("x-large")

@CssDsl
public inline val FontSize.Companion.xxLarge: FontSize
	get() = unsafe("xx-large")

@CssDsl
public inline val FontSize.Companion.xxxLarge: FontSize
	get() = unsafe("xxx-large")


public inline fun FontSize.Companion.unsafe(value: String): FontSize =
	CssValue.unsafe(value)


public inline fun FontSize.Companion.variable(name: String): FontSize.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSize) {
	property(fontSize, value)
}


@Suppress("unused")
public inline val CssProperties.fontSize: CssProperty<FontSize>
	get() = CssProperty.unsafe("font-size")
