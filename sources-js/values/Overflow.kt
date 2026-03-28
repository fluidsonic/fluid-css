@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `overflow` value. */
@JsName("0;0")
public external interface Overflow : CssValue {

	public companion object;


	/** A single-axis `overflow` value. */
	@JsName("0;0")
	public interface Axis : Overflow {

		public companion object;


		/** A [Axis] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	/** A [Overflow] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Overflow, CssVariable<Overflow>
}


/** The CSS `auto` overflow value. */
@CssDsl
public inline val Overflow.Companion.auto: Overflow.Axis
	get() = Overflow.Axis.unsafe("auto")


/** The CSS `hidden` overflow value. */
@CssDsl
public inline val Overflow.Companion.hidden: Overflow.Axis
	get() = Overflow.Axis.unsafe("hidden")

/** The CSS `scroll` overflow value. */
@CssDsl
public inline val Overflow.Companion.scroll: Overflow.Axis
	get() = Overflow.Axis.unsafe("scroll")

/** The CSS `visible` overflow value. */
@CssDsl
public inline val Overflow.Companion.visible: Overflow.Axis
	get() = Overflow.Axis.unsafe("visible")


/** Creates a [Overflow] value. */
public inline fun Overflow.Companion.of(xy: Overflow.Axis): Overflow =
	xy


/** Creates a [Overflow] value. */
public inline fun Overflow.Companion.of(x: Overflow.Axis, y: Overflow.Axis): Overflow =
	if (x eq y) x
	else unsafe("$x $y")


/** Creates a [Overflow] from an unchecked string [value]. */
public inline fun Overflow.Companion.unsafe(value: String): Overflow =
	CssValue.unsafe(value)


/** Creates a [Overflow] backed by a CSS variable with the given [name]. */
public inline fun Overflow.Companion.variable(name: String): Overflow.Variable =
	CssVariable.unsafe(name)


/** Creates a [Axis] from an unchecked string [value]. */
public inline fun Overflow.Axis.Companion.unsafe(value: String): Overflow.Axis =
	CssValue.unsafe(value)


/** Creates a [Axis] backed by a CSS variable with the given [name]. */
public inline fun Overflow.Axis.Companion.variable(name: String): Overflow.Axis.Variable =
	CssVariable.unsafe(name)


/** Sets the `overflow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.overflow(all: Overflow) {
	property(overflow, all)
}


/** Sets the `overflow` CSS property with x/y values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.overflow(x: Overflow.Axis, y: Overflow.Axis) {
	overflow(Overflow.of(x, y))
}


/** Sets the `overflow-x` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.overflowX(value: Overflow.Axis) {
	property(overflowX, value)
}


/** Sets the `overflow-y` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.overflowY(value: Overflow.Axis) {
	property(overflowY, value)
}


/** The `overflow` CSS property. */
@Suppress("unused")
public inline val CssProperties.overflow: CssProperty<Overflow>
	get() = CssProperty.unsafe("overflow")


/** The `overflow-x` CSS property. */
@Suppress("unused")
public inline val CssProperties.overflowX: CssProperty<Overflow.Axis>
	get() = CssProperty.unsafe("overflow-x")


/** The `overflow-y` CSS property. */
@Suppress("unused")
public inline val CssProperties.overflowY: CssProperty<Overflow.Axis>
	get() = CssProperty.unsafe("overflow-y")
