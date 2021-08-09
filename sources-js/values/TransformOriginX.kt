@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TransformOriginX : CssValue {

	public companion object
}


@CssDsl
public inline val TransformOriginX.Companion.center: TransformOriginX
	get() = unsafe("center")

@CssDsl
public inline val TransformOriginX.Companion.left: TransformOriginX
	get() = unsafe("left")

@CssDsl
public inline val TransformOriginX.Companion.right: TransformOriginX
	get() = unsafe("right")


public inline fun TransformOriginX.Companion.unsafe(value: String): TransformOriginX =
	CssValue.unsafe(value)
