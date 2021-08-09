@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface CounterReset : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : CounterReset, CssVariable<CounterReset>
}


@CssDsl
public inline val CounterReset.Companion.none: CounterReset
	get() = unsafe("none")


public inline fun CounterReset.Companion.unsafe(value: String): CounterReset =
	CssValue.unsafe(value)


public inline fun CounterReset.Companion.variable(name: String): CounterReset.Variable =
	CssVariable.unsafe(name)


public inline fun CounterReset.Companion.with(name: String, value: Int = 0): CounterReset =
	unsafe(
		if (value == 0) name
		else "$name $value"
	)


@CssDsl
public inline fun CssDeclarationBlockBuilder.counterReset(value: CounterReset) {
	property(counterReset, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.counterReset(name: String, value: Int = 0) {
	counterReset(CounterReset.with(name = name, value = value))
}


@Suppress("unused")
public inline val CssProperties.counterReset: CssProperty<CounterReset>
	get() = CssProperty.unsafe("counter-reset")
