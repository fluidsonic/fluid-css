@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `fill` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fill(value: Color) {
	property(fill, value)
}


/** The `fill` CSS property. */
@Suppress("unused")
public inline val CssProperties.fill: CssProperty<Color>
	get() = CssProperty.unsafe("fill")
