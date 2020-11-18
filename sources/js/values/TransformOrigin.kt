@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOrigin : CssValue {

	public companion object
}


private class TransformOriginImpl(value: String) : CssValueBase(value), TransformOrigin


@Suppress("FunctionName")
public fun TransformOrigin(value: String): TransformOrigin =
	TransformOriginImpl(value)


@Suppress("FunctionName")
public fun TransformOrigin(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
): TransformOrigin =
	TransformOriginImpl("$x $y $z")


public inline fun CssDeclarationBlockBuilder.transformOrigin(xy: LengthOrPercentage) {
	property(CssProperty.transformOrigin, xy)
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(x: TransformOriginX) {
	property(CssProperty.transformOrigin, x)
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(y: TransformOriginY) {
	property(CssProperty.transformOrigin, "50% $y")
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
) {
	transformOrigin(TransformOrigin(x = x, y = y, z = z))
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(value: TransformOrigin) {
	property(CssProperty.transformOrigin, value)
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(value: GlobalValue) {
	property(CssProperty.transformOrigin, value)
}


public inline fun CssDeclarationBlockBuilder.transformOrigin(value: CustomCssProperty<out TransformOrigin>) {
	property(CssProperty.transformOrigin, value)
}


public inline val CssProperty.Companion.transformOrigin: CssProperty get() = CssProperty("transform-origin")
