@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface OutlineStyle : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: OutlineStyle = raw("none")


		@CssDsl
		public val dashed: OutlineStyle = raw("dashed")

		@CssDsl
		public val dotted: OutlineStyle = raw("dotted")

		@CssDsl
		public val double: OutlineStyle = raw("double")

		@CssDsl
		public val groove: OutlineStyle = raw("groove")

		@CssDsl
		public val hidden: OutlineStyle = raw("hidden")

		@CssDsl
		public val inset: OutlineStyle = raw("inset")

		@CssDsl
		public val outset: OutlineStyle = raw("outset")

		@CssDsl
		public val ridge: OutlineStyle = raw("ridge")

		@CssDsl
		public val solid: OutlineStyle = raw("solid")


		public fun raw(value: String): OutlineStyle =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : OutlineStyle, CssVariable<OutlineStyle>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineStyle(all: OutlineStyle) {
	property(outlineStyle, all)
}


@Suppress("unused")
public inline val CssProperties.outlineStyle: CssProperty<OutlineStyle>
	get() = CssProperty("outline-style")
