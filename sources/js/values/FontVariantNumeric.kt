@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumericOrGlobal : CssValue
public interface FontVariantNumeric : FontVariantNumericOrGlobal {

	public companion object {

		public val normal: FontVariantNumeric = FontVariantNumeric("normal")
	}
}


private class FontVariantNumericImpl(value: String) : CssValueBase(value), FontVariantNumeric


@Suppress("FunctionName")
public fun FontVariantNumeric(value: String): FontVariantNumeric =
	FontVariantNumericImpl(value)


@Suppress("FunctionName")
public fun FontVariantNumeric(
	figure: FontVariantNumericFigure? = null,
	spacing: FontVariantNumericSpacing? = null,
	fraction: FontVariantNumericFraction? = null,
	isOrdinal: Boolean = false,
	isSlashedZero: Boolean = false,
): FontVariantNumeric {
	require(figure != null || spacing != null || fraction != null || isOrdinal || isSlashedZero) {
		"At least one of figure, spacing, fraction, isOrdinal or isSlashedZero must be specified."
	}

	return FontVariantNumeric(buildString {
		if (figure != null)
			append(figure)

		if (spacing != null) {
			if (isNotEmpty()) append(" ")
			append(spacing)
		}
		if (fraction != null) {
			if (isNotEmpty()) append(" ")
			append(fraction)
		}
		if (isOrdinal) {
			if (isNotEmpty()) append(" ")
			append("ordinal")
		}
		if (isSlashedZero) {
			if (isNotEmpty()) append(" ")
			append("slashed-zero")
		}
	})
}


public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(
	figure: FontVariantNumericFigure? = null,
	spacing: FontVariantNumericSpacing? = null,
	fraction: FontVariantNumericFraction? = null,
	isOrdinal: Boolean = false,
	isSlashedZero: Boolean = false,
) {
	fontVariantNumeric(FontVariantNumeric(
		figure = figure,
		fraction = fraction,
		isOrdinal = isOrdinal,
		isSlashedZero = isSlashedZero,
		spacing = spacing,
	))
}


public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: FontVariantNumeric) {
	property(CssProperty.fontVariantNumeric, value)
}


public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: FontVariantNumericOrGlobal) {
	property(CssProperty.fontVariantNumeric, value)
}


public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: GlobalValue) {
	property(CssProperty.fontVariantNumeric, value)
}


public inline fun CssDeclarationBlockBuilder.fontVariantNumeric(value: CustomCssProperty<out FontVariantNumericOrGlobal>) {
	property(CssProperty.fontVariantNumeric, value)
}


public inline val CssProperty.Companion.fontVariantNumeric: CssProperty get() = CssProperty("font-variant-numeric")
