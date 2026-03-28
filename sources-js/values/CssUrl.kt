@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `css-url` value. */
@JsName("0;0")
public external interface CssUrl : CssImage {

	public companion object;


	/** A [CssUrl] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : CssUrl, CssVariable<CssUrl>
}


/** Creates a [CssUrl] value. */
public inline fun CssUrl.Companion.of(value: String): CssUrl =
	unsafe("url('$value')") // FIXME escaping


/** Creates a [CssUrl] from an unchecked string [value]. */
public inline fun CssUrl.Companion.unsafe(value: String): CssUrl =
	CssValue.unsafe(value)


/** Creates a [CssUrl] backed by a CSS variable with the given [name]. */
public inline fun CssUrl.Companion.variable(name: String): CssUrl.Variable =
	CssVariable.unsafe(name)


/** Sets the `url` CSS property. */
@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.url(value: String): CssUrl =
	CssUrl.of(value)
