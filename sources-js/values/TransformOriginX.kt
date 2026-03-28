@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `transform-origin-x` value. */
@JsName("0;0")
public external interface TransformOriginX : CssValue {

	public companion object
}


/** The CSS `center` transform-origin-x value. */
@CssDsl
public inline val TransformOriginX.Companion.center: TransformOriginX
	get() = unsafe("center")

/** The CSS `left` transform-origin-x value. */
@CssDsl
public inline val TransformOriginX.Companion.left: TransformOriginX
	get() = unsafe("left")

/** The CSS `right` transform-origin-x value. */
@CssDsl
public inline val TransformOriginX.Companion.right: TransformOriginX
	get() = unsafe("right")


/** Creates a [TransformOriginX] from an unchecked string [value]. */
public inline fun TransformOriginX.Companion.unsafe(value: String): TransformOriginX =
	CssValue.unsafe(value)
