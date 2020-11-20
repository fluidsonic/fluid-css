@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AlignItems : CssValue, Internal {

	public companion object {

		@CssDsl
		public val baseline: AlignItems = raw("baseline")

		@CssDsl
		public val center: AlignItems = raw("center")

		@CssDsl
		public val end: AlignItems = raw("end")

		@CssDsl
		public val firstBaseline: AlignItems = raw("first baseline")

		@CssDsl
		public val flexEnd: AlignItems = raw("flex-end")

		@CssDsl
		public val flexStart: AlignItems = raw("flex-start")

		@CssDsl
		public val lastBaseline: AlignItems = raw("last baseline")

		@CssDsl
		public val normal: AlignItems = raw("normal")

		@CssDsl
		public val selfEnd: AlignItems = raw("self-end")

		@CssDsl
		public val selfStart: AlignItems = raw("self-start")

		@CssDsl
		public val start: AlignItems = raw("start")

		@CssDsl
		public val stretch: AlignItems = raw("stretch")


		@CssDsl
		public val safeCenter: AlignItems = raw("safe center")

		@CssDsl
		public val safeEnd: AlignItems = raw("safe end")

		@CssDsl
		public val safeFlexEnd: AlignItems = raw("safe flex-end")

		@CssDsl
		public val safeFlexStart: AlignItems = raw("safe flex-start")

		@CssDsl
		public val safeSelfEnd: AlignItems = raw("safe self-end")

		@CssDsl
		public val safeSelfStart: AlignItems = raw("safe self-start")

		@CssDsl
		public val safeStart: AlignItems = raw("safe start")


		@CssDsl
		public val unsafeCenter: AlignItems = raw("unsafe center")

		@CssDsl
		public val unsafeEnd: AlignItems = raw("unsafe end")

		@CssDsl
		public val unsafeFlexEnd: AlignItems = raw("unsafe flex-end")

		@CssDsl
		public val unsafeFlexStart: AlignItems = raw("unsafe flex-start")

		@CssDsl
		public val unsafeSelfEnd: AlignItems = raw("unsafe self-end")

		@CssDsl
		public val unsafeSelfStart: AlignItems = raw("unsafe self-start")

		@CssDsl
		public val unsafeStart: AlignItems = raw("unsafe start")


		public fun raw(value: String): AlignItems =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : AlignItems, CssVariable<AlignItems>
}


@CssDsl
public fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(alignItems, value)
}


@Suppress("unused")
public val CssProperties.alignItems: CssProperty<AlignItems>
	get() = CssProperty("align-items")
