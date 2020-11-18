@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


public inline fun CssDeclarationBlockBuilder.animationDuration(value: Time) {
	property(CssProperty.animationDuration, value)
}


public inline fun CssDeclarationBlockBuilder.animationDuration(value: TimeOrGlobal) {
	property(CssProperty.animationDuration, value)
}


public inline fun CssDeclarationBlockBuilder.animationDuration(value: GlobalValue) {
	property(CssProperty.animationDuration, value)
}


public inline fun CssDeclarationBlockBuilder.animationDuration(value: CustomCssProperty<out TimeOrGlobal>) {
	property(CssProperty.animationDuration, value)
}


public inline val CssProperty.Companion.animationDuration: CssProperty get() = CssProperty("animation-duration")
