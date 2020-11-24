@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BorderCollapse : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val collapse: BorderCollapse
			get() = unsafe("collapse")

		@CssDsl
		public inline val separate: BorderCollapse
			get() = unsafe("separate")


		public inline fun unsafe(value: String): BorderCollapse =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BorderCollapse, CssVariable<BorderCollapse>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderCollapse(value: BorderCollapse) {
	property(borderCollapse, value)
}


@Suppress("unused")
public inline val CssProperties.borderCollapse: CssProperty<BorderCollapse>
	get() = CssProperty.unsafe("border-collapse")
