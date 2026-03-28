@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `box-offset` value. */
@JsName("0;0")
public external interface BoxOffset : CssValue {

	public companion object;


	/** A [BoxOffset] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BoxOffset, CssVariable<BoxOffset>
}


/** The CSS `auto` box-offset value. */
@CssDsl
public inline val BoxOffset.Companion.auto: BoxOffset
	get() = unsafe("auto")


/** Creates a [BoxOffset] from an unchecked string [value]. */
public inline fun BoxOffset.Companion.unsafe(value: String): BoxOffset =
	CssValue.unsafe(value)


/** Creates a [BoxOffset] backed by a CSS variable with the given [name]. */
public inline fun BoxOffset.Companion.variable(name: String): BoxOffset.Variable =
	CssVariable.unsafe(name)


/** Sets the `bottom` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.bottom(value: BoxOffset) {
	property(bottom, value)
}


/** Sets the `left` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.left(value: BoxOffset) {
	property(left, value)
}


/** Sets the `right` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.right(value: BoxOffset) {
	property(right, value)
}


/** Sets the `top` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.top(value: BoxOffset) {
	property(top, value)
}


/** The `bottom` CSS property. */
@Suppress("unused")
public inline val CssProperties.bottom: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("bottom")


/** The `left` CSS property. */
@Suppress("unused")
public inline val CssProperties.left: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("left")


/** The `right` CSS property. */
@Suppress("unused")
public inline val CssProperties.right: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("right")


/** The `top` CSS property. */
@Suppress("unused")
public inline val CssProperties.top: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("top")
