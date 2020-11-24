@file:Suppress("NOTHING_TO_INLINE")

import io.fluidsonic.css.*


@CssDsl
public inline fun CssDeclarationBlockBuilder.maxHeight(value: SizeLimit) {
	property(maxHeight, value)
}


@Suppress("unused")
public inline val CssProperties.maxHeight: CssProperty<SizeLimit>
	get() = CssProperty.unsafe("max-height")
