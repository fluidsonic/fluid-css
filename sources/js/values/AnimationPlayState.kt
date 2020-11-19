@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface AnimationPlayState : CssValue, Internal {

	public companion object {

		@CssDsl
		public val paused: AnimationPlayState = raw("paused")

		@CssDsl
		public val running: AnimationPlayState = raw("running")


		public fun raw(value: String): AnimationPlayState =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : AnimationPlayState, CssVariable<AnimationPlayState>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayState) {
	property(animationPlayState, value)
}


@Suppress("unused")
public inline val CssProperties.animationPlayState: CssProperty<AnimationPlayState>
	get() = CssProperty("animation-play-state")
