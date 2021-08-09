@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FlexGrow : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : FlexGrow, CssVariable<FlexGrow>
}


public inline fun FlexGrow.Companion.of(value: Double): FlexGrow =
	CssValue.unsafe(value)


public inline fun FlexGrow.Companion.of(value: Int): FlexGrow =
	CssValue.unsafe(value)


public inline fun FlexGrow.Companion.unsafe(value: String): FlexGrow =
	CssValue.unsafe(value)


public inline fun FlexGrow.Companion.variable(name: String): FlexGrow.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrow) {
	property(flexGrow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Double) {
	property(flexGrow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Int) {
	property(flexGrow, value)
}


@Suppress("unused")
public inline val CssProperties.flexGrow: CssProperty<FlexGrow>
	get() = CssProperty.unsafe("flex-grow")
