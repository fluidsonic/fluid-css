@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `visibility` value. */
@JsName("0;0")
public external interface Visibility : CssValue {

	public companion object;


	/** A [Visibility] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Visibility, CssVariable<Visibility>
}


/** The CSS `collapse` visibility value. */
@CssDsl
public inline val Visibility.Companion.collapse: Visibility
	get() = unsafe("collapse")

/** The CSS `hidden` visibility value. */
@CssDsl
public inline val Visibility.Companion.hidden: Visibility
	get() = unsafe("hidden")

/** The CSS `visible` visibility value. */
@CssDsl
public inline val Visibility.Companion.visible: Visibility
	get() = unsafe("visible")


/** Creates a [Visibility] from an unchecked string [value]. */
public inline fun Visibility.Companion.unsafe(value: String): Visibility =
	CssValue.unsafe(value)


/** Creates a [Visibility] backed by a CSS variable with the given [name]. */
public inline fun Visibility.Companion.variable(name: String): Visibility.Variable =
	CssVariable.unsafe(name)


/** Sets the `visibility` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.visibility(value: Visibility) {
	property(visibility, value)
}


/** The `visibility` CSS property. */
@Suppress("unused")
public inline val CssProperties.visibility: CssProperty<Visibility>
	get() = CssProperty.unsafe("visibility")
