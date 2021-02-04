@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface WhiteSpace : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val breakSpaces: WhiteSpace
			get() = unsafe("break-spaces")

		@CssDsl
		public inline val normal: WhiteSpace
			get() = unsafe("normal")

		@CssDsl
		public inline val noWrap: WhiteSpace
			get() = unsafe("nowrap")

		@CssDsl
		public inline val pre: WhiteSpace
			get() = unsafe("pre")

		@CssDsl
		public inline val preLine: WhiteSpace
			get() = unsafe("pre-line")

		@CssDsl
		public inline val preWrap: WhiteSpace
			get() = unsafe("pre-wrap")


		public inline fun unsafe(value: String): WhiteSpace =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : WhiteSpace, CssVariable<WhiteSpace>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpace) {
	property(whiteSpace, value)
}


@Suppress("unused")
public inline val CssProperties.whiteSpace: CssProperty<WhiteSpace>
	get() = CssProperty.unsafe("white-space")
