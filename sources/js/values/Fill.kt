@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.fill(value: Color) {
	property(fill, value)
}


@Suppress("unused")
public inline val CssProperties.fill: CssProperty<Color>
	get() = CssProperty.unsafe("fill")
