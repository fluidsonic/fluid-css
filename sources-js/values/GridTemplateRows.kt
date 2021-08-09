@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


@JsName("0;0")
public external interface GridTemplateRows : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : GridTemplateRows, CssVariable<GridTemplateRows>
}


public inline fun GridTemplateRows.Companion.unsafe(value: String): GridTemplateRows =
	CssValue.unsafe(value)


public inline fun GridTemplateRows.Companion.variable(name: String): GridTemplateRows.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: GridTemplateRows) {
	property(gridTemplateRows, value)
}


@Suppress("unused")
public inline val CssProperties.gridTemplateRows: CssProperty<GridTemplateRows>
	get() = CssProperty.unsafe("grid-template-rows")
