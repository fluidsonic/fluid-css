@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-decoration` value. */
@JsName("0;0")
public external interface TextDecoration : CssValue {

	public companion object;


	/** A [TextDecoration] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextDecoration, CssVariable<TextDecoration>
}


/** The CSS `none` text-decoration value. */
@CssDsl
public inline val TextDecoration.Companion.none: TextDecoration
	get() = unsafe("none")


/** Creates a [TextDecoration] from an unchecked string [value]. */
public inline fun TextDecoration.Companion.unsafe(value: String): TextDecoration =
	CssValue.unsafe(value)


/** Creates a [TextDecoration] backed by a CSS variable with the given [name]. */
public inline fun TextDecoration.Companion.variable(name: String): TextDecoration.Variable =
	CssVariable.unsafe(name)


/** Creates a [TextDecoration] shorthand value. */
public inline fun TextDecoration.Companion.with(
	line: TextDecorationLine? = null,
	style: TextDecorationStyle? = null,
	color: Color? = null,
	thickness: TextDecorationThickness? = null,
): TextDecoration =
	if (line != null || style != null || color != null || thickness != null) {
		var string = ""

		if (line != null)
			string += line

		if (style != null) {
			if (string.isNotEmpty()) string += " "
			string += style
		}
		if (color != null) {
			if (string.isNotEmpty()) string += " "
			string += color
		}
		if (thickness != null) {
			if (string.isNotEmpty()) string += " "
			string += thickness
		}

		unsafe(string)
	}
	else
		CssValue.initial


/** Sets the `text-decoration` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecoration(value: TextDecoration) {
	property(textDecoration, value)
}


/** Sets the `text-decoration` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecoration(
	line: TextDecorationLine? = null,
	style: TextDecorationStyle? = null,
	color: Color? = null,
	thickness: TextDecorationThickness? = null,
) {
	textDecoration(TextDecoration.with(color = color, line = line, style = style, thickness = thickness))
}


/** The `text-decoration` CSS property. */
@Suppress("unused")
public inline val CssProperties.textDecoration: CssProperty<TextDecoration>
	get() = CssProperty.unsafe("text-decoration")
