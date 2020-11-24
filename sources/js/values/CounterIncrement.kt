@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface CounterIncrement : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: CounterIncrement
			get() = unsafe("none")


		public inline fun unsafe(value: String): CounterIncrement =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(name: String, increment: Int = 1): CounterIncrement =
			unsafe(
				if (increment == 1) name
				else "$name $increment"
			)
	}


	public interface Variable : CounterIncrement, CssVariable<CounterIncrement>
}


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
