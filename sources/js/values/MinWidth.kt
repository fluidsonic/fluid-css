@file:Suppress("NOTHING_TO_INLINE")

import io.fluidsonic.css.*


@CssDsl
public fun CssDeclarationBlockBuilder.minWidth(value: SizeLimit) {
	property(minWidth, value)
}


@Suppress("unused")
public val CssProperties.minWidth: CssProperty<SizeLimit>
	get() = CssProperty("min-width")
