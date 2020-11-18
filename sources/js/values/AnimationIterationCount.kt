@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AnimationIterationCountOrGlobal : CssValue

public interface AnimationIterationCount : AnimationIterationCountOrGlobal {

	public companion object {

		public val infinite: AnimationIterationCount = raw("infinite")


		public fun of(value: Number): AnimationIterationCount =
			raw(value.toString())


		public fun raw(value: String): AnimationIterationCount =
			Default(value)
	}


	private class Default(value: String) : CssValueImpl(value), AnimationIterationCount
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: AnimationIterationCount) {
	property(CssProperty.animationIterationCount, value)
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: AnimationIterationCountOrGlobal) {
	property(CssProperty.animationIterationCount, value)
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Number) {
	property(CssProperty.animationIterationCount, value)
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: GlobalValue) {
	property(CssProperty.animationIterationCount, value)
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: CustomCssProperty<out AnimationIterationCountOrGlobal>) {
	property(CssProperty.animationIterationCount, value)
}


public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: CustomCssProperty<out Number>) {
	property(CssProperty.animationIterationCount, value)
}


public inline val CssProperty.Companion.animationIterationCount: CssProperty get() = CssProperty("animation-iteration-count")
