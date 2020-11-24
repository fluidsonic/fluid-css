@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface VerticalAlign : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val baseline: VerticalAlign
			get() = unsafe("baseline")

		@CssDsl
		public inline val bottom: VerticalAlign
			get() = unsafe("bottom")

		@CssDsl
		public inline val middle: VerticalAlign
			get() = unsafe("middle")

		@CssDsl
		public inline val sub: VerticalAlign
			get() = unsafe("sub")

		@CssDsl
		public inline val `super`: VerticalAlign
			get() = unsafe("super")

		@CssDsl
		public inline val textBottom: VerticalAlign
			get() = unsafe("text-bottom")

		@CssDsl
		public inline val textTop: VerticalAlign
			get() = unsafe("text-top")

		@CssDsl
		public inline val top: VerticalAlign
			get() = unsafe("top")


		public inline fun unsafe(value: String): VerticalAlign =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : VerticalAlign, CssVariable<VerticalAlign>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.verticalAlign(value: VerticalAlign) {
	property(verticalAlign, value)
}


@Suppress("unused")
public inline val CssProperties.verticalAlign: CssProperty<VerticalAlign>
	get() = CssProperty.unsafe("vertical-align")
