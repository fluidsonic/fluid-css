@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundSize : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: BackgroundSize = raw("auto")

		@CssDsl
		public val contain: BackgroundSize = raw("contain")

		@CssDsl
		public val cover: BackgroundSize = raw("cover")


		public fun raw(value: String): BackgroundSize =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BackgroundSize, CssVariable<BackgroundSize>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(value: BackgroundSize) {
	property(backgroundSize, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundSize: CssProperty<BackgroundSize>
	get() = CssProperty("background-size")
