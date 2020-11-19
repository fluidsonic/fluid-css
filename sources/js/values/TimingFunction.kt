@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME add support for steps & for multiple values


public interface TimingFunction : CssValue, Internal {

	public companion object {

		@CssDsl
		public val ease: TimingFunction = raw("ease")

		@CssDsl
		public val easeIn: TimingFunction = raw("ease-in")

		@CssDsl
		public val easeInOut: TimingFunction = raw("ease-in-out")

		@CssDsl
		public val easeOut: TimingFunction = raw("ease-out")

		@CssDsl
		public val linear: TimingFunction = raw("linear")

		@CssDsl
		public val stepEnd: TimingFunction = raw("step-end")

		@CssDsl
		public val stepStart: TimingFunction = raw("step-start")


		@CssDsl
		public fun cubicBezier(p0: Number, p1: Number, p2: Number, p3: Number): TimingFunction =
			raw("cubic-bezier($p0,$p1,$p2,$p3)")


		public fun raw(value: String): TimingFunction =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TimingFunction, CssVariable<TimingFunction>
}
