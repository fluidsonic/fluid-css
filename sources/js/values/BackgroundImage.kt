@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


public interface BackgroundImageOrGlobal : CssValue
public interface BackgroundImage : BackgroundImageOrGlobal {

	public companion object {

		public val none: BackgroundImage = NoneValue.none


		public fun raw(value: String): BackgroundImage =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), BackgroundImage
}


public inline fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImage) {
	property(CssProperty.backgroundImage, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImageOrGlobal) {
	property(CssProperty.backgroundImage, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundImage(value: GlobalValue) {
	property(CssProperty.backgroundImage, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundImage(value: CustomCssProperty<out BackgroundImageOrGlobal>) {
	property(CssProperty.backgroundImage, value)
}


public inline val CssProperty.Companion.backgroundImage: CssProperty get() = CssProperty("background-image")
