@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderCollapse : CssValue {

	public companion object {

		public val collapse: BorderCollapse = BorderCollapse("collapse")
		public val separate: BorderCollapse = BorderCollapse("separate")
	}
}


private class BorderCollapseImpl(value: String) : CssValueImpl(value), BorderCollapse


@Suppress("FunctionName")
public fun BorderCollapse(value: String): BorderCollapse =
	BorderCollapseImpl(value)


public inline fun CssDeclarationBlockBuilder.borderCollapse(value: BorderCollapse) {
	property(CssProperty.borderCollapse, value)
}


public inline fun CssDeclarationBlockBuilder.borderCollapse(value: GlobalValue) {
	property(CssProperty.borderCollapse, value)
}


public inline fun CssDeclarationBlockBuilder.borderCollapse(value: CustomCssProperty<out BorderCollapse>) {
	property(CssProperty.borderCollapse, value)
}


public inline val CssProperty.Companion.borderCollapse: CssProperty get() = CssProperty("border-collapse")
