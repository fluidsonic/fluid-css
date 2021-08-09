@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontWeight : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : FontWeight, CssVariable<FontWeight>
}


@CssDsl
public inline val FontWeight.Companion.bold: FontWeight
	get() = unsafe("bold")

@CssDsl
public inline val FontWeight.Companion.bolder: FontWeight
	get() = unsafe("bolder")

@CssDsl
public inline val FontWeight.Companion.lighter: FontWeight
	get() = unsafe("lighter")

@CssDsl
public inline val FontWeight.Companion.normal: FontWeight
	get() = unsafe("normal")

@CssDsl
public inline val FontWeight.Companion.w100: FontWeight
	get() = unsafe("100")

@CssDsl
public inline val FontWeight.Companion.w200: FontWeight
	get() = unsafe("200")

@CssDsl
public inline val FontWeight.Companion.w300: FontWeight
	get() = unsafe("300")

@CssDsl
public inline val FontWeight.Companion.w400: FontWeight
	get() = unsafe("400")

@CssDsl
public inline val FontWeight.Companion.w500: FontWeight
	get() = unsafe("500")

@CssDsl
public inline val FontWeight.Companion.w600: FontWeight
	get() = unsafe("600")

@CssDsl
public inline val FontWeight.Companion.w700: FontWeight
	get() = unsafe("700")

@CssDsl
public inline val FontWeight.Companion.w800: FontWeight
	get() = unsafe("800")

@CssDsl
public inline val FontWeight.Companion.w900: FontWeight
	get() = unsafe("900")


@CssDsl
public inline fun FontWeight.Companion.of(value: Double): FontWeight =
	CssValue.unsafe(value)


@CssDsl
public inline fun FontWeight.Companion.of(value: Int): FontWeight =
	CssValue.unsafe(value)


public inline fun FontWeight.Companion.unsafe(value: String): FontWeight =
	CssValue.unsafe(value)


public inline fun FontWeight.Companion.variable(name: String): FontWeight.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: FontWeight) {
	property(fontWeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Double) {
	property(fontWeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Int) {
	property(fontWeight, value)
}


@Suppress("unused")
public inline val CssProperties.fontWeight: CssProperty<FontWeight>
	get() = CssProperty.unsafe("font-weight")
