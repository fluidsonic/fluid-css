@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support


public interface FontFamilyOrGlobal : CssValue
public interface FontFamily : FontFamilyOrGlobal {

	public companion object {

		public fun raw(value: String): FontFamily =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), FontFamily
}


public inline fun CssDeclarationBlockBuilder.fontFamily(value: FontFamily) {
	property(CssProperty.fontFamily, value)
}


public inline fun CssDeclarationBlockBuilder.fontFamily(value: GlobalValue) {
	property(CssProperty.fontFamily, value)
}


public inline fun CssDeclarationBlockBuilder.fontFamily(value: String) {
	property(CssProperty.fontFamily, value)
}


public inline fun CssDeclarationBlockBuilder.fontFamily(value: CustomCssProperty<out FontFamily>) {
	property(CssProperty.fontFamily, value)
}


public inline val CssProperty.Companion.fontFamily: CssProperty get() = CssProperty("font-family")
