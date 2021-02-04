@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Overflow : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: Axis
			get() = Axis.unsafe("auto")


		@CssDsl
		public inline val hidden: Axis
			get() = Axis.unsafe("hidden")

		@CssDsl
		public inline val scroll: Axis
			get() = Axis.unsafe("scroll")

		@CssDsl
		public inline val visible: Axis
			get() = Axis.unsafe("visible")


		public inline fun of(xy: Axis): Overflow =
			xy


		public inline fun of(x: Axis, y: Axis): Overflow =
			if (x eq y) x
			else unsafe("$x $y")


		public inline fun unsafe(value: String): Overflow =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Axis : Overflow {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Axis =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Axis, CssVariable<Axis>
	}


	public interface Variable : Overflow, CssVariable<Overflow>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.overflow(all: Overflow) {
	property(overflow, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.overflow(x: Overflow.Axis, y: Overflow.Axis) {
	overflow(Overflow.of(x, y))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.overflowX(value: Overflow.Axis) {
	property(overflowX, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.overflowY(value: Overflow.Axis) {
	property(overflowY, value)
}


@Suppress("unused")
public inline val CssProperties.overflow: CssProperty<Overflow>
	get() = CssProperty.unsafe("overflow")


@Suppress("unused")
public inline val CssProperties.overflowX: CssProperty<Overflow.Axis>
	get() = CssProperty.unsafe("overflow-x")


@Suppress("unused")
public inline val CssProperties.overflowY: CssProperty<Overflow.Axis>
	get() = CssProperty.unsafe("overflow-y")
