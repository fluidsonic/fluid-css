@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TransformOrigin : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		public inline fun of(
			xy: LengthOrPercentage,
		): TransformOrigin =
			unsafe(xy.asString())


		public inline fun of(
			x: TransformOriginX,
		): TransformOrigin =
			unsafe(x.asString())


		public inline fun of(
			y: TransformOriginY,
		): TransformOrigin =
			unsafe("50% $y")


		public inline fun of(
			x: TransformOriginX = 50.percent,
			y: TransformOriginY = 50.percent,
			z: Length = Length.zero,
		): TransformOrigin =
			unsafe("$x $y $z")


		public inline fun unsafe(value: String): TransformOrigin =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
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
	get() = CssProperty.unsafe("transform-origin")
