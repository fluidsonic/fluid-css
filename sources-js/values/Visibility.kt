@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Visibility : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val collapse: Visibility
			get() = unsafe("collapse")

		@CssDsl
		public inline val hidden: Visibility
			get() = unsafe("hidden")

		@CssDsl
		public inline val visible: Visibility
			get() = unsafe("visible")


		public inline fun unsafe(value: String): Visibility =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Visibility, CssVariable<Visibility>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.visibility(value: Visibility) {
	property(visibility, value)
}


@Suppress("unused")
public inline val CssProperties.visibility: CssProperty<Visibility>
	get() = CssProperty.unsafe("visibility")
