@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecoration : CssValue, Internal {

	public companion object {

		public val none: TextDecoration = raw("none")


		public fun raw(value: String): TextDecoration =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(
			line: TextDecorationLine? = null,
			style: TextDecorationStyle? = null,
			color: Color? = null,
			thickness: TextDecorationThickness? = null,
		): TextDecoration =
			if (line != null || style != null || color != null || thickness != null)
				raw(buildString {
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
				})
			else
				CssValue.initial
	}


	public interface Variable : TextDecoration, CssVariable<TextDecoration>
}


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
	get() = CssProperty("text-decoration")
