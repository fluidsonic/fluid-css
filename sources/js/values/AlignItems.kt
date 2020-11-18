@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AlignItems : CssValue {

	public companion object {

		public val baseline: AlignItems = raw("baseline")
		public val center: AlignItems = raw("center")
		public val end: AlignItems = raw("end")
		public val firstBaseline: AlignItems = raw("first baseline")
		public val flexEnd: AlignItems = raw("flex-end")
		public val flexStart: AlignItems = raw("flex-start")
		public val lastBaseline: AlignItems = raw("last baseline")
		public val normal: AlignItems = raw("normal")
		public val selfEnd: AlignItems = raw("self-end")
		public val selfStart: AlignItems = raw("self-start")
		public val start: AlignItems = raw("start")
		public val stretch: AlignItems = raw("stretch")

		public val safeCenter: AlignItems = raw("safe center")
		public val safeEnd: AlignItems = raw("safe end")
		public val safeFlexEnd: AlignItems = raw("safe flex-end")
		public val safeFlexStart: AlignItems = raw("safe flex-start")
		public val safeSelfEnd: AlignItems = raw("safe self-end")
		public val safeSelfStart: AlignItems = raw("safe self-start")
		public val safeStart: AlignItems = raw("safe start")

		public val unsafeCenter: AlignItems = raw("unsafe center")
		public val unsafeEnd: AlignItems = raw("unsafe end")
		public val unsafeFlexEnd: AlignItems = raw("unsafe flex-end")
		public val unsafeFlexStart: AlignItems = raw("unsafe flex-start")
		public val unsafeSelfEnd: AlignItems = raw("unsafe self-end")
		public val unsafeSelfStart: AlignItems = raw("unsafe self-start")
		public val unsafeStart: AlignItems = raw("unsafe start")


		public fun raw(value: String): AlignItems =
			Default(value)


		public fun variable(name: String): Variable =
			VariableDefault(name)
	}


	private class Default(value: String) : CssValueBase(value), AlignItems


	public interface Variable : AlignItems, CssVariable<AlignItems>

	private class VariableDefault(name: String, vararg defaults: AlignItems) : CssVariableBase<AlignItems>(name, *defaults), Variable {

		override fun withDefaults(vararg defaults: AlignItems): AlignItems =
			VariableDefault(name, *defaults)
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(CssProperty.alignItems, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.alignItems(value: GlobalValue) {
	property(CssProperty.alignItems, value)
}


public inline val CssProperty.Companion.alignItems: CssProperty get() = CssProperty("align-items")
