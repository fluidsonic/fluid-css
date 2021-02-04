@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface AnimationPlayState : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val paused: AnimationPlayState
			get() = unsafe("paused")

		@CssDsl
		public inline val running: AnimationPlayState
			get() = unsafe("running")


		public inline fun unsafe(value: String): AnimationPlayState =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : AnimationPlayState, CssVariable<AnimationPlayState>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayState) {
	property(animationPlayState, value)
}


@Suppress("unused")
public inline val CssProperties.animationPlayState: CssProperty<AnimationPlayState>
	get() = CssProperty.unsafe("animation-play-state")
