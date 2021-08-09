@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TransformOrigin : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TransformOrigin, CssVariable<TransformOrigin>
}


public inline fun TransformOrigin.Companion.of(
	xy: LengthOrPercentage,
): TransformOrigin =
	unsafe(xy.asString())


public inline fun TransformOrigin.Companion.of(
	x: TransformOriginX,
): TransformOrigin =
	unsafe(x.asString())


public inline fun TransformOrigin.Companion.of(
	y: TransformOriginY,
): TransformOrigin =
	unsafe("50% $y")


public inline fun TransformOrigin.Companion.of(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
): TransformOrigin =
	unsafe("$x $y $z")


public inline fun TransformOrigin.Companion.unsafe(value: String): TransformOrigin =
	CssValue.unsafe(value)


public inline fun TransformOrigin.Companion.variable(name: String): TransformOrigin.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(value: TransformOrigin) {
	property(transformOrigin, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(xy: LengthOrPercentage) {
	transformOrigin(TransformOrigin.of(xy = xy))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(x: TransformOriginX) {
	transformOrigin(TransformOrigin.of(x = x))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(y: TransformOriginY) {
	transformOrigin(TransformOrigin.of(y = y))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
) {
	transformOrigin(TransformOrigin.of(x = x, y = y, z = z))
}


@Suppress("unused")
public inline val CssProperties.transformOrigin: CssProperty<TransformOrigin>
	get() = CssProperty.unsafe("transform-origin")
