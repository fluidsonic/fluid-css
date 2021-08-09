@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface ColorStop {

	public companion object
}


public inline fun ColorStop.Companion.of(color: Color, position: LengthOrPercentage?): ColorStop =
	unsafe("$color $position")


public inline fun ColorStop.Companion.unsafe(value: String): ColorStop =
	CssValue.unsafe(value)
