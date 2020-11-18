@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridTemplate : CssValue {

	public companion object
}


private class GridTemplateImpl(value: String) : CssValueBase(value), GridTemplate


@Suppress("FunctionName")
public fun GridTemplate(value: String): GridTemplate =
	GridTemplateImpl(value)


public inline fun CssDeclarationBlockBuilder.gridTemplate(value: GridTemplate) {
	property(CssProperty.gridTemplate, value)
}


public inline fun CssDeclarationBlockBuilder.gridTemplate(value: GlobalValue) {
	property(CssProperty.gridTemplate, value)
}


public inline fun CssDeclarationBlockBuilder.gridTemplate(value: CustomCssProperty<out GridTemplate>) {
	property(CssProperty.gridTemplate, value)
}


public inline val CssProperty.Companion.gridTemplate: CssProperty get() = CssProperty("grid-template")
