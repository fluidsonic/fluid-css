@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `animation-iteration-count` value. */
@JsName("0;0")
public external interface AnimationIterationCount : CssValue.DoubleConstructable {

	public companion object;


	/** A [AnimationIterationCount] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : AnimationIterationCount, CssVariable<AnimationIterationCount>
}


/** The CSS `infinite` animation-iteration-count value. */
@CssDsl
public inline val AnimationIterationCount.Companion.infinite: AnimationIterationCount
	get() = unsafe("infinite")


/** Creates a [AnimationIterationCount] value. */
public inline fun AnimationIterationCount.Companion.of(value: Double): AnimationIterationCount =
	CssValue.unsafe(value)


/** Creates a [AnimationIterationCount] value. */
public inline fun AnimationIterationCount.Companion.of(value: Int): AnimationIterationCount =
	CssValue.unsafe(value)


/** Creates a [AnimationIterationCount] from an unchecked string [value]. */
public inline fun AnimationIterationCount.Companion.unsafe(value: String): AnimationIterationCount =
	CssValue.unsafe(value)


/** Creates a [AnimationIterationCount] backed by a CSS variable with the given [name]. */
public inline fun AnimationIterationCount.Companion.variable(name: String): AnimationIterationCount.Variable =
	CssVariable.unsafe(name)


/** Sets the `animation-iteration-count` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: AnimationIterationCount) {
	property(animationIterationCount, value)
}


/** Sets the `animation-iteration-count` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Double) {
	property(animationIterationCount, value)
}


/** Sets the `animation-iteration-count` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Int) {
	property(animationIterationCount, value)
}


/** The `animation-iteration-count` CSS property. */
@Suppress("unused")
public inline val CssProperties.animationIterationCount: CssProperty<AnimationIterationCount>
	get() = CssProperty.unsafe("animation-iteration-count")
