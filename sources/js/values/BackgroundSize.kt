@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundSize : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: BackgroundSize
			get() = unsafe("auto")

		@CssDsl
		public inline val contain: BackgroundSize
			get() = unsafe("contain")

		@CssDsl
		public inline val cover: BackgroundSize
			get() = unsafe("cover")


		public inline fun unsafe(value: String): BackgroundSize =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundSize, CssVariable<BackgroundSize>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(value: BackgroundSize) {
	property(backgroundSize, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundSize: CssProperty<BackgroundSize>
	get() = CssProperty.unsafe("background-size")
