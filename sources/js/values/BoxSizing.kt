@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BoxSizing : CssValue {

	public companion object {

		public val contentBox: BoxSizing = BoxSizing("content-box")
		public val borderBox: BoxSizing = BoxSizing("border-box")
	}
}


private class BoxSizingImpl(value: String) : CssValueBase(value), BoxSizing


@Suppress("FunctionName")
public fun BoxSizing(value: String): BoxSizing =
	BoxSizingImpl(value)


public inline fun CssDeclarationBlockBuilder.boxSizing(value: BoxSizing) {
	property(CssProperty.boxSizing, value)
}


public inline fun CssDeclarationBlockBuilder.boxSizing(value: GlobalValue) {
	property(CssProperty.boxSizing, value)
}


public inline fun CssDeclarationBlockBuilder.boxSizing(value: CustomCssProperty<out BoxSizing>) {
	property(CssProperty.boxSizing, value)
}


public inline val CssProperty.Companion.boxSizing: CssProperty get() = CssProperty("box-sizing")
