@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundImage : Background, Internal {

	public companion object {

		@CssDsl
		public val none: BackgroundImage = raw("none")


		public fun raw(value: String): BackgroundImage =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BackgroundImage, CssVariable<BackgroundImage>
}


@CssDsl
public fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImage) {
	property(backgroundImage, value)
}


@Suppress("unused")
public val CssProperties.backgroundImage: CssProperty<BackgroundImage>
	get() = CssProperty("background-image")
