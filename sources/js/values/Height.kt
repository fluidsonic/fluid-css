@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.height(value: Size) {
	property(height, value)
}


@Suppress("unused")
public inline val CssProperties.height: CssProperty<Size>
	get() = CssProperty.unsafe("height")
