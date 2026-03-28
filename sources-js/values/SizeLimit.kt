@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `size-limit` value. */
@JsName("0;0")
public external interface SizeLimit : CssValue {

	public companion object;


	/** A [SizeLimit] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : SizeLimit, CssVariable<SizeLimit>
}


/** The CSS `max-content` size-limit value. */
@CssDsl
public inline val SizeLimit.Companion.maxContent: SizeLimit
	get() = unsafe("max-content")

/** The CSS `min-content` size-limit value. */
@CssDsl
public inline val SizeLimit.Companion.minContent: SizeLimit
	get() = unsafe("min-content")

/** The CSS `none` size-limit value. */
@CssDsl
public inline val SizeLimit.Companion.none: SizeLimit
	get() = unsafe("none")


/** Creates a [SizeLimit] value. */
@CssDsl
public inline fun SizeLimit.Companion.fitContent(height: LengthOrPercentage): SizeLimit =
	unsafe("fit-content($height)")


/** Creates a [SizeLimit] from an unchecked string [value]. */
public inline fun SizeLimit.Companion.unsafe(value: String): SizeLimit =
	CssValue.unsafe(value)


/** Creates a [SizeLimit] backed by a CSS variable with the given [name]. */
public inline fun SizeLimit.Companion.variable(name: String): SizeLimit.Variable =
	CssVariable.unsafe(name)
