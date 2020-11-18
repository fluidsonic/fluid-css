@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME add support for steps & for multiple values


public interface TimingFunctionOrGlobal : CssValue
public interface TimingFunction : TimingFunctionOrGlobal {

	public companion object {

		public val ease: TimingFunction = TimingFunction("ease")
		public val easeIn: TimingFunction = TimingFunction("ease-in")
		public val easeInOut: TimingFunction = TimingFunction("ease-in-out")
		public val easeOut: TimingFunction = TimingFunction("ease-out")
		public val linear: TimingFunction = TimingFunction("linear")
		public val stepEnd: TimingFunction = TimingFunction("step-end")
		public val stepStart: TimingFunction = TimingFunction("step-start")

		public fun cubicBezier(p0: Number, p1: Number, p2: Number, p3: Number): TimingFunction =
			TimingFunction("cubic-bezier($p0,$p1,$p2,$p3)")
	}
}


private class TimingFunctionImpl(value: String) : CssValueImpl(value), TimingFunction


@Suppress("FunctionName")
public fun TimingFunction(value: String): TimingFunction =
	TimingFunctionImpl(value)
