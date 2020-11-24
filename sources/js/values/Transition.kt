@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Transition : CssValue {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val all: Transition
			get() = unsafe("all")

		@CssDsl
		public inline val none: Transition
			get() = unsafe("none")


		public inline fun build(values: TransitionBuilder.() -> Unit): Transition =
			TransitionBuilder.build(values)


		public inline fun combine(vararg values: Single): Transition =
			when (values.size) {
				1 -> values[0]
				0 -> CssValue.initial
				else -> unsafe(values.join())
			}


		public inline fun unsafe(value: String): Transition =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Single : Transition {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : Transition, CssVariable<Transition>
}


@Suppress("DEPRECATION")
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
