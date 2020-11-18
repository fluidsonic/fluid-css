@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CounterIncrement : CssValue {

	public companion object {

		public val none: CounterIncrement = NoneValue.none
	}
}


private class CounterIncrementImpl(value: String) : CssValueImpl(value), CounterIncrement


@Suppress("FunctionName")
public fun CounterIncrement(name: String, increment: Int = 1): CounterIncrement =
	CounterIncrementImpl(
		if (increment == 1) name
		else "$name $increment"
	)


public inline fun CssDeclarationBlockBuilder.counterIncrement(value: CounterIncrement) {
	property(CssProperty.counterIncrement, value)
}


public inline fun CssDeclarationBlockBuilder.counterIncrement(value: GlobalValue) {
	property(CssProperty.counterIncrement, value)
}


public inline fun CssDeclarationBlockBuilder.counterIncrement(value: CustomCssProperty<out CounterIncrement>) {
	property(CssProperty.counterIncrement, value)
}


public inline fun CssDeclarationBlockBuilder.counterIncrement(name: String, increment: Int = 1) {
	counterIncrement(CounterIncrement(increment = increment, name = name))
}


public inline val CssProperty.Companion.counterIncrement: CssProperty get() = CssProperty("counter-increment")
