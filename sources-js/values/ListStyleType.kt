@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface ListStyleType : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : ListStyleType, CssVariable<ListStyleType>
}


@CssDsl
public inline val ListStyleType.Companion.none: ListStyleType
	get() = unsafe("none")


@CssDsl
public inline val ListStyleType.Companion.circle: ListStyleType
	get() = unsafe("circle")

@CssDsl
public inline val ListStyleType.Companion.decimal: ListStyleType
	get() = unsafe("decimal")

@CssDsl
public inline val ListStyleType.Companion.disc: ListStyleType
	get() = unsafe("disc")

@CssDsl
public inline val ListStyleType.Companion.square: ListStyleType
	get() = unsafe("square")


public inline fun ListStyleType.Companion.unsafe(value: String): ListStyleType =
	CssValue.unsafe(value)


public inline fun ListStyleType.Companion.variable(name: String): ListStyleType.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleType) {
	property(listStyleType, value)
}


@Suppress("unused")
public inline val CssProperties.listStyleType: CssProperty<ListStyleType>
	get() = CssProperty.unsafe("list-style-type")
