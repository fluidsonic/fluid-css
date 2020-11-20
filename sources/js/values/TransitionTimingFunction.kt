@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.transitionTimingFunction(value: TimingFunction) {
	property(transitionTimingFunction, value)
}


@Suppress("unused")
public val CssProperties.transitionTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty("transition-timing-function")
