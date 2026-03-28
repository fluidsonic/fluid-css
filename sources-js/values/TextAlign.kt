@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-align` value. */
@JsName("0;0")
public external interface TextAlign : CssValue {

	public companion object;


	/** A [TextAlign] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextAlign, CssVariable<TextAlign>
}


/** The CSS `center` text-align value. */
@CssDsl
public inline val TextAlign.Companion.center: TextAlign
	get() = unsafe("center")

/** The CSS `end` text-align value. */
@CssDsl
public inline val TextAlign.Companion.end: TextAlign
	get() = unsafe("end")

/** The CSS `justify` text-align value. */
@CssDsl
public inline val TextAlign.Companion.justify: TextAlign
	get() = unsafe("justify")

/** The CSS `left` text-align value. */
@CssDsl
public inline val TextAlign.Companion.left: TextAlign
	get() = unsafe("left")

/** The CSS `match-parent` text-align value. */
@CssDsl
public inline val TextAlign.Companion.matchParent: TextAlign
	get() = unsafe("match-parent")

/** The CSS `right` text-align value. */
@CssDsl
public inline val TextAlign.Companion.right: TextAlign
	get() = unsafe("right")

/** The CSS `start` text-align value. */
@CssDsl
public inline val TextAlign.Companion.start: TextAlign
	get() = unsafe("start")


/** Creates a [TextAlign] from an unchecked string [value]. */
public inline fun TextAlign.Companion.unsafe(value: String): TextAlign =
	CssValue.unsafe(value)


/** Creates a [TextAlign] backed by a CSS variable with the given [name]. */
public inline fun TextAlign.Companion.variable(name: String): TextAlign.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-align` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlign) {
	property(textAlign, value)
}


/** The `text-align` CSS property. */
@Suppress("unused")
public inline val CssProperties.textAlign: CssProperty<TextAlign>
	get() = CssProperty.unsafe("text-align")
