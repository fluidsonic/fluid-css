@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundOriginOrGlobal : CssValue
public interface BackgroundOrigin : BackgroundOriginOrGlobal {

	public companion object {

		public val borderBox: BackgroundOrigin = BackgroundOrigin("border-box")
		public val contentBox: BackgroundOrigin = BackgroundOrigin("content-box")
		public val paddingBox: BackgroundOrigin = BackgroundOrigin("padding-box")
	}
}


private class BackgroundOriginImpl(value: String) : CssValueBase(value), BackgroundOrigin


@Suppress("FunctionName")
public fun BackgroundOrigin(value: String): BackgroundOrigin =
	BackgroundOriginImpl(value)


public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOrigin) {
	property(CssProperty.backgroundOrigin, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOriginOrGlobal) {
	property(CssProperty.backgroundOrigin, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: GlobalValue) {
	property(CssProperty.backgroundOrigin, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: CustomCssProperty<out BackgroundOriginOrGlobal>) {
	property(CssProperty.backgroundOrigin, value)
}


public inline val CssProperty.Companion.backgroundOrigin: CssProperty get() = CssProperty("background-origin")
