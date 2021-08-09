@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface VerticalAlign : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : VerticalAlign, CssVariable<VerticalAlign>
}


@CssDsl
public inline val VerticalAlign.Companion.baseline: VerticalAlign
	get() = unsafe("baseline")

@CssDsl
public inline val VerticalAlign.Companion.bottom: VerticalAlign
	get() = unsafe("bottom")

@CssDsl
public inline val VerticalAlign.Companion.middle: VerticalAlign
	get() = unsafe("middle")

@CssDsl
public inline val VerticalAlign.Companion.sub: VerticalAlign
	get() = unsafe("sub")

@CssDsl
public inline val VerticalAlign.Companion.`super`: VerticalAlign
	get() = unsafe("super")

@CssDsl
public inline val VerticalAlign.Companion.textBottom: VerticalAlign
	get() = unsafe("text-bottom")

@CssDsl
public inline val VerticalAlign.Companion.textTop: VerticalAlign
	get() = unsafe("text-top")

@CssDsl
public inline val VerticalAlign.Companion.top: VerticalAlign
	get() = unsafe("top")


public inline fun VerticalAlign.Companion.unsafe(value: String): VerticalAlign =
	CssValue.unsafe(value)


public inline fun VerticalAlign.Companion.variable(name: String): VerticalAlign.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.verticalAlign(value: VerticalAlign) {
	property(verticalAlign, value)
}


@Suppress("unused")
public inline val CssProperties.verticalAlign: CssProperty<VerticalAlign>
	get() = CssProperty.unsafe("vertical-align")
