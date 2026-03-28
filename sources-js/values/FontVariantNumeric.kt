@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `font-variant-numeric` value. */
@JsName("0;0")
public external interface FontVariantNumeric : CssValue {

	public companion object;


	/** A [FontVariantNumeric] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : FontVariantNumeric, CssVariable<FontVariantNumeric>
}


/** The CSS `normal` font-variant-numeric value. */
@CssDsl
public inline val FontVariantNumeric.Companion.normal: FontVariantNumeric
	get() = unsafe("normal")


/** Creates a [FontVariantNumeric] from an unchecked string [value]. */
public inline fun FontVariantNumeric.Companion.unsafe(value: String): FontVariantNumeric =
	CssValue.unsafe(value)


/** Creates a [FontVariantNumeric] backed by a CSS variable with the given [name]. */
public inline fun FontVariantNumeric.Companion.variable(name: String): FontVariantNumeric.Variable =
	CssVariable.unsafe(name)


/** Creates a [FontVariantNumeric] shorthand value. */
public inline fun FontVariantNumeric.Companion.with(
	figure: FontVariantNumericFigure? = null,
	spacing: FontVariantNumericSpacing? = null,
	fraction: FontVariantNumericFraction? = null,
	isOrdinal: Boolean = false,
	isSlashedZero: Boolean = false,
): FontVariantNumeric =
	if (figure != null || spacing != null || fraction != null || isOrdinal || isSlashedZero) {
		var string = ""

		if (figure != null)
			string += figure

		if (spacing != null) {
			if (string.isNotEmpty()) string += " "
			string += spacing
		}
		if (fraction != null) {
			if (string.isNotEmpty()) string += " "
			string += fraction
		}
		if (isOrdinal) {
			if (string.isNotEmpty()) string += " "
			string += "ordinal"
		}
		if (isSlashedZero) {
			if (string.isNotEmpty()) string += " "
			string += "slashed-zero"
		}

		unsafe(string)
	}
	else
		CssValue.initial


/** Sets the `font-variant-numeric` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: FontVariantNumeric) {
	property(fontVariantNumeric, value)
}


/** Sets the `font-variant-numeric` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(
	figure: FontVariantNumericFigure? = null,
	spacing: FontVariantNumericSpacing? = null,
	fraction: FontVariantNumericFraction? = null,
	isOrdinal: Boolean = false,
	isSlashedZero: Boolean = false,
) {
	fontVariantNumeric(FontVariantNumeric.with(
		figure = figure,
		fraction = fraction,
		isOrdinal = isOrdinal,
		isSlashedZero = isSlashedZero,
		spacing = spacing,
	))
}


/** The `font-variant-numeric` CSS property. */
@Suppress("unused")
public inline val CssProperties.fontVariantNumeric: CssProperty<FontVariantNumeric>
	get() = CssProperty.unsafe("font-variant-numeric")
