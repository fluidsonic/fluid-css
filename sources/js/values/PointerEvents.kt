@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface PointerEventsOrGlobal : CssValue
public interface PointerEvents : PointerEventsOrGlobal {

	public companion object {

		public val auto: PointerEvents = AutoValue.auto
		public val none: PointerEvents = NoneValue.none

		public val all: PointerEvents = PointerEvents("all")
		public val fill: PointerEvents = PointerEvents("fill")
		public val painted: PointerEvents = PointerEvents("painted")
		public val stroke: PointerEvents = PointerEvents("stroke")
		public val visible: PointerEvents = PointerEvents("visible")
		public val visibleFill: PointerEvents = PointerEvents("visibleFill")
		public val visiblePainted: PointerEvents = PointerEvents("visiblePainted")
		public val visibleStroke: PointerEvents = PointerEvents("visibleStroke")
	}
}


private class PointerEventsImpl(value: String) : CssValueImpl(value), PointerEvents


@Suppress("FunctionName")
public fun PointerEvents(value: String): PointerEvents =
	PointerEventsImpl(value)


public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEvents) {
	property(CssProperty.pointerEvents, value)
}


public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEventsOrGlobal) {
	property(CssProperty.pointerEvents, value)
}


public inline fun CssDeclarationBlockBuilder.pointerEvents(value: GlobalValue) {
	property(CssProperty.pointerEvents, value)
}


public inline fun CssDeclarationBlockBuilder.pointerEvents(value: CustomCssProperty<out PointerEventsOrGlobal>) {
	property(CssProperty.pointerEvents, value)
}


public inline val CssProperty.Companion.pointerEvents: CssProperty get() = CssProperty("pointer-events")
