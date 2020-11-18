@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecorationThicknessOrGlobal : CssValue
public interface TextDecorationThickness : TextDecorationThicknessOrGlobal {

	public companion object {

		public val auto: TextDecorationThickness = AutoValue.auto

		public val fromFont: TextDecorationThickness = TextDecorationThickness("from-font")
	}
}


private class TextDecorationThicknessImpl(value: String) : CssValueImpl(value), TextDecorationThickness


@Suppress("FunctionName")
public fun TextDecorationThickness(value: String): TextDecorationThickness =
	TextDecorationThicknessImpl(value)


public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: TextDecorationThickness) {
	property(CssProperty.textDecorationThickness, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: TextDecorationThicknessOrGlobal) {
	property(CssProperty.textDecorationThickness, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: GlobalValue) {
	property(CssProperty.textDecorationThickness, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: CustomCssProperty<out TextDecorationThicknessOrGlobal>) {
	property(CssProperty.textDecorationThickness, value)
}


public inline val CssProperty.Companion.textDecorationThickness: CssProperty get() = CssProperty("text-decoration-thickness")
