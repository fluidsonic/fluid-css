@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-variant-numeric-fraction` value. */
@JsName("0;0")
public external interface FontVariantNumericFraction : CssValue {

	public companion object
}


/** The CSS `diagonal-fractions` font-variant-numeric-fraction value. */
@CssDsl
public inline val FontVariantNumericFraction.Companion.diagonalFractions: FontVariantNumericFraction
	get() = unsafe("diagonal-fractions")

/** The CSS `stacked-fractions` font-variant-numeric-fraction value. */
@CssDsl
public inline val FontVariantNumericFraction.Companion.stackedFractions: FontVariantNumericFraction
	get() = unsafe("stacked-fractions")


/** Creates a [FontVariantNumericFraction] from an unchecked string [value]. */
public inline fun FontVariantNumericFraction.Companion.unsafe(value: String): FontVariantNumericFraction =
	CssValue.unsafe(value)
