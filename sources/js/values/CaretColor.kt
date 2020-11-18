@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public inline fun CssDeclarationBlockBuilder.caretColor(all: Color) {
	property(CssProperty.caretColor, all)
}


public inline fun CssDeclarationBlockBuilder.caretColor(all: ColorOrAutoOrGlobal) {
	property(CssProperty.caretColor, all)
}


public inline fun CssDeclarationBlockBuilder.caretColor(all: GlobalValue) {
	property(CssProperty.caretColor, all)
}


public inline fun CssDeclarationBlockBuilder.caretColor(all: CustomCssProperty<out ColorOrAutoOrGlobal>) {
	property(CssProperty.caretColor, all)
}


public inline val CssProperty.Companion.caretColor: CssProperty get() = CssProperty("caret-color")
