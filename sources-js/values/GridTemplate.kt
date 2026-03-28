@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


/** Represents a CSS `grid-template` value. */
@JsName("0;0")
public external interface GridTemplate : CssValue {

	public companion object;


	/** A [GridTemplate] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : GridTemplate, CssVariable<GridTemplate>
}


/** Creates a [GridTemplate] from an unchecked string [value]. */
public inline fun GridTemplate.Companion.unsafe(value: String): GridTemplate =
	CssValue.unsafe(value)


/** Creates a [GridTemplate] backed by a CSS variable with the given [name]. */
public inline fun GridTemplate.Companion.variable(name: String): GridTemplate.Variable =
	CssVariable.unsafe(name)


/** Sets the `grid-template` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplate(value: GridTemplate) {
	property(gridTemplate, value)
}


/** The `grid-template` CSS property. */
@Suppress("unused")
public inline val CssProperties.gridTemplate: CssProperty<GridTemplate>
	get() = CssProperty.unsafe("grid-template")
