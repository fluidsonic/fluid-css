@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontVariantNumericFigure : CssValue {

	public companion object
}


@CssDsl
public inline val FontVariantNumericFigure.Companion.liningNums: FontVariantNumericFigure
	get() = unsafe("lining-nums")

@CssDsl
public inline val FontVariantNumericFigure.Companion.oldstyleNums: FontVariantNumericFigure
	get() = unsafe("oldstyle-nums")


public inline fun FontVariantNumericFigure.Companion.unsafe(value: String): FontVariantNumericFigure =
	CssValue.unsafe(value)
