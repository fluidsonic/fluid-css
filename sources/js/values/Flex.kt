@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Flex : CssValue {

	public companion object {

		public val auto: Flex = AutoValue.auto
		public val none: Flex = NoneValue.none


		public fun raw(value: String): Flex =
			Default(value)


		public fun with(grow: Number? = null, shrink: Number? = null, basis: FlexBasis? = null): Flex =
			with(grow = grow?.let(::FlexGrow), shrink = shrink?.let(::FlexShrink), basis = basis)


		public fun with(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null): Flex =
			raw(buildString {
				require(grow != null || shrink != null || basis != null) { "At least one of grow, shrink or basis must be specified." }

				if (grow != null)
					append(grow)

				if (shrink != null) {
					if (grow == null)
						append("0")

					if (isNotEmpty()) append(" ")
					append(shrink)
				}

				if (basis != null) {
					if (isNotEmpty()) append(" ")
					append(basis)
				}
			})
	}


	private class Default(value: String) : CssValueImpl(value), Flex
}


public inline fun CssDeclarationBlockBuilder.flex(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


public inline fun CssDeclarationBlockBuilder.flex(grow: Number? = null, shrink: Number? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


public inline fun CssDeclarationBlockBuilder.flex(value: Flex) {
	property(CssProperty.flex, value)
}


public inline fun CssDeclarationBlockBuilder.flex(value: GlobalValue) {
	property(CssProperty.flex, value)
}


public inline fun CssDeclarationBlockBuilder.flex(value: CustomCssProperty<out Flex>) {
	property(CssProperty.flex, value)
}


public inline val CssProperty.Companion.flex: CssProperty get() = CssProperty("flex")
