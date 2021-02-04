@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface AnimationIterationCount : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val infinite: AnimationIterationCount
			get() = unsafe("infinite")


		public inline fun of(value: Double): AnimationIterationCount =
			CssValue.unsafe(value)


		public inline fun of(value: Int): AnimationIterationCount =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): AnimationIterationCount =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : AnimationIterationCount, CssVariable<AnimationIterationCount>
}


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
