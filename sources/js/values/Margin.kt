@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.margin(all: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.margin, all)
}


public inline fun CssDeclarationBlockBuilder.margin(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.margin, value)
}


public inline fun CssDeclarationBlockBuilder.margin(vertical: LengthOrPercentageOrAuto, horizontal: LengthOrPercentageOrAuto) {
	if (vertical == horizontal)
		margin(all = vertical)
	else
		property(CssProperty.margin, "$vertical $horizontal")
}


public inline fun CssDeclarationBlockBuilder.margin(top: LengthOrPercentageOrAuto, horizontal: LengthOrPercentageOrAuto, bottom: LengthOrPercentageOrAuto) {
	if (top == bottom)
		margin(vertical = top, horizontal = horizontal)
	else
		property(CssProperty.margin, "$top $horizontal $bottom")
}


public inline fun CssDeclarationBlockBuilder.margin(
	top: LengthOrPercentageOrAuto,
	right: LengthOrPercentageOrAuto,
	bottom: LengthOrPercentageOrAuto,
	left: LengthOrPercentageOrAuto,
) {
	if (left == right)
		margin(top = top, horizontal = left, bottom = bottom)
	else
		property(CssProperty.margin, "$top $left $bottom $right")
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.margin(
	all: LengthOrPercentageOrAuto? = null,
	vertical: LengthOrPercentageOrAuto? = all,
	horizontal: LengthOrPercentageOrAuto? = all,
	top: LengthOrPercentageOrAuto? = vertical,
	right: LengthOrPercentageOrAuto? = horizontal,
	bottom: LengthOrPercentageOrAuto? = vertical,
	left: LengthOrPercentageOrAuto? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		margin(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			marginTop(top)
		if (right != null)
			marginRight(right)
		if (bottom != null)
			marginBottom(bottom)
		if (left != null)
			marginLeft(left)
	}
}


public inline fun CssDeclarationBlockBuilder.marginBottom(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.marginBottom, value)
}


public inline fun CssDeclarationBlockBuilder.marginBottom(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.marginBottom, value)
}


public inline fun CssDeclarationBlockBuilder.marginLeft(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.marginLeft, value)
}


public inline fun CssDeclarationBlockBuilder.marginLeft(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.marginLeft, value)
}


public inline fun CssDeclarationBlockBuilder.marginRight(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.marginRight, value)
}


public inline fun CssDeclarationBlockBuilder.marginRight(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.marginRight, value)
}


public inline fun CssDeclarationBlockBuilder.marginTop(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.marginTop, value)
}


public inline fun CssDeclarationBlockBuilder.marginTop(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.marginTop, value)
}


public inline val CssProperty.Companion.margin: CssProperty get() = CssProperty("margin")
public inline val CssProperty.Companion.marginBottom: CssProperty get() = CssProperty("margin-bottom")
public inline val CssProperty.Companion.marginLeft: CssProperty get() = CssProperty("margin-left")
public inline val CssProperty.Companion.marginRight: CssProperty get() = CssProperty("margin-right")
public inline val CssProperty.Companion.marginTop: CssProperty get() = CssProperty("margin-top")
