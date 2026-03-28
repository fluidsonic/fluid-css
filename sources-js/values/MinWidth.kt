@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `min-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.minWidth(value: SizeLimit) {
	property(minWidth, value)
}


/** The `min-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.minWidth: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("min-width")
