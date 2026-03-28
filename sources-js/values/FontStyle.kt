@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-style` value. */
@JsName("0;0")
public external interface FontStyle : CssValue {

	public companion object;


	/** A [FontStyle] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FontStyle, CssVariable<FontStyle>
}


/** The CSS `italic` font-style value. */
@CssDsl
public inline val FontStyle.Companion.italic: FontStyle
	get() = unsafe("italic")

/** The CSS `normal` font-style value. */
@CssDsl
public inline val FontStyle.Companion.normal: FontStyle
	get() = unsafe("normal")

/** The CSS `oblique` font-style value. */
@CssDsl
public inline val FontStyle.Companion.oblique: FontStyle
	get() = unsafe("oblique")


/** Creates an `oblique` font style with the given [angle]. */
@CssDsl
public inline fun FontStyle.Companion.oblique(angle: Angle): FontStyle =
	unsafe("oblique $angle")


/** Creates a [FontStyle] from an unchecked string [value]. */
public inline fun FontStyle.Companion.unsafe(value: String): FontStyle =
	CssValue.unsafe(value)


/** Creates a [FontStyle] backed by a CSS variable with the given [name]. */
public inline fun FontStyle.Companion.variable(name: String): FontStyle.Variable =
	CssVariable.unsafe(name)


/** Sets the `font-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontStyle(value: FontStyle) {
	property(fontStyle, value)
}


/** The `font-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.fontStyle: CssProperty<FontStyle>
	get() = CssProperty.unsafe("font-style")
