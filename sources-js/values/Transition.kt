@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `transition` value. */
@JsName("0;0")
public external interface Transition : CssValue {

	public companion object;


	/** A single `transition` value. */
	@JsName("0;0")
	public interface Single : Transition {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [Transition] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Transition, CssVariable<Transition>
}


/** The CSS `all` transition value. */
@CssDsl
public inline val Transition.Companion.all: Transition
	get() = unsafe("all")

/** The CSS `none` transition value. */
@CssDsl
public inline val Transition.Companion.none: Transition
	get() = unsafe("none")


/** Builds a [Transition] using the given builder [action]. */
public inline fun Transition.Companion.build(values: TransitionBuilder.() -> Unit): Transition =
	TransitionBuilder.build(values)


/** Combines multiple [Transition] values. */
public inline fun Transition.Companion.combine(vararg values: Transition.Single): Transition =
	when (values.size) {
		1 -> values[0]
		0 -> CssValue.initial
		else -> unsafe(values.join())
	}


/** Creates a [Transition] from an unchecked string [value]. */
public inline fun Transition.Companion.unsafe(value: String): Transition =
	CssValue.unsafe(value)


/** Creates a [Transition] backed by a CSS variable with the given [name]. */
public inline fun Transition.Companion.variable(name: String): Transition.Variable =
	CssVariable.unsafe(name)


/** Creates a [Transition.Single] shorthand value. */
public inline fun Transition.Companion.with(
	property: CssProperty<*>? = null,
	duration: Time? = null,
	timingFunction: TimingFunction? = null,
	delay: Time? = null,
): Transition.Single =
	if (property != null || duration != null || timingFunction != null || delay != null) {
		var string = ""

		if (property != null)
			string += property

		if (duration != null) {
			if (string.isNotEmpty())
				string += " "
			string += duration
		}
		if (timingFunction != null) {
			if (string.isNotEmpty())
				string += " "
			string += timingFunction
		}
		if (delay != null) {
			if (string.isNotEmpty())
				string += " "
			string += delay
		}

		val finalString = string

		Transition.Single.unsafe(finalString)
	}
	else
		CssValue.initial


/** Creates a [Transition.Single] with property, duration, timing function, and delay. */
public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
): Transition.Single =
	Transition.Single.unsafe("$property $duration $timingFunction $delay")


/** Creates a [Transition.Single] with property, duration, and timing function. */
public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
): Transition.Single =
	Transition.Single.unsafe("$property $duration $timingFunction")


/** Creates a [Transition.Single] with property and duration. */
public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
): Transition.Single =
	Transition.Single.unsafe("$property $duration")


/** Creates a [Transition.Single] with duration, timing function, and delay. */
public inline fun Transition.Companion.with(
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
): Transition.Single =
	Transition.Single.unsafe("$duration $timingFunction $delay")


/** Creates a [Transition.Single] with duration and timing function. */
public inline fun Transition.Companion.with(
	duration: Time,
	timingFunction: TimingFunction,
): Transition.Single =
	Transition.Single.unsafe("$duration $timingFunction")


/** Creates a [Transition.Single] with duration only. */
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun Transition.Companion.with(
	duration: Time,
): Transition.Single =
	Transition.Single.unsafe("$duration")


/** Creates a [Single] from an unchecked string [value]. */
public inline fun Transition.Single.Companion.unsafe(value: String): Transition.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun Transition.Single.Companion.variable(name: String): Transition.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(value: Transition) {
	property(transition, value)
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(value: Transition.Single) {
	property(transition, value)
}


/** Sets the `transition` CSS property with multiple values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(vararg values: Transition.Single) {
	transition(Transition.combine(*values))
}


/** Sets the `transition` CSS property. */
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


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
) {
	transition(Transition.with(
		delay = delay,
		duration = duration,
		property = property,
		timingFunction = timingFunction,
	))
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
) {
	transition(Transition.with(
		duration = duration,
		property = property,
		timingFunction = timingFunction,
	))
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	property: CssProperty<*>,
	duration: Time,
) {
	transition(Transition.with(
		duration = duration,
		property = property,
	))
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
) {
	transition(Transition.with(
		delay = delay,
		duration = duration,
		timingFunction = timingFunction,
	))
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	duration: Time,
	timingFunction: TimingFunction,
) {
	transition(Transition.with(
		duration = duration,
		timingFunction = timingFunction,
	))
}


/** Sets the `transition` CSS property. */
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(
	duration: Time,
) {
	transition(Transition.with(
		duration = duration,
	))
}


/** Sets the `transition` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(values: TransitionBuilder.() -> Unit) {
	transition(Transition.build(values))
}


/** The `transition` CSS property. */
@Suppress("unused")
public inline val CssProperties.transition: CssProperty<Transition>
	get() = CssProperty.unsafe("transition")
