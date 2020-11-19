@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: TimingFunction) {
	property(animationTimingFunction, value)
}


@Suppress("unused")
public inline val CssProperties.animationTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty("animation-timing-function")
