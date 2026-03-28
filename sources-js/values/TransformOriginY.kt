@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `transform-origin-y` value. */
@JsName("0;0")
public external interface TransformOriginY : CssValue {

	public companion object
}


/** The CSS `bottom` transform-origin-y value. */
@CssDsl
public inline val TransformOriginY.Companion.bottom: TransformOriginY
	get() = unsafe("bottom")

/** The CSS `center` transform-origin-y value. */
@CssDsl
public inline val TransformOriginY.Companion.center: TransformOriginY
	get() = unsafe("center")

/** The CSS `top` transform-origin-y value. */
@CssDsl
public inline val TransformOriginY.Companion.top: TransformOriginY
	get() = unsafe("top")


/** Creates a [TransformOriginY] from an unchecked string [value]. */
public inline fun TransformOriginY.Companion.unsafe(value: String): TransformOriginY =
	CssValue.unsafe(value)

