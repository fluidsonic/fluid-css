@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-weight` value. */
@JsName("0;0")
public external interface FontWeight : CssValue.DoubleConstructable {

	public companion object;


	/** A [FontWeight] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FontWeight, CssVariable<FontWeight>
}


/** The CSS `bold` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.bold: FontWeight
	get() = unsafe("bold")

/** The CSS `bolder` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.bolder: FontWeight
	get() = unsafe("bolder")

/** The CSS `lighter` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.lighter: FontWeight
	get() = unsafe("lighter")

/** The CSS `normal` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.normal: FontWeight
	get() = unsafe("normal")

/** The CSS `100` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w100: FontWeight
	get() = unsafe("100")

/** The CSS `200` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w200: FontWeight
	get() = unsafe("200")

/** The CSS `300` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w300: FontWeight
	get() = unsafe("300")

/** The CSS `400` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w400: FontWeight
	get() = unsafe("400")

/** The CSS `500` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w500: FontWeight
	get() = unsafe("500")

/** The CSS `600` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w600: FontWeight
	get() = unsafe("600")

/** The CSS `700` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w700: FontWeight
	get() = unsafe("700")

/** The CSS `800` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w800: FontWeight
	get() = unsafe("800")

/** The CSS `900` font-weight value. */
@CssDsl
public inline val FontWeight.Companion.w900: FontWeight
	get() = unsafe("900")


/** Creates a [FontWeight] value. */
@CssDsl
public inline fun FontWeight.Companion.of(value: Double): FontWeight =
	CssValue.unsafe(value)


/** Creates a [FontWeight] value. */
@CssDsl
public inline fun FontWeight.Companion.of(value: Int): FontWeight =
	CssValue.unsafe(value)


/** Creates a [FontWeight] from an unchecked string [value]. */
public inline fun FontWeight.Companion.unsafe(value: String): FontWeight =
	CssValue.unsafe(value)


/** Creates a [FontWeight] backed by a CSS variable with the given [name]. */
public inline fun FontWeight.Companion.variable(name: String): FontWeight.Variable =
	CssVariable.unsafe(name)


/** Sets the `font-weight` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: FontWeight) {
	property(fontWeight, value)
}


/** Sets the `font-weight` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Double) {
	property(fontWeight, value)
}


/** Sets the `font-weight` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Int) {
	property(fontWeight, value)
}


/** The `font-weight` CSS property. */
@Suppress("unused")
public inline val CssProperties.fontWeight: CssProperty<FontWeight>
	get() = CssProperty.unsafe("font-weight")
