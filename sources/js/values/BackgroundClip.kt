@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundClipOrGlobal : CssValue
public interface BackgroundClip : BackgroundClipOrGlobal {

	public companion object {

		public val borderBox: BackgroundClip = BackgroundClip("border-box")
		public val contentBox: BackgroundClip = BackgroundClip("content-box")
		public val paddingBox: BackgroundClip = BackgroundClip("padding-box")
	}
}


private class BackgroundClipImpl(value: String) : CssValueImpl(value), BackgroundClip


@Suppress("FunctionName")
public fun BackgroundClip(value: String): BackgroundClip =
	BackgroundClipImpl(value)


public inline fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClip) {
	property(CssProperty.backgroundClip, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClipOrGlobal) {
	property(CssProperty.backgroundClip, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundClip(value: GlobalValue) {
	property(CssProperty.backgroundClip, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundClip(value: CustomCssProperty<out BackgroundClipOrGlobal>) {
	property(CssProperty.backgroundClip, value)
}


public inline val CssProperty.Companion.backgroundClip: CssProperty get() = CssProperty("background-clip")
