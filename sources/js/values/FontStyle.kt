@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontStyle : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val italic: FontStyle
			get() = unsafe("italic")

		@CssDsl
		public inline val normal: FontStyle
			get() = unsafe("normal")

		@CssDsl
		public inline val oblique: FontStyle
			get() = unsafe("oblique")


		@CssDsl
		public inline fun oblique(angle: Angle): FontStyle =
			unsafe("oblique $angle")


		public inline fun unsafe(value: String): FontStyle =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FontStyle, CssVariable<FontStyle>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontStyle(value: FontStyle) {
	property(fontStyle, value)
}


@Suppress("unused")
public inline val CssProperties.fontStyle: CssProperty<FontStyle>
	get() = CssProperty.unsafe("font-style")
