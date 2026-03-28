@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


/** Represents a CSS `font-family` value. */
@JsName("0;0")
public external interface FontFamily : CssValue.StringConstructable {

	public companion object;


	/** A [FontFamily] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FontFamily, CssVariable<FontFamily>
}


/** Creates a [FontFamily] from an unchecked string [value]. */
public inline fun FontFamily.Companion.unsafe(value: String): FontFamily =
	CssValue.unsafe(value)


/** Creates a [FontFamily] backed by a CSS variable with the given [name]. */
public inline fun FontFamily.Companion.variable(name: String): FontFamily.Variable =
	CssVariable.unsafe(name)


/** Sets the `font-family` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontFamily(value: FontFamily) {
	property(fontFamily, value)
}


/** Sets the `font-family` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontFamily(value: String) {
	property(fontFamily, value)
}


/** The `font-family` CSS property. */
@Suppress("unused")
public inline val CssProperties.fontFamily: CssProperty<FontFamily>
	get() = CssProperty.unsafe("font-family")
