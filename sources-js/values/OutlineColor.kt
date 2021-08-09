@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface OutlineColor : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : OutlineColor, CssVariable<OutlineColor>
}


@CssDsl
public inline val OutlineColor.Companion.invert: OutlineColor
	get() = unsafe("invert")


public inline fun OutlineColor.Companion.unsafe(value: String): OutlineColor =
	CssValue.unsafe(value)


public inline fun OutlineColor.Companion.variable(name: String): OutlineColor.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineColor(all: OutlineColor) {
	property(outlineColor, all)
}


@Suppress("unused")
public inline val CssProperties.outlineColor: CssProperty<OutlineColor>
	get() = CssProperty.unsafe("outline-color")
