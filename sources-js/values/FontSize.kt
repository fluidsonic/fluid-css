@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-size` value. */
@JsName("0;0")
public external interface FontSize : CssValue {

	public companion object;


	/** A [FontSize] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FontSize, CssVariable<FontSize>
}


/** The CSS `xx-small` font-size value. */
@CssDsl
public inline val FontSize.Companion.xxSmall: FontSize
	get() = unsafe("xx-small")

/** The CSS `x-small` font-size value. */
@CssDsl
public inline val FontSize.Companion.xSmall: FontSize
	get() = unsafe("x-small")

/** The CSS `small` font-size value. */
@CssDsl
public inline val FontSize.Companion.small: FontSize
	get() = unsafe("small")

/** The CSS `medium` font-size value. */
@CssDsl
public inline val FontSize.Companion.medium: FontSize
	get() = unsafe("medium")

/** The CSS `large` font-size value. */
@CssDsl
public inline val FontSize.Companion.large: FontSize
	get() = unsafe("large")

/** The CSS `x-large` font-size value. */
@CssDsl
public inline val FontSize.Companion.xLarge: FontSize
	get() = unsafe("x-large")

/** The CSS `xx-large` font-size value. */
@CssDsl
public inline val FontSize.Companion.xxLarge: FontSize
	get() = unsafe("xx-large")

/** The CSS `xxx-large` font-size value. */
@CssDsl
public inline val FontSize.Companion.xxxLarge: FontSize
	get() = unsafe("xxx-large")


/** Creates a [FontSize] from an unchecked string [value]. */
public inline fun FontSize.Companion.unsafe(value: String): FontSize =
	CssValue.unsafe(value)


/** Creates a [FontSize] backed by a CSS variable with the given [name]. */
public inline fun FontSize.Companion.variable(name: String): FontSize.Variable =
	CssVariable.unsafe(name)


/** Sets the `font-size` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSize) {
	property(fontSize, value)
}


/** The `font-size` CSS property. */
@Suppress("unused")
public inline val CssProperties.fontSize: CssProperty<FontSize>
	get() = CssProperty.unsafe("font-size")
