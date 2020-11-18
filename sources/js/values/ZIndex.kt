@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface ZIndexOrGlobal : CssValue
public interface ZIndex : ZIndexOrGlobal {

	public companion object {

		public val auto: ZIndex = AutoValue.auto
	}
}


private class ZIndexImpl(value: String) : CssValueImpl(value), ZIndex


@Suppress("FunctionName")
public inline fun ZIndex(value: Int): ZIndex =
	ZIndex(value.toString())


@Suppress("FunctionName")
public fun ZIndex(value: String): ZIndex =
	CssValue(value, ::ZIndexImpl)


public inline fun CssDeclarationBlockBuilder.zIndex(value: Int) {
	property(CssProperty.zIndex, value)
}


public inline fun CssDeclarationBlockBuilder.zIndex(value: ZIndex) {
	property(CssProperty.zIndex, value)
}


public inline fun CssDeclarationBlockBuilder.zIndex(value: ZIndexOrGlobal) {
	property(CssProperty.zIndex, value)
}


public inline fun CssDeclarationBlockBuilder.zIndex(value: GlobalValue) {
	property(CssProperty.zIndex, value)
}


public inline fun CssDeclarationBlockBuilder.zIndex(value: CustomCssProperty<out ZIndexOrGlobal>) {
	property(CssProperty.zIndex, value)
}


public inline fun CssDeclarationBlockBuilder.zIndex(value: CustomCssProperty<out Int>) {
	property(CssProperty.zIndex, value)
}


public inline val CssProperty.Companion.zIndex: CssProperty get() = CssProperty("z-index")
