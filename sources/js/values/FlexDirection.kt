@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexDirectionOrGlobal : CssValue
public interface FlexDirection : FlexDirectionOrGlobal {

	public companion object {

		public val column: FlexDirection = FlexDirection("column")
		public val columnReverse: FlexDirection = FlexDirection("column-reverse")
		public val row: FlexDirection = FlexDirection("row")
		public val rowReverse: FlexDirection = FlexDirection("row-reverse")
	}
}


private class FlexDirectionImpl(value: String) : CssValueImpl(value), FlexDirection


@Suppress("FunctionName")
public fun FlexDirection(value: String): FlexDirection =
	CssValue(value, ::FlexDirectionImpl)


public inline fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirection) {
	property(CssProperty.flexDirection, value)
}


public inline fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirectionOrGlobal) {
	property(CssProperty.flexDirection, value)
}


public inline fun CssDeclarationBlockBuilder.flexDirection(value: GlobalValue) {
	property(CssProperty.flexDirection, value)
}


public inline fun CssDeclarationBlockBuilder.flexDirection(value: CustomCssProperty<out FlexDirectionOrGlobal>) {
	property(CssProperty.flexDirection, value)
}


public inline val CssProperty.Companion.flexDirection: CssProperty get() = CssProperty("flex-direction")
