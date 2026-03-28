@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `outline-width` value. */
@JsName("0;0")
public external interface OutlineWidth : CssValue {

	public companion object;


	/** A [OutlineWidth] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : OutlineWidth, CssVariable<OutlineWidth>
}


/** The CSS `medium` outline-width value. */
@CssDsl
public inline val OutlineWidth.Companion.medium: OutlineWidth
	get() = unsafe("medium")

/** The CSS `thin` outline-width value. */
@CssDsl
public inline val OutlineWidth.Companion.thin: OutlineWidth
	get() = unsafe("thin")

/** The CSS `thick` outline-width value. */
@CssDsl
public inline val OutlineWidth.Companion.thick: OutlineWidth
	get() = unsafe("thick")


/** Creates a [OutlineWidth] from an unchecked string [value]. */
public inline fun OutlineWidth.Companion.unsafe(value: String): OutlineWidth =
	CssValue.unsafe(value)


/** Creates a [OutlineWidth] backed by a CSS variable with the given [name]. */
public inline fun OutlineWidth.Companion.variable(name: String): OutlineWidth.Variable =
	CssVariable.unsafe(name)


/** Sets the `outline-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineWidth(all: OutlineWidth) {
	property(outlineWidth, all)
}

/** The `outline-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.outlineWidth: CssProperty<OutlineWidth>
	get() = CssProperty.unsafe("outline-width")
