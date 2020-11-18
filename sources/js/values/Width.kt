@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface WidthOrAutoOrGlobal : CssValue
public interface WidthOrNoneOrGlobal : CssValue
public interface Width : WidthOrAutoOrGlobal, WidthOrNoneOrGlobal {

	public companion object {

		public val auto: AutoValue = AutoValue.auto
		public val maxContent: Width = Width("max-content")
		public val minContent: Width = Width("min-content")
		public val none: NoneValue = NoneValue.none

		public fun fitContent(width: LengthOrPercentage): Width =
			Width("fit-content($width)")
	}
}


private class WidthImpl(value: String) : CssValueBase(value), Width


@Suppress("FunctionName")
public fun Width(value: String): Width =
	WidthImpl(value)


public inline fun CssDeclarationBlockBuilder.maxWidth(value: GlobalValue) {
	property(CssProperty.maxWidth, value)
}


public inline fun CssDeclarationBlockBuilder.maxWidth(value: NoneValue) {
	property(CssProperty.maxWidth, value)
}


public inline fun CssDeclarationBlockBuilder.maxWidth(value: Width) {
	property(CssProperty.maxWidth, value)
}


public inline fun CssDeclarationBlockBuilder.maxWidth(value: WidthOrNoneOrGlobal) {
	property(CssProperty.maxWidth, value)
}


public inline fun CssDeclarationBlockBuilder.maxWidth(value: CustomCssProperty<out WidthOrNoneOrGlobal>) {
	property(CssProperty.maxWidth, value)
}


public inline fun CssDeclarationBlockBuilder.minWidth(value: GlobalValue) {
	property(CssProperty.minWidth, value)
}


public inline fun CssDeclarationBlockBuilder.minWidth(value: NoneValue) {
	property(CssProperty.minWidth, value)
}


public inline fun CssDeclarationBlockBuilder.minWidth(value: Width) {
	property(CssProperty.minWidth, value)
}


public inline fun CssDeclarationBlockBuilder.minWidth(value: WidthOrNoneOrGlobal) {
	property(CssProperty.minWidth, value)
}


public inline fun CssDeclarationBlockBuilder.minWidth(value: CustomCssProperty<out WidthOrNoneOrGlobal>) {
	property(CssProperty.minWidth, value)
}


public inline fun CssDeclarationBlockBuilder.width(value: AutoValue) {
	property(CssProperty.width, value)
}


public inline fun CssDeclarationBlockBuilder.width(value: Width) {
	property(CssProperty.width, value)
}


public inline fun CssDeclarationBlockBuilder.width(value: WidthOrAutoOrGlobal) {
	property(CssProperty.width, value)
}


public inline fun CssDeclarationBlockBuilder.width(value: GlobalValue) {
	property(CssProperty.width, value)
}


public inline fun CssDeclarationBlockBuilder.width(value: CustomCssProperty<out WidthOrAutoOrGlobal>) {
	property(CssProperty.width, value)
}


public inline val CssProperty.Companion.maxWidth: CssProperty get() = CssProperty("max-width")
public inline val CssProperty.Companion.minWidth: CssProperty get() = CssProperty("min-width")
public inline val CssProperty.Companion.width: CssProperty get() = CssProperty("width")
