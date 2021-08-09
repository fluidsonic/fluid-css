@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface StrokeWidth : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : StrokeWidth, CssVariable<StrokeWidth>
}


public inline fun StrokeWidth.Companion.unsafe(value: String): StrokeWidth =
	CssValue.unsafe(value)


public inline fun StrokeWidth.Companion.variable(name: String): StrokeWidth.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidth) {
	property(strokeWidth, value)
}


@Suppress("unused")
public inline val CssProperties.strokeWidth: CssProperty<StrokeWidth>
	get() = CssProperty.unsafe("stroke-width")
