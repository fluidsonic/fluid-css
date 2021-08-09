@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontVariantNumericSpacing : CssValue {

	public companion object
}


@CssDsl
public inline val FontVariantNumericSpacing.Companion.proportionalNums: FontVariantNumericSpacing
	get() = unsafe("proportional-nums")

@CssDsl
public inline val FontVariantNumericSpacing.Companion.tabularNums: FontVariantNumericSpacing
	get() = unsafe("tabular-nums")


public inline fun FontVariantNumericSpacing.Companion.unsafe(value: String): FontVariantNumericSpacing =
	CssValue.unsafe(value)
