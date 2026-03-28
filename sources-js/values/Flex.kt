@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `flex` value. */
@JsName("0;0")
public external interface Flex : CssValue {

	public companion object;


	/** A [Flex] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Flex, CssVariable<Flex>
}


/** The CSS `auto` flex value. */
@CssDsl
public inline val Flex.Companion.auto: Flex
	get() = unsafe("auto")

/** The CSS `none` flex value. */
@CssDsl
public inline val Flex.Companion.none: Flex
	get() = unsafe("none")


/** Creates a [Flex] from an unchecked string [value]. */
public inline fun Flex.Companion.unsafe(value: String): Flex =
	CssValue.unsafe(value)


/** Creates a [Flex] backed by a CSS variable with the given [name]. */
public inline fun Flex.Companion.variable(name: String): Flex.Variable =
	CssVariable.unsafe(name)


/** Creates a [Flex] shorthand value. */
public inline fun Flex.Companion.with(grow: Int? = null, shrink: Int? = null, basis: FlexBasis? = null): Flex =
	with(grow = grow?.let(FlexGrow::of), shrink = shrink?.let(FlexShrink::of), basis = basis)


/** Creates a [Flex] shorthand value. */
public inline fun Flex.Companion.with(grow: Double? = null, shrink: Double? = null, basis: FlexBasis? = null): Flex =
	with(grow = grow?.let(FlexGrow::of), shrink = shrink?.let(FlexShrink::of), basis = basis)


/** Creates a [Flex] shorthand value. */
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


/** Sets the `flex` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(value: Flex) {
	property(flex, value)
}


/** Sets the `flex` CSS shorthand property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: FlexGrow? = null, shrink: FlexShrink? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


/** Sets the `flex` CSS shorthand property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: Int? = null, shrink: Int? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


/** Sets the `flex` CSS shorthand property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.flex(grow: Double? = null, shrink: Double? = null, basis: FlexBasis? = null) {
	flex(Flex.with(grow = grow, shrink = shrink, basis = basis))
}


/** The `flex` CSS property. */
@Suppress("unused")
public inline val CssProperties.flex: CssProperty<Flex>
	get() = CssProperty.unsafe("flex")
