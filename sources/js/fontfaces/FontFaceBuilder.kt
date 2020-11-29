@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface FontFaceBuilder {

	@CssDsl
	public fun declaration(value: CssDeclaration)

	@CssDsl
	public fun property(name: String, value: String) {
		declaration(CssDeclaration.of(property = name, value = value))
	}

	public fun Unit.build(): FontFace


	public companion object {

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


@CssDsl
public fun FontFaceBuilder.fontDisplay(value: FontFace.Display) {
	property("font-display", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontFamily(value: String) {
	property("font-family", value)
}


@CssDsl
public fun FontFaceBuilder.fontFeatureSettings(value: FontFace.FeatureSettings) {
	property("font-feature-settings", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontStretch(value: FontFace.Stretch) {
	property("font-stretch", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontStyle(value: FontFace.Style) {
	property("font-style", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontVariationSettings(value: FontFace.VariationSettings) {
	property("font-variation-settings", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontVariant(value: FontFace.Variant) {
	property("font-variant", value.asString())
}


@CssDsl
public fun FontFaceBuilder.fontWeight(value: FontFace.Weight) {
	property("font-weight", value.asString())
}


@CssDsl
public fun FontFaceBuilder.src(value: FontFace.Source) {
	property("src", value.asString())
}


@CssDsl
public fun FontFaceBuilder.unicodeRange(value: FontFace.UnicodeRange) {
	property("unicode-range", value.asString())
}
