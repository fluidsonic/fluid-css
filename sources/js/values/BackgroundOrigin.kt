@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundOrigin : CssValue, Internal {

	public companion object {

		@CssDsl
		public val borderBox: BackgroundOrigin = raw("border-box")

		@CssDsl
		public val contentBox: BackgroundOrigin = raw("content-box")

		@CssDsl
		public val paddingBox: BackgroundOrigin = raw("padding-box")


		public fun raw(value: String): BackgroundOrigin =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BackgroundOrigin, CssVariable<BackgroundOrigin>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOrigin) {
	property(backgroundOrigin, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundOrigin: CssProperty<BackgroundOrigin>
	get() = CssProperty("background-origin")
