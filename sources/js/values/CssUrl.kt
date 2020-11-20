@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CssUrl : CssImage {

	public companion object {

		public fun of(value: String): CssUrl =
			GenericValue("url('$value')") // FIXME escaping


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : CssUrl, CssVariable<CssUrl>
}


@CssDsl
public fun CssDeclarationBlockBuilder.url(value: String): CssUrl =
	CssUrl.of(value)
