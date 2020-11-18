@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.backgroundColor(value: Color) {
	property(CssProperty.backgroundColor, value)
}


public inline val CssProperty.Companion.backgroundColor: CssProperty get() = CssProperty("background-color")
