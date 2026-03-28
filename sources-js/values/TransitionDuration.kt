@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `transition-duration` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transitionDuration(value: Time) {
	property(transitionDuration, value)
}


/** The `transition-duration` CSS property. */
@Suppress("unused")
public inline val CssProperties.transitionDuration: CssProperty<Time>
	get() = CssProperty.unsafe("transition-duration")
