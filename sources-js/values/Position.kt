@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Position : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Position, CssVariable<Position>
}


@CssDsl
public inline val Position.Companion.absolute: Position
	get() = unsafe("absolute")

@CssDsl
public inline val Position.Companion.fixed: Position
	get() = unsafe("fixed")

@CssDsl
public inline val Position.Companion.relative: Position
	get() = unsafe("relative")

@CssDsl
public inline val Position.Companion.static: Position
	get() = unsafe("static")

@CssDsl
public inline val Position.Companion.sticky: Position
	get() = unsafe("sticky")


public inline fun Position.Companion.unsafe(value: String): Position =
	CssValue.unsafe(value)


public inline fun Position.Companion.variable(name: String): Position.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.position(value: Position) {
	property(position, value)
}


@Suppress("unused")
public inline val CssProperties.position: CssProperty<Position>
	get() = CssProperty.unsafe("position")

