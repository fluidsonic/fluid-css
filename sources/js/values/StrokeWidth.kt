@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface StrokeWidthOrGlobal : CssValue
public interface StrokeWidth : StrokeWidthOrGlobal {

	public companion object {

		public fun raw(value: String): StrokeWidth =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), StrokeWidth
}


public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidth) {
	property(CssProperty.strokeWidth, value)
}


public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidthOrGlobal) {
	property(CssProperty.strokeWidth, value)
}


public inline fun CssDeclarationBlockBuilder.strokeWidth(value: GlobalValue) {
	property(CssProperty.strokeWidth, value)
}


public inline fun CssDeclarationBlockBuilder.strokeWidth(value: CustomCssProperty<out StrokeWidthOrGlobal>) {
	property(CssProperty.strokeWidth, value)
}


public inline val CssProperty.Companion.strokeWidth: CssProperty get() = CssProperty("stroke-width")
