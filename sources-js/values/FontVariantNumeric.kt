@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontVariantNumeric : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : FontVariantNumeric, CssVariable<FontVariantNumeric>
}


@CssDsl
public inline val FontVariantNumeric.Companion.normal: FontVariantNumeric
	get() = unsafe("normal")


public inline fun FontVariantNumeric.Companion.unsafe(value: String): FontVariantNumeric =
	CssValue.unsafe(value)


public inline fun FontVariantNumeric.Companion.variable(name: String): FontVariantNumeric.Variable =
	CssVariable.unsafe(name)


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: FontVariantNumeric) {
	property(fontVariantNumeric, value)
}


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


@Suppress("unused")
public inline val CssProperties.fontVariantNumeric: CssProperty<FontVariantNumeric>
	get() = CssProperty.unsafe("font-variant-numeric")
