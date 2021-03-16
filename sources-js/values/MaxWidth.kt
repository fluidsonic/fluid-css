@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.maxWidth(value: SizeLimit) {
	property(maxWidth, value)
}


@Suppress("unused")
public inline val CssProperties.maxWidth: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("max-width")
