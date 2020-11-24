@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.transitionDuration(value: Time) {
	property(transitionDuration, value)
}


@Suppress("unused")
public inline val CssProperties.transitionDuration: CssProperty<Time>
	get() = CssProperty.unsafe("transition-duration")
