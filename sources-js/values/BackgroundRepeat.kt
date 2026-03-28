@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-repeat` value. */
@JsName("0;0")
public external interface BackgroundRepeat : CssValue {

	public companion object;

	/** A single-axis `background-repeat` value. */
	@JsName("0;0")
	public interface Axis : BackgroundRepeat {

		public companion object;


		/** A [Axis] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	/** A [BackgroundRepeat] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundRepeat, CssVariable<BackgroundRepeat>
}


/** Predefined `noRepeat` value. */
@CssDsl
public inline val BackgroundRepeat.Companion.noRepeat: BackgroundRepeat
	get() = BackgroundRepeat.Axis.noRepeat

/** Predefined `repeat` value. */
@CssDsl
public inline val BackgroundRepeat.Companion.repeat: BackgroundRepeat
	get() = BackgroundRepeat.Axis.repeat

/** The CSS `repeat-x` background-repeat value. */
@CssDsl
public inline val BackgroundRepeat.Companion.repeatX: BackgroundRepeat
	get() = unsafe("repeat-x")

/** The CSS `repeat-y` background-repeat value. */
@CssDsl
public inline val BackgroundRepeat.Companion.repeatY: BackgroundRepeat
	get() = unsafe("repeat-y")

/** Predefined `round` value. */
@CssDsl
public inline val BackgroundRepeat.Companion.round: BackgroundRepeat
	get() = BackgroundRepeat.Axis.round

/** Predefined `space` value. */
@CssDsl
public inline val BackgroundRepeat.Companion.space: BackgroundRepeat
	get() = BackgroundRepeat.Axis.space


/** Creates a [BackgroundRepeat] from an unchecked string [value]. */
public inline fun BackgroundRepeat.Companion.unsafe(value: String): BackgroundRepeat =
	CssValue.unsafe(value)


/** Creates a [BackgroundRepeat] backed by a CSS variable with the given [name]. */
public inline fun BackgroundRepeat.Companion.variable(name: String): BackgroundRepeat.Variable =
	CssVariable.unsafe(name)


/** Creates a [BackgroundRepeat] shorthand value. */
public inline fun BackgroundRepeat.Companion.with(x: BackgroundRepeat.Axis, y: BackgroundRepeat.Axis): BackgroundRepeat =
	unsafe("$x $y")


/** The CSS `no-repeat` axis value. */
@CssDsl
public inline val BackgroundRepeat.Axis.Companion.noRepeat: BackgroundRepeat.Axis
	get() = unsafe("no-repeat")

/** The CSS `repeat` axis value. */
@CssDsl
public inline val BackgroundRepeat.Axis.Companion.repeat: BackgroundRepeat.Axis
	get() = unsafe("repeat")

/** The CSS `round` axis value. */
@CssDsl
public inline val BackgroundRepeat.Axis.Companion.round: BackgroundRepeat.Axis
	get() = unsafe("round")

/** The CSS `space` axis value. */
@CssDsl
public inline val BackgroundRepeat.Axis.Companion.space: BackgroundRepeat.Axis
	get() = unsafe("space")


/** Creates a [Axis] from an unchecked string [value]. */
public inline fun BackgroundRepeat.Axis.Companion.unsafe(value: String): BackgroundRepeat.Axis =
	CssValue.unsafe(value)


/** Creates a [Axis] backed by a CSS variable with the given [name]. */
public inline fun BackgroundRepeat.Axis.Companion.variable(name: String): BackgroundRepeat.Axis.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-repeat` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeat) {
	property(backgroundRepeat, value)
}


/** Sets the `background-repeat` CSS property with x/y values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(x: BackgroundRepeat.Axis, y: BackgroundRepeat.Axis) {
	backgroundRepeat(BackgroundRepeat.with(x, y))
}


/** The `background-repeat` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundRepeat: CssProperty<BackgroundRepeat>
	get() = CssProperty.unsafe("background-repeat")
