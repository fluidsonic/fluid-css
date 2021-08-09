@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FlexBasis : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : FlexBasis, CssVariable<FlexBasis>
}


@CssDsl
public inline val FlexBasis.Companion.auto: FlexBasis
	get() = unsafe("auto")


@CssDsl
public inline val FlexBasis.Companion.content: FlexBasis
	get() = unsafe("content")

@CssDsl
public inline val FlexBasis.Companion.fill: FlexBasis
	get() = unsafe("fill")

@CssDsl
public inline val FlexBasis.Companion.fitContent: FlexBasis
	get() = unsafe("fit-content")

@CssDsl
public inline val FlexBasis.Companion.maxContent: FlexBasis
	get() = unsafe("max-content")

@CssDsl
public inline val FlexBasis.Companion.minContent: FlexBasis
	get() = unsafe("min-content")


public inline fun FlexBasis.Companion.unsafe(value: String): FlexBasis =
	CssValue.unsafe(value)


public inline fun FlexBasis.Companion.variable(name: String): FlexBasis.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasis) {
	property(flexBasis, value)
}


@Suppress("unused")
public inline val CssProperties.flexBasis: CssProperty<FlexBasis>
	get() = CssProperty.unsafe("flex-basis")
