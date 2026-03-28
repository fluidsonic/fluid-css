package io.fluidsonic.css


/** DSL builder for `@font-face` rules. */
@CssDsl
public interface FontFaceBuilder {

	/** Adds a [CssDeclaration] to the font face being built. */
	@CssDsl
	public fun declaration(value: CssDeclaration)

	/** Adds a CSS property declaration with the given [name] and [value]. */
	@CssDsl
	public fun property(name: String, value: String) {
		declaration(CssDeclaration.of(property = name, value = value))
	}

	/** Builds the [FontFace] from accumulated declarations. */
	public fun Unit.build(): FontFace


	public companion object {

		/** Creates a default [FontFaceBuilder] instance. */
		public fun default(): FontFaceBuilder =
			Default()
	}


	private class Default : FontFaceBuilder {

		private val declarations = arrayOf<CssDeclaration>()


		override fun declaration(value: CssDeclaration) {
			declarations.push(value)
		}


		override fun Unit.build(): FontFace =
			FontFace.default(declarations = CssDeclarationBlock.default(declarations = declarations))
	}
}


/** Sets the `font-display` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontDisplay(value: FontFace.Display) {
	property("font-display", value.asString())
}


/** Sets the `font-family` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontFamily(value: String) {
	property("font-family", value)
}


/** Sets the `font-feature-settings` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontFeatureSettings(value: FontFace.FeatureSettings) {
	property("font-feature-settings", value.asString())
}


/** Sets the `font-stretch` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontStretch(value: FontFace.Stretch) {
	property("font-stretch", value.asString())
}


/** Sets the `font-style` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontStyle(value: FontFace.Style) {
	property("font-style", value.asString())
}


/** Sets the `font-variation-settings` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontVariationSettings(value: FontFace.VariationSettings) {
	property("font-variation-settings", value.asString())
}


/** Sets the `font-variant` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontVariant(value: FontFace.Variant) {
	property("font-variant", value.asString())
}


/** Sets the `font-weight` descriptor. */
@CssDsl
public fun FontFaceBuilder.fontWeight(value: FontFace.Weight) {
	property("font-weight", value.asString())
}


/** Sets the `src` descriptor. */
@CssDsl
public fun FontFaceBuilder.src(value: FontFace.Source) {
	property("src", value.asString())
}


/** Sets the `unicode-range` descriptor. */
@CssDsl
public fun FontFaceBuilder.unicodeRange(value: FontFace.UnicodeRange) {
	property("unicode-range", value.asString())
}
