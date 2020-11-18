@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.stroke(value: Color) {
	property(CssProperty.stroke, value)
}


public inline fun CssDeclarationBlockBuilder.stroke(value: GlobalValue) {
	property(CssProperty.stroke, value)
}


public inline val CssProperty.Companion.stroke: CssProperty get() = CssProperty("stroke")
