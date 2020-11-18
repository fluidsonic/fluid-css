@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Resize : CssValue {

	public companion object {

		public val none: Resize = NoneValue.none

		public val block: Resize = Resize("block")
		public val both: Resize = Resize("both")
		public val horizontal: Resize = Resize("horizontal")
		public val inline: Resize = Resize("inline")
		public val vertical: Resize = Resize("vertical")
	}
}


private class ResizeImpl(value: String) : CssValueImpl(value), Resize


@Suppress("FunctionName")
public fun Resize(value: String): Resize =
	ResizeImpl(value)


public inline fun CssDeclarationBlockBuilder.resize(value: Resize) {
	property(CssProperty.resize, value)
}


public inline fun CssDeclarationBlockBuilder.resize(value: GlobalValue) {
	property(CssProperty.resize, value)
}


public inline fun CssDeclarationBlockBuilder.resize(value: CustomCssProperty<out Resize>) {
	property(CssProperty.resize, value)
}


public inline val CssProperty.Companion.resize: CssProperty get() = CssProperty("resize")
