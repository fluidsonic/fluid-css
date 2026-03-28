@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `transition-timing-function` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: TimingFunction) {
	property(transitionTimingFunction, value)
}


/** The `transition-timing-function` CSS property. */
@Suppress("unused")
public inline val CssProperties.transitionTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty.unsafe("transition-timing-function")
