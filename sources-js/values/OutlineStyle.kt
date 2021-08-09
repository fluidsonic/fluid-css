@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface OutlineStyle : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : OutlineStyle, CssVariable<OutlineStyle>
}


@CssDsl
public inline val OutlineStyle.Companion.none: OutlineStyle
	get() = unsafe("none")


@CssDsl
public inline val OutlineStyle.Companion.dashed: OutlineStyle
	get() = unsafe("dashed")

@CssDsl
public inline val OutlineStyle.Companion.dotted: OutlineStyle
	get() = unsafe("dotted")

@CssDsl
public inline val OutlineStyle.Companion.double: OutlineStyle
	get() = unsafe("double")

@CssDsl
public inline val OutlineStyle.Companion.groove: OutlineStyle
	get() = unsafe("groove")

@CssDsl
public inline val OutlineStyle.Companion.hidden: OutlineStyle
	get() = unsafe("hidden")

@CssDsl
public inline val OutlineStyle.Companion.inset: OutlineStyle
	get() = unsafe("inset")

@CssDsl
public inline val OutlineStyle.Companion.outset: OutlineStyle
	get() = unsafe("outset")

@CssDsl
public inline val OutlineStyle.Companion.ridge: OutlineStyle
	get() = unsafe("ridge")

@CssDsl
public inline val OutlineStyle.Companion.solid: OutlineStyle
	get() = unsafe("solid")


public inline fun OutlineStyle.Companion.unsafe(value: String): OutlineStyle =
	CssValue.unsafe(value)


public inline fun OutlineStyle.Companion.variable(name: String): OutlineStyle.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineStyle(all: OutlineStyle) {
	property(outlineStyle, all)
}


@Suppress("unused")
public inline val CssProperties.outlineStyle: CssProperty<OutlineStyle>
	get() = CssProperty.unsafe("outline-style")
