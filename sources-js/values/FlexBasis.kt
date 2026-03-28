@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `flex-basis` value. */
@JsName("0;0")
public external interface FlexBasis : CssValue {

	public companion object;


	/** A [FlexBasis] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FlexBasis, CssVariable<FlexBasis>
}


/** The CSS `auto` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.auto: FlexBasis
	get() = unsafe("auto")


/** The CSS `content` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.content: FlexBasis
	get() = unsafe("content")

/** The CSS `fill` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.fill: FlexBasis
	get() = unsafe("fill")

/** The CSS `fit-content` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.fitContent: FlexBasis
	get() = unsafe("fit-content")

/** The CSS `max-content` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.maxContent: FlexBasis
	get() = unsafe("max-content")

/** The CSS `min-content` flex-basis value. */
@CssDsl
public inline val FlexBasis.Companion.minContent: FlexBasis
	get() = unsafe("min-content")


/** Creates a [FlexBasis] from an unchecked string [value]. */
public inline fun FlexBasis.Companion.unsafe(value: String): FlexBasis =
	CssValue.unsafe(value)


/** Creates a [FlexBasis] backed by a CSS variable with the given [name]. */
public inline fun FlexBasis.Companion.variable(name: String): FlexBasis.Variable =
	CssVariable.unsafe(name)


/** Sets the `flex-basis` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasis) {
	property(flexBasis, value)
}


/** The `flex-basis` CSS property. */
@Suppress("unused")
public inline val CssProperties.flexBasis: CssProperty<FlexBasis>
	get() = CssProperty.unsafe("flex-basis")
