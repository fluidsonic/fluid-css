@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundClip : CssValue, Internal {

	public companion object {

		@CssDsl
		public val borderBox: BackgroundClip = raw("border-box")

		@CssDsl
		public val contentBox: BackgroundClip = raw("content-box")

		@CssDsl
		public val paddingBox: BackgroundClip = raw("padding-box")


		public fun raw(value: String): BackgroundClip =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BackgroundClip, CssVariable<BackgroundClip>
}


@CssDsl
public fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClip) {
	property(backgroundClip, value)
}


@Suppress("unused")
public val CssProperties.backgroundClip: CssProperty<BackgroundClip>
	get() = CssProperty("background-clip")
