@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.width(value: Size) {
	property(width, value)
}


/** The `width` CSS property. */
@Suppress("unused")
public inline val CssProperties.width: CssProperty<Size>
	get() = CssProperty.unsafe("width")
