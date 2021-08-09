@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


@JsName("0;0")
public external interface GridTemplate : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : GridTemplate, CssVariable<GridTemplate>
}


public inline fun GridTemplate.Companion.unsafe(value: String): GridTemplate =
	CssValue.unsafe(value)


public inline fun GridTemplate.Companion.variable(name: String): GridTemplate.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplate(value: GridTemplate) {
	property(gridTemplate, value)
}


@Suppress("unused")
public inline val CssProperties.gridTemplate: CssProperty<GridTemplate>
	get() = CssProperty.unsafe("grid-template")
