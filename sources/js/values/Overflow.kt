@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface OverflowOrGlobal : CssValue
public interface Overflow : OverflowOrGlobal {

	public companion object {

		public val auto: Overflow = AutoValue.auto

		public val hidden: Overflow = Overflow("hidden")
		public val scroll: Overflow = Overflow("scroll")
		public val visible: Overflow = Overflow("visible")
	}
}


private class OverflowImpl(value: String) : CssValueImpl(value), Overflow


@Suppress("FunctionName")
public fun Overflow(value: String): Overflow =
	OverflowImpl(value)


public inline fun CssDeclarationBlockBuilder.overflow(all: Overflow) {
	property(CssProperty.overflow, all)
}


public inline fun CssDeclarationBlockBuilder.overflow(all: OverflowOrGlobal) {
	property(CssProperty.overflow, all)
}


public inline fun CssDeclarationBlockBuilder.overflow(all: GlobalValue) {
	property(CssProperty.overflow, all)
}


public inline fun CssDeclarationBlockBuilder.overflow(all: CustomCssProperty<out OverflowOrGlobal>) {
	property(CssProperty.overflow, all)
}


public inline fun CssDeclarationBlockBuilder.overflow(x: Overflow, y: Overflow) {
	if (x == y)
		overflow(x)
	else
		property(CssProperty.overflow, "$x $y")
}


public inline fun CssDeclarationBlockBuilder.overflowX(value: Overflow) {
	property(CssProperty.overflowX, value)
}


public inline fun CssDeclarationBlockBuilder.overflowX(value: OverflowOrGlobal) {
	property(CssProperty.overflowX, value)
}


public inline fun CssDeclarationBlockBuilder.overflowX(value: GlobalValue) {
	property(CssProperty.overflowX, value)
}


public inline fun CssDeclarationBlockBuilder.overflowX(value: CustomCssProperty<out OverflowOrGlobal>) {
	property(CssProperty.overflowX, value)
}


public inline fun CssDeclarationBlockBuilder.overflowY(value: Overflow) {
	property(CssProperty.overflowY, value)
}


public inline fun CssDeclarationBlockBuilder.overflowY(value: OverflowOrGlobal) {
	property(CssProperty.overflowY, value)
}


public inline fun CssDeclarationBlockBuilder.overflowY(value: GlobalValue) {
	property(CssProperty.overflowY, value)
}


public inline fun CssDeclarationBlockBuilder.overflowY(value: CustomCssProperty<out OverflowOrGlobal>) {
	property(CssProperty.overflowY, value)
}


public inline val CssProperty.Companion.overflow: CssProperty get() = CssProperty("overflow")
public inline val CssProperty.Companion.overflowX: CssProperty get() = CssProperty("overflow-x")
public inline val CssProperty.Companion.overflowY: CssProperty get() = CssProperty("overflow-y")
