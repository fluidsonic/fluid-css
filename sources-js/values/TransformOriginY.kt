@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TransformOriginY : CssValue {

	public companion object
}


@CssDsl
public inline val TransformOriginY.Companion.bottom: TransformOriginY
	get() = unsafe("bottom")

@CssDsl
public inline val TransformOriginY.Companion.center: TransformOriginY
	get() = unsafe("center")

@CssDsl
public inline val TransformOriginY.Companion.top: TransformOriginY
	get() = unsafe("top")


public inline fun TransformOriginY.Companion.unsafe(value: String): TransformOriginY =
	CssValue.unsafe(value)

