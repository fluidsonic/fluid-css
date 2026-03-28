@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `stroke` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.stroke(value: Color) {
	property(stroke, value)
}


/** The `stroke` CSS property. */
@Suppress("unused")
public inline val CssProperties.stroke: CssProperty<Color>
	get() = CssProperty.unsafe("stroke")
