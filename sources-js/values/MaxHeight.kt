@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `max-height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.maxHeight(value: SizeLimit) {
	property(maxHeight, value)
}


/** The `max-height` CSS property. */
@Suppress("unused")
public inline val CssProperties.maxHeight: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("max-height")
