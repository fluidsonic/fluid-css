@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.width(value: Size) {
	property(width, value)
}


@Suppress("unused")
public val CssProperties.width: CssProperty<Size>
	get() = CssProperty("width")
