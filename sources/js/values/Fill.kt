@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.fill(value: Color) {
	property(CssProperty.fill, value)
}


public inline fun CssDeclarationBlockBuilder.fill(value: GlobalValue) {
	property(CssProperty.fill, value)
}


public inline val CssProperty.Companion.fill: CssProperty get() = CssProperty("fill")
