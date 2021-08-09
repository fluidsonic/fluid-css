@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
@JsName("0;0")
public external interface TransitionBuilder : CssProperties {

	public companion object
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


public inline fun TransitionBuilder.Companion.build(action: TransitionBuilder.() -> Unit): Transition =
	complete(create().apply(action))


public inline fun TransitionBuilder.Companion.complete(builder: TransitionBuilder): Transition =
	if (builder.asDynamic().length == 0)
		Transition.none
	else
		Transition.unsafe(builder.asDynamic().join().unsafeCast<String>())


public inline fun TransitionBuilder.Companion.create(): TransitionBuilder =
	js("[]").unsafeCast<TransitionBuilder>()
