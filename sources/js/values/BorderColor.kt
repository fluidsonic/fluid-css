@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.borderColor(all: Color) {
	property(CssProperty.borderColor, all)
}


public inline fun CssDeclarationBlockBuilder.borderColor(all: ColorOrGlobal) {
	property(CssProperty.borderColor, all)
}


public inline fun CssDeclarationBlockBuilder.borderColor(all: GlobalValue) {
	property(CssProperty.borderColor, all)
}


public inline fun CssDeclarationBlockBuilder.borderColor(all: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.borderColor, all)
}


public inline fun CssDeclarationBlockBuilder.borderColor(vertical: Color, horizontal: Color) {
	if (vertical == horizontal)
		borderColor(all = vertical)
	else
		property(CssProperty.borderColor, "$vertical $horizontal")
}


public inline fun CssDeclarationBlockBuilder.borderColor(top: Color, horizontal: Color, bottom: Color) {
	if (top == bottom)
		borderColor(vertical = top, horizontal = horizontal)
	else
		property(CssProperty.borderColor, "$top $horizontal $bottom")
}


public inline fun CssDeclarationBlockBuilder.borderColor(top: Color, right: Color, bottom: Color, left: Color) {
	if (left == right)
		borderColor(top = top, horizontal = left, bottom = bottom)
	else
		property(CssProperty.borderColor, "$top $left $bottom $right")
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderColor(
	all: Color? = null,
	vertical: Color? = all,
	horizontal: Color? = all,
	top: Color? = vertical,
	right: Color? = horizontal,
	bottom: Color? = vertical,
	left: Color? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderColor(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopColor(top)
		if (right != null)
			borderRightColor(right)
		if (bottom != null)
			borderBottomColor(bottom)
		if (left != null)
			borderLeftColor(left)
	}
}


public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: Color) {
	property(CssProperty.borderBottomColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: ColorOrGlobal) {
	property(CssProperty.borderBottomColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: GlobalValue) {
	property(CssProperty.borderBottomColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.borderBottomColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: Color) {
	property(CssProperty.borderLeftColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: ColorOrGlobal) {
	property(CssProperty.borderLeftColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: GlobalValue) {
	property(CssProperty.borderLeftColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.borderLeftColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightColor(value: Color) {
	property(CssProperty.borderRightColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightColor(value: ColorOrGlobal) {
	property(CssProperty.borderRightColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightColor(value: GlobalValue) {
	property(CssProperty.borderRightColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightColor(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.borderRightColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopColor(value: Color) {
	property(CssProperty.borderTopColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopColor(value: ColorOrGlobal) {
	property(CssProperty.borderTopColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopColor(value: GlobalValue) {
	property(CssProperty.borderTopColor, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopColor(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.borderTopColor, value)
}


public inline val CssProperty.Companion.borderBottomColor: CssProperty get() = CssProperty("border-bottom-color")
public inline val CssProperty.Companion.borderColor: CssProperty get() = CssProperty("border-color")
public inline val CssProperty.Companion.borderLeftColor: CssProperty get() = CssProperty("border-left-color")
public inline val CssProperty.Companion.borderRightColor: CssProperty get() = CssProperty("border-right-color")
public inline val CssProperty.Companion.borderTopColor: CssProperty get() = CssProperty("border-top-color")
