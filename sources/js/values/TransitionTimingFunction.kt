@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: TimingFunction) {
	property(transitionTimingFunction, value)
}


@Suppress("unused")
public inline val CssProperties.transitionTimingFunction: CssProperty<TimingFunction>
	get() = CssProperty.unsafe("transition-timing-function")
