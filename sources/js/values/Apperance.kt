@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Appearance : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Appearance = raw("auto")

		@CssDsl
		public val none: Appearance = raw("none")


		@CssDsl
		public val menulistButton: Appearance = raw("menulist-button")

		@CssDsl
		public val textfield: Appearance = raw("textfield")


		public fun raw(value: String): Appearance =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Appearance, CssVariable<Appearance>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.appearance(value: Appearance) {
	property(appearance, value)
}


@Suppress("unused")
public inline val CssProperties.appearance: CssProperty<Appearance>
	get() = CssProperty("appearance")
