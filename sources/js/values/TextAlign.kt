@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextAlign : CssValue, Internal {

	public companion object {

		@CssDsl
		public val center: TextAlign = raw("center")

		@CssDsl
		public val end: TextAlign = raw("end")

		@CssDsl
		public val justify: TextAlign = raw("justify")

		@CssDsl
		public val left: TextAlign = raw("left")

		@CssDsl
		public val matchParent: TextAlign = raw("match-parent")

		@CssDsl
		public val right: TextAlign = raw("right")

		@CssDsl
		public val start: TextAlign = raw("start")


		public fun raw(value: String): TextAlign =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TextAlign, CssVariable<TextAlign>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlign) {
	property(textAlign, value)
}


@Suppress("unused")
public inline val CssProperties.textAlign: CssProperty<TextAlign>
	get() = CssProperty("text-align")
