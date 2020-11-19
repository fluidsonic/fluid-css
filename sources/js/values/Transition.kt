@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Transition : CssValue, Internal {

	public companion object {

		@CssDsl
		public val all: Transition = raw("all")

		@CssDsl
		public val none: Transition = raw("none")


		public inline fun build(values: TransitionBuilder.() -> Unit): Transition =
			with(TransitionBuilder.default().apply(values)) { Unit.build() }


		public fun combine(vararg values: Single): Transition =
			when (values.size) {
				1 -> values.first()
				0 -> CssValue.initial
				else -> raw(values.joinToString(","))
			}


		public fun with(
			property: CssProperty<*>? = null,
			duration: Time? = null,
			timingFunction: TimingFunction? = null,
			delay: Time? = null,
		): Single =
			if (property != null || duration != null || timingFunction != null || delay != null)
				GenericValue(buildString {
					if (property != null)
						append(property)

					if (duration != null) {
						append(" ")
						append(duration)
					}
					if (timingFunction != null) {
						append(" ")
						append(timingFunction)
					}
					if (delay != null) {
						append(" ")
						append(delay)
					}
				})
			else
				CssValue.initial


		public fun raw(value: String): Transition =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : Transition


	public interface Variable : Transition, CssVariable<Transition>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(value: Transition) {
	property(transition, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(value: Transition.Single) {
	property(transition, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(vararg values: Transition.Single) {
	transition(Transition.combine(*values))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	property: CssProperty<*>? = null,
	duration: Time? = null,
	timingFunction: TimingFunction? = null,
	delay: Time? = null,
) {
	transition(Transition.with(
		delay = delay,
		duration = duration,
		property = property,
		timingFunction = timingFunction,
	))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(values: TransitionBuilder.() -> Unit) {
	transition(Transition.build(values))
}


@Suppress("unused")
public inline val CssProperties.transition: CssProperty<Transition>
	get() = CssProperty("transition")
