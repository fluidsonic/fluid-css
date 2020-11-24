@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BoxOffset : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: BoxOffset
			get() = unsafe("auto")


		public inline fun unsafe(value: String): BoxOffset =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BoxOffset, CssVariable<BoxOffset>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.bottom(value: BoxOffset) {
	property(bottom, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.left(value: BoxOffset) {
	property(left, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.right(value: BoxOffset) {
	property(right, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.top(value: BoxOffset) {
	property(top, value)
}


@Suppress("unused")
public inline val CssProperties.bottom: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("bottom")


@Suppress("unused")
public inline val CssProperties.left: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("left")


@Suppress("unused")
public inline val CssProperties.right: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("right")


@Suppress("unused")
public inline val CssProperties.top: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("top")
