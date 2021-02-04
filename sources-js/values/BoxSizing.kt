@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BoxSizing : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val contentBox: BoxSizing
			get() = unsafe("content-box")

		@CssDsl
		public inline val borderBox: BoxSizing
			get() = unsafe("border-box")


		public inline fun unsafe(value: String): BoxSizing =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BoxSizing, CssVariable<BoxSizing>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxSizing(value: BoxSizing) {
	property(boxSizing, value)
}


@Suppress("unused")
public inline val CssProperties.boxSizing: CssProperty<BoxSizing>
	get() = CssProperty.unsafe("box-sizing")
