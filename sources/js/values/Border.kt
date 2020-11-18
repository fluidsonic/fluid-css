@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderOrGlobal : CssValue
public interface Border : BorderOrGlobal {

	public companion object {

		public val none: Border = NoneValue.none
	}
}


private class BorderImpl(
	color: Color?,
	style: BorderStyle?,
	width: BorderWidth?,
) : CssValueImpl(buildString {
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
}), Border


@Suppress("FunctionName")
public fun Border(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
): Border {
	require(width != null || style != null || color != null) { "At least one of width, style or color must be specified." }

	return BorderImpl(color = color, style = style, width = width)
}


public inline fun CssDeclarationBlockBuilder.border(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
) {
	border(Border(color = color, style = style, width = width))
}


public inline fun CssDeclarationBlockBuilder.border(value: Border) {
	property(CssProperty.border, value)
}


public inline fun CssDeclarationBlockBuilder.border(value: BorderOrGlobal) {
	property(CssProperty.border, value)
}


public inline fun CssDeclarationBlockBuilder.border(value: GlobalValue) {
	property(CssProperty.border, value)
}


public inline fun CssDeclarationBlockBuilder.border(value: CustomCssProperty<out BorderOrGlobal>) {
	property(CssProperty.border, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottom(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
) {
	borderBottom(Border(color = color, style = style, width = width))
}


public inline fun CssDeclarationBlockBuilder.borderBottom(value: Border) {
	property(CssProperty.borderBottom, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottom(value: BorderOrGlobal) {
	property(CssProperty.borderBottom, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottom(value: GlobalValue) {
	property(CssProperty.borderBottom, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottom(value: CustomCssProperty<out BorderOrGlobal>) {
	property(CssProperty.borderBottom, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeft(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
) {
	borderLeft(Border(color = color, style = style, width = width))
}


public inline fun CssDeclarationBlockBuilder.borderLeft(value: Border) {
	property(CssProperty.borderLeft, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeft(value: BorderOrGlobal) {
	property(CssProperty.borderLeft, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeft(value: GlobalValue) {
	property(CssProperty.borderLeft, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeft(value: CustomCssProperty<out BorderOrGlobal>) {
	property(CssProperty.borderLeft, value)
}


public inline fun CssDeclarationBlockBuilder.borderRight(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
) {
	borderRight(Border(color = color, style = style, width = width))
}


public inline fun CssDeclarationBlockBuilder.borderRight(value: Border) {
	property(CssProperty.borderRight, value)
}


public inline fun CssDeclarationBlockBuilder.borderRight(value: BorderOrGlobal) {
	property(CssProperty.borderRight, value)
}


public inline fun CssDeclarationBlockBuilder.borderRight(value: GlobalValue) {
	property(CssProperty.borderRight, value)
}


public inline fun CssDeclarationBlockBuilder.borderRight(value: CustomCssProperty<out BorderOrGlobal>) {
	property(CssProperty.borderRight, value)
}


public inline fun CssDeclarationBlockBuilder.borderTop(
	width: BorderWidth? = null,
	style: BorderStyle? = null,
	color: Color? = null,
) {
	borderTop(Border(color = color, style = style, width = width))
}


public inline fun CssDeclarationBlockBuilder.borderTop(value: Border) {
	property(CssProperty.borderTop, value)
}


public inline fun CssDeclarationBlockBuilder.borderTop(value: BorderOrGlobal) {
	property(CssProperty.borderTop, value)
}


public inline fun CssDeclarationBlockBuilder.borderTop(value: GlobalValue) {
	property(CssProperty.borderTop, value)
}


public inline fun CssDeclarationBlockBuilder.borderTop(value: CustomCssProperty<out BorderOrGlobal>) {
	property(CssProperty.borderTop, value)
}


public inline val CssProperty.Companion.border: CssProperty get() = CssProperty("border")
public inline val CssProperty.Companion.borderBottom: CssProperty get() = CssProperty("border-bottom")
public inline val CssProperty.Companion.borderLeft: CssProperty get() = CssProperty("border-left")
public inline val CssProperty.Companion.borderRight: CssProperty get() = CssProperty("border-right")
public inline val CssProperty.Companion.borderTop: CssProperty get() = CssProperty("border-top")
