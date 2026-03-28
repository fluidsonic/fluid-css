@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border` value. */
@JsName("0;0")
public external interface Border : CssValue {

	public companion object;


	/** A [Border] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Border, CssVariable<Border>
}


/** The CSS `none` border value. */
@CssDsl
public inline val Border.Companion.none: Border
	get() = unsafe("none")


/** Creates a [Border] from an unchecked string [value]. */
public inline fun Border.Companion.unsafe(value: String): Border =
	CssValue.unsafe(value)


/** Creates a [Border] backed by a CSS variable with the given [name]. */
public inline fun Border.Companion.variable(name: String): Border.Variable =
	CssVariable.unsafe(name)


/** Creates a [Border] shorthand value. */
public inline fun Border.Companion.with(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null): Border =
	when {
		width != null && style != null && color != null ->
			unsafe("$width $style $color")

		width != null || style != null || color != null -> {
			var string = ""

			if (width != null)
				string += width

			if (style != null) {
				if (string.isNotEmpty()) string += " "
				string += style
			}
			if (color != null) {
				if (string.isNotEmpty()) string += " "
				string += color
			}

			unsafe(string)
		}

		else -> CssValue.initial
	}


/** Sets the `border` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.border(value: Border) {
	property(border, value)
}


/** Sets the `border` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.border(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	border(Border.with(color = color, style = style, width = width))
}


/** Sets the `border-bottom` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottom(value: Border) {
	property(borderBottom, value)
}


/** Sets the `border-bottom` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottom(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderBottom(Border.with(color = color, style = style, width = width))
}


/** Sets the `border-left` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeft(value: Border) {
	property(borderLeft, value)
}


/** Sets the `border-left` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeft(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderLeft(Border.with(color = color, style = style, width = width))
}


/** Sets the `border-right` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRight(value: Border) {
	property(borderRight, value)
}


/** Sets the `border-right` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRight(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderRight(Border.with(color = color, style = style, width = width))
}


/** Sets the `border-top` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTop(value: Border) {
	property(borderTop, value)
}


/** Sets the `border-top` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTop(width: BorderWidth? = null, style: BorderStyle? = null, color: Color? = null) {
	borderTop(Border.with(color = color, style = style, width = width))
}


/** The `border` CSS property. */
@Suppress("unused")
public inline val CssProperties.border: CssProperty<Border>
	get() = CssProperty.unsafe("border")


/** The `border-bottom` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottom: CssProperty<Border>
	get() = CssProperty.unsafe("border-bottom")


/** The `border-left` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderLeft: CssProperty<Border>
	get() = CssProperty.unsafe("border-left")


/** The `border-right` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderRight: CssProperty<Border>
	get() = CssProperty.unsafe("border-right")


/** The `border-top` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTop: CssProperty<Border>
	get() = CssProperty.unsafe("border-top")
