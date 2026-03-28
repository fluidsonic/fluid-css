@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


/** Sets the `animation-timing-function` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: TimingFunction) {
	property(animationTimingFunction, value)
}


/** The `animation-timing-function` CSS property. */
@Suppress("unused")
public inline val CssProperties.animationTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty.unsafe("animation-timing-function")
