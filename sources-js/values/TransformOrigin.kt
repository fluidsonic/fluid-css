@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `transform-origin` value. */
@JsName("0;0")
public external interface TransformOrigin : CssValue {

	public companion object;


	/** A [TransformOrigin] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TransformOrigin, CssVariable<TransformOrigin>
}


/** Creates a [TransformOrigin] from a single length or percentage. */
public inline fun TransformOrigin.Companion.of(
	xy: LengthOrPercentage,
): TransformOrigin =
	unsafe(xy.asString())


/** Creates a [TransformOrigin] from a horizontal origin. */
public inline fun TransformOrigin.Companion.of(
	x: TransformOriginX,
): TransformOrigin =
	unsafe(x.asString())


/** Creates a [TransformOrigin] from a vertical origin. */
public inline fun TransformOrigin.Companion.of(
	y: TransformOriginY,
): TransformOrigin =
	unsafe("50% $y")


/** Creates a [TransformOrigin] with x, y, and z values. */
public inline fun TransformOrigin.Companion.of(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
): TransformOrigin =
	unsafe("$x $y $z")


/** Creates a [TransformOrigin] from an unchecked string [value]. */
public inline fun TransformOrigin.Companion.unsafe(value: String): TransformOrigin =
	CssValue.unsafe(value)


/** Creates a [TransformOrigin] backed by a CSS variable with the given [name]. */
public inline fun TransformOrigin.Companion.variable(name: String): TransformOrigin.Variable =
	CssVariable.unsafe(name)


/** Sets the `transform-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(value: TransformOrigin) {
	property(transformOrigin, value)
}


/** Sets the `transform-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(xy: LengthOrPercentage) {
	transformOrigin(TransformOrigin.of(xy = xy))
}


/** Sets the `transform-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(x: TransformOriginX) {
	transformOrigin(TransformOrigin.of(x = x))
}


/** Sets the `transform-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(y: TransformOriginY) {
	transformOrigin(TransformOrigin.of(y = y))
}


/** Sets the `transform-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transformOrigin(
	x: TransformOriginX = 50.percent,
	y: TransformOriginY = 50.percent,
	z: Length = Length.zero,
) {
	transformOrigin(TransformOrigin.of(x = x, y = y, z = z))
}


/** The `transform-origin` CSS property. */
@Suppress("unused")
public inline val CssProperties.transformOrigin: CssProperty<TransformOrigin>
	get() = CssProperty.unsafe("transform-origin")
