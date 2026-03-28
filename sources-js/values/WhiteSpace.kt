@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `white-space` value. */
@JsName("0;0")
public external interface WhiteSpace : CssValue {

	public companion object;


	/** A [WhiteSpace] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : WhiteSpace, CssVariable<WhiteSpace>
}


/** The CSS `break-spaces` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.breakSpaces: WhiteSpace
	get() = unsafe("break-spaces")

/** The CSS `normal` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.normal: WhiteSpace
	get() = unsafe("normal")

/** The CSS `nowrap` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.noWrap: WhiteSpace
	get() = unsafe("nowrap")

/** The CSS `pre` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.pre: WhiteSpace
	get() = unsafe("pre")

/** The CSS `pre-line` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.preLine: WhiteSpace
	get() = unsafe("pre-line")

/** The CSS `pre-wrap` white-space value. */
@CssDsl
public inline val WhiteSpace.Companion.preWrap: WhiteSpace
	get() = unsafe("pre-wrap")


/** Creates a [WhiteSpace] from an unchecked string [value]. */
public inline fun WhiteSpace.Companion.unsafe(value: String): WhiteSpace =
	CssValue.unsafe(value)


/** Creates a [WhiteSpace] backed by a CSS variable with the given [name]. */
public inline fun WhiteSpace.Companion.variable(name: String): WhiteSpace.Variable =
	CssVariable.unsafe(name)


/** Sets the `white-space` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpace) {
	property(whiteSpace, value)
}


/** The `white-space` CSS property. */
@Suppress("unused")
public inline val CssProperties.whiteSpace: CssProperty<WhiteSpace>
	get() = CssProperty.unsafe("white-space")
