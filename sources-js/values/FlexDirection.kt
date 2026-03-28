@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `flex-direction` value. */
@JsName("0;0")
public external interface FlexDirection : CssValue {

	public companion object;


	/** A [FlexDirection] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FlexDirection, CssVariable<FlexDirection>
}


/** The CSS `column` flex-direction value. */
@CssDsl
public inline val FlexDirection.Companion.column: FlexDirection
	get() = unsafe("column")

/** The CSS `column-reverse` flex-direction value. */
@CssDsl
public inline val FlexDirection.Companion.columnReverse: FlexDirection
	get() = unsafe("column-reverse")

/** The CSS `row` flex-direction value. */
@CssDsl
public inline val FlexDirection.Companion.row: FlexDirection
	get() = unsafe("row")

/** The CSS `row-reverse` flex-direction value. */
@CssDsl
public inline val FlexDirection.Companion.rowReverse: FlexDirection
	get() = unsafe("row-reverse")


/** Creates a [FlexDirection] from an unchecked string [value]. */
public inline fun FlexDirection.Companion.unsafe(value: String): FlexDirection =
	CssValue.unsafe(value)


/** Creates a [FlexDirection] backed by a CSS variable with the given [name]. */
public inline fun FlexDirection.Companion.variable(name: String): FlexDirection.Variable =
	CssVariable.unsafe(name)


/** Sets the `flex-direction` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexDirection(value: FlexDirection) {
	property(flexDirection, value)
}


/** The `flex-direction` CSS property. */
@Suppress("unused")
public inline val CssProperties.flexDirection: CssProperty<FlexDirection>
	get() = CssProperty.unsafe("flex-direction")
