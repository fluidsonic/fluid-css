@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Border : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: Border
			get() = unsafe("none")


		public inline fun unsafe(value: String): Border =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Border, CssVariable<Border>
}


@Suppress("DEPRECATION")
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
	get() = CssProperty.unsafe("border")


@Suppress("unused")
public inline val CssProperties.borderBottom: CssProperty<Border>
	get() = CssProperty.unsafe("border-bottom")


@Suppress("unused")
public inline val CssProperties.borderLeft: CssProperty<Border>
	get() = CssProperty.unsafe("border-left")


@Suppress("unused")
public inline val CssProperties.borderRight: CssProperty<Border>
	get() = CssProperty.unsafe("border-right")


@Suppress("unused")
public inline val CssProperties.borderTop: CssProperty<Border>
	get() = CssProperty.unsafe("border-top")
