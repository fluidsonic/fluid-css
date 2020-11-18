@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundRepeatOrGlobal : CssValue
public interface BackgroundRepeat : BackgroundRepeatOrGlobal {

	public companion object {

		public val noRepeat: BackgroundRepeat = BackgroundRepeat("no-repeat")
		public val repeat: BackgroundRepeat = BackgroundRepeat("repeat")
		public val repeatX: BackgroundRepeat = BackgroundRepeat("repeat-x")
		public val repeatY: BackgroundRepeat = BackgroundRepeat("repeat-y")
		public val round: BackgroundRepeat = BackgroundRepeat("round")
		public val space: BackgroundRepeat = BackgroundRepeat("space")

		public fun axis(x: BackgroundRepeatAxis, y: BackgroundRepeatAxis): BackgroundRepeat =
			BackgroundRepeat("$x $y")
	}
}


private class BackgroundRepeatImpl(value: String) : CssValueBase(value), BackgroundRepeat


@Suppress("FunctionName")
public fun BackgroundRepeat(value: String): BackgroundRepeat =
	BackgroundRepeatImpl(value)


public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeat) {
	property(CssProperty.backgroundRepeat, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundRepeat(x: BackgroundRepeatAxis, y: BackgroundRepeatAxis) {
	property(CssProperty.backgroundRepeat, "$x $y")
}


public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeatOrGlobal) {
	property(CssProperty.backgroundRepeat, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: GlobalValue) {
	property(CssProperty.backgroundRepeat, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: CustomCssProperty<out BackgroundRepeatOrGlobal>) {
	property(CssProperty.backgroundRepeat, value)
}


public inline val CssProperty.Companion.backgroundRepeat: CssProperty get() = CssProperty("background-repeat")
