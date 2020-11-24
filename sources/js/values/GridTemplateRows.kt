@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public external interface GridTemplateRows : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun unsafe(value: String): GridTemplateRows =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : GridTemplateRows, CssVariable<GridTemplateRows>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplateRows(value: GridTemplateRows) {
	property(gridTemplateRows, value)
}


@Suppress("unused")
public inline val CssProperties.gridTemplateRows: CssProperty<GridTemplateRows>
	get() = CssProperty.unsafe("grid-template-rows")
