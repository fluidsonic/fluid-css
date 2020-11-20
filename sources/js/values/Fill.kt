@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.fill(value: Color) {
	property(fill, value)
}


@Suppress("unused")
public val CssProperties.fill: CssProperty<Color>
	get() = CssProperty("fill")
