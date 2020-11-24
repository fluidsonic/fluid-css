@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontSize : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val xxSmall: FontSize
			get() = unsafe("xx-small")

		@CssDsl
		public inline val xSmall: FontSize
			get() = unsafe("x-small")

		@CssDsl
		public inline val small: FontSize
			get() = unsafe("small")

		@CssDsl
		public inline val medium: FontSize
			get() = unsafe("medium")

		@CssDsl
		public inline val large: FontSize
			get() = unsafe("large")

		@CssDsl
		public inline val xLarge: FontSize
			get() = unsafe("x-large")

		@CssDsl
		public inline val xxLarge: FontSize
			get() = unsafe("xx-large")

		@CssDsl
		public inline val xxxLarge: FontSize
			get() = unsafe("xxx-large")


		public inline fun unsafe(value: String): FontSize =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FontSize, CssVariable<FontSize>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSize) {
	property(fontSize, value)
}


@Suppress("unused")
public inline val CssProperties.fontSize: CssProperty<FontSize>
	get() = CssProperty.unsafe("font-size")
