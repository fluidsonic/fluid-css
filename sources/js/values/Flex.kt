@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Flex : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val auto: Flex
			get() = unsafe("auto")

		@CssDsl
		public inline val none: Flex
			get() = unsafe("none")


		public inline fun unsafe(value: String): Flex =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(grow: Int? = null, shrink: Int? = null, basis: FlexBasis? = null): Flex =
			with(grow = grow?.let(FlexGrow::of), shrink = shrink?.let(FlexShrink::of), basis = basis)


		public inline fun with(grow: Double? = null, shrink: Double? = null, basis: FlexBasis? = null): Flex =
			with(grow = grow?.let(FlexGrow::of), shrink = shrink?.let(FlexShrink::of), basis = basis)
	}


	public interface Variable : Flex, CssVariable<Flex>
}


@Suppress("DEPRECATION")
public inline fun Flex.Companion.with(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null): Flex =
	when {
		grow != null && shrink != null && basis != null ->
			unsafe("$grow $shrink $basis")

		grow != null || shrink != null || basis != null -> {
			var string = ""

			if (grow != null)
				string += grow

			if (shrink != null) {
				if (grow == null)
					string += "0"

				if (string.isNotEmpty()) string += " "
				string += shrink
			}
			if (basis != null) {
				if (string.isNotEmpty()) string += " "
				string += basis
			}

			unsafe(string)
		}

		else -> CssValue.initial
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
public inline fun CssDeclarationBlockBuilder.flex(grow: Int? = null, shrink: Int? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: Double? = null, shrink: Double? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


@Suppress("unused")
public inline val CssProperties.flex: CssProperty<Flex>
	get() = CssProperty.unsafe("flex")
