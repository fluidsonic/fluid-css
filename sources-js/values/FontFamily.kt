@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


@JsName("0;0")
public external interface FontFamily : CssValue.StringConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : FontFamily, CssVariable<FontFamily>
}


public inline fun FontFamily.Companion.unsafe(value: String): FontFamily =
	CssValue.unsafe(value)


public inline fun FontFamily.Companion.variable(name: String): FontFamily.Variable =
	CssVariable.unsafe(name)


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
