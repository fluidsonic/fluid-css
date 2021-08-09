@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface UserSelect : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : UserSelect, CssVariable<UserSelect>
}


@CssDsl
public inline val UserSelect.Companion.auto: UserSelect
	get() = unsafe("auto")

@CssDsl
public inline val UserSelect.Companion.none: UserSelect
	get() = unsafe("none")


@CssDsl
public inline val UserSelect.Companion.all: UserSelect
	get() = unsafe("all")

@CssDsl
public inline val UserSelect.Companion.contain: UserSelect
	get() = unsafe("contain")

@CssDsl
public inline val UserSelect.Companion.text: UserSelect
	get() = unsafe("text")


public inline fun UserSelect.Companion.unsafe(value: String): UserSelect =
	CssValue.unsafe(value)


public inline fun UserSelect.Companion.variable(name: String): UserSelect.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.userSelect(value: UserSelect) {
	property(userSelect, value)
}


@Suppress("unused")
public inline val CssProperties.userSelect: CssProperty<UserSelect>
	get() = CssProperty.unsafe("user-select")
