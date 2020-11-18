@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface WhiteSpaceOrGlobal : CssValue
public interface WhiteSpace : WhiteSpaceOrGlobal {

	public companion object {

		public val breakSpaces: WhiteSpace = WhiteSpace("break-spaces")
		public val normal: WhiteSpace = WhiteSpace("normal")
		public val nowrap: WhiteSpace = WhiteSpace("nowrap")
		public val pre: WhiteSpace = WhiteSpace("pre")
		public val preLine: WhiteSpace = WhiteSpace("pre-line")
		public val preWrap: WhiteSpace = WhiteSpace("pre-wrap")
	}
}


private class WhiteSpaceImpl(value: String) : CssValueBase(value), WhiteSpace


@Suppress("FunctionName")
public fun WhiteSpace(value: String): WhiteSpace =
	WhiteSpaceImpl(value)


public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpace) {
	property(CssProperty.whiteSpace, value)
}


public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpaceOrGlobal) {
	property(CssProperty.whiteSpace, value)
}


public inline fun CssDeclarationBlockBuilder.whiteSpace(value: GlobalValue) {
	property(CssProperty.whiteSpace, value)
}


public inline fun CssDeclarationBlockBuilder.whiteSpace(value: CustomCssProperty<out WhiteSpaceOrGlobal>) {
	property(CssProperty.whiteSpace, value)
}


public inline val CssProperty.Companion.whiteSpace: CssProperty get() = CssProperty("white-space")
