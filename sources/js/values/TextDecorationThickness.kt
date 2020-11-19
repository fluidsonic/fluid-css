@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextDecorationThickness : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: TextDecorationThickness = raw("auto")


		@CssDsl
		public val fromFont: TextDecorationThickness = raw("from-font")


		public fun raw(value: String): TextDecorationThickness =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TextDecorationThickness, CssVariable<TextDecorationThickness>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textDecorationThickness(value: TextDecorationThickness) {
	property(textDecorationThickness, value)
}


@Suppress("unused")
public inline val CssProperties.textDecorationThickness: CssProperty<TextDecorationThickness>
	get() = CssProperty("text-decoration-thickness")
