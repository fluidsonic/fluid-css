@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface PointerEvents : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : PointerEvents, CssVariable<PointerEvents>
}


@CssDsl
public inline val PointerEvents.Companion.auto: PointerEvents
	get() = unsafe("auto")

@CssDsl
public inline val PointerEvents.Companion.none: PointerEvents
	get() = unsafe("none")


@CssDsl
public inline val PointerEvents.Companion.all: PointerEvents
	get() = unsafe("all")

@CssDsl
public inline val PointerEvents.Companion.fill: PointerEvents
	get() = unsafe("fill")

@CssDsl
public inline val PointerEvents.Companion.painted: PointerEvents
	get() = unsafe("painted")

@CssDsl
public inline val PointerEvents.Companion.stroke: PointerEvents
	get() = unsafe("stroke")

@CssDsl
public inline val PointerEvents.Companion.visible: PointerEvents
	get() = unsafe("visible")

@CssDsl
public inline val PointerEvents.Companion.visibleFill: PointerEvents
	get() = unsafe("visibleFill")

@CssDsl
public inline val PointerEvents.Companion.visiblePainted: PointerEvents
	get() = unsafe("visiblePainted")

@CssDsl
public inline val PointerEvents.Companion.visibleStroke: PointerEvents
	get() = unsafe("visibleStroke")


public inline fun PointerEvents.Companion.unsafe(value: String): PointerEvents =
	CssValue.unsafe(value)


public inline fun PointerEvents.Companion.variable(name: String): PointerEvents.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEvents) {
	property(pointerEvents, value)
}


@Suppress("unused")
public inline val CssProperties.pointerEvents: CssProperty<PointerEvents>
	get() = CssProperty.unsafe("pointer-events")
