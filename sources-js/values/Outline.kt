@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.internal.*


@JsName("0;0")
public external interface Outline : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Outline, CssVariable<Outline>
}


@CssDsl
public inline val Outline.Companion.none: Outline
	get() = unsafe("none")


public inline fun Outline.Companion.unsafe(value: String): Outline =
	CssValue.unsafe(value)


public inline fun Outline.Companion.variable(name: String): Outline.Variable =
	CssVariable.unsafe(name)


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.outline(value: Outline) {
	property(outline, value)
}


@CssDsl
@LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.outline(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null) {
	outline(Outline.with(color = color, style = style, width = width))
}


@Suppress("unused")
public inline val CssProperties.outline: CssProperty<Outline>
	get() = CssProperty.unsafe("outline")
