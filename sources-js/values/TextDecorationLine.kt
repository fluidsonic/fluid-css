@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `text-decoration-line` value. */
@JsName("0;0")
public external interface TextDecorationLine : CssValue {

	public companion object;


	/** A [TextDecorationLine] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextDecorationLine, CssVariable<TextDecorationLine>
}


/** The CSS `none` text-decoration-line value. */
@CssDsl
public inline val TextDecorationLine.Companion.none: TextDecorationLine
	get() = unsafe("none")


/** The CSS `line-through` text-decoration-line value. */
@CssDsl
public inline val TextDecorationLine.Companion.lineThrough: TextDecorationLine
	get() = unsafe("line-through")

/** The CSS `overline` text-decoration-line value. */
@CssDsl
public inline val TextDecorationLine.Companion.overline: TextDecorationLine
	get() = unsafe("overline")

/** The CSS `underline` text-decoration-line value. */
@CssDsl
public inline val TextDecorationLine.Companion.underline: TextDecorationLine
	get() = unsafe("underline")


/** Creates a [TextDecorationLine] from an unchecked string [value]. */
public inline fun TextDecorationLine.Companion.unsafe(value: String): TextDecorationLine =
	CssValue.unsafe(value)


/** Creates a [TextDecorationLine] backed by a CSS variable with the given [name]. */
public inline fun TextDecorationLine.Companion.variable(name: String): TextDecorationLine.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-decoration-line` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLine) {
	property(textDecorationLine, value)
}


/** The `text-decoration-line` CSS property. */
@Suppress("unused")
public inline val CssProperties.textDecorationLine: CssProperty<TextDecorationLine>
	get() = CssProperty.unsafe("text-decoration-line")
