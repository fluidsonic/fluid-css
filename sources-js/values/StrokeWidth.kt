@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `stroke-width` value. */
@JsName("0;0")
public external interface StrokeWidth : CssValue {

	public companion object;


	/** A [StrokeWidth] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : StrokeWidth, CssVariable<StrokeWidth>
}


/** Creates a [StrokeWidth] from an unchecked string [value]. */
public inline fun StrokeWidth.Companion.unsafe(value: String): StrokeWidth =
	CssValue.unsafe(value)


/** Creates a [StrokeWidth] backed by a CSS variable with the given [name]. */
public inline fun StrokeWidth.Companion.variable(name: String): StrokeWidth.Variable =
	CssVariable.unsafe(name)


/** Sets the `stroke-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidth) {
	property(strokeWidth, value)
}


/** The `stroke-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.strokeWidth: CssProperty<StrokeWidth>
	get() = CssProperty.unsafe("stroke-width")
