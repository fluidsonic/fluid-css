@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


public interface TransitionOrGlobal : CssValue
public interface Transition : TransitionOrGlobal {

	public companion object {

		public val all: Transition = raw("all")
		public val none: Transition = raw("none")


		public fun with(
			property: CssProperty? = null,
			duration: Time? = null,
			timingFunction: TimingFunction? = null,
			delay: Time? = null,
		): Transition {
			require(property != null || duration != null || timingFunction != null || delay != null) {
				"At least one of property, duration, timingFunction or delay must be specified."
			}

			return raw(buildString {
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
		}


		public fun raw(value: String): Transition =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), Transition
}


public inline fun CssDeclarationBlockBuilder.transition(
	property: CssProperty? = null,
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


public inline fun CssDeclarationBlockBuilder.transition(value: Transition) {
	property(CssProperty.transition, value)
}


public inline fun CssDeclarationBlockBuilder.transition(value: TransitionOrGlobal) {
	property(CssProperty.transition, value)
}


public inline fun CssDeclarationBlockBuilder.transition(value: GlobalValue) {
	property(CssProperty.transition, value)
}


public inline fun CssDeclarationBlockBuilder.transition(value: CustomCssProperty<out TransitionOrGlobal>) {
	property(CssProperty.transition, value)
}


public inline fun CssDeclarationBlockBuilder.transitionDuration(value: Time) {
	property(CssProperty.transitionDuration, value)
}


public inline fun CssDeclarationBlockBuilder.transitionDuration(value: TimeOrGlobal) {
	property(CssProperty.transitionDuration, value)
}


public inline fun CssDeclarationBlockBuilder.transitionDuration(value: GlobalValue) {
	property(CssProperty.transitionDuration, value)
}


public inline fun CssDeclarationBlockBuilder.transitionDuration(value: CustomCssProperty<out TimeOrGlobal>) {
	property(CssProperty.transitionDuration, value)
}


public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: TimingFunction) {
	property(CssProperty.transitionTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: TimingFunctionOrGlobal) {
	property(CssProperty.transitionTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: GlobalValue) {
	property(CssProperty.transitionTimingFunction, value)
}


public inline fun CssDeclarationBlockBuilder.transitionTimingFunction(value: CustomCssProperty<out TimingFunctionOrGlobal>) {
	property(CssProperty.transitionTimingFunction, value)
}


public inline val CssProperty.Companion.transition: CssProperty get() = CssProperty("transition")
public inline val CssProperty.Companion.transitionDuration: CssProperty get() = CssProperty("transition-duration")
public inline val CssProperty.Companion.transitionTimingFunction: CssProperty get() = CssProperty("transition-timing-function")
