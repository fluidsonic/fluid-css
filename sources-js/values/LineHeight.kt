@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface LineHeight : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val normal: LineHeight
			get() = unsafe("normal")


		public inline fun multiple(value: Double): LineHeight =
			CssValue.unsafe(value)


		public inline fun multiple(value: Int): LineHeight =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): LineHeight =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : LineHeight, CssVariable<LineHeight>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(lineHeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Double) {
	property(lineHeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Int) {
	property(lineHeight, value)
}


@Suppress("unused")
public inline val CssProperties.lineHeight: CssProperty<LineHeight>
	get() = CssProperty.unsafe("line-height")
