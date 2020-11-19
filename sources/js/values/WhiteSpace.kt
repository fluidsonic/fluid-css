@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface WhiteSpace : CssValue, Internal {

	public companion object {

		@CssDsl
		public val breakSpaces: WhiteSpace = raw("break-spaces")

		@CssDsl
		public val normal: WhiteSpace = raw("normal")

		@CssDsl
		public val nowrap: WhiteSpace = raw("nowrap")

		@CssDsl
		public val pre: WhiteSpace = raw("pre")

		@CssDsl
		public val preLine: WhiteSpace = raw("pre-line")

		@CssDsl
		public val preWrap: WhiteSpace = raw("pre-wrap")


		public fun raw(value: String): WhiteSpace =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : WhiteSpace, CssVariable<WhiteSpace>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.whiteSpace(value: WhiteSpace) {
	property(whiteSpace, value)
}


@Suppress("unused")
public inline val CssProperties.whiteSpace: CssProperty<WhiteSpace>
	get() = CssProperty("white-space")
