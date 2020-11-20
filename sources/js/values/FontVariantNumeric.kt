@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontVariantNumeric : CssValue, Internal {

	public companion object {

		@CssDsl
		public val normal: FontVariantNumeric = raw("normal")


		public fun raw(value: String): FontVariantNumeric =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(
			figure: FontVariantNumericFigure? = null,
			spacing: FontVariantNumericSpacing? = null,
			fraction: FontVariantNumericFraction? = null,
			isOrdinal: Boolean = false,
			isSlashedZero: Boolean = false,
		): FontVariantNumeric =
			if (figure != null || spacing != null || fraction != null || isOrdinal || isSlashedZero)
				raw(buildString {
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
			else
				CssValue.initial
	}


	public interface Variable : FontVariantNumeric, CssVariable<FontVariantNumeric>
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontVariantNumeric(value: FontVariantNumeric) {
	property(fontVariantNumeric, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontVariantNumeric(
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
public val CssProperties.fontVariantNumeric: CssProperty<FontVariantNumeric>
	get() = CssProperty("font-variant-numeric")
