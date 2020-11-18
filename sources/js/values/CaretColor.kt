@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CaretColor : CssValue {

	public companion object {

		public val auto: CaretColor = raw("auto")


		public fun raw(value: String): CaretColor =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), CaretColor
}


public inline fun CssDeclarationBlockBuilder.caretColor(all: CaretColor) {
	property(CssProperty.caretColor, all)
}


public inline fun CssDeclarationBlockBuilder.caretColor(all: GlobalValue) {
	property(CssProperty.caretColor, all)
}


public inline val CssProperty.Companion.caretColor: CssProperty get() = CssProperty("caret-color")
