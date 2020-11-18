@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface CssFontFaceBuilder {

	@CssDsl
	public fun declaration(value: CssDeclaration)

	@CssDsl
	public fun property(name: String, value: String) {
		declaration(CssDeclaration(property = CssProperty(name), value = value))
	}

	public fun Unit.build(): FontFace


	public companion object {

		public fun default(): CssFontFaceBuilder =
			Default()
	}


	private class Default : CssFontFaceBuilder {

		private val declarations = mutableListOf<CssDeclaration>()


		override fun declaration(value: CssDeclaration) {
			declarations += value
		}


		override fun Unit.build(): FontFace =
			FontFace.default(declarations = declarations)
	}
}


@CssDsl
public inline fun CssFontFaceBuilder.fontDisplay(value: FontFace.Display) {
	property("font-display", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontFamily(value: String) {
	property("font-family", value)
}


@CssDsl
public inline fun CssFontFaceBuilder.fontFeatureSettings(value: FontFace.FeatureSettings) {
	property("font-feature-settings", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontStretch(value: FontFace.Stretch) {
	property("font-stretch", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontStyle(value: FontFace.Style) {
	property("font-style", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontVariationSettings(value: FontFace.VariationSettings) {
	property("font-variation-settings", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontVariant(value: FontFace.Variant) {
	property("font-variant", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.fontWeight(value: FontFace.Weight) {
	property("font-weight", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.src(value: FontFace.Source) {
	property("src", value.toString())
}


@CssDsl
public inline fun CssFontFaceBuilder.unicodeRange(value: FontFace.UnicodeRange) {
	property("unicode-range", value.toString())
}
