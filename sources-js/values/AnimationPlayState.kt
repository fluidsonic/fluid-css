@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `animation-play-state` value. */
@JsName("0;0")
public external interface AnimationPlayState : CssValue {

	public companion object;


	/** A [AnimationPlayState] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : AnimationPlayState, CssVariable<AnimationPlayState>
}


/** The CSS `paused` animation-play-state value. */
@CssDsl
public inline val AnimationPlayState.Companion.paused: AnimationPlayState
	get() = unsafe("paused")

/** The CSS `running` animation-play-state value. */
@CssDsl
public inline val AnimationPlayState.Companion.running: AnimationPlayState
	get() = unsafe("running")


/** Creates a [AnimationPlayState] from an unchecked string [value]. */
public inline fun AnimationPlayState.Companion.unsafe(value: String): AnimationPlayState =
	CssValue.unsafe(value)


/** Creates a [AnimationPlayState] backed by a CSS variable with the given [name]. */
public inline fun AnimationPlayState.Companion.variable(name: String): AnimationPlayState.Variable =
	CssVariable.unsafe(name)


/** Sets the `animation-play-state` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationPlayState(value: AnimationPlayState) {
	property(animationPlayState, value)
}


/** The `animation-play-state` CSS property. */
@Suppress("unused")
public inline val CssProperties.animationPlayState: CssProperty<AnimationPlayState>
	get() = CssProperty.unsafe("animation-play-state")
