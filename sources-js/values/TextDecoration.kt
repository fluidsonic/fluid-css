@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TextDecoration : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: TextDecoration
			get() = unsafe("none")


		public inline fun unsafe(value: String): TextDecoration =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextDecoration, CssVariable<TextDecoration>
}


@Suppress("DEPRECATION")
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
