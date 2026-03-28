@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `opacity` value. */
@JsName("0;0")
public external interface Opacity : CssValue.DoubleConstructable {

	public companion object;


	/** A [Opacity] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Opacity, CssVariable<Opacity>
}


/** Creates a [Opacity] value. */
public inline fun Opacity.Companion.of(value: Double): Opacity =
	CssValue.unsafe(value)


/** Creates a [Opacity] value. */
public inline fun Opacity.Companion.of(value: Int): Opacity =
	CssValue.unsafe(value)


/** Creates a [Opacity] from an unchecked string [value]. */
public inline fun Opacity.Companion.unsafe(value: String): Opacity =
	CssValue.unsafe(value)


/** Creates a [Opacity] backed by a CSS variable with the given [name]. */
public inline fun Opacity.Companion.variable(name: String): Opacity.Variable =
	CssVariable.unsafe(name)


/** Sets the `opacity` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Opacity) {
	property(opacity, value)
}


/** Sets the `opacity` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Double) {
	property(opacity, value)
}


/** Sets the `opacity` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Int) {
	property(opacity, value)
}


/** The `opacity` CSS property. */
@Suppress("unused")
public inline val CssProperties.opacity: CssProperty<Opacity>
	get() = CssProperty.unsafe("opacity")
