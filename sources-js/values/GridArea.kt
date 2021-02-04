@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public external interface GridArea : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun unsafe(value: String): GridArea =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : GridArea, CssVariable<GridArea>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridArea(value: GridArea) {
	property(gridArea, value)
}


@Suppress("unused")
public inline val CssProperties.gridArea: CssProperty<GridArea>
	get() = CssProperty.unsafe("grid-area")
