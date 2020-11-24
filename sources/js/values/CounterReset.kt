@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface CounterReset : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: CounterReset
			get() = unsafe("none")


		public inline fun unsafe(value: String): CounterReset =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(name: String, value: Int = 0): CounterReset =
			unsafe(
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
	get() = CssProperty.unsafe("counter-reset")
