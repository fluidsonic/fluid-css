@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CounterReset : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: CounterReset = raw("none")


		public fun raw(value: String): CounterReset =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public inline fun with(name: String, value: Int = 0): CounterReset =
			raw(
				if (value == 0) name
				else "$name $value"
			)
	}


	public interface Variable : CounterReset, CssVariable<CounterReset>
}


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
	get() = CssProperty("counter-reset")
