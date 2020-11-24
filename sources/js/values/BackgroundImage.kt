@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundImage : Background.Single {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: BackgroundImage
			get() = unsafe("none")


		public inline fun unsafe(value: String): BackgroundImage =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundImage, CssVariable<BackgroundImage>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImage) {
	property(backgroundImage, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundImage: CssProperty<BackgroundImage>
	get() = CssProperty.unsafe("background-image")
