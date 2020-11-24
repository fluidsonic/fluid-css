@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundClip : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val borderBox: BackgroundClip
			get() = unsafe("border-box")

		@CssDsl
		public inline val contentBox: BackgroundClip
			get() = unsafe("content-box")

		@CssDsl
		public inline val paddingBox: BackgroundClip
			get() = unsafe("padding-box")


		public inline fun unsafe(value: String): BackgroundClip =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundClip, CssVariable<BackgroundClip>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClip) {
	property(backgroundClip, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundClip: CssProperty<BackgroundClip>
	get() = CssProperty.unsafe("background-clip")
