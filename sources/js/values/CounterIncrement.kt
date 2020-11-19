@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CounterIncrement : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: CounterIncrement = raw("none")


		public fun raw(value: String): CounterIncrement =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public inline fun with(name: String, increment: Int = 1): CounterIncrement =
			raw(
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
	get() = CssProperty("counter-increment")
