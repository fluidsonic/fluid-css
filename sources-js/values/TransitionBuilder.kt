@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public external interface TransitionBuilder : CssProperties {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION"
	)
	public companion object {

		public inline fun build(action: TransitionBuilder.() -> Unit): Transition =
			complete(create().apply(action))


		public inline fun complete(builder: TransitionBuilder): Transition =
			if (builder.asDynamic().length == 0)
				Transition.none
			else
				Transition.unsafe(builder.asDynamic().join().unsafeCast<String>())


		public inline fun create(): TransitionBuilder =
			js("[]").unsafeCast<TransitionBuilder>()
	}
}


@CssDsl
public inline fun TransitionBuilder.add(value: Transition.Single) {
	asDynamic().push(value)
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
