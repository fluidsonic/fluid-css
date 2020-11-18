@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface VisibilityOrGlobal : CssValue
public interface Visibility : VisibilityOrGlobal {

	public companion object {

		public val collapse: Visibility = Visibility("collapse")
		public val hidden: Visibility = Visibility("hidden")
		public val visible: Visibility = Visibility("visible")
	}
}


private class VisibilityImpl(value: String) : CssValueBase(value), Visibility


@Suppress("FunctionName")
public fun Visibility(value: String): Visibility =
	VisibilityImpl(value)


public inline fun CssDeclarationBlockBuilder.visibility(value: Visibility) {
	property(CssProperty.visibility, value)
}


public inline fun CssDeclarationBlockBuilder.visibility(value: VisibilityOrGlobal) {
	property(CssProperty.visibility, value)
}


public inline fun CssDeclarationBlockBuilder.visibility(value: GlobalValue) {
	property(CssProperty.visibility, value)
}


public inline fun CssDeclarationBlockBuilder.visibility(value: CustomCssProperty<out VisibilityOrGlobal>) {
	property(CssProperty.visibility, value)
}


public inline val CssProperty.Companion.visibility: CssProperty get() = CssProperty("visibility")
