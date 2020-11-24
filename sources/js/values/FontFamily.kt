@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


public external interface FontFamily : CssValue.StringConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun unsafe(value: String): FontFamily =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FontFamily, CssVariable<FontFamily>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontFamily(value: FontFamily) {
	property(fontFamily, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontFamily(value: String) {
	property(fontFamily, value)
}


@Suppress("unused")
public inline val CssProperties.fontFamily: CssProperty<FontFamily>
	get() = CssProperty.unsafe("font-family")
