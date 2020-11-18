@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support 2nd radius w/ builder


public inline fun CssDeclarationBlockBuilder.borderRadius(all: LengthOrPercentageOrGlobal) {
	property(CssProperty.borderRadius, all)
}


// FIXME improve this & apply to all properties
public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.borderRadius(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.borderRadius, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.borderRadius(topLeftBottomRight: LengthOrPercentage, topRightBottomLeft: LengthOrPercentage) {
	if (topLeftBottomRight == topRightBottomLeft)
		borderRadius(all = topLeftBottomRight)
	else
		property(CssProperty.borderRadius, "$topLeftBottomRight $topRightBottomLeft")
}


public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: LengthOrPercentage,
	topRightBottomLeft: LengthOrPercentage,
	bottomRight: LengthOrPercentage,
) {
	if (topLeft == bottomRight)
		borderRadius(topLeftBottomRight = topLeft, topRightBottomLeft = topRightBottomLeft)
	else
		property(CssProperty.borderRadius, "$topLeft $topRightBottomLeft $bottomRight")
}


public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: LengthOrPercentage,
	topRight: LengthOrPercentage,
	bottomRight: LengthOrPercentage,
	bottomLeft: LengthOrPercentage,
) {
	if (topRight == bottomLeft)
		borderRadius(topLeft = topLeft, topRightBottomLeft = topRight, bottomRight = bottomRight)
	else
		property(CssProperty.borderRadius, "$topLeft $topRight $bottomRight $bottomLeft")
}


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderRadius(
	all: LengthOrPercentage? = null,
	topLeft: LengthOrPercentage? = all,
	topRight: LengthOrPercentage? = all,
	bottomRight: LengthOrPercentage? = all,
	bottomLeft: LengthOrPercentage? = all,
) {
	if (topLeft != null && topRight != null && bottomRight != null && bottomLeft != null)
		borderRadius(topLeft = topLeft, topRight = topRight, bottomRight = bottomRight, bottomLeft = bottomLeft)
	else {
		if (topLeft != null)
			borderTopLeftRadius(topLeft)
		if (topRight != null)
			borderTopRightRadius(topRight)
		if (bottomRight != null)
			borderBottomRightRadius(bottomRight)
		if (bottomLeft != null)
			borderBottomLeftRadius(bottomLeft)
	}
}


public inline fun CssDeclarationBlockBuilder.borderBottomRadius(value: LengthOrPercentageOrGlobal) {
	borderBottomLeftRadius(value)
	borderBottomRightRadius(value)
}


public inline fun CssDeclarationBlockBuilder.borderBottomLeftRadius(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.borderBottomLeftRadius, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.borderBottomLeftRadius(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.borderBottomLeftRadius, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.borderBottomRightRadius(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.borderBottomRightRadius, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.borderBottomRightRadius(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.borderBottomRightRadius, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.borderLeftRadius(value: LengthOrPercentageOrGlobal) {
	borderBottomLeftRadius(value)
	borderTopLeftRadius(value)
}


public inline fun CssDeclarationBlockBuilder.borderRightRadius(value: LengthOrPercentageOrGlobal) {
	borderBottomRightRadius(value)
	borderTopRightRadius(value)
}


public inline fun CssDeclarationBlockBuilder.borderTopRadius(value: LengthOrPercentageOrGlobal) {
	borderTopLeftRadius(value)
	borderTopRightRadius(value)
}


public inline fun CssDeclarationBlockBuilder.borderTopLeftRadius(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.borderTopLeftRadius, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.borderTopLeftRadius(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.borderTopLeftRadius, value, *defaultValues)
}


public inline fun CssDeclarationBlockBuilder.borderTopRightRadius(value: LengthOrPercentageOrGlobal) {
	property(CssProperty.borderTopRightRadius, value)
}


public inline fun <Value : LengthOrPercentageOrGlobal> CssDeclarationBlockBuilder.borderTopRightRadius(
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(CssProperty.borderTopRightRadius, value, *defaultValues)
}


public inline val CssProperty.Companion.borderRadius: CssProperty get() = CssProperty("border-radius")
public inline val CssProperty.Companion.borderBottomLeftRadius: CssProperty get() = CssProperty("border-bottom-left-radius")
public inline val CssProperty.Companion.borderBottomRightRadius: CssProperty get() = CssProperty("border-bottom-right-radius")
public inline val CssProperty.Companion.borderTopLeftRadius: CssProperty get() = CssProperty("border-top-left-radius")
public inline val CssProperty.Companion.borderTopRightRadius: CssProperty get() = CssProperty("border-top-right-radius")
