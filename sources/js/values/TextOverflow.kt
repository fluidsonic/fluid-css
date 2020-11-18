@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextOverflow : CssValue {

	public companion object {

		public val clip: TextOverflow = TextOverflow("clip")
		public val ellipsis: TextOverflow = TextOverflow("ellipsis")
	}
}


private class TextOverflowImpl(value: String) : CssValueImpl(value), TextOverflow


@Suppress("FunctionName")
public fun TextOverflow(value: String): TextOverflow =
	TextOverflowImpl(value)


public inline fun CssDeclarationBlockBuilder.textOverflow(value: TextOverflow) {
	property(CssProperty.textOverflow, value)
}


public inline fun CssDeclarationBlockBuilder.textOverflow(left: TextOverflow, right: TextOverflow) {
	property(CssProperty.textOverflow, "$left $right")
}


public inline fun CssDeclarationBlockBuilder.textOverflow(value: GlobalValue) {
	property(CssProperty.textOverflow, value)
}


public inline fun CssDeclarationBlockBuilder.textOverflow(value: CustomCssProperty<out TextOverflow>) {
	property(CssProperty.textOverflow, value)
}


public inline val CssProperty.Companion.textOverflow: CssProperty get() = CssProperty("text-overflow")
