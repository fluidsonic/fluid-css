@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `outline-color` value. */
@JsName("0;0")
public external interface OutlineColor : CssValue {

	public companion object;


	/** A [OutlineColor] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : OutlineColor, CssVariable<OutlineColor>
}


/** The CSS `invert` outline-color value. */
@CssDsl
public inline val OutlineColor.Companion.invert: OutlineColor
	get() = unsafe("invert")


/** Creates a [OutlineColor] from an unchecked string [value]. */
public inline fun OutlineColor.Companion.unsafe(value: String): OutlineColor =
	CssValue.unsafe(value)


/** Creates a [OutlineColor] backed by a CSS variable with the given [name]. */
public inline fun OutlineColor.Companion.variable(name: String): OutlineColor.Variable =
	CssVariable.unsafe(name)


/** Sets the `outline-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineColor(all: OutlineColor) {
	property(outlineColor, all)
}


/** The `outline-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.outlineColor: CssProperty<OutlineColor>
	get() = CssProperty.unsafe("outline-color")
