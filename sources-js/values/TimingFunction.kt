@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME add support for steps & for multiple values


/** Represents a CSS `timing-function` value. */
@JsName("0;0")
public external interface TimingFunction : CssValue {

	public companion object;


	/** A [TimingFunction] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TimingFunction, CssVariable<TimingFunction>
}


/** The CSS `ease` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.ease: TimingFunction
	get() = unsafe("ease")

/** The CSS `ease-in` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.easeIn: TimingFunction
	get() = unsafe("ease-in")

/** The CSS `ease-in-out` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.easeInOut: TimingFunction
	get() = unsafe("ease-in-out")

/** The CSS `ease-out` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.easeOut: TimingFunction
	get() = unsafe("ease-out")

/** The CSS `linear` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.linear: TimingFunction
	get() = unsafe("linear")

/** The CSS `step-end` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.stepEnd: TimingFunction
	get() = unsafe("step-end")

/** The CSS `step-start` timing-function value. */
@CssDsl
public inline val TimingFunction.Companion.stepStart: TimingFunction
	get() = unsafe("step-start")


/** Creates a [TimingFunction] value. */
@CssDsl
public inline fun TimingFunction.Companion.cubicBezier(p0: Double, p1: Double, p2: Double, p3: Double): TimingFunction =
	unsafe("cubic-bezier($p0,$p1,$p2,$p3)")


/** Creates a [TimingFunction] from an unchecked string [value]. */
public inline fun TimingFunction.Companion.unsafe(value: String): TimingFunction =
	CssValue.unsafe(value)


/** Creates a [TimingFunction] backed by a CSS variable with the given [name]. */
public inline fun TimingFunction.Companion.variable(name: String): TimingFunction.Variable =
	CssVariable.unsafe(name)
