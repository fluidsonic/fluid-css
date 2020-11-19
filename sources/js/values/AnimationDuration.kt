@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple
// FIXME add own type/


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationDuration(value: Time) {
	property(animationDuration, value)
}


@Suppress("unused")
public inline val CssProperties.animationDuration: CssProperty<Time>
	get() = CssProperty("animation-duration")
