@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public fun CssDeclarationBlockBuilder.height(value: Size) {
	property(height, value)
}


@Suppress("unused")
public val CssProperties.height: CssProperty<Size>
	get() = CssProperty("height")
