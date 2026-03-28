@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-decoration-thickness` value. */
@JsName("0;0")
public external interface TextDecorationThickness : CssValue {

	public companion object;


	/** A [TextDecorationThickness] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextDecorationThickness, CssVariable<TextDecorationThickness>
}


/** The CSS `auto` text-decoration-thickness value. */
@CssDsl
public inline val TextDecorationThickness.Companion.auto: TextDecorationThickness
	get() = unsafe("auto")


/** The CSS `from-font` text-decoration-thickness value. */
@CssDsl
public inline val TextDecorationThickness.Companion.fromFont: TextDecorationThickness
	get() = unsafe("from-font")


/** Creates a [TextDecorationThickness] from an unchecked string [value]. */
public inline fun TextDecorationThickness.Companion.unsafe(value: String): TextDecorationThickness =
	CssValue.unsafe(value)


/** Creates a [TextDecorationThickness] backed by a CSS variable with the given [name]. */
public inline fun TextDecorationThickness.Companion.variable(name: String): TextDecorationThickness.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-decoration-thickness` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: TextDecorationThickness) {
	property(textDecorationThickness, value)
}


/** The `text-decoration-thickness` CSS property. */
@Suppress("unused")
public inline val CssProperties.textDecorationThickness: CssProperty<TextDecorationThickness>
	get() = CssProperty.unsafe("text-decoration-thickness")
