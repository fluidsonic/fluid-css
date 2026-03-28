@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple
// FIXME add own type/


/** Sets the `animation-duration` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationDuration(value: Time) {
	property(animationDuration, value)
}


/** The `animation-duration` CSS property. */
@Suppress("unused")
public inline val CssProperties.animationDuration: CssProperty<Time>
	get() = CssProperty.unsafe("animation-duration")
