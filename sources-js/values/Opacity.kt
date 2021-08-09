@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Opacity : CssValue.DoubleConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : Opacity, CssVariable<Opacity>
}


public inline fun Opacity.Companion.of(value: Double): Opacity =
	CssValue.unsafe(value)


public inline fun Opacity.Companion.of(value: Int): Opacity =
	CssValue.unsafe(value)


public inline fun Opacity.Companion.unsafe(value: String): Opacity =
	CssValue.unsafe(value)


public inline fun Opacity.Companion.variable(name: String): Opacity.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Opacity) {
	property(opacity, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Double) {
	property(opacity, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Int) {
	property(opacity, value)
}


@Suppress("unused")
public inline val CssProperties.opacity: CssProperty<Opacity>
	get() = CssProperty.unsafe("opacity")
