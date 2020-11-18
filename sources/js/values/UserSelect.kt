@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface UserSelectOrGlobal : CssValue
public interface UserSelect : UserSelectOrGlobal {

	public companion object {

		public val auto: UserSelect = AutoValue.auto
		public val none: UserSelect = NoneValue.none

		public val all: UserSelect = UserSelect("all")
		public val contain: UserSelect = UserSelect("contain")
		public val text: UserSelect = UserSelect("text")
	}
}


private class UserSelectImpl(value: String) : CssValueImpl(value), UserSelect


@Suppress("FunctionName")
public fun UserSelect(value: String): UserSelect =
	UserSelectImpl(value)


public inline fun CssDeclarationBlockBuilder.userSelect(value: UserSelect) {
	property(CssProperty.userSelect, value)
}


public inline fun CssDeclarationBlockBuilder.userSelect(value: UserSelectOrGlobal) {
	property(CssProperty.userSelect, value)
}


public inline fun CssDeclarationBlockBuilder.userSelect(value: GlobalValue) {
	property(CssProperty.userSelect, value)
}


public inline fun CssDeclarationBlockBuilder.userSelect(value: CustomCssProperty<out UserSelectOrGlobal>) {
	property(CssProperty.userSelect, value)
}


public inline val CssProperty.Companion.userSelect: CssProperty get() = CssProperty("user-select")
