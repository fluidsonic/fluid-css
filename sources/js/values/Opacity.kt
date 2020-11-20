@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Opacity : CssValue.NumberConstructable, Internal {

	public companion object {

		public fun of(value: Number): Opacity =
			raw(value.toString())


		public fun raw(value: String): Opacity =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Opacity, CssVariable<Opacity>
}


@CssDsl
public fun CssDeclarationBlockBuilder.opacity(value: Opacity) {
	property(opacity, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.opacity(value: Number) {
	property(opacity, value)
}


@Suppress("unused")
public val CssProperties.opacity: CssProperty<Opacity>
	get() = CssProperty("opacity")
