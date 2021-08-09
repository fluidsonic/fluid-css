@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Size : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Size, CssVariable<Size>
}


@CssDsl
public inline val Size.Companion.auto: Size
	get() = unsafe("auto")

@CssDsl
public inline val Size.Companion.contain: Size
	get() = unsafe("contain")

@CssDsl
public inline val Size.Companion.fitContent: Size
	get() = unsafe("fit-content")

@CssDsl
public inline val Size.Companion.maxContent: Size
	get() = unsafe("max-content")

@CssDsl
public inline val Size.Companion.minContent: Size
	get() = unsafe("min-content")

@CssDsl
public inline val Size.Companion.stretch: Size
	get() = unsafe("stretch")


@CssDsl
public inline fun Size.Companion.fitContent(height: LengthOrPercentage): Size =
	unsafe("fit-content($height)")


public inline fun Size.Companion.unsafe(value: String): Size =
	CssValue.unsafe(value)


public inline fun Size.Companion.variable(name: String): Size.Variable =
	CssVariable.unsafe(name)
