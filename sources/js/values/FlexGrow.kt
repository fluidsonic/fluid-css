@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexGrow : CssValue.NumberConstructable, Internal {

	public companion object {

		public inline fun of(value: Number): FlexGrow =
			raw(value.toString())


		public fun raw(value: String): FlexGrow =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FlexGrow, CssVariable<FlexGrow>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrow) {
	property(flexGrow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Number) {
	property(flexGrow, value)
}


@Suppress("unused")
public inline val CssProperties.flexGrow: CssProperty<FlexGrow>
	get() = CssProperty("flex-grow")
