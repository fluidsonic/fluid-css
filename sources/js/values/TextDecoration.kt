@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecorationOrGlobal : CssValue
public interface TextDecoration : TextDecorationOrGlobal {

	public companion object {

		public val none: TextDecoration = NoneValue.none
	}
}


private class TextDecorationImpl(
	color: Color?,
	line: TextDecorationLine?,
	style: TextDecorationStyle?,
	thickness: TextDecorationThickness?,
) : CssValueBase(buildString {
	if (line != null)
		append(line)

	if (style != null) {
		if (isNotEmpty()) append(" ")
		append(style)
	}

	if (color != null) {
		if (isNotEmpty()) append(" ")
		append(color)
	}

	if (thickness != null) {
		if (isNotEmpty()) append(" ")
		append(thickness)
	}
}), TextDecoration


@Suppress("FunctionName")
public fun TextDecoration(
	line: TextDecorationLine? = null,
	style: TextDecorationStyle? = null,
	color: Color? = null,
	thickness: TextDecorationThickness? = null,
): TextDecoration {
	require(line != null || style != null || color != null || thickness != null) { "At least one of line, style, color or thickness must be specified." }

	return TextDecorationImpl(color = color, line = line, style = style, thickness = thickness)
}


public inline fun CssDeclarationBlockBuilder.textDecoration(
	line: TextDecorationLine? = null,
	style: TextDecorationStyle? = null,
	color: Color? = null,
	thickness: TextDecorationThickness? = null,
) {
	textDecoration(TextDecoration(color = color, line = line, style = style, thickness = thickness))
}


public inline fun CssDeclarationBlockBuilder.textDecoration(value: TextDecoration) {
	property(CssProperty.textDecoration, value)
}


public inline fun CssDeclarationBlockBuilder.textDecoration(value: TextDecorationOrGlobal) {
	property(CssProperty.textDecoration, value)
}


public inline fun CssDeclarationBlockBuilder.textDecoration(value: GlobalValue) {
	property(CssProperty.textDecoration, value)
}


public inline fun CssDeclarationBlockBuilder.textDecoration(value: CustomCssProperty<out TextDecorationOrGlobal>) {
	property(CssProperty.textDecoration, value)
}


public inline val CssProperty.Companion.textDecoration: CssProperty get() = CssProperty("text-decoration")
