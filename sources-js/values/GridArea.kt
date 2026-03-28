@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


/** Represents a CSS `grid-area` value. */
@JsName("0;0")
public external interface GridArea : CssValue {

	public companion object;


	/** A [GridArea] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : GridArea, CssVariable<GridArea>
}


/** Creates a [GridArea] from an unchecked string [value]. */
public inline fun GridArea.Companion.unsafe(value: String): GridArea =
	CssValue.unsafe(value)


/** Creates a [GridArea] backed by a CSS variable with the given [name]. */
public inline fun GridArea.Companion.variable(name: String): GridArea.Variable =
	CssVariable.unsafe(name)


/** Sets the `grid-area` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.gridArea(value: GridArea) {
	property(gridArea, value)
}


/** The `grid-area` CSS property. */
@Suppress("unused")
public inline val CssProperties.gridArea: CssProperty<GridArea>
	get() = CssProperty.unsafe("grid-area")
