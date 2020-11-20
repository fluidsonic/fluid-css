@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface UserSelect : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: UserSelect = raw("auto")

		@CssDsl
		public val none: UserSelect = raw("none")


		@CssDsl
		public val all: UserSelect = raw("all")

		@CssDsl
		public val contain: UserSelect = raw("contain")

		@CssDsl
		public val text: UserSelect = raw("text")


		public fun raw(value: String): UserSelect =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : UserSelect, CssVariable<UserSelect>
}


@CssDsl
public fun CssDeclarationBlockBuilder.userSelect(value: UserSelect) {
	property(userSelect, value)
}


@Suppress("unused")
public val CssProperties.userSelect: CssProperty<UserSelect>
	get() = CssProperty("user-select")
