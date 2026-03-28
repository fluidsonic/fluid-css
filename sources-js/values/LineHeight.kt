@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `line-height` value. */
@JsName("0;0")
public external interface LineHeight : CssValue.DoubleConstructable {

	public companion object;


	/** A [LineHeight] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : LineHeight, CssVariable<LineHeight>
}


/** The CSS `normal` line-height value. */
@CssDsl
public inline val LineHeight.Companion.normal: LineHeight
	get() = unsafe("normal")


/** Creates a [LineHeight] from a numeric multiple. */
@CssDsl
public inline fun LineHeight.Companion.multiple(value: Double): LineHeight =
	CssValue.unsafe(value)


/** Creates a [LineHeight] from a numeric multiple. */
@CssDsl
public inline fun LineHeight.Companion.multiple(value: Int): LineHeight =
	CssValue.unsafe(value)


/** Creates a [LineHeight] from an unchecked string [value]. */
public inline fun LineHeight.Companion.unsafe(value: String): LineHeight =
	CssValue.unsafe(value)


/** Creates a [LineHeight] backed by a CSS variable with the given [name]. */
public inline fun LineHeight.Companion.variable(name: String): LineHeight.Variable =
	CssVariable.unsafe(name)


/** Sets the `line-height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(lineHeight, value)
}


/** Sets the `line-height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Double) {
	property(lineHeight, value)
}


/** Sets the `line-height` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Int) {
	property(lineHeight, value)
}


/** The `line-height` CSS property. */
@Suppress("unused")
public inline val CssProperties.lineHeight: CssProperty<LineHeight>
	get() = CssProperty.unsafe("line-height")
