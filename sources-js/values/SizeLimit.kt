@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface SizeLimit : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : SizeLimit, CssVariable<SizeLimit>
}


@CssDsl
public inline val SizeLimit.Companion.maxContent: SizeLimit
	get() = unsafe("max-content")

@CssDsl
public inline val SizeLimit.Companion.minContent: SizeLimit
	get() = unsafe("min-content")

@CssDsl
public inline val SizeLimit.Companion.none: SizeLimit
	get() = unsafe("none")


@CssDsl
public inline fun SizeLimit.Companion.fitContent(height: LengthOrPercentage): SizeLimit =
	unsafe("fit-content($height)")


public inline fun SizeLimit.Companion.unsafe(value: String): SizeLimit =
	CssValue.unsafe(value)


public inline fun SizeLimit.Companion.variable(name: String): SizeLimit.Variable =
	CssVariable.unsafe(name)
