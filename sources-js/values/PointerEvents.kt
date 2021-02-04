@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface PointerEvents : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: PointerEvents
			get() = unsafe("auto")

		@CssDsl
		public inline val none: PointerEvents
			get() = unsafe("none")


		@CssDsl
		public inline val all: PointerEvents
			get() = unsafe("all")

		@CssDsl
		public inline val fill: PointerEvents
			get() = unsafe("fill")

		@CssDsl
		public inline val painted: PointerEvents
			get() = unsafe("painted")

		@CssDsl
		public inline val stroke: PointerEvents
			get() = unsafe("stroke")

		@CssDsl
		public inline val visible: PointerEvents
			get() = unsafe("visible")

		@CssDsl
		public inline val visibleFill: PointerEvents
			get() = unsafe("visibleFill")

		@CssDsl
		public inline val visiblePainted: PointerEvents
			get() = unsafe("visiblePainted")

		@CssDsl
		public inline val visibleStroke: PointerEvents
			get() = unsafe("visibleStroke")


		public inline fun unsafe(value: String): PointerEvents =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : PointerEvents, CssVariable<PointerEvents>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.pointerEvents(value: PointerEvents) {
	property(pointerEvents, value)
}


@Suppress("unused")
public inline val CssProperties.pointerEvents: CssProperty<PointerEvents>
	get() = CssProperty.unsafe("pointer-events")
