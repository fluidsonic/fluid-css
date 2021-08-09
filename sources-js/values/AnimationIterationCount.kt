@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface AnimationIterationCount : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : AnimationIterationCount, CssVariable<AnimationIterationCount>
}


@CssDsl
public inline val AnimationIterationCount.Companion.infinite: AnimationIterationCount
	get() = unsafe("infinite")


public inline fun AnimationIterationCount.Companion.of(value: Double): AnimationIterationCount =
	CssValue.unsafe(value)


public inline fun AnimationIterationCount.Companion.of(value: Int): AnimationIterationCount =
	CssValue.unsafe(value)


public inline fun AnimationIterationCount.Companion.unsafe(value: String): AnimationIterationCount =
	CssValue.unsafe(value)


public inline fun AnimationIterationCount.Companion.variable(name: String): AnimationIterationCount.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: AnimationIterationCount) {
	property(animationIterationCount, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Double) {
	property(animationIterationCount, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Int) {
	property(animationIterationCount, value)
}


@Suppress("unused")
public inline val CssProperties.animationIterationCount: CssProperty<AnimationIterationCount>
	get() = CssProperty.unsafe("animation-iteration-count")
