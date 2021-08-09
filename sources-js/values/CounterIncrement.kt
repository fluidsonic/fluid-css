@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface CounterIncrement : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : CounterIncrement, CssVariable<CounterIncrement>
}


@CssDsl
public inline val CounterIncrement.Companion.none: CounterIncrement
	get() = unsafe("none")


public inline fun CounterIncrement.Companion.unsafe(value: String): CounterIncrement =
	CssValue.unsafe(value)


public inline fun CounterIncrement.Companion.variable(name: String): CounterIncrement.Variable =
	CssVariable.unsafe(name)


public inline fun CounterIncrement.Companion.with(name: String, increment: Int = 1): CounterIncrement =
	unsafe(
		if (increment == 1) name
		else "$name $increment"
	)


@CssDsl
public inline fun CssDeclarationBlockBuilder.counterIncrement(value: CounterIncrement) {
	property(counterIncrement, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.counterIncrement(name: String, increment: Int = 1) {
	counterIncrement(CounterIncrement.with(increment = increment, name = name))
}


@Suppress("unused")
public inline val CssProperties.counterIncrement: CssProperty<CounterIncrement>
	get() = CssProperty.unsafe("counter-increment")
