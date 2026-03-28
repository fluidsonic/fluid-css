@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `max-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.maxWidth(value: SizeLimit) {
	property(maxWidth, value)
}


/** The `max-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.maxWidth: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("max-width")
