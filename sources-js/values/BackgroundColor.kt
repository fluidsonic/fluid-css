@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `background-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundColor(value: Color) {
	property(backgroundColor, value)
}


/** The `background-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundColor: CssProperty<Color>
	get() = CssProperty.unsafe("background-color")
