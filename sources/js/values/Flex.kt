@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Flex : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Flex = raw("auto")

		@CssDsl
		public val none: Flex = raw("none")


		public fun raw(value: String): Flex =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public inline fun with(grow: Number? = null, shrink: Number? = null, basis: FlexBasis? = null): Flex =
			with(grow = grow?.let(FlexGrow::of), shrink = shrink?.let(FlexShrink::of), basis = basis)


		public fun with(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null): Flex =
			if (grow != null || shrink != null || basis != null)
				raw(buildString {
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
			else
				CssValue.initial
	}


	public interface Variable : Flex, CssVariable<Flex>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(value: Flex) {
	property(flex, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: Number? = null, shrink: Number? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


@Suppress("unused")
public inline val CssProperties.flex: CssProperty<Flex>
	get() = CssProperty("flex")
