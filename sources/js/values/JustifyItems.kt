@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface JustifyItems : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val baseline: JustifyItems
			get() = unsafe("baseline")

		@CssDsl
		public inline val center: JustifyItems
			get() = unsafe("center")

		@CssDsl
		public inline val end: JustifyItems
			get() = unsafe("end")

		@CssDsl
		public inline val firstBaseline: JustifyItems
			get() = unsafe("first baseline")

		@CssDsl
		public inline val flexEnd: JustifyItems
			get() = unsafe("flex-end")

		@CssDsl
		public inline val flexStart: JustifyItems
			get() = unsafe("flex-start")

		@CssDsl
		public inline val lastBaseline: JustifyItems
			get() = unsafe("last baseline")

		@CssDsl
		public inline val left: JustifyItems
			get() = unsafe("left")

		@CssDsl
		public inline val normal: JustifyItems
			get() = unsafe("normal")

		@CssDsl
		public inline val right: JustifyItems
			get() = unsafe("right")

		@CssDsl
		public inline val selfEnd: JustifyItems
			get() = unsafe("self-end")

		@CssDsl
		public inline val selfStart: JustifyItems
			get() = unsafe("self-start")

		@CssDsl
		public inline val start: JustifyItems
			get() = unsafe("start")

		@CssDsl
		public inline val stretch: JustifyItems
			get() = unsafe("stretch")


		@CssDsl
		public inline val legacy: JustifyItems
			get() = unsafe("legacy")


		@CssDsl
		public inline val legacyCenter: JustifyItems
			get() = unsafe("legacy center")


		@CssDsl
		public inline val legacyLeft: JustifyItems
			get() = unsafe("legacy left")


		@CssDsl
		public inline val legacyRight: JustifyItems
			get() = unsafe("legacy right")


		@CssDsl
		public inline val safeCenter: JustifyItems
			get() = unsafe("safe center")

		@CssDsl
		public inline val safeEnd: JustifyItems
			get() = unsafe("safe end")

		@CssDsl
		public inline val safeFlexEnd: JustifyItems
			get() = unsafe("safe flex-end")

		@CssDsl
		public inline val safeFlexStart: JustifyItems
			get() = unsafe("safe flex-start")

		@CssDsl
		public inline val safeSelfEnd: JustifyItems
			get() = unsafe("safe self-end")

		@CssDsl
		public inline val safeSelfStart: JustifyItems
			get() = unsafe("safe self-start")

		@CssDsl
		public inline val safeStart: JustifyItems
			get() = unsafe("safe start")


		@CssDsl
		public inline val unsafeCenter: JustifyItems
			get() = unsafe("unsafe center")

		@CssDsl
		public inline val unsafeEnd: JustifyItems
			get() = unsafe("unsafe end")

		@CssDsl
		public inline val unsafeFlexEnd: JustifyItems
			get() = unsafe("unsafe flex-end")

		@CssDsl
		public inline val unsafeFlexStart: JustifyItems
			get() = unsafe("unsafe flex-start")

		@CssDsl
		public inline val unsafeSelfEnd: JustifyItems
			get() = unsafe("unsafe self-end")

		@CssDsl
		public inline val unsafeSelfStart: JustifyItems
			get() = unsafe("unsafe self-start")

		@CssDsl
		public inline val unsafeStart: JustifyItems
			get() = unsafe("unsafe start")


		public inline fun unsafe(value: String): JustifyItems =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : JustifyItems, CssVariable<JustifyItems>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyItems(value: JustifyItems) {
	property(justifyItems, value)
}


@Suppress("unused")
public inline val CssProperties.justifyItems: CssProperty<JustifyItems>
	get() = CssProperty.unsafe("justify-items")
