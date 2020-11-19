@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Border : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Border = raw("none")


		public fun raw(value: String): Border =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null): Border =
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


	public interface Variable : Border, CssVariable<Border>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.border(value: Border) {
	property(border, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.border(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	border(Border.with(color = color, style = style, width = width))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottom(value: Border) {
	property(borderBottom, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottom(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderBottom(Border.with(color = color, style = style, width = width))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeft(value: Border) {
	property(borderLeft, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeft(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderLeft(Border.with(color = color, style = style, width = width))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRight(value: Border) {
	property(borderRight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRight(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderRight(Border.with(color = color, style = style, width = width))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTop(value: Border) {
	property(borderTop, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTop(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderTop(Border.with(color = color, style = style, width = width))
}


@Suppress("unused")
public inline val CssProperties.border: CssProperty<Border>
	get() = CssProperty("border")


@Suppress("unused")
public inline val CssProperties.borderBottom: CssProperty<Border>
	get() = CssProperty("border-bottom")


@Suppress("unused")
public inline val CssProperties.borderLeft: CssProperty<Border>
	get() = CssProperty("border-left")


@Suppress("unused")
public inline val CssProperties.borderRight: CssProperty<Border>
	get() = CssProperty("border-right")


@Suppress("unused")
public inline val CssProperties.borderTop: CssProperty<Border>
	get() = CssProperty("border-top")
