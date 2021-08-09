@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface WhiteSpace : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : WhiteSpace, CssVariable<WhiteSpace>
}


@CssDsl
public inline val WhiteSpace.Companion.breakSpaces: WhiteSpace
	get() = unsafe("break-spaces")

@CssDsl
public inline val WhiteSpace.Companion.normal: WhiteSpace
	get() = unsafe("normal")

@CssDsl
public inline val WhiteSpace.Companion.noWrap: WhiteSpace
	get() = unsafe("nowrap")

@CssDsl
public inline val WhiteSpace.Companion.pre: WhiteSpace
	get() = unsafe("pre")

@CssDsl
public inline val WhiteSpace.Companion.preLine: WhiteSpace
	get() = unsafe("pre-line")

@CssDsl
public inline val WhiteSpace.Companion.preWrap: WhiteSpace
	get() = unsafe("pre-wrap")


public inline fun WhiteSpace.Companion.unsafe(value: String): WhiteSpace =
	CssValue.unsafe(value)


public inline fun WhiteSpace.Companion.variable(name: String): WhiteSpace.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpace) {
	property(whiteSpace, value)
}


@Suppress("unused")
public inline val CssProperties.whiteSpace: CssProperty<WhiteSpace>
	get() = CssProperty.unsafe("white-space")
