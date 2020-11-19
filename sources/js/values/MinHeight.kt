@file:Suppress("NOTHING_TO_INLINE")

import io.fluidsonic.css.*


@CssDsl
public inline fun CssDeclarationBlockBuilder.minHeight(value: SizeLimit) {
	property(minHeight, value)
}


@Suppress("unused")
public inline val CssProperties.minHeight: CssProperty<SizeLimit>
	get() = CssProperty("min-height")
