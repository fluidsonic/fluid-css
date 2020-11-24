@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface JustifyContent : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val center: JustifyContent
			get() = unsafe("center")

		@CssDsl
		public inline val flexEnd: JustifyContent
			get() = unsafe("flex-end")

		@CssDsl
		public inline val flexStart: JustifyContent
			get() = unsafe("flex-start")

		@CssDsl
		public inline val end: JustifyContent
			get() = unsafe("end")

		@CssDsl
		public inline val left: JustifyContent
			get() = unsafe("left")

		@CssDsl
		public inline val right: JustifyContent
			get() = unsafe("right")

		@CssDsl
		public inline val normal: JustifyContent
			get() = unsafe("normal")

		@CssDsl
		public inline val spaceAround: JustifyContent
			get() = unsafe("space-around")

		@CssDsl
		public inline val spaceBetween: JustifyContent
			get() = unsafe("space-between")

		@CssDsl
		public inline val spaceEvenly: JustifyContent
			get() = unsafe("space-evenly")

		@CssDsl
		public inline val start: JustifyContent
			get() = unsafe("start")

		@CssDsl
		public inline val stretch: JustifyContent
			get() = unsafe("stretch")


		@CssDsl
		public inline val safeCenter: JustifyContent
			get() = unsafe("safe center")

		@CssDsl
		public inline val safeEnd: JustifyContent
			get() = unsafe("safe end")

		@CssDsl
		public inline val safeLeft: JustifyContent
			get() = unsafe("safe left")

		@CssDsl
		public inline val safeFlexEnd: JustifyContent
			get() = unsafe("safe flex-end")

		@CssDsl
		public inline val safeFlexStart: JustifyContent
			get() = unsafe("safe flex-start")

		@CssDsl
		public inline val safeRight: JustifyContent
			get() = unsafe("safe right")

		@CssDsl
		public inline val safeStart: JustifyContent
			get() = unsafe("safe start")


		@CssDsl
		public inline val unsafeCenter: JustifyContent
			get() = unsafe("unsafe center")

		@CssDsl
		public inline val unsafeEnd: JustifyContent
			get() = unsafe("unsafe end")

		@CssDsl
		public inline val unsafeLeft: JustifyContent
			get() = unsafe("unsafe left")

		@CssDsl
		public inline val unsafeFlexEnd: JustifyContent
			get() = unsafe("unsafe flex-end")

		@CssDsl
		public inline val unsafeFlexStart: JustifyContent
			get() = unsafe("unsafe flex-start")

		@CssDsl
		public inline val unsafeRight: JustifyContent
			get() = unsafe("unsafe right")

		@CssDsl
		public inline val unsafeStart: JustifyContent
			get() = unsafe("unsafe start")


		public inline fun unsafe(value: String): JustifyContent =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : JustifyContent, CssVariable<JustifyContent>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContent) {
	property(justifyContent, value)
}


@Suppress("unused")
public inline val CssProperties.justifyContent: CssProperty<JustifyContent>
	get() = CssProperty.unsafe("justify-content")
