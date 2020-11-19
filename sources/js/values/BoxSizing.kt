@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BoxSizing : CssValue, Internal {

	public companion object {

		@CssDsl
		public val contentBox: BoxSizing = raw("content-box")

		@CssDsl
		public val borderBox: BoxSizing = raw("border-box")


		public fun raw(value: String): BoxSizing =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BoxSizing, CssVariable<BoxSizing>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxSizing(value: BoxSizing) {
	property(boxSizing, value)
}


@Suppress("unused")
public inline val CssProperties.boxSizing: CssProperty<BoxSizing>
	get() = CssProperty("box-sizing")
