@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `box-sizing` value. */
@JsName("0;0")
public external interface BoxSizing : CssValue {

	@Suppress()
	public companion object


	/** A [BoxSizing] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BoxSizing, CssVariable<BoxSizing>
}


/** The CSS `content-box` box-sizing value. */
@CssDsl
public inline val BoxSizing.Companion.contentBox: BoxSizing
	get() = unsafe("content-box")

/** The CSS `border-box` box-sizing value. */
@CssDsl
public inline val BoxSizing.Companion.borderBox: BoxSizing
	get() = unsafe("border-box")


/** Creates a [BoxSizing] from an unchecked string [value]. */
public inline fun BoxSizing.Companion.unsafe(value: String): BoxSizing =
	CssValue.unsafe(value)


/** Creates a [BoxSizing] backed by a CSS variable with the given [name]. */
public inline fun BoxSizing.Companion.variable(name: String): BoxSizing.Variable =
	CssVariable.unsafe(name)


/** Sets the `box-sizing` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxSizing(value: BoxSizing) {
	property(boxSizing, value)
}


/** The `box-sizing` CSS property. */
@Suppress("unused")
public inline val CssProperties.boxSizing: CssProperty<BoxSizing>
	get() = CssProperty.unsafe("box-sizing")
