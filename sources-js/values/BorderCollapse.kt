@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BorderCollapse : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BorderCollapse, CssVariable<BorderCollapse>
}


@CssDsl
public inline val BorderCollapse.Companion.collapse: BorderCollapse
	get() = unsafe("collapse")

@CssDsl
public inline val BorderCollapse.Companion.separate: BorderCollapse
	get() = unsafe("separate")


public inline fun BorderCollapse.Companion.unsafe(value: String): BorderCollapse =
	CssValue.unsafe(value)


public inline fun BorderCollapse.Companion.variable(name: String): BorderCollapse.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderCollapse(value: BorderCollapse) {
	property(borderCollapse, value)
}


@Suppress("unused")
public inline val CssProperties.borderCollapse: CssProperty<BorderCollapse>
	get() = CssProperty.unsafe("border-collapse")
