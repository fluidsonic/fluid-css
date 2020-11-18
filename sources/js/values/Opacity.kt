@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface OpacityOrGlobal : CssValue
public interface Opacity : OpacityOrGlobal {

	public companion object {

		public val full: Opacity = Opacity(1)
		public val none: Opacity = Opacity(0)
	}
}


private class OpacityImpl(value: String) : CssValueBase(value), Opacity


@Suppress("FunctionName")
public inline fun Opacity(value: Number): Opacity =
	Opacity(value.toString())


@Suppress("FunctionName")
public fun Opacity(value: String): Opacity =
	CssValue(value, ::OpacityImpl)


public inline fun CssDeclarationBlockBuilder.opacity(value: Number) {
	property(CssProperty.opacity, value)
}


public inline fun CssDeclarationBlockBuilder.opacity(value: Opacity) {
	property(CssProperty.opacity, value)
}


public inline fun CssDeclarationBlockBuilder.opacity(value: OpacityOrGlobal) {
	property(CssProperty.opacity, value)
}


public inline fun CssDeclarationBlockBuilder.opacity(value: GlobalValue) {
	property(CssProperty.opacity, value)
}


public inline fun CssDeclarationBlockBuilder.opacity(value: CustomCssProperty<out OpacityOrGlobal>) {
	property(CssProperty.opacity, value)
}


public inline fun CssDeclarationBlockBuilder.opacity(value: CustomCssProperty<out Number>) {
	property(CssProperty.opacity, value)
}


public inline val CssProperty.Companion.opacity: CssProperty get() = CssProperty("opacity")
