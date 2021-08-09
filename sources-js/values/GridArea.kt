@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


@JsName("0;0")
public external interface GridArea : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : GridArea, CssVariable<GridArea>
}


public inline fun GridArea.Companion.unsafe(value: String): GridArea =
	CssValue.unsafe(value)


public inline fun GridArea.Companion.variable(name: String): GridArea.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridArea(value: GridArea) {
	property(gridArea, value)
}


@Suppress("unused")
public inline val CssProperties.gridArea: CssProperty<GridArea>
	get() = CssProperty.unsafe("grid-area")
