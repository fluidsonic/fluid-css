@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface PointerEvents : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: PointerEvents = raw("auto")

		@CssDsl
		public val none: PointerEvents = raw("none")


		@CssDsl
		public val all: PointerEvents = raw("all")

		@CssDsl
		public val fill: PointerEvents = raw("fill")

		@CssDsl
		public val painted: PointerEvents = raw("painted")

		@CssDsl
		public val stroke: PointerEvents = raw("stroke")

		@CssDsl
		public val visible: PointerEvents = raw("visible")

		@CssDsl
		public val visibleFill: PointerEvents = raw("visibleFill")

		@CssDsl
		public val visiblePainted: PointerEvents = raw("visiblePainted")

		@CssDsl
		public val visibleStroke: PointerEvents = raw("visibleStroke")


		public fun raw(value: String): PointerEvents =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : PointerEvents, CssVariable<PointerEvents>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEvents) {
	property(pointerEvents, value)
}


@Suppress("unused")
public inline val CssProperties.pointerEvents: CssProperty<PointerEvents>
	get() = CssProperty("pointer-events")
