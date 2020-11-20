@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.transitionDuration(value: Time) {
	property(transitionDuration, value)
}


@Suppress("unused")
public val CssProperties.transitionDuration: CssProperty<Time>
	get() = CssProperty("transition-duration")
