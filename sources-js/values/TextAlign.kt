@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TextAlign : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val center: TextAlign
			get() = unsafe("center")

		@CssDsl
		public inline val end: TextAlign
			get() = unsafe("end")

		@CssDsl
		public inline val justify: TextAlign
			get() = unsafe("justify")

		@CssDsl
		public inline val left: TextAlign
			get() = unsafe("left")

		@CssDsl
		public inline val matchParent: TextAlign
			get() = unsafe("match-parent")

		@CssDsl
		public inline val right: TextAlign
			get() = unsafe("right")

		@CssDsl
		public inline val start: TextAlign
			get() = unsafe("start")


		public inline fun unsafe(value: String): TextAlign =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextAlign, CssVariable<TextAlign>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlign) {
	property(textAlign, value)
}


@Suppress("unused")
public inline val CssProperties.textAlign: CssProperty<TextAlign>
	get() = CssProperty.unsafe("text-align")
