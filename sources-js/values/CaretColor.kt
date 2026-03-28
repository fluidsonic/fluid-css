@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `caret-color` value. */
@JsName("0;0")
public external interface CaretColor : CssValue {

	public companion object;


	/** A [CaretColor] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : CaretColor, CssVariable<CaretColor>
}


/** The CSS `auto` caret-color value. */
@CssDsl
public inline val CaretColor.Companion.auto: CaretColor
	get() = unsafe("auto")


/** Creates a [CaretColor] from an unchecked string [value]. */
public inline fun CaretColor.Companion.unsafe(value: String): CaretColor =
	CssValue.unsafe(value)


/** Creates a [CaretColor] backed by a CSS variable with the given [name]. */
public inline fun CaretColor.Companion.variable(name: String): CaretColor.Variable =
	CssVariable.unsafe(name)


/** Sets the `caret-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.caretColor(all: CaretColor) {
	property(caretColor, all)
}


/** The `caret-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.caretColor: CssProperty<CaretColor>
	get() = CssProperty.unsafe("caret-color")
