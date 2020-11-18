@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface TextDecorationLineOrGlobal : CssValue
public interface TextDecorationLine : TextDecorationLineOrGlobal {

	public companion object {

		public val none: TextDecorationLine = NoneValue.none

		public val lineThrough: TextDecorationLine = TextDecorationLine("line-through")
		public val overline: TextDecorationLine = TextDecorationLine("overline")
		public val underline: TextDecorationLine = TextDecorationLine("underline")
	}
}


private class TextDecorationLineImpl(value: String) : CssValueImpl(value), TextDecorationLine


@Suppress("FunctionName")
public fun TextDecorationLine(value: String): TextDecorationLine =
	TextDecorationLineImpl(value)


public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLine) {
	property(CssProperty.textDecorationLine, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: TextDecorationLineOrGlobal) {
	property(CssProperty.textDecorationLine, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: GlobalValue) {
	property(CssProperty.textDecorationLine, value)
}


public inline fun CssDeclarationBlockBuilder.textDecorationLine(value: CustomCssProperty<out TextDecorationLineOrGlobal>) {
	property(CssProperty.textDecorationLine, value)
}


public inline val CssProperty.Companion.textDecorationLine: CssProperty get() = CssProperty("text-decoration-line")
