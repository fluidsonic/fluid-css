@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FlexDirection : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : FlexDirection, CssVariable<FlexDirection>
}


@CssDsl
public inline val FlexDirection.Companion.column: FlexDirection
	get() = unsafe("column")

@CssDsl
public inline val FlexDirection.Companion.columnReverse: FlexDirection
	get() = unsafe("column-reverse")

@CssDsl
public inline val FlexDirection.Companion.row: FlexDirection
	get() = unsafe("row")

@CssDsl
public inline val FlexDirection.Companion.rowReverse: FlexDirection
	get() = unsafe("row-reverse")


public inline fun FlexDirection.Companion.unsafe(value: String): FlexDirection =
	CssValue.unsafe(value)


public inline fun FlexDirection.Companion.variable(name: String): FlexDirection.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirection) {
	property(flexDirection, value)
}


@Suppress("unused")
public inline val CssProperties.flexDirection: CssProperty<FlexDirection>
	get() = CssProperty.unsafe("flex-direction")
