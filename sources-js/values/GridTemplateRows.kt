@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


/** Represents a CSS `grid-template-rows` value. */
@JsName("0;0")
public external interface GridTemplateRows : CssValue {

	public companion object;


	/** A [GridTemplateRows] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : GridTemplateRows, CssVariable<GridTemplateRows>
}


/** Creates a [GridTemplateRows] from an unchecked string [value]. */
public inline fun GridTemplateRows.Companion.unsafe(value: String): GridTemplateRows =
	CssValue.unsafe(value)


/** Creates a [GridTemplateRows] backed by a CSS variable with the given [name]. */
public inline fun GridTemplateRows.Companion.variable(name: String): GridTemplateRows.Variable =
	CssVariable.unsafe(name)


/** Sets the `grid-template-rows` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: GridTemplateRows) {
	property(gridTemplateRows, value)
}


/** The `grid-template-rows` CSS property. */
@Suppress("unused")
public inline val CssProperties.gridTemplateRows: CssProperty<GridTemplateRows>
	get() = CssProperty.unsafe("grid-template-rows")
