@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface UserSelect : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: UserSelect
			get() = unsafe("auto")

		@CssDsl
		public inline val none: UserSelect
			get() = unsafe("none")


		@CssDsl
		public inline val all: UserSelect
			get() = unsafe("all")

		@CssDsl
		public inline val contain: UserSelect
			get() = unsafe("contain")

		@CssDsl
		public inline val text: UserSelect
			get() = unsafe("text")


		public inline fun unsafe(value: String): UserSelect =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : UserSelect, CssVariable<UserSelect>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.userSelect(value: UserSelect) {
	property(userSelect, value)
}


@Suppress("unused")
public inline val CssProperties.userSelect: CssProperty<UserSelect>
	get() = CssProperty.unsafe("user-select")
