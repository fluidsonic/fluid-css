@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontVariantNumeric : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val normal: FontVariantNumeric
			get() = unsafe("normal")


		public inline fun unsafe(value: String): FontVariantNumeric =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FontVariantNumeric, CssVariable<FontVariantNumeric>
}


@Suppress("DEPRECATION")
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
