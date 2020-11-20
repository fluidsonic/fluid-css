@file:Suppress("NOTHING_TO_INLINE")

import io.fluidsonic.css.*


@CssDsl
public fun CssDeclarationBlockBuilder.maxHeight(value: SizeLimit) {
	property(maxHeight, value)
}


@Suppress("unused")
public val CssProperties.maxHeight: CssProperty<SizeLimit>
	get() = CssProperty("max-height")
