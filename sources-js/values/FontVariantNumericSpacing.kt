@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-variant-numeric-spacing` value. */
@JsName("0;0")
public external interface FontVariantNumericSpacing : CssValue {

	public companion object
}


/** The CSS `proportional-nums` font-variant-numeric-spacing value. */
@CssDsl
public inline val FontVariantNumericSpacing.Companion.proportionalNums: FontVariantNumericSpacing
	get() = unsafe("proportional-nums")

/** The CSS `tabular-nums` font-variant-numeric-spacing value. */
@CssDsl
public inline val FontVariantNumericSpacing.Companion.tabularNums: FontVariantNumericSpacing
	get() = unsafe("tabular-nums")


/** Creates a [FontVariantNumericSpacing] from an unchecked string [value]. */
public inline fun FontVariantNumericSpacing.Companion.unsafe(value: String): FontVariantNumericSpacing =
	CssValue.unsafe(value)
