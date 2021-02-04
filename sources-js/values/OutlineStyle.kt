@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface OutlineStyle : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: OutlineStyle
			get() = unsafe("none")


		@CssDsl
		public inline val dashed: OutlineStyle
			get() = unsafe("dashed")

		@CssDsl
		public inline val dotted: OutlineStyle
			get() = unsafe("dotted")

		@CssDsl
		public inline val double: OutlineStyle
			get() = unsafe("double")

		@CssDsl
		public inline val groove: OutlineStyle
			get() = unsafe("groove")

		@CssDsl
		public inline val hidden: OutlineStyle
			get() = unsafe("hidden")

		@CssDsl
		public inline val inset: OutlineStyle
			get() = unsafe("inset")

		@CssDsl
		public inline val outset: OutlineStyle
			get() = unsafe("outset")

		@CssDsl
		public inline val ridge: OutlineStyle
			get() = unsafe("ridge")

		@CssDsl
		public inline val solid: OutlineStyle
			get() = unsafe("solid")


		public inline fun unsafe(value: String): OutlineStyle =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : OutlineStyle, CssVariable<OutlineStyle>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineStyle(all: OutlineStyle) {
	property(outlineStyle, all)
}


@Suppress("unused")
public inline val CssProperties.outlineStyle: CssProperty<OutlineStyle>
	get() = CssProperty.unsafe("outline-style")
