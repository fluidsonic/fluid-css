@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface OutlineColor : CssValue, Internal {

	public companion object {

		@CssDsl
		public val invert: OutlineColor = raw("invert")


		public fun raw(value: String): OutlineColor =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : OutlineColor


	public interface Variable : OutlineColor, CssVariable<OutlineColor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineColor(all: OutlineColor) {
	property(outlineColor, all)
}


@Suppress("unused")
public inline val CssProperties.outlineColor: CssProperty<OutlineColor>
	get() = CssProperty("outline-color")
