@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public inline fun CssDeclarationBlockBuilder.minWidth(value: SizeLimit) {
	property(minWidth, value)
}


@Suppress("unused")
public inline val CssProperties.minWidth: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("min-width")
