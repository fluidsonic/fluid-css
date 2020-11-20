@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Visibility : CssValue, Internal {

	public companion object {

		@CssDsl
		public val collapse: Visibility = raw("collapse")

		@CssDsl
		public val hidden: Visibility = raw("hidden")

		@CssDsl
		public val visible: Visibility = raw("visible")


		public fun raw(value: String): Visibility =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Visibility, CssVariable<Visibility>
}


@CssDsl
public fun CssDeclarationBlockBuilder.visibility(value: Visibility) {
	property(visibility, value)
}


@Suppress("unused")
public val CssProperties.visibility: CssProperty<Visibility>
	get() = CssProperty("visibility")
