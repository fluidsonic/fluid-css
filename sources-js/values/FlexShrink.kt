@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `flex-shrink` value. */
@JsName("0;0")
public external interface FlexShrink : CssValue.DoubleConstructable {

	public companion object;


	/** A [FlexShrink] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FlexShrink, CssVariable<FlexShrink>
}


/** Creates a [FlexShrink] value. */
public inline fun FlexShrink.Companion.of(value: Double): FlexShrink =
	CssValue.unsafe(value)


/** Creates a [FlexShrink] value. */
public inline fun FlexShrink.Companion.of(value: Int): FlexShrink =
	CssValue.unsafe(value)


/** Creates a [FlexShrink] from an unchecked string [value]. */
public inline fun FlexShrink.Companion.unsafe(value: String): FlexShrink =
	CssValue.unsafe(value)


/** Creates a [FlexShrink] backed by a CSS variable with the given [name]. */
public inline fun FlexShrink.Companion.variable(name: String): FlexShrink.Variable =
	CssVariable.unsafe(name)


/** Sets the `flex-shrink` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrink) {
	property(flexShrink, value)
}


/** Sets the `flex-shrink` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Double) {
	property(flexShrink, value)
}


/** Sets the `flex-shrink` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Int) {
	property(flexShrink, value)
}


/** The `flex-shrink` CSS property. */
@Suppress("unused")
public inline val CssProperties.flexShrink: CssProperty<FlexShrink>
	get() = CssProperty.unsafe("flex-shrink")
