@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AlignItemsOrGlobal : CssValue
public interface AlignItems : AlignItemsOrGlobal {

	public companion object {

		public val baseline: AlignItems = AlignItems("baseline")
		public val center: AlignItems = AlignItems("center")
		public val end: AlignItems = AlignItems("end")
		public val firstBaseline: AlignItems = AlignItems("first baseline")
		public val flexEnd: AlignItems = AlignItems("flex-end")
		public val flexStart: AlignItems = AlignItems("flex-start")
		public val lastBaseline: AlignItems = AlignItems("last baseline")
		public val normal: AlignItems = AlignItems("normal")
		public val selfEnd: AlignItems = AlignItems("self-end")
		public val selfStart: AlignItems = AlignItems("self-start")
		public val start: AlignItems = AlignItems("start")
		public val stretch: AlignItems = AlignItems("stretch")

		public val safeCenter: AlignItems = AlignItems("safe center")
		public val safeEnd: AlignItems = AlignItems("safe end")
		public val safeFlexEnd: AlignItems = AlignItems("safe flex-end")
		public val safeFlexStart: AlignItems = AlignItems("safe flex-start")
		public val safeSelfEnd: AlignItems = AlignItems("safe self-end")
		public val safeSelfStart: AlignItems = AlignItems("safe self-start")
		public val safeStart: AlignItems = AlignItems("safe start")

		public val unsafeCenter: AlignItems = AlignItems("unsafe center")
		public val unsafeEnd: AlignItems = AlignItems("unsafe end")
		public val unsafeFlexEnd: AlignItems = AlignItems("unsafe flex-end")
		public val unsafeFlexStart: AlignItems = AlignItems("unsafe flex-start")
		public val unsafeSelfEnd: AlignItems = AlignItems("unsafe self-end")
		public val unsafeSelfStart: AlignItems = AlignItems("unsafe self-start")
		public val unsafeStart: AlignItems = AlignItems("unsafe start")
	}
}


private class AlignItemsImpl(value: String) : CssValueImpl(value), AlignItems


@Suppress("FunctionName")
public fun AlignItems(value: String): AlignItems =
	AlignItemsImpl(value)


public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(CssProperty.alignItems, value)
}


public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItemsOrGlobal) {
	property(CssProperty.alignItems, value)
}


public inline fun CssDeclarationBlockBuilder.alignItems(value: GlobalValue) {
	property(CssProperty.alignItems, value)
}


public inline fun CssDeclarationBlockBuilder.alignItems(value: CustomCssProperty<out AlignItemsOrGlobal>) {
	property(CssProperty.alignItems, value)
}


public inline val CssProperty.Companion.alignItems: CssProperty get() = CssProperty("align-items")
