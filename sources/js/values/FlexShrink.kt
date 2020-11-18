@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexShrinkOrGlobal : CssValue
public interface FlexShrink : FlexShrinkOrGlobal {

	public companion object
}


private class FlexShrinkImpl(value: String) : CssValueImpl(value), FlexShrink


@Suppress("FunctionName")
public inline fun FlexShrink(value: Number): FlexShrink =
	FlexShrink(value.toString())


@Suppress("FunctionName")
public fun FlexShrink(value: String): FlexShrink =
	CssValue(value, ::FlexShrinkImpl)


public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrink) {
	property(CssProperty.flexShrink, value)
}


public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrinkOrGlobal) {
	property(CssProperty.flexShrink, value)
}


public inline fun CssDeclarationBlockBuilder.flexShrink(value: Number) {
	property(CssProperty.flexShrink, value)
}


public inline fun CssDeclarationBlockBuilder.flexShrink(value: GlobalValue) {
	property(CssProperty.flexShrink, value)
}


public inline fun CssDeclarationBlockBuilder.flexShrink(value: CustomCssProperty<out FlexShrinkOrGlobal>) {
	property(CssProperty.flexShrink, value)
}


public inline fun CssDeclarationBlockBuilder.flexShrink(value: CustomCssProperty<out Number>) {
	property(CssProperty.flexShrink, value)
}


public inline val CssProperty.Companion.flexShrink: CssProperty get() = CssProperty("flex-shrink")
