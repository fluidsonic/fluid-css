@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public external interface BoxShadowBuilder {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION"
	)
	public companion object {

		public inline fun build(action: BoxShadowBuilder.() -> Unit): BoxShadow =
			complete(create().apply(action))


		public inline fun complete(builder: BoxShadowBuilder): BoxShadow =
			if (builder.asDynamic().length == 0)
				BoxShadow.none
			else
				BoxShadow.unsafe(builder.asDynamic().join().unsafeCast<String>())


		public inline fun create(): BoxShadowBuilder =
			js("[]").unsafeCast<BoxShadowBuilder>()
	}
}


@CssDsl
public inline fun BoxShadowBuilder.add(value: BoxShadow.Single) {
	asDynamic().push(value)
}


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
