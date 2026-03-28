@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Sets the `min-height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.minHeight(value: SizeLimit) {
	property(minHeight, value)
}


/** The `min-height` CSS property. */
@Suppress("unused")
public inline val CssProperties.minHeight: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("min-height")
