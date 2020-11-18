@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface AnimationPlayStateOrGlobal : CssValue
public interface AnimationPlayState : AnimationPlayStateOrGlobal {

	public companion object {

		public val paused: AnimationPlayState = AnimationPlayState("paused")
		public val running: AnimationPlayState = AnimationPlayState("running")
	}
}


private class AnimationPlayStateImpl(value: String) : CssValueImpl(value), AnimationPlayState


@Suppress("FunctionName")
public fun AnimationPlayState(value: String): AnimationPlayState =
	AnimationPlayStateImpl(value)


public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayState) {
	property(CssProperty.animationPlayState, value)
}


public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayStateOrGlobal) {
	property(CssProperty.animationPlayState, value)
}


public inline fun CssDeclarationBlockBuilder.animationPlayState(value: GlobalValue) {
	property(CssProperty.animationPlayState, value)
}


public inline fun CssDeclarationBlockBuilder.animationPlayState(value: CustomCssProperty<out AnimationPlayStateOrGlobal>) {
	property(CssProperty.animationPlayState, value)
}


public inline val CssProperty.Companion.animationPlayState: CssProperty get() = CssProperty("animation-play-state")
