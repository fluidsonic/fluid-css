@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-variant-numeric-figure` value. */
@JsName("0;0")
public external interface FontVariantNumericFigure : CssValue {

	public companion object
}


/** The CSS `lining-nums` font-variant-numeric-figure value. */
@CssDsl
public inline val FontVariantNumericFigure.Companion.liningNums: FontVariantNumericFigure
	get() = unsafe("lining-nums")

/** The CSS `oldstyle-nums` font-variant-numeric-figure value. */
@CssDsl
public inline val FontVariantNumericFigure.Companion.oldstyleNums: FontVariantNumericFigure
	get() = unsafe("oldstyle-nums")


/** Creates a [FontVariantNumericFigure] from an unchecked string [value]. */
public inline fun FontVariantNumericFigure.Companion.unsafe(value: String): FontVariantNumericFigure =
	CssValue.unsafe(value)
