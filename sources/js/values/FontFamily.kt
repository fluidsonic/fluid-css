@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


public interface FontFamily : CssValue.StringConstructable, Internal {

	public companion object {

		public fun raw(value: String): FontFamily =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FontFamily, CssVariable<FontFamily>
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontFamily(value: FontFamily) {
	property(fontFamily, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.fontFamily(value: String) {
	property(fontFamily, value)
}


@Suppress("unused")
public val CssProperties.fontFamily: CssProperty<FontFamily>
	get() = CssProperty("font-family")
