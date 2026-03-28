@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.height(value: Size) {
	property(height, value)
}


/** The `height` CSS property. */
@Suppress("unused")
public inline val CssProperties.height: CssProperty<Size>
	get() = CssProperty.unsafe("height")
