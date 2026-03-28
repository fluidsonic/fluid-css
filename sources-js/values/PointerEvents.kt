@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `pointer-events` value. */
@JsName("0;0")
public external interface PointerEvents : CssValue {

	public companion object;


	/** A [PointerEvents] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : PointerEvents, CssVariable<PointerEvents>
}


/** The CSS `auto` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.auto: PointerEvents
	get() = unsafe("auto")

/** The CSS `none` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.none: PointerEvents
	get() = unsafe("none")


/** The CSS `all` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.all: PointerEvents
	get() = unsafe("all")

/** The CSS `fill` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.fill: PointerEvents
	get() = unsafe("fill")

/** The CSS `painted` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.painted: PointerEvents
	get() = unsafe("painted")

/** The CSS `stroke` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.stroke: PointerEvents
	get() = unsafe("stroke")

/** The CSS `visible` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.visible: PointerEvents
	get() = unsafe("visible")

/** The CSS `visibleFill` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.visibleFill: PointerEvents
	get() = unsafe("visibleFill")

/** The CSS `visiblePainted` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.visiblePainted: PointerEvents
	get() = unsafe("visiblePainted")

/** The CSS `visibleStroke` pointer-events value. */
@CssDsl
public inline val PointerEvents.Companion.visibleStroke: PointerEvents
	get() = unsafe("visibleStroke")


/** Creates a [PointerEvents] from an unchecked string [value]. */
public inline fun PointerEvents.Companion.unsafe(value: String): PointerEvents =
	CssValue.unsafe(value)


/** Creates a [PointerEvents] backed by a CSS variable with the given [name]. */
public inline fun PointerEvents.Companion.variable(name: String): PointerEvents.Variable =
	CssVariable.unsafe(name)


/** Sets the `pointer-events` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEvents) {
	property(pointerEvents, value)
}


/** The `pointer-events` CSS property. */
@Suppress("unused")
public inline val CssProperties.pointerEvents: CssProperty<PointerEvents>
	get() = CssProperty.unsafe("pointer-events")
