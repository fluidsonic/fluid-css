@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CounterReset : CssValue {

	public companion object {

		public val none: CounterReset = NoneValue.none
	}
}


private class CounterResetImpl(value: String) : CssValueBase(value), CounterReset


@Suppress("FunctionName")
public fun CounterReset(name: String, value: Int = 0): CounterReset =
	CounterResetImpl(
		if (value == 0) name
		else "$name $value"
	)


public inline fun CssDeclarationBlockBuilder.counterReset(value: CounterReset) {
	property(CssProperty.counterReset, value)
}


public inline fun CssDeclarationBlockBuilder.counterReset(value: GlobalValue) {
	property(CssProperty.counterReset, value)
}


public inline fun CssDeclarationBlockBuilder.counterReset(value: CustomCssProperty<out CounterReset>) {
	property(CssProperty.counterReset, value)
}


public inline fun CssDeclarationBlockBuilder.counterReset(name: String, increment: Int = 0) {
	counterReset(CounterReset(value = increment, name = name))
}


public inline val CssProperty.Companion.counterReset: CssProperty get() = CssProperty("counter-reset")
