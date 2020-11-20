@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CaretColor : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: CaretColor = raw("auto")


		public fun raw(value: String): CaretColor =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : CaretColor, CssVariable<CaretColor>
}


@CssDsl
public fun CssDeclarationBlockBuilder.caretColor(all: CaretColor) {
	property(caretColor, all)
}


@Suppress("unused")
public val CssProperties.caretColor: CssProperty<CaretColor>
	get() = CssProperty("caret-color")
