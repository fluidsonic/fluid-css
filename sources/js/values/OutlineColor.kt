@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface OutlineColor : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val invert: OutlineColor
			get() = unsafe("invert")


		public inline fun unsafe(value: String): OutlineColor =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : OutlineColor, CssVariable<OutlineColor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineColor(all: OutlineColor) {
	property(outlineColor, all)
}


@Suppress("unused")
public inline val CssProperties.outlineColor: CssProperty<OutlineColor>
	get() = CssProperty.unsafe("outline-color")
