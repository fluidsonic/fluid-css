@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.width(value: Size) {
	property(width, value)
}


@Suppress("unused")
public inline val CssProperties.width: CssProperty<Size>
	get() = CssProperty("width")
