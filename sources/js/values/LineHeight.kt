@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LineHeightOrGlobal : CssValue
public interface LineHeight : LineHeightOrGlobal {

	public companion object {

		public val normal: LineHeight = LineHeight("normal")
	}
}


private class LineHeightImpl(value: String) : CssValueImpl(value), LineHeight


@Suppress("FunctionName")
public fun LineHeight(value: Number): LineHeight =
	LineHeightImpl(value.toString())


@Suppress("FunctionName")
public fun LineHeight(value: String): LineHeight =
	LineHeightImpl(value)


public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(CssProperty.lineHeight, value)
}


public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeightOrGlobal) {
	property(CssProperty.lineHeight, value)
}


public inline fun CssDeclarationBlockBuilder.lineHeight(value: GlobalValue) {
	property(CssProperty.lineHeight, value)
}


public inline fun CssDeclarationBlockBuilder.lineHeight(value: Number) {
	property(CssProperty.lineHeight, value)
}


public inline fun CssDeclarationBlockBuilder.lineHeight(value: CustomCssProperty<out LineHeightOrGlobal>) {
	property(CssProperty.lineHeight, value)
}


public inline fun CssDeclarationBlockBuilder.lineHeight(value: CustomCssProperty<out Number>) {
	property(CssProperty.lineHeight, value)
}


public inline val CssProperty.Companion.lineHeight: CssProperty get() = CssProperty("line-height")
