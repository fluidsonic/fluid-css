@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `counter-increment` value. */
@JsName("0;0")
public external interface CounterIncrement : CssValue {

	public companion object;


	/** A [CounterIncrement] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : CounterIncrement, CssVariable<CounterIncrement>
}


/** The CSS `none` counter-increment value. */
@CssDsl
public inline val CounterIncrement.Companion.none: CounterIncrement
	get() = unsafe("none")


/** Creates a [CounterIncrement] from an unchecked string [value]. */
public inline fun CounterIncrement.Companion.unsafe(value: String): CounterIncrement =
	CssValue.unsafe(value)


/** Creates a [CounterIncrement] backed by a CSS variable with the given [name]. */
public inline fun CounterIncrement.Companion.variable(name: String): CounterIncrement.Variable =
	CssVariable.unsafe(name)


/** Creates a [CounterIncrement] shorthand value. */
public inline fun CounterIncrement.Companion.with(name: String, increment: Int = 1): CounterIncrement =
	unsafe(
		if (increment == 1) name
		else "$name $increment"
	)


/** Sets the `counter-increment` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.counterIncrement(value: CounterIncrement) {
	property(counterIncrement, value)
}


/** Sets the `counter-increment` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.counterIncrement(name: String, increment: Int = 1) {
	counterIncrement(CounterIncrement.with(increment = increment, name = name))
}


/** The `counter-increment` CSS property. */
@Suppress("unused")
public inline val CssProperties.counterIncrement: CssProperty<CounterIncrement>
	get() = CssProperty.unsafe("counter-increment")
