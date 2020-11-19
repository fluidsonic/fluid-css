@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface FontFaceBuilder {

	@CssDsl
	public fun declaration(value: CssDeclaration)

	@CssDsl
	public fun property(name: String, value: String) {
		declaration(CssDeclaration(property = name, value = value))
	}

	public fun Unit.build(): FontFace


	public companion object {

		public fun default(): FontFaceBuilder =
			Default()
	}


	private class Default : FontFaceBuilder {

		private val declarations = mutableListOf<CssDeclaration>()


		override fun declaration(value: CssDeclaration) {
			declarations += value
		}


		override fun Unit.build(): FontFace =
			FontFace.default(declarations = CssDeclarationBlock.default(declarations = declarations))
	}
}


@CssDsl
public inline fun FontFaceBuilder.fontDisplay(value: FontFace.Display) {
	property("font-display", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontFamily(value: String) {
	property("font-family", value)
}


@CssDsl
public inline fun FontFaceBuilder.fontFeatureSettings(value: FontFace.FeatureSettings) {
	property("font-feature-settings", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontStretch(value: FontFace.Stretch) {
	property("font-stretch", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontStyle(value: FontFace.Style) {
	property("font-style", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontVariationSettings(value: FontFace.VariationSettings) {
	property("font-variation-settings", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontVariant(value: FontFace.Variant) {
	property("font-variant", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.fontWeight(value: FontFace.Weight) {
	property("font-weight", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.src(value: FontFace.Source) {
	property("src", value.toString())
}


@CssDsl
public inline fun FontFaceBuilder.unicodeRange(value: FontFace.UnicodeRange) {
	property("unicode-range", value.toString())
}
