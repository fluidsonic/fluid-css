@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridTemplate : CssValue, Internal {

	public companion object {

		public fun raw(value: String): GridTemplate =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : GridTemplate, CssVariable<GridTemplate>
}


@CssDsl
public fun CssDeclarationBlockBuilder.gridTemplate(value: GridTemplate) {
	property(gridTemplate, value)
}


@Suppress("unused")
public val CssProperties.gridTemplate: CssProperty<GridTemplate>
	get() = CssProperty("grid-template")
