@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `position` value. */
@JsName("0;0")
public external interface Position : CssValue {

	public companion object;


	/** A [Position] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Position, CssVariable<Position>
}


/** The CSS `absolute` position value. */
@CssDsl
public inline val Position.Companion.absolute: Position
	get() = unsafe("absolute")

/** The CSS `fixed` position value. */
@CssDsl
public inline val Position.Companion.fixed: Position
	get() = unsafe("fixed")

/** The CSS `relative` position value. */
@CssDsl
public inline val Position.Companion.relative: Position
	get() = unsafe("relative")

/** The CSS `static` position value. */
@CssDsl
public inline val Position.Companion.static: Position
	get() = unsafe("static")

/** The CSS `sticky` position value. */
@CssDsl
public inline val Position.Companion.sticky: Position
	get() = unsafe("sticky")


/** Creates a [Position] from an unchecked string [value]. */
public inline fun Position.Companion.unsafe(value: String): Position =
	CssValue.unsafe(value)


/** Creates a [Position] backed by a CSS variable with the given [name]. */
public inline fun Position.Companion.variable(name: String): Position.Variable =
	CssVariable.unsafe(name)


/** Sets the `position` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.position(value: Position) {
	property(position, value)
}


/** The `position` CSS property. */
@Suppress("unused")
public inline val CssProperties.position: CssProperty<Position>
	get() = CssProperty.unsafe("position")

