@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.backgroundColor(value: Color) {
	property(backgroundColor, value)
}


@Suppress("unused")
public val CssProperties.backgroundColor: CssProperty<Color>
	get() = CssProperty("background-color")
