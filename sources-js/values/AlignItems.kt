@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

@JsName("null")
public external interface AlignItems : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val baseline: AlignItems
			get() = unsafe("baseline")

		@CssDsl
		public inline val center: AlignItems
			get() = unsafe("center")

		@CssDsl
		public inline val end: AlignItems
			get() = unsafe("end")

		@CssDsl
		public inline val firstBaseline: AlignItems
			get() = unsafe("first baseline")

		@CssDsl
		public inline val flexEnd: AlignItems
			get() = unsafe("flex-end")

		@CssDsl
		public inline val flexStart: AlignItems
			get() = unsafe("flex-start")

		@CssDsl
		public inline val lastBaseline: AlignItems
			get() = unsafe("last baseline")

		@CssDsl
		public inline val normal: AlignItems
			get() = unsafe("normal")

		@CssDsl
		public inline val selfEnd: AlignItems
			get() = unsafe("self-end")

		@CssDsl
		public inline val selfStart: AlignItems
			get() = unsafe("self-start")

		@CssDsl
		public inline val start: AlignItems
			get() = unsafe("start")

		@CssDsl
		public inline val stretch: AlignItems
			get() = unsafe("stretch")


		@CssDsl
		public inline val safeCenter: AlignItems
			get() = unsafe("safe center")

		@CssDsl
		public inline val safeEnd: AlignItems
			get() = unsafe("safe end")

		@CssDsl
		public inline val safeFlexEnd: AlignItems
			get() = unsafe("safe flex-end")

		@CssDsl
		public inline val safeFlexStart: AlignItems
			get() = unsafe("safe flex-start")

		@CssDsl
		public inline val safeSelfEnd: AlignItems
			get() = unsafe("safe self-end")

		@CssDsl
		public inline val safeSelfStart: AlignItems
			get() = unsafe("safe self-start")

		@CssDsl
		public inline val safeStart: AlignItems
			get() = unsafe("safe start")


		@CssDsl
		public inline val unsafeCenter: AlignItems
			get() = unsafe("unsafe center")

		@CssDsl
		public inline val unsafeEnd: AlignItems
			get() = unsafe("unsafe end")

		@CssDsl
		public inline val unsafeFlexEnd: AlignItems
			get() = unsafe("unsafe flex-end")

		@CssDsl
		public inline val unsafeFlexStart: AlignItems
			get() = unsafe("unsafe flex-start")

		@CssDsl
		public inline val unsafeSelfEnd: AlignItems
			get() = unsafe("unsafe self-end")

		@CssDsl
		public inline val unsafeSelfStart: AlignItems
			get() = unsafe("unsafe self-start")

		@CssDsl
		public inline val unsafeStart: AlignItems
			get() = unsafe("unsafe start")


		public inline fun unsafe(value: String): AlignItems =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : AlignItems, CssVariable<AlignItems>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(alignItems, value)
}


@Suppress("unused")
public inline val CssProperties.alignItems: CssProperty<AlignItems>
	get() = CssProperty.unsafe("align-items")
