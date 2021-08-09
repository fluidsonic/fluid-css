@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface LineHeight : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : LineHeight, CssVariable<LineHeight>
}


@CssDsl
public inline val LineHeight.Companion.normal: LineHeight
	get() = unsafe("normal")


@CssDsl
public inline fun LineHeight.Companion.multiple(value: Double): LineHeight =
	CssValue.unsafe(value)


@CssDsl
public inline fun LineHeight.Companion.multiple(value: Int): LineHeight =
	CssValue.unsafe(value)


public inline fun LineHeight.Companion.unsafe(value: String): LineHeight =
	CssValue.unsafe(value)


public inline fun LineHeight.Companion.variable(name: String): LineHeight.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(lineHeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Double) {
	property(lineHeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Int) {
	property(lineHeight, value)
}


@Suppress("unused")
public inline val CssProperties.lineHeight: CssProperty<LineHeight>
	get() = CssProperty.unsafe("line-height")
