@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


/** Represents a CSS `content` value. */
@JsName("0;0")
public external interface Content : CssValue {

	public companion object;


	/** A [Content] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Content, CssVariable<Content>
}


/** Creates a CSS `counter()` content value. */
@CssDsl
public inline fun Content.Companion.counter(name: String): Content =
	unsafe("counter($name)")


/** Creates a [Content] from a string literal. */
public inline fun Content.Companion.string(value: String): Content =
	unsafe("'$value'") // FIXME escaping


/** Creates a [Content] from an unchecked string [value]. */
public inline fun Content.Companion.unsafe(value: String): Content =
	CssValue.unsafe(value)


/** Creates a [Content] backed by a CSS variable with the given [name]. */
public inline fun Content.Companion.variable(name: String): Content.Variable =
	CssVariable.unsafe(name)


/** Sets the `content` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: Content) {
	property(content, value)
}


/** Sets the `content` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: String = "") {
	content(Content.string(value))
}


/** The `content` CSS property. */
@Suppress("unused")
public inline val CssProperties.content: CssProperty<Content>
	get() = CssProperty.unsafe("content")
