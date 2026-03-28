@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `user-select` value. */
@JsName("0;0")
public external interface UserSelect : CssValue {

	public companion object;


	/** A [UserSelect] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : UserSelect, CssVariable<UserSelect>
}


/** The CSS `auto` user-select value. */
@CssDsl
public inline val UserSelect.Companion.auto: UserSelect
	get() = unsafe("auto")

/** The CSS `none` user-select value. */
@CssDsl
public inline val UserSelect.Companion.none: UserSelect
	get() = unsafe("none")


/** The CSS `all` user-select value. */
@CssDsl
public inline val UserSelect.Companion.all: UserSelect
	get() = unsafe("all")

/** The CSS `contain` user-select value. */
@CssDsl
public inline val UserSelect.Companion.contain: UserSelect
	get() = unsafe("contain")

/** The CSS `text` user-select value. */
@CssDsl
public inline val UserSelect.Companion.text: UserSelect
	get() = unsafe("text")


/** Creates a [UserSelect] from an unchecked string [value]. */
public inline fun UserSelect.Companion.unsafe(value: String): UserSelect =
	CssValue.unsafe(value)


/** Creates a [UserSelect] backed by a CSS variable with the given [name]. */
public inline fun UserSelect.Companion.variable(name: String): UserSelect.Variable =
	CssVariable.unsafe(name)


/** Sets the `user-select` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.userSelect(value: UserSelect) {
	property(userSelect, value)
}


/** The `user-select` CSS property. */
@Suppress("unused")
public inline val CssProperties.userSelect: CssProperty<UserSelect>
	get() = CssProperty.unsafe("user-select")
