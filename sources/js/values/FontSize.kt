@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontSize : CssValue, Internal {

	public companion object {

		@CssDsl
		public val xxSmall: FontSize = raw("xx-small")

		@CssDsl
		public val xSmall: FontSize = raw("x-small")

		@CssDsl
		public val small: FontSize = raw("small")

		@CssDsl
		public val medium: FontSize = raw("medium")

		@CssDsl
		public val large: FontSize = raw("large")

		@CssDsl
		public val xLarge: FontSize = raw("x-large")

		@CssDsl
		public val xxLarge: FontSize = raw("xx-large")

		@CssDsl
		public val xxxLarge: FontSize = raw("xxx-large")


		public fun raw(value: String): FontSize =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FontSize, CssVariable<FontSize>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontSize(value: FontSize) {
	property(fontSize, value)
}


@Suppress("unused")
public inline val CssProperties.fontSize: CssProperty<FontSize>
	get() = CssProperty("font-size")
