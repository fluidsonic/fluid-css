@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AppearanceOrGlobal : CssValue
public interface Appearance : AppearanceOrGlobal {

	public companion object {

		public val auto: Appearance = AutoValue.auto
		public val none: Appearance = NoneValue.none

		public val menulistButton: Appearance = Appearance("menulist-button")
		public val textfield: Appearance = Appearance("textfield")
	}
}


private class AppearanceImpl(value: String) : CssValueImpl(value), Appearance


@Suppress("FunctionName")
public fun Appearance(value: String): Appearance =
	CssValue(value, ::AppearanceImpl)


public inline fun CssDeclarationBlockBuilder.appearance(value: Appearance) {
	property(CssProperty.appearance, value)
}


public inline fun CssDeclarationBlockBuilder.appearance(value: AppearanceOrGlobal) {
	property(CssProperty.appearance, value)
}


public inline fun CssDeclarationBlockBuilder.appearance(value: GlobalValue) {
	property(CssProperty.appearance, value)
}


public inline fun CssDeclarationBlockBuilder.appearance(value: CustomCssProperty<out AppearanceOrGlobal>) {
	property(CssProperty.appearance, value)
}


public inline val CssProperty.Companion.appearance: CssProperty get() = CssProperty("appearance")

