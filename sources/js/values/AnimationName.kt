@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AnimationNameOrGlobal : CssValue

public interface AnimationName : AnimationNameOrGlobal {

	public companion object {

		public val none: AnimationName = raw("none")


		public fun of(value: Number): AnimationName =
			raw(value.toString())


		public fun raw(value: String): AnimationName =
			Default(value)
	}


	private class Default(value: String) : CssValueImpl(value), AnimationName
}


public inline fun CssDeclarationBlockBuilder.animationName(value: AnimationName) {
	property(CssProperty.animationName, value)
}


public inline fun CssDeclarationBlockBuilder.animationName(value: AnimationNameOrGlobal) {
	property(CssProperty.animationName, value)
}


public inline fun CssDeclarationBlockBuilder.animationName(value: GlobalValue) {
	property(CssProperty.animationName, value)
}


public inline fun CssDeclarationBlockBuilder.animationName(value: String) {
	property(CssProperty.animationName, value)
}


public inline fun CssDeclarationBlockBuilder.animationName(value: CustomCssProperty<out AnimationNameOrGlobal>) {
	property(CssProperty.animationName, value)
}


public inline fun CssDeclarationBlockBuilder.animationName(value: CustomCssProperty<out Number>) {
	property(CssProperty.animationName, value)
}


public inline val CssProperty.Companion.animationName: CssProperty get() = CssProperty("animation-name")
