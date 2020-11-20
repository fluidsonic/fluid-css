@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Overflow : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Axis = GenericValue("auto")


		@CssDsl
		public val hidden: Axis = GenericValue("hidden")

		@CssDsl
		public val scroll: Axis = GenericValue("scroll")

		@CssDsl
		public val visible: Axis = GenericValue("visible")


		public fun of(xy: Axis): Overflow =
			xy


		public fun of(x: Axis, y: Axis): Overflow =
			if (x == y) x
			else raw("$x $y")


		public fun raw(value: String): Overflow =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Axis : Overflow


	public interface Variable : Overflow, CssVariable<Overflow>
}


@CssDsl
public fun CssDeclarationBlockBuilder.overflow(all: Overflow) {
	property(overflow, all)
}


@CssDsl
public fun CssDeclarationBlockBuilder.overflow(x: Overflow.Axis, y: Overflow.Axis) {
	overflow(Overflow.of(x, y))
}


@CssDsl
public fun CssDeclarationBlockBuilder.overflowX(value: Overflow.Axis) {
	property(overflowX, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.overflowY(value: Overflow.Axis) {
	property(overflowY, value)
}


@Suppress("unused")
public val CssProperties.overflow: CssProperty<Overflow>
	get() = CssProperty("overflow")


@Suppress("unused")
public val CssProperties.overflowX: CssProperty<Overflow.Axis>
	get() = CssProperty("overflow-x")


@Suppress("unused")
public val CssProperties.overflowY: CssProperty<Overflow.Axis>
	get() = CssProperty("overflow-y")
