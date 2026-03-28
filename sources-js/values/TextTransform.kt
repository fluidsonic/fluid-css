@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-transform` value. */
@JsName("0;0")
public external interface TextTransform : CssValue {

	public companion object;


	/** A [TextTransform] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextTransform, CssVariable<TextTransform>
}


/** The CSS `capitalize` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.capitalize: TextTransform
	get() = unsafe("capitalize")

/** The CSS `full-size-kana` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.fullSizeKana: TextTransform
	get() = unsafe("full-size-kana")

/** The CSS `full-width` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.fullWidth: TextTransform
	get() = unsafe("full-width")

/** The CSS `lowercase` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.lowercase: TextTransform
	get() = unsafe("lowercase")

/** The CSS `none` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.none: TextTransform
	get() = unsafe("none")

/** The CSS `uppercase` text-transform value. */
@CssDsl
public inline val TextTransform.Companion.uppercase: TextTransform
	get() = unsafe("uppercase")


/** Creates a [TextTransform] from an unchecked string [value]. */
public inline fun TextTransform.Companion.unsafe(value: String): TextTransform =
	CssValue.unsafe(value)


/** Creates a [TextTransform] backed by a CSS variable with the given [name]. */
public inline fun TextTransform.Companion.variable(name: String): TextTransform.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-transform` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textTransform(value: TextTransform) {
	property(textTransform, value)
}


/** The `text-transform` CSS property. */
@Suppress("unused")
public inline val CssProperties.textTransform: CssProperty<TextTransform>
	get() = CssProperty.unsafe("text-transform")
