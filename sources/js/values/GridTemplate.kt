@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public external interface GridTemplate : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun unsafe(value: String): GridTemplate =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : GridTemplate, CssVariable<GridTemplate>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gridTemplate(value: GridTemplate) {
	property(gridTemplate, value)
}


@Suppress("unused")
public inline val CssProperties.gridTemplate: CssProperty<GridTemplate>
	get() = CssProperty.unsafe("grid-template")
