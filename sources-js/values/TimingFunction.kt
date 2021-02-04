@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME add support for steps & for multiple values


public external interface TimingFunction : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val ease: TimingFunction
			get() = unsafe("ease")

		@CssDsl
		public inline val easeIn: TimingFunction
			get() = unsafe("ease-in")

		@CssDsl
		public inline val easeInOut: TimingFunction
			get() = unsafe("ease-in-out")

		@CssDsl
		public inline val easeOut: TimingFunction
			get() = unsafe("ease-out")

		@CssDsl
		public inline val linear: TimingFunction
			get() = unsafe("linear")

		@CssDsl
		public inline val stepEnd: TimingFunction
			get() = unsafe("step-end")

		@CssDsl
		public inline val stepStart: TimingFunction
			get() = unsafe("step-start")


		@CssDsl
		public inline fun cubicBezier(p0: Double, p1: Double, p2: Double, p3: Double): TimingFunction =
			unsafe("cubic-bezier($p0,$p1,$p2,$p3)")


		public inline fun unsafe(value: String): TimingFunction =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TimingFunction, CssVariable<TimingFunction>
}
