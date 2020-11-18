@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderWidthOrGlobal : CssValue
public interface BorderWidth : BorderWidthOrGlobal {

	public companion object {

		public val medium: BorderWidth = BorderWidth("medium")
		public val thin: BorderWidth = BorderWidth("thin")
		public val think: BorderWidth = BorderWidth("thick")
	}
}


private class BorderWidthImpl(value: String) : CssValueImpl(value), BorderWidth


@Suppress("FunctionName")
public fun BorderWidth(value: String): BorderWidth =
	BorderWidthImpl(value)


public inline fun CssDeclarationBlockBuilder.borderWidth(all: BorderWidth) {
	property(CssProperty.borderWidth, all)
}


public inline fun CssDeclarationBlockBuilder.borderWidth(all: BorderWidthOrGlobal) {
	property(CssProperty.borderWidth, all)
}


public inline fun CssDeclarationBlockBuilder.borderWidth(all: GlobalValue) {
	property(CssProperty.borderWidth, all)
}


public inline fun CssDeclarationBlockBuilder.borderWidth(all: CustomCssProperty<out BorderWidthOrGlobal>) {
	property(CssProperty.borderWidth, all)
}


public inline fun CssDeclarationBlockBuilder.borderWidth(vertical: BorderWidth, horizontal: BorderWidth) {
	if (vertical == horizontal)
		borderWidth(all = vertical)
	else
		property(CssProperty.borderWidth, "$vertical $horizontal")
}


public inline fun CssDeclarationBlockBuilder.borderWidth(top: BorderWidth, horizontal: BorderWidth, bottom: BorderWidth) {
	if (top == bottom)
		borderWidth(vertical = top, horizontal = horizontal)
	else
		property(CssProperty.borderWidth, "$top $horizontal $bottom")
}


public inline fun CssDeclarationBlockBuilder.borderWidth(top: BorderWidth, right: BorderWidth, bottom: BorderWidth, left: BorderWidth) {
	if (left == right)
		borderWidth(top = top, horizontal = left, bottom = bottom)
	else
		property(CssProperty.borderWidth, "$top $left $bottom $right")
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderWidth(
	all: BorderWidth? = null,
	vertical: BorderWidth? = all,
	horizontal: BorderWidth? = all,
	top: BorderWidth? = vertical,
	right: BorderWidth? = horizontal,
	bottom: BorderWidth? = vertical,
	left: BorderWidth? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderWidth(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopWidth(top)
		if (right != null)
			borderRightWidth(right)
		if (bottom != null)
			borderBottomWidth(bottom)
		if (left != null)
			borderLeftWidth(left)
	}
}


public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: BorderWidth) {
	property(CssProperty.borderBottomWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: BorderWidthOrGlobal) {
	property(CssProperty.borderBottomWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: GlobalValue) {
	property(CssProperty.borderBottomWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: CustomCssProperty<out BorderWidthOrGlobal>) {
	property(CssProperty.borderBottomWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: BorderWidth) {
	property(CssProperty.borderLeftWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: BorderWidthOrGlobal) {
	property(CssProperty.borderLeftWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: GlobalValue) {
	property(CssProperty.borderLeftWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: CustomCssProperty<out BorderWidthOrGlobal>) {
	property(CssProperty.borderLeftWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: BorderWidth) {
	property(CssProperty.borderRightWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: BorderWidthOrGlobal) {
	property(CssProperty.borderRightWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: GlobalValue) {
	property(CssProperty.borderRightWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: CustomCssProperty<out BorderWidthOrGlobal>) {
	property(CssProperty.borderRightWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: BorderWidth) {
	property(CssProperty.borderTopWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: BorderWidthOrGlobal) {
	property(CssProperty.borderTopWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: GlobalValue) {
	property(CssProperty.borderTopWidth, value)
}


public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: CustomCssProperty<out BorderWidthOrGlobal>) {
	property(CssProperty.borderTopWidth, value)
}


public inline val CssProperty.Companion.borderWidth: CssProperty get() = CssProperty("border-width")
public inline val CssProperty.Companion.borderBottomWidth: CssProperty get() = CssProperty("border-bottom-width")
public inline val CssProperty.Companion.borderLeftWidth: CssProperty get() = CssProperty("border-left-width")
public inline val CssProperty.Companion.borderRightWidth: CssProperty get() = CssProperty("border-right-width")
public inline val CssProperty.Companion.borderTopWidth: CssProperty get() = CssProperty("border-top-width")
