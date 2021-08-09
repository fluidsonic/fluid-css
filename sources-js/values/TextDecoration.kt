@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextDecoration : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextDecoration, CssVariable<TextDecoration>
}


@CssDsl
public inline val TextDecoration.Companion.none: TextDecoration
	get() = unsafe("none")


public inline fun TextDecoration.Companion.unsafe(value: String): TextDecoration =
	CssValue.unsafe(value)


public inline fun TextDecoration.Companion.variable(name: String): TextDecoration.Variable =
	CssVariable.unsafe(name)


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecoration(value: TextDecoration) {
	property(textDecoration, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecoration(
	line: TextDecorationLine? = null,
	style: TextDecorationStyle? = null,
	color: Color? = null,
	thickness: TextDecorationThickness? = null,
) {
	textDecoration(TextDecoration.with(color = color, line = line, style = style, thickness = thickness))
}


@Suppress("unused")
public inline val CssProperties.textDecoration: CssProperty<TextDecoration>
	get() = CssProperty.unsafe("text-decoration")
