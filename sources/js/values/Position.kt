@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Position : CssValue, Internal {

	public companion object {

		@CssDsl
		public val absolute: Position = raw("absolute")

		@CssDsl
		public val fixed: Position = raw("fixed")

		@CssDsl
		public val relative: Position = raw("relative")

		@CssDsl
		public val static: Position = raw("static")

		@CssDsl
		public val sticky: Position = raw("sticky")


		public fun raw(value: String): Position =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Position, CssVariable<Position>
}


@CssDsl
public fun CssDeclarationBlockBuilder.position(value: Position) {
	property(position, value)
}


@Suppress("unused")
public val CssProperties.position: CssProperty<Position>
	get() = CssProperty("position")

