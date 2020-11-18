@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridArea : CssValue {

	public companion object
}


private class GridAreaImpl(value: String) : CssValueImpl(value), GridArea


@Suppress("FunctionName")
public fun GridArea(value: String): GridArea =
	GridAreaImpl(value)


public inline fun CssDeclarationBlockBuilder.gridArea(value: GridArea) {
	property(CssProperty.gridArea, value)
}


public inline fun CssDeclarationBlockBuilder.gridArea(value: GlobalValue) {
	property(CssProperty.gridArea, value)
}


public inline fun CssDeclarationBlockBuilder.gridArea(value: CustomCssProperty<out GridArea>) {
	property(CssProperty.gridArea, value)
}


public inline val CssProperty.Companion.gridArea: CssProperty get() = CssProperty("grid-area")
