@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexShrink : CssValue.NumberConstructable, Internal {

	public companion object {

		public inline fun of(value: Number): FlexShrink =
			raw(value.toString())


		public fun raw(value: String): FlexShrink =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : FlexShrink, CssVariable<FlexShrink>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrink) {
	property(flexShrink, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Number) {
	property(flexShrink, value)
}


@Suppress("unused")
public inline val CssProperties.flexShrink: CssProperty<FlexShrink>
	get() = CssProperty("flex-shrink")
