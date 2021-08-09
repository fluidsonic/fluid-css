@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontVariantNumericFraction : CssValue {

	public companion object
}


@CssDsl
public inline val FontVariantNumericFraction.Companion.diagonalFractions: FontVariantNumericFraction
	get() = unsafe("diagonal-fractions")

@CssDsl
public inline val FontVariantNumericFraction.Companion.stackedFractions: FontVariantNumericFraction
	get() = unsafe("stacked-fractions")


public inline fun FontVariantNumericFraction.Companion.unsafe(value: String): FontVariantNumericFraction =
	CssValue.unsafe(value)
