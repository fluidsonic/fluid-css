@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-decoration-style` value. */
@JsName("0;0")
public external interface TextDecorationStyle : CssValue {

	public companion object;


	/** A [TextDecorationStyle] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextDecorationStyle, CssVariable<TextDecorationStyle>
}


/** The CSS `dashed` text-decoration-style value. */
@CssDsl
public inline val TextDecorationStyle.Companion.dashed: TextDecorationStyle
	get() = unsafe("dashed")

/** The CSS `dotted` text-decoration-style value. */
@CssDsl
public inline val TextDecorationStyle.Companion.dotted: TextDecorationStyle
	get() = unsafe("dotted")

/** The CSS `double` text-decoration-style value. */
@CssDsl
public inline val TextDecorationStyle.Companion.double: TextDecorationStyle
	get() = unsafe("double")

/** The CSS `solid` text-decoration-style value. */
@CssDsl
public inline val TextDecorationStyle.Companion.solid: TextDecorationStyle
	get() = unsafe("solid")

/** The CSS `wavy` text-decoration-style value. */
@CssDsl
public inline val TextDecorationStyle.Companion.wavy: TextDecorationStyle
	get() = unsafe("wavy")


/** Creates a [TextDecorationStyle] from an unchecked string [value]. */
public inline fun TextDecorationStyle.Companion.unsafe(value: String): TextDecorationStyle =
	CssValue.unsafe(value)


/** Creates a [TextDecorationStyle] backed by a CSS variable with the given [name]. */
public inline fun TextDecorationStyle.Companion.variable(name: String): TextDecorationStyle.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-decoration-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationStyle(value: TextDecorationStyle) {
	property(textDecorationStyle, value)
}


/** The `text-decoration-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.textDecorationStyle: CssProperty<TextDecorationStyle>
	get() = CssProperty.unsafe("text-decoration-style")
