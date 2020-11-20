@file:Suppress("NOTHING_TO_INLINE")

import io.fluidsonic.css.*


@CssDsl
public fun CssDeclarationBlockBuilder.maxWidth(value: SizeLimit) {
	property(maxWidth, value)
}


@Suppress("unused")
public val CssProperties.maxWidth: CssProperty<SizeLimit>
	get() = CssProperty("max-width")
