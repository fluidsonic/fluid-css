@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Visibility : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Visibility, CssVariable<Visibility>
}


@CssDsl
public inline val Visibility.Companion.collapse: Visibility
	get() = unsafe("collapse")

@CssDsl
public inline val Visibility.Companion.hidden: Visibility
	get() = unsafe("hidden")

@CssDsl
public inline val Visibility.Companion.visible: Visibility
	get() = unsafe("visible")


public inline fun Visibility.Companion.unsafe(value: String): Visibility =
	CssValue.unsafe(value)


public inline fun Visibility.Companion.variable(name: String): Visibility.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.visibility(value: Visibility) {
	property(visibility, value)
}


@Suppress("unused")
public inline val CssProperties.visibility: CssProperty<Visibility>
	get() = CssProperty.unsafe("visibility")
