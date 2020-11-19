@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderCollapse : CssValue, Internal {

	public companion object {

		@CssDsl
		public val collapse: BorderCollapse = raw("collapse")

		@CssDsl
		public val separate: BorderCollapse = raw("separate")


		public fun raw(value: String): BorderCollapse =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BorderCollapse, CssVariable<BorderCollapse>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderCollapse(value: BorderCollapse) {
	property(borderCollapse, value)
}


@Suppress("unused")
public inline val CssProperties.borderCollapse: CssProperty<BorderCollapse>
	get() = CssProperty("border-collapse")
