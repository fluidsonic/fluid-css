@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface JustifyContentOrGlobal : CssValue
public interface JustifyContent : JustifyContentOrGlobal {

	public companion object {

		@CssDsl
		public val center: JustifyContent = raw("center")

		@CssDsl
		public val flexEnd: JustifyContent = raw("flex-end")

		@CssDsl
		public val flexStart: JustifyContent = raw("flex-start")

		@CssDsl
		public val end: JustifyContent = raw("end")

		@CssDsl
		public val left: JustifyContent = raw("left")

		@CssDsl
		public val right: JustifyContent = raw("right")

		@CssDsl
		public val normal: JustifyContent = raw("normal")

		@CssDsl
		public val spaceAround: JustifyContent = raw("space-around")

		@CssDsl
		public val spaceBetween: JustifyContent = raw("space-between")

		@CssDsl
		public val spaceEvenly: JustifyContent = raw("space-evenly")

		@CssDsl
		public val start: JustifyContent = raw("start")

		@CssDsl
		public val stretch: JustifyContent = raw("stretch")


		@CssDsl
		public val safeCenter: JustifyContent = raw("safe center")

		@CssDsl
		public val safeEnd: JustifyContent = raw("safe end")

		@CssDsl
		public val safeLeft: JustifyContent = raw("safe left")

		@CssDsl
		public val safeFlexEnd: JustifyContent = raw("safe flex-end")

		@CssDsl
		public val safeFlexStart: JustifyContent = raw("safe flex-start")

		@CssDsl
		public val safeRight: JustifyContent = raw("safe right")

		@CssDsl
		public val safeStart: JustifyContent = raw("safe start")


		@CssDsl
		public val unsafeCenter: JustifyContent = raw("unsafe center")

		@CssDsl
		public val unsafeEnd: JustifyContent = raw("unsafe end")

		@CssDsl
		public val unsafeLeft: JustifyContent = raw("unsafe left")

		@CssDsl
		public val unsafeFlexEnd: JustifyContent = raw("unsafe flex-end")

		@CssDsl
		public val unsafeFlexStart: JustifyContent = raw("unsafe flex-start")

		@CssDsl
		public val unsafeRight: JustifyContent = raw("unsafe right")

		@CssDsl
		public val unsafeStart: JustifyContent = raw("unsafe start")


		public fun raw(value: String): JustifyContent =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : JustifyContent, CssVariable<JustifyContent>
}


@CssDsl
public fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContent) {
	property(justifyContent, value)
}


@Suppress("unused")
public val CssProperties.justifyContent: CssProperty<JustifyContent>
	get() = CssProperty("justify-content")
