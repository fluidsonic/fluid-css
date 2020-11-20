@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple
// FIXME add own type/


@CssDsl
public fun CssDeclarationBlockBuilder.animationDuration(value: Time) {
	property(animationDuration, value)
}


@Suppress("unused")
public val CssProperties.animationDuration: CssProperty<Time>
	get() = CssProperty("animation-duration")
