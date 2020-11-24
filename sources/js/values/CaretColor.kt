@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface CaretColor : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: CaretColor
			get() = unsafe("auto")


		public inline fun unsafe(value: String): CaretColor =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : CaretColor, CssVariable<CaretColor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.caretColor(all: CaretColor) {
	property(caretColor, all)
}


@Suppress("unused")
public inline val CssProperties.caretColor: CssProperty<CaretColor>
	get() = CssProperty.unsafe("caret-color")
