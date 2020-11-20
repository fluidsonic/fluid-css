@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Outline : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Outline = raw("none")


		public fun raw(value: String): Outline =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null): Outline =
			if (width != null || style != null || color != null)
				raw(buildString {
					if (width != null)
						append(width)

					if (style != null) {
						if (isNotEmpty()) append(" ")
						append(style)
					}
					if (color != null) {
						if (isNotEmpty()) append(" ")
						append(color)
					}
				})
			else
				CssValue.initial
	}


	public interface Variable : Outline, CssVariable<Outline>
}


@CssDsl
public fun CssDeclarationBlockBuilder.outline(value: Outline) {
	property(outline, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.outline(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null) {
	outline(Outline.with(color = color, style = style, width = width))
}


@Suppress("unused")
public val CssProperties.outline: CssProperty<Outline>
	get() = CssProperty("outline")
