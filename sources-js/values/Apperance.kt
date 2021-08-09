@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Appearance : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Appearance, CssVariable<Appearance>
}


@CssDsl
public inline val Appearance.Companion.auto: Appearance
	get() = unsafe("auto")

@CssDsl
public inline val Appearance.Companion.none: Appearance
	get() = unsafe("none")


@CssDsl
public inline val Appearance.Companion.menulistButton: Appearance
	get() = unsafe("menulist-button")

@CssDsl
public inline val Appearance.Companion.textfield: Appearance
	get() = unsafe("textfield")


public inline fun Appearance.Companion.unsafe(value: String): Appearance =
	CssValue.unsafe(value)


public inline fun Appearance.Companion.variable(name: String): Appearance.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.appearance(value: Appearance) {
	property(appearance, value)
}


@Suppress("unused")
public inline val CssProperties.appearance: CssProperty<Appearance>
	get() = CssProperty.unsafe("appearance")
