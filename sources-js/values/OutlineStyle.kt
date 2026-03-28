@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `outline-style` value. */
@JsName("0;0")
public external interface OutlineStyle : CssValue {

	public companion object;


	/** A [OutlineStyle] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : OutlineStyle, CssVariable<OutlineStyle>
}


/** The CSS `none` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.none: OutlineStyle
	get() = unsafe("none")


/** The CSS `dashed` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.dashed: OutlineStyle
	get() = unsafe("dashed")

/** The CSS `dotted` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.dotted: OutlineStyle
	get() = unsafe("dotted")

/** The CSS `double` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.double: OutlineStyle
	get() = unsafe("double")

/** The CSS `groove` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.groove: OutlineStyle
	get() = unsafe("groove")

/** The CSS `hidden` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.hidden: OutlineStyle
	get() = unsafe("hidden")

/** The CSS `inset` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.inset: OutlineStyle
	get() = unsafe("inset")

/** The CSS `outset` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.outset: OutlineStyle
	get() = unsafe("outset")

/** The CSS `ridge` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.ridge: OutlineStyle
	get() = unsafe("ridge")

/** The CSS `solid` outline-style value. */
@CssDsl
public inline val OutlineStyle.Companion.solid: OutlineStyle
	get() = unsafe("solid")


/** Creates a [OutlineStyle] from an unchecked string [value]. */
public inline fun OutlineStyle.Companion.unsafe(value: String): OutlineStyle =
	CssValue.unsafe(value)


/** Creates a [OutlineStyle] backed by a CSS variable with the given [name]. */
public inline fun OutlineStyle.Companion.variable(name: String): OutlineStyle.Variable =
	CssVariable.unsafe(name)


/** Sets the `outline-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineStyle(all: OutlineStyle) {
	property(outlineStyle, all)
}


/** The `outline-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.outlineStyle: CssProperty<OutlineStyle>
	get() = CssProperty.unsafe("outline-style")
