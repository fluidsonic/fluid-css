@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundOrigin : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val borderBox: BackgroundOrigin
			get() = unsafe("border-box")

		@CssDsl
		public inline val contentBox: BackgroundOrigin
			get() = unsafe("content-box")

		@CssDsl
		public inline val paddingBox: BackgroundOrigin
			get() = unsafe("padding-box")


		public inline fun unsafe(value: String): BackgroundOrigin =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundOrigin, CssVariable<BackgroundOrigin>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOrigin) {
	property(backgroundOrigin, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundOrigin: CssProperty<BackgroundOrigin>
	get() = CssProperty.unsafe("background-origin")
