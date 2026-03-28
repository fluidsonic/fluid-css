@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `size` value. */
@JsName("0;0")
public external interface Size : CssValue {

	public companion object;


	/** A [Size] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Size, CssVariable<Size>
}


/** The CSS `auto` size value. */
@CssDsl
public inline val Size.Companion.auto: Size
	get() = unsafe("auto")

/** The CSS `contain` size value. */
@CssDsl
public inline val Size.Companion.contain: Size
	get() = unsafe("contain")

/** The CSS `fit-content` size value. */
@CssDsl
public inline val Size.Companion.fitContent: Size
	get() = unsafe("fit-content")

/** The CSS `max-content` size value. */
@CssDsl
public inline val Size.Companion.maxContent: Size
	get() = unsafe("max-content")

/** The CSS `min-content` size value. */
@CssDsl
public inline val Size.Companion.minContent: Size
	get() = unsafe("min-content")

/** The CSS `stretch` size value. */
@CssDsl
public inline val Size.Companion.stretch: Size
	get() = unsafe("stretch")


/** Creates a [Size] value. */
@CssDsl
public inline fun Size.Companion.fitContent(height: LengthOrPercentage): Size =
	unsafe("fit-content($height)")


/** Creates a [Size] from an unchecked string [value]. */
public inline fun Size.Companion.unsafe(value: String): Size =
	CssValue.unsafe(value)


/** Creates a [Size] backed by a CSS variable with the given [name]. */
public inline fun Size.Companion.variable(name: String): Size.Variable =
	CssVariable.unsafe(name)
