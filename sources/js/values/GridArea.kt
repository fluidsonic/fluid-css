@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface GridArea : CssValue, Internal {

	public companion object {

		public fun raw(value: String): GridArea =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : GridArea, CssVariable<GridArea>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridArea(value: GridArea) {
	property(gridArea, value)
}


@Suppress("unused")
public inline val CssProperties.gridArea: CssProperty<GridArea>
	get() = CssProperty("grid-area")
