@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Transition : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : Transition {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : Transition, CssVariable<Transition>
}


@CssDsl
public inline val Transition.Companion.all: Transition
	get() = unsafe("all")

@CssDsl
public inline val Transition.Companion.none: Transition
	get() = unsafe("none")


public inline fun Transition.Companion.build(values: TransitionBuilder.() -> Unit): Transition =
	TransitionBuilder.build(values)


public inline fun Transition.Companion.combine(vararg values: Transition.Single): Transition =
	when (values.size) {
		1 -> values[0]
		0 -> CssValue.initial
		else -> unsafe(values.join())
	}


public inline fun Transition.Companion.unsafe(value: String): Transition =
	CssValue.unsafe(value)


public inline fun Transition.Companion.variable(name: String): Transition.Variable =
	CssVariable.unsafe(name)


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


public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
): Transition.Single =
	Transition.Single.unsafe("$property $duration $timingFunction $delay")


public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
	timingFunction: TimingFunction,
): Transition.Single =
	Transition.Single.unsafe("$property $duration $timingFunction")


public inline fun Transition.Companion.with(
	property: CssProperty<*>,
	duration: Time,
): Transition.Single =
	Transition.Single.unsafe("$property $duration")


public inline fun Transition.Companion.with(
	duration: Time,
	timingFunction: TimingFunction,
	delay: Time,
): Transition.Single =
	Transition.Single.unsafe("$duration $timingFunction $delay")


public inline fun Transition.Companion.with(
	duration: Time,
	timingFunction: TimingFunction,
): Transition.Single =
	Transition.Single.unsafe("$duration $timingFunction")


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun Transition.Companion.with(
	duration: Time,
): Transition.Single =
	Transition.Single.unsafe("$duration")


public inline fun Transition.Single.Companion.unsafe(value: String): Transition.Single =
	CssValue.unsafe(value)


public inline fun Transition.Single.Companion.variable(name: String): Transition.Single.Variable =
	CssVariable.unsafe(name)


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.transition(values: TransitionBuilder.() -> Unit) {
	transition(Transition.build(values))
}


@Suppress("unused")
public inline val CssProperties.transition: CssProperty<Transition>
	get() = CssProperty.unsafe("transition")
