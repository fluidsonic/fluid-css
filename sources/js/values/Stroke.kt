@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.stroke(value: Color) {
	property(stroke, value)
}


@Suppress("unused")
public inline val CssProperties.stroke: CssProperty<Color>
	get() = CssProperty("stroke")
