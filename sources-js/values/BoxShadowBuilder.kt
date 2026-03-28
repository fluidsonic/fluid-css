@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** DSL builder for CSS `box-shadow` values. */
@CssDsl
@JsName("0;0")
public external interface BoxShadowBuilder {

	public companion object
}


/** Adds a box shadow value to this builder. */
@CssDsl
public inline fun BoxShadowBuilder.add(value: BoxShadow.Single) {
	asDynamic().push(value)
}


/** Adds a box shadow with the given parameters to this builder. */
@CssDsl
public inline fun BoxShadowBuilder.add(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	add(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = false,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


/** Adds an inset box shadow with the given parameters to this builder. */
@CssDsl
public inline fun BoxShadowBuilder.addInset(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	add(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = true,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


/** Builds a [BoxShadowBuilder] using the given builder [action]. */
public inline fun BoxShadowBuilder.Companion.build(action: BoxShadowBuilder.() -> Unit): BoxShadow =
	complete(create().apply(action))


/** Completes the [BoxShadowBuilder] builder and returns the result. */
public inline fun BoxShadowBuilder.Companion.complete(builder: BoxShadowBuilder): BoxShadow =
	if (builder.asDynamic().length == 0)
		BoxShadow.none
	else
		BoxShadow.unsafe(builder.asDynamic().join().unsafeCast<String>())


/** Creates a new [BoxShadowBuilder] builder. */
public inline fun BoxShadowBuilder.Companion.create(): BoxShadowBuilder =
	js("[]").unsafeCast<BoxShadowBuilder>()
