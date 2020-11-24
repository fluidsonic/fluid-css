@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Position : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val absolute: Position
			get() = unsafe("absolute")

		@CssDsl
		public inline val fixed: Position
			get() = unsafe("fixed")

		@CssDsl
		public inline val relative: Position
			get() = unsafe("relative")

		@CssDsl
		public inline val static: Position
			get() = unsafe("static")

		@CssDsl
		public inline val sticky: Position
			get() = unsafe("sticky")


		public inline fun unsafe(value: String): Position =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Position, CssVariable<Position>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.position(value: Position) {
	property(position, value)
}


@Suppress("unused")
public inline val CssProperties.position: CssProperty<Position>
	get() = CssProperty.unsafe("position")

