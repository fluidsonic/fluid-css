@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderStyleOrGlobal : CssValue
public interface BorderStyle : BorderStyleOrGlobal {

	public companion object {

		public val none: BorderStyle = NoneValue.none

		public val dashed: BorderStyle = BorderStyle("dashed")
		public val dotted: BorderStyle = BorderStyle("dotted")
		public val double: BorderStyle = BorderStyle("double")
		public val groove: BorderStyle = BorderStyle("groove")
		public val hidden: BorderStyle = BorderStyle("hidden")
		public val inset: BorderStyle = BorderStyle("inset")
		public val outset: BorderStyle = BorderStyle("outset")
		public val ridge: BorderStyle = BorderStyle("ridge")
		public val solid: BorderStyle = BorderStyle("solid")
	}
}


private class BorderStyleImpl(value: String) : CssValueBase(value), BorderStyle


@Suppress("FunctionName")
public fun BorderStyle(value: String): BorderStyle =
	BorderStyleImpl(value)


public inline fun CssDeclarationBlockBuilder.borderStyle(all: BorderStyle) {
	property(CssProperty.borderStyle, all)
}


public inline fun CssDeclarationBlockBuilder.borderStyle(all: BorderStyleOrGlobal) {
	property(CssProperty.borderStyle, all)
}


public inline fun CssDeclarationBlockBuilder.borderStyle(all: GlobalValue) {
	property(CssProperty.borderStyle, all)
}


public inline fun CssDeclarationBlockBuilder.borderStyle(all: CustomCssProperty<out BorderStyleOrGlobal>) {
	property(CssProperty.borderStyle, all)
}


public inline fun CssDeclarationBlockBuilder.borderStyle(vertical: BorderStyle, horizontal: BorderStyle) {
	if (vertical == horizontal)
		borderStyle(all = vertical)
	else
		property(CssProperty.borderStyle, "$vertical $horizontal")
}


public inline fun CssDeclarationBlockBuilder.borderStyle(top: BorderStyle, horizontal: BorderStyle, bottom: BorderStyle) {
	if (top == bottom)
		borderStyle(vertical = top, horizontal = horizontal)
	else
		property(CssProperty.borderStyle, "$top $horizontal $bottom")
}


public inline fun CssDeclarationBlockBuilder.borderStyle(top: BorderStyle, right: BorderStyle, bottom: BorderStyle, left: BorderStyle) {
	if (left == right)
		borderStyle(top = top, horizontal = left, bottom = bottom)
	else
		property(CssProperty.borderStyle, "$top $left $bottom $right")
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderStyle(
	all: BorderStyle? = null,
	vertical: BorderStyle? = all,
	horizontal: BorderStyle? = all,
	top: BorderStyle? = vertical,
	right: BorderStyle? = horizontal,
	bottom: BorderStyle? = vertical,
	left: BorderStyle? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderStyle(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopStyle(top)
		if (right != null)
			borderRightStyle(right)
		if (bottom != null)
			borderBottomStyle(bottom)
		if (left != null)
			borderLeftStyle(left)
	}
}


public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: BorderStyle) {
	property(CssProperty.borderBottomStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: BorderStyleOrGlobal) {
	property(CssProperty.borderBottomStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: GlobalValue) {
	property(CssProperty.borderBottomStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: CustomCssProperty<out BorderStyleOrGlobal>) {
	property(CssProperty.borderBottomStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: BorderStyle) {
	property(CssProperty.borderLeftStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: BorderStyleOrGlobal) {
	property(CssProperty.borderLeftStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: GlobalValue) {
	property(CssProperty.borderLeftStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: CustomCssProperty<out BorderStyleOrGlobal>) {
	property(CssProperty.borderLeftStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: BorderStyle) {
	property(CssProperty.borderRightStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: BorderStyleOrGlobal) {
	property(CssProperty.borderRightStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: GlobalValue) {
	property(CssProperty.borderRightStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: CustomCssProperty<out BorderStyleOrGlobal>) {
	property(CssProperty.borderRightStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: BorderStyle) {
	property(CssProperty.borderTopStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: BorderStyleOrGlobal) {
	property(CssProperty.borderTopStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: GlobalValue) {
	property(CssProperty.borderTopStyle, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: CustomCssProperty<out BorderStyleOrGlobal>) {
	property(CssProperty.borderTopStyle, value)
}


public inline val CssProperty.Companion.borderStyle: CssProperty get() = CssProperty("border-style")
public inline val CssProperty.Companion.borderBottomStyle: CssProperty get() = CssProperty("border-bottom-style")
public inline val CssProperty.Companion.borderLeftStyle: CssProperty get() = CssProperty("border-left-style")
public inline val CssProperty.Companion.borderRightStyle: CssProperty get() = CssProperty("border-right-style")
public inline val CssProperty.Companion.borderTopStyle: CssProperty get() = CssProperty("border-top-style")
