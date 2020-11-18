@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.padding(all: LengthOrPercentageOrGlobal) {
	property(CssProperty.padding, all)
}


public inline fun CssDeclarationBlockBuilder.padding(vertical: LengthOrPercentage, horizontal: LengthOrPercentage) {
	if (vertical == horizontal)
		padding(all = vertical)
	else
		property(CssProperty.padding, "$vertical $horizontal")
}


public inline fun CssDeclarationBlockBuilder.padding(top: LengthOrPercentage, horizontal: LengthOrPercentage, bottom: LengthOrPercentage) {
	if (top == bottom)
		padding(vertical = top, horizontal = horizontal)
	else
		property(CssProperty.padding, "$top $horizontal $bottom")
}


public inline fun CssDeclarationBlockBuilder.padding(top: LengthOrPercentage, right: LengthOrPercentage, bottom: LengthOrPercentage, left: LengthOrPercentage) {
	if (left == right)
		padding(top = top, horizontal = left, bottom = bottom)
	else
		property(CssProperty.padding, "$top $left $bottom $right")
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.padding(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.padding, value, *defaultValues)
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.padding(
	all: LengthOrPercentage? = null,
	vertical: LengthOrPercentage? = all,
	horizontal: LengthOrPercentage? = all,
	top: LengthOrPercentage? = vertical,
	right: LengthOrPercentage? = horizontal,
	bottom: LengthOrPercentage? = vertical,
	left: LengthOrPercentage? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		padding(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			paddingTop(top)
		if (right != null)
			paddingRight(right)
		if (bottom != null)
			paddingBottom(bottom)
		if (left != null)
			paddingLeft(left)
	}
}


public inline fun CssDeclarationBlockBuilder.paddingBottom(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.paddingBottom, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.paddingBottom(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.paddingBottom, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.paddingLeft(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.paddingLeft, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.paddingLeft(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.paddingLeft, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.paddingRight(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.paddingRight, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.paddingRight(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.paddingRight, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.paddingTop(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.paddingTop, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.paddingTop(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.paddingTop, value, *defaultValues)
}


public inline val CssProperty.Companion.padding: CssProperty get() = CssProperty("padding")
public inline val CssProperty.Companion.paddingBottom: CssProperty get() = CssProperty("padding-bottom")
public inline val CssProperty.Companion.paddingLeft: CssProperty get() = CssProperty("padding-left")
public inline val CssProperty.Companion.paddingRight: CssProperty get() = CssProperty("padding-right")
public inline val CssProperty.Companion.paddingTop: CssProperty get() = CssProperty("padding-top")
