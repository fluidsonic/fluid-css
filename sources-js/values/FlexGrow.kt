@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `flex-grow` value. */
@JsName("0;0")
public external interface FlexGrow : CssValue.DoubleConstructable {

	public companion object;


	/** A [FlexGrow] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FlexGrow, CssVariable<FlexGrow>
}


/** Creates a [FlexGrow] value. */
public inline fun FlexGrow.Companion.of(value: Double): FlexGrow =
	CssValue.unsafe(value)


/** Creates a [FlexGrow] value. */
public inline fun FlexGrow.Companion.of(value: Int): FlexGrow =
	CssValue.unsafe(value)


/** Creates a [FlexGrow] from an unchecked string [value]. */
public inline fun FlexGrow.Companion.unsafe(value: String): FlexGrow =
	CssValue.unsafe(value)


/** Creates a [FlexGrow] backed by a CSS variable with the given [name]. */
public inline fun FlexGrow.Companion.variable(name: String): FlexGrow.Variable =
	CssVariable.unsafe(name)


/** Sets the `flex-grow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrow) {
	property(flexGrow, value)
}


/** Sets the `flex-grow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Double) {
	property(flexGrow, value)
}


/** Sets the `flex-grow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Int) {
	property(flexGrow, value)
}


/** The `flex-grow` CSS property. */
@Suppress("unused")
public inline val CssProperties.flexGrow: CssProperty<FlexGrow>
	get() = CssProperty.unsafe("flex-grow")
