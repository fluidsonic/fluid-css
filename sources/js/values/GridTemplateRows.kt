@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridTemplateRows : CssValue {

	public companion object
}


private class GridTemplateRowsImpl(value: String) : CssValueBase(value), GridTemplateRows


@Suppress("FunctionName")
public fun GridTemplateRows(value: String): GridTemplateRows =
	GridTemplateRowsImpl(value)


public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: GridTemplateRows) {
	property(CssProperty.gridTemplateRows, value)
}


public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: GlobalValue) {
	property(CssProperty.gridTemplateRows, value)
}


public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: CustomCssProperty<out GridTemplateRows>) {
	property(CssProperty.gridTemplateRows, value)
}


public inline val CssProperty.Companion.gridTemplateRows: CssProperty get() = CssProperty("grid-template-rows")
