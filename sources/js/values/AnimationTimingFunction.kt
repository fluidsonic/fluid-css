@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


@CssDsl
public fun CssDeclarationBlockBuilder.animationTimingFunction(value: TimingFunction) {
	property(animationTimingFunction, value)
}


@Suppress("unused")
public val CssProperties.animationTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty("animation-timing-function")
