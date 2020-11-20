@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontWeight : CssValue.NumberConstructable, Internal {

	public companion object {

		@CssDsl
		public val bold: FontWeight = raw("bold")

		@CssDsl
		public val bolder: FontWeight = raw("bolder")

		@CssDsl
		public val lighter: FontWeight = raw("lighter")

		@CssDsl
		public val normal: FontWeight = raw("normal")

		@CssDsl
		public val w100: FontWeight = raw("100")

		@CssDsl
		public val w200: FontWeight = raw("200")

		@CssDsl
		public val w300: FontWeight = raw("300")

		@CssDsl
		public val w400: FontWeight = raw("400")

		@CssDsl
		public val w500: FontWeight = raw("500")

		@CssDsl
		public val w600: FontWeight = raw("600")

		@CssDsl
		public val w700: FontWeight = raw("700")

		@CssDsl
		public val w800: FontWeight = raw("800")

		@CssDsl
		public val w900: FontWeight = raw("900")


		@CssDsl
		public fun of(value: Number): FontWeight =
			raw(value.toString())


		public fun raw(value: String): FontWeight =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FontWeight, CssVariable<FontWeight>
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontWeight(value: FontWeight) {
	property(fontWeight, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontWeight(value: Number) {
	property(fontWeight, value)
}


@Suppress("unused")
public val CssProperties.fontWeight: CssProperty<FontWeight>
	get() = CssProperty("font-weight")
