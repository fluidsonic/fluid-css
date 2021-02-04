@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface CssUrl : CssImage {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun of(value: String): CssUrl =
			unsafe("url('$value')") // FIXME escaping


		public inline fun unsafe(value: String): CssUrl =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : CssUrl, CssVariable<CssUrl>
}


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.url(value: String): CssUrl =
	CssUrl.of(value)
