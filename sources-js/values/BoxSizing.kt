@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BoxSizing : CssValue {

	@Suppress()
	public companion object


	@JsName("0;0")
	public interface Variable : BoxSizing, CssVariable<BoxSizing>
}


@CssDsl
public inline val BoxSizing.Companion.contentBox: BoxSizing
	get() = unsafe("content-box")

@CssDsl
public inline val BoxSizing.Companion.borderBox: BoxSizing
	get() = unsafe("border-box")


public inline fun BoxSizing.Companion.unsafe(value: String): BoxSizing =
	CssValue.unsafe(value)


public inline fun BoxSizing.Companion.variable(name: String): BoxSizing.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxSizing(value: BoxSizing) {
	property(boxSizing, value)
}


@Suppress("unused")
public inline val CssProperties.boxSizing: CssProperty<BoxSizing>
	get() = CssProperty.unsafe("box-sizing")
