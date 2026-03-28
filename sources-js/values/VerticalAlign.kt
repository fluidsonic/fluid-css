@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `vertical-align` value. */
@JsName("0;0")
public external interface VerticalAlign : CssValue {

	public companion object;


	/** A [VerticalAlign] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : VerticalAlign, CssVariable<VerticalAlign>
}


/** The CSS `baseline` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.baseline: VerticalAlign
	get() = unsafe("baseline")

/** The CSS `bottom` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.bottom: VerticalAlign
	get() = unsafe("bottom")

/** The CSS `middle` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.middle: VerticalAlign
	get() = unsafe("middle")

/** The CSS `sub` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.sub: VerticalAlign
	get() = unsafe("sub")

/** The CSS `super` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.`super`: VerticalAlign
	get() = unsafe("super")

/** The CSS `text-bottom` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.textBottom: VerticalAlign
	get() = unsafe("text-bottom")

/** The CSS `text-top` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.textTop: VerticalAlign
	get() = unsafe("text-top")

/** The CSS `top` vertical-align value. */
@CssDsl
public inline val VerticalAlign.Companion.top: VerticalAlign
	get() = unsafe("top")


/** Creates a [VerticalAlign] from an unchecked string [value]. */
public inline fun VerticalAlign.Companion.unsafe(value: String): VerticalAlign =
	CssValue.unsafe(value)


/** Creates a [VerticalAlign] backed by a CSS variable with the given [name]. */
public inline fun VerticalAlign.Companion.variable(name: String): VerticalAlign.Variable =
	CssVariable.unsafe(name)


/** Sets the `vertical-align` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.verticalAlign(value: VerticalAlign) {
	property(verticalAlign, value)
}


/** The `vertical-align` CSS property. */
@Suppress("unused")
public inline val CssProperties.verticalAlign: CssProperty<VerticalAlign>
	get() = CssProperty.unsafe("vertical-align")
