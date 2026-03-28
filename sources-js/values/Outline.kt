@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.internal.*


/** Represents a CSS `outline` value. */
@JsName("0;0")
public external interface Outline : CssValue {

	public companion object;


	/** A [Outline] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Outline, CssVariable<Outline>
}


/** The CSS `none` outline value. */
@CssDsl
public inline val Outline.Companion.none: Outline
	get() = unsafe("none")


/** Creates a [Outline] from an unchecked string [value]. */
public inline fun Outline.Companion.unsafe(value: String): Outline =
	CssValue.unsafe(value)


/** Creates a [Outline] backed by a CSS variable with the given [name]. */
public inline fun Outline.Companion.variable(name: String): Outline.Variable =
	CssVariable.unsafe(name)


/** Creates a [Outline] shorthand value. */
public inline fun Outline.Companion.with(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null): Outline =
	when {
		width != null && style != null && color != null -> unsafe("$width $style $color")
		width != null || style != null || color != null -> {
			var string = ""

			if (width != null)
				string += width

			if (style != null) {
				if (string.isNotEmpty()) string += " "
				string += style
			}
			if (color != null) {
				if (string.isNotEmpty()) string += " "
				string += color
			}

			unsafe(string)
		}
		else -> CssValue.initial
	}


/** Sets the `outline` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.outline(value: Outline) {
	property(outline, value)
}


/** Sets the `outline` CSS property with width and height values. */
@CssDsl
@LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.outline(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null) {
	outline(Outline.with(color = color, style = style, width = width))
}


/** The `outline` CSS property. */
@Suppress("unused")
public inline val CssProperties.outline: CssProperty<Outline>
	get() = CssProperty.unsafe("outline")
