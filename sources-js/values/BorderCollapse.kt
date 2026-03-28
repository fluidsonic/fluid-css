@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border-collapse` value. */
@JsName("0;0")
public external interface BorderCollapse : CssValue {

	public companion object;


	/** A [BorderCollapse] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderCollapse, CssVariable<BorderCollapse>
}


/** The CSS `collapse` border-collapse value. */
@CssDsl
public inline val BorderCollapse.Companion.collapse: BorderCollapse
	get() = unsafe("collapse")

/** The CSS `separate` border-collapse value. */
@CssDsl
public inline val BorderCollapse.Companion.separate: BorderCollapse
	get() = unsafe("separate")


/** Creates a [BorderCollapse] from an unchecked string [value]. */
public inline fun BorderCollapse.Companion.unsafe(value: String): BorderCollapse =
	CssValue.unsafe(value)


/** Creates a [BorderCollapse] backed by a CSS variable with the given [name]. */
public inline fun BorderCollapse.Companion.variable(name: String): BorderCollapse.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-collapse` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderCollapse(value: BorderCollapse) {
	property(borderCollapse, value)
}


/** The `border-collapse` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderCollapse: CssProperty<BorderCollapse>
	get() = CssProperty.unsafe("border-collapse")
