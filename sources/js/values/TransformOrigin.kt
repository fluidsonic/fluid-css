@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOrigin : CssValue, Internal {

	public companion object {

		public inline fun of(
			xy: LengthOrPercentage,
		): TransformOrigin =
			raw(xy.toString())


		public inline fun of(
			x: TransformOriginX,
		): TransformOrigin =
			raw(x.toString())


		public inline fun of(
			y: TransformOriginY,
		): TransformOrigin =
			raw("50% $y")


		public inline fun of(
			x: TransformOriginX = 50.percent,
			y: TransformOriginY = 50.percent,
			z: Length = Length.zero,
		): TransformOrigin =
			raw("$x $y $z")


		public fun raw(value: String): TransformOrigin =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TransformOrigin, CssVariable<TransformOrigin>
}


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
	get() = CssProperty("transform-origin")
