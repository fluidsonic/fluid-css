@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface AnimationPlayState : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : AnimationPlayState, CssVariable<AnimationPlayState>
}


@CssDsl
public inline val AnimationPlayState.Companion.paused: AnimationPlayState
	get() = unsafe("paused")

@CssDsl
public inline val AnimationPlayState.Companion.running: AnimationPlayState
	get() = unsafe("running")


public inline fun AnimationPlayState.Companion.unsafe(value: String): AnimationPlayState =
	CssValue.unsafe(value)


public inline fun AnimationPlayState.Companion.variable(name: String): AnimationPlayState.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayState) {
	property(animationPlayState, value)
}


@Suppress("unused")
public inline val CssProperties.animationPlayState: CssProperty<AnimationPlayState>
	get() = CssProperty.unsafe("animation-play-state")
