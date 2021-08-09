@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME add support for steps & for multiple values


@JsName("0;0")
public external interface TimingFunction : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TimingFunction, CssVariable<TimingFunction>
}


@CssDsl
public inline val TimingFunction.Companion.ease: TimingFunction
	get() = unsafe("ease")

@CssDsl
public inline val TimingFunction.Companion.easeIn: TimingFunction
	get() = unsafe("ease-in")

@CssDsl
public inline val TimingFunction.Companion.easeInOut: TimingFunction
	get() = unsafe("ease-in-out")

@CssDsl
public inline val TimingFunction.Companion.easeOut: TimingFunction
	get() = unsafe("ease-out")

@CssDsl
public inline val TimingFunction.Companion.linear: TimingFunction
	get() = unsafe("linear")

@CssDsl
public inline val TimingFunction.Companion.stepEnd: TimingFunction
	get() = unsafe("step-end")

@CssDsl
public inline val TimingFunction.Companion.stepStart: TimingFunction
	get() = unsafe("step-start")


@CssDsl
public inline fun TimingFunction.Companion.cubicBezier(p0: Double, p1: Double, p2: Double, p3: Double): TimingFunction =
	unsafe("cubic-bezier($p0,$p1,$p2,$p3)")


public inline fun TimingFunction.Companion.unsafe(value: String): TimingFunction =
	CssValue.unsafe(value)


public inline fun TimingFunction.Companion.variable(name: String): TimingFunction.Variable =
	CssVariable.unsafe(name)
