@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexGrowOrGlobal : CssValue
public interface FlexGrow : FlexGrowOrGlobal {

	public companion object
}


private class FlexGrowImpl(value: String) : CssValueBase(value), FlexGrow


@Suppress("FunctionName")
public inline fun FlexGrow(value: Number): FlexGrow =
	FlexGrow(value.toString())


@Suppress("FunctionName")
public fun FlexGrow(value: String): FlexGrow =
	CssValue(value, ::FlexGrowImpl)


public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrow) {
	property(CssProperty.flexGrow, value)
}


public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrowOrGlobal) {
	property(CssProperty.flexGrow, value)
}


public inline fun CssDeclarationBlockBuilder.flexGrow(value: Number) {
	property(CssProperty.flexGrow, value)
}


public inline fun CssDeclarationBlockBuilder.flexGrow(value: GlobalValue) {
	property(CssProperty.flexGrow, value)
}


public inline fun CssDeclarationBlockBuilder.flexGrow(value: CustomCssProperty<out FlexGrowOrGlobal>) {
	property(CssProperty.flexGrow, value)
}


public inline fun CssDeclarationBlockBuilder.flexGrow(value: CustomCssProperty<out Number>) {
	property(CssProperty.flexGrow, value)
}


public inline val CssProperty.Companion.flexGrow: CssProperty get() = CssProperty("flex-grow")
