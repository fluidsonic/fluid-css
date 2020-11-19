@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface TransitionBuilder : CssProperties {

	@CssDsl
	public fun add(value: Transition.Single)

	public fun Unit.build(): Transition


	public companion object {

		public fun default(): TransitionBuilder =
			Default()
	}


	private class Default : TransitionBuilder {

		private var value = ""


		override fun add(value: Transition.Single) {
			if (this.value.isNotEmpty())
				this.value += ","

			this.value += value
		}


		override fun Unit.build(): Transition =
			Transition.raw(value)
	}
}


@CssDsl
public inline fun TransitionBuilder.add(
	property: CssProperty<*>? = null,
	duration: Time? = null,
	timingFunction: TimingFunction? = null,
	delay: Time? = null,
) {
	add(Transition.with(
		delay = delay,
		duration = duration,
		property = property,
		timingFunction = timingFunction,
	))
}
