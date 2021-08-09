@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Overflow : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Axis : Overflow {

		public companion object;


		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	@JsName("0;0")
	public interface Variable : Overflow, CssVariable<Overflow>
}


@CssDsl
public inline val Overflow.Companion.auto: Overflow.Axis
	get() = Overflow.Axis.unsafe("auto")


@CssDsl
public inline val Overflow.Companion.hidden: Overflow.Axis
	get() = Overflow.Axis.unsafe("hidden")

@CssDsl
public inline val Overflow.Companion.scroll: Overflow.Axis
	get() = Overflow.Axis.unsafe("scroll")

@CssDsl
public inline val Overflow.Companion.visible: Overflow.Axis
	get() = Overflow.Axis.unsafe("visible")


public inline fun Overflow.Companion.of(xy: Overflow.Axis): Overflow =
	xy


public inline fun Overflow.Companion.of(x: Overflow.Axis, y: Overflow.Axis): Overflow =
	if (x eq y) x
	else unsafe("$x $y")


public inline fun Overflow.Companion.unsafe(value: String): Overflow =
	CssValue.unsafe(value)


public inline fun Overflow.Companion.variable(name: String): Overflow.Variable =
	CssVariable.unsafe(name)


public inline fun Overflow.Axis.Companion.unsafe(value: String): Overflow.Axis =
	CssValue.unsafe(value)


public inline fun Overflow.Axis.Companion.variable(name: String): Overflow.Axis.Variable =
	CssVariable.unsafe(name)


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
