@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: TimingFunction) {
	property(CssProperty.animationTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: TimingFunctionOrGlobal) {
	property(CssProperty.animationTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: GlobalValue) {
	property(CssProperty.animationTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.animationTimingFunction(value: CustomCssProperty<out TimingFunctionOrGlobal>) {
	property(CssProperty.animationTimingFunction, value)
}


public inline val CssProperty.Companion.animationTimingFunction: CssProperty get() = CssProperty("animation-timing-function")
