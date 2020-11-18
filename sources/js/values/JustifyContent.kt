@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface JustifyContentOrGlobal : CssValue
public interface JustifyContent : JustifyContentOrGlobal {

	public companion object {

		public val center: JustifyContent = JustifyContent("center")
		public val flexEnd: JustifyContent = JustifyContent("flex-end")
		public val flexStart: JustifyContent = JustifyContent("flex-start")
		public val end: JustifyContent = JustifyContent("end")
		public val left: JustifyContent = JustifyContent("left")
		public val right: JustifyContent = JustifyContent("right")
		public val normal: JustifyContent = JustifyContent("normal")
		public val spaceAround: JustifyContent = JustifyContent("space-around")
		public val spaceBetween: JustifyContent = JustifyContent("space-between")
		public val spaceEvenly: JustifyContent = JustifyContent("space-evenly")
		public val start: JustifyContent = JustifyContent("start")
		public val stretch: JustifyContent = JustifyContent("stretch")

		public val safeCenter: JustifyContent = JustifyContent("safe center")
		public val safeEnd: JustifyContent = JustifyContent("safe end")
		public val safeLeft: JustifyContent = JustifyContent("safe left")
		public val safeFlexEnd: JustifyContent = JustifyContent("safe flex-end")
		public val safeFlexStart: JustifyContent = JustifyContent("safe flex-start")
		public val safeRight: JustifyContent = JustifyContent("safe right")
		public val safeStart: JustifyContent = JustifyContent("safe start")

		public val unsafeCenter: JustifyContent = JustifyContent("unsafe center")
		public val unsafeEnd: JustifyContent = JustifyContent("unsafe end")
		public val unsafeLeft: JustifyContent = JustifyContent("unsafe left")
		public val unsafeFlexEnd: JustifyContent = JustifyContent("unsafe flex-end")
		public val unsafeFlexStart: JustifyContent = JustifyContent("unsafe flex-start")
		public val unsafeRight: JustifyContent = JustifyContent("unsafe right")
		public val unsafeStart: JustifyContent = JustifyContent("unsafe start")
	}
}


private class JustifyContentImpl(value: String) : CssValueImpl(value), JustifyContent


@Suppress("FunctionName")
public fun JustifyContent(value: String): JustifyContent =
	JustifyContentImpl(value)


public inline fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContent) {
	property(CssProperty.justifyContent, value)
}


public inline fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContentOrGlobal) {
	property(CssProperty.justifyContent, value)
}


public inline fun CssDeclarationBlockBuilder.justifyContent(value: GlobalValue) {
	property(CssProperty.justifyContent, value)
}


public inline fun CssDeclarationBlockBuilder.justifyContent(value: CustomCssProperty<out JustifyContentOrGlobal>) {
	property(CssProperty.justifyContent, value)
}


public inline val CssProperty.Companion.justifyContent: CssProperty get() = CssProperty("justify-content")
