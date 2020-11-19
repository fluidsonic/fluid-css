@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface StrokeWidth : CssValue, Internal {

	public companion object {

		public fun raw(value: String): StrokeWidth =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : StrokeWidth, CssVariable<StrokeWidth>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidth) {
	property(strokeWidth, value)
}


@Suppress("unused")
public inline val CssProperties.strokeWidth: CssProperty<StrokeWidth>
	get() = CssProperty("stroke-width")
