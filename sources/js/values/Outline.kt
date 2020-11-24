@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Outline : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: Outline
			get() = unsafe("none")


		public inline fun unsafe(value: String): Outline =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Outline, CssVariable<Outline>
}


@Suppress("DEPRECATION")
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
public inline fun CssDeclarationBlockBuilder.outline(width: OutlineWidth? = null, style: OutlineStyle? = null, color: Color? = null) {
	outline(Outline.with(color = color, style = style, width = width))
}


@Suppress("unused")
public inline val CssProperties.outline: CssProperty<Outline>
	get() = CssProperty.unsafe("outline")
