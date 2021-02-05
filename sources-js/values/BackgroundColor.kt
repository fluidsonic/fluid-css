@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundColor(value: Color) {
	property(backgroundColor, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundColor: CssProperty<Color>
	get() = CssProperty.unsafe("background-color")
