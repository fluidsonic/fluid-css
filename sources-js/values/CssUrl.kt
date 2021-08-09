@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface CssUrl : CssImage {

	public companion object;


	@JsName("0;0")
	public interface Variable : CssUrl, CssVariable<CssUrl>
}


public inline fun CssUrl.Companion.of(value: String): CssUrl =
	unsafe("url('$value')") // FIXME escaping


public inline fun CssUrl.Companion.unsafe(value: String): CssUrl =
	CssValue.unsafe(value)


public inline fun CssUrl.Companion.variable(name: String): CssUrl.Variable =
	CssVariable.unsafe(name)


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.url(value: String): CssUrl =
	CssUrl.of(value)
