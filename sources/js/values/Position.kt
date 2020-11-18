@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface PositionOrGlobal : CssValue
public interface Position : PositionOrGlobal {

	public companion object {

		public val static: Position = Position("static")
		public val relative: Position = Position("relative")
		public val absolute: Position = Position("absolute")
		public val fixed: Position = Position("fixed")
		public val sticky: Position = Position("sticky")
	}
}


private class PositionImpl(value: String) : CssValueBase(value), Position


@Suppress("FunctionName")
public fun Position(value: String): Position =
	CssValue(value, ::PositionImpl)


public inline fun CssDeclarationBlockBuilder.position(value: Position) {
	property(CssProperty.position, value)
}


public inline fun CssDeclarationBlockBuilder.position(value: PositionOrGlobal) {
	property(CssProperty.position, value)
}


public inline fun CssDeclarationBlockBuilder.position(value: GlobalValue) {
	property(CssProperty.position, value)
}


public inline fun CssDeclarationBlockBuilder.position(value: CustomCssProperty<out PositionOrGlobal>) {
	property(CssProperty.position, value)
}


public inline fun CssDeclarationBlockBuilder.bottom(value: AutoValue) {
	property(CssProperty.bottom, value)
}


public inline fun CssDeclarationBlockBuilder.bottom(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.bottom, value)
}


public inline fun CssDeclarationBlockBuilder.bottom(value: GlobalValue) {
	property(CssProperty.bottom, value)
}


public inline fun CssDeclarationBlockBuilder.bottom(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.bottom, value)
}


public inline fun CssDeclarationBlockBuilder.left(value: AutoValue) {
	property(CssProperty.left, value)
}


public inline fun CssDeclarationBlockBuilder.left(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.left, value)
}


public inline fun CssDeclarationBlockBuilder.left(value: GlobalValue) {
	property(CssProperty.left, value)
}


public inline fun CssDeclarationBlockBuilder.left(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.left, value)
}


public inline fun CssDeclarationBlockBuilder.right(value: AutoValue) {
	property(CssProperty.right, value)
}


public inline fun CssDeclarationBlockBuilder.right(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.right, value)
}


public inline fun CssDeclarationBlockBuilder.right(value: GlobalValue) {
	property(CssProperty.right, value)
}


public inline fun CssDeclarationBlockBuilder.right(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.right, value)
}


public inline fun CssDeclarationBlockBuilder.top(value: AutoValue) {
	property(CssProperty.top, value)
}


public inline fun CssDeclarationBlockBuilder.top(value: LengthOrPercentageOrAutoOrGlobal) {
	property(CssProperty.top, value)
}


public inline fun CssDeclarationBlockBuilder.top(value: GlobalValue) {
	property(CssProperty.top, value)
}


public inline fun CssDeclarationBlockBuilder.top(value: CustomCssProperty<out LengthOrPercentageOrAutoOrGlobal>) {
	property(CssProperty.top, value)
}


public inline val CssProperty.Companion.bottom: CssProperty get() = CssProperty("bottom")
public inline val CssProperty.Companion.left: CssProperty get() = CssProperty("left")
public inline val CssProperty.Companion.position: CssProperty get() = CssProperty("position")
public inline val CssProperty.Companion.right: CssProperty get() = CssProperty("right")
public inline val CssProperty.Companion.top: CssProperty get() = CssProperty("top")
