@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Appearance : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: Appearance
			get() = unsafe("auto")

		@CssDsl
		public inline val none: Appearance
			get() = unsafe("none")


		@CssDsl
		public inline val menulistButton: Appearance
			get() = unsafe("menulist-button")

		@CssDsl
		public inline val textfield: Appearance
			get() = unsafe("textfield")


		public inline fun unsafe(value: String): Appearance =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Appearance, CssVariable<Appearance>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.appearance(value: Appearance) {
	property(appearance, value)
}


@Suppress("unused")
public inline val CssProperties.appearance: CssProperty<Appearance>
	get() = CssProperty.unsafe("appearance")
