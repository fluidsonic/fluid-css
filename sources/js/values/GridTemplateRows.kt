@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridTemplateRows : CssValue, Internal {

	public companion object {

		public fun raw(value: String): GridTemplateRows =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : GridTemplateRows, CssVariable<GridTemplateRows>
}


@CssDsl
public fun CssDeclarationBlockBuilder.gridTemplateRows(value: GridTemplateRows) {
	property(gridTemplateRows, value)
}


@Suppress("unused")
public val CssProperties.gridTemplateRows: CssProperty<GridTemplateRows>
	get() = CssProperty("grid-template-rows")
