@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FlexShrink : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : FlexShrink, CssVariable<FlexShrink>
}


public inline fun FlexShrink.Companion.of(value: Double): FlexShrink =
	CssValue.unsafe(value)


public inline fun FlexShrink.Companion.of(value: Int): FlexShrink =
	CssValue.unsafe(value)


public inline fun FlexShrink.Companion.unsafe(value: String): FlexShrink =
	CssValue.unsafe(value)


public inline fun FlexShrink.Companion.variable(name: String): FlexShrink.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrink) {
	property(flexShrink, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Double) {
	property(flexShrink, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Int) {
	property(flexShrink, value)
}


@Suppress("unused")
public inline val CssProperties.flexShrink: CssProperty<FlexShrink>
	get() = CssProperty.unsafe("flex-shrink")
