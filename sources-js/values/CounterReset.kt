@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `counter-reset` value. */
@JsName("0;0")
public external interface CounterReset : CssValue {

	public companion object;


	/** A [CounterReset] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : CounterReset, CssVariable<CounterReset>
}


/** The CSS `none` counter-reset value. */
@CssDsl
public inline val CounterReset.Companion.none: CounterReset
	get() = unsafe("none")


/** Creates a [CounterReset] from an unchecked string [value]. */
public inline fun CounterReset.Companion.unsafe(value: String): CounterReset =
	CssValue.unsafe(value)


/** Creates a [CounterReset] backed by a CSS variable with the given [name]. */
public inline fun CounterReset.Companion.variable(name: String): CounterReset.Variable =
	CssVariable.unsafe(name)


/** Creates a [CounterReset] shorthand value. */
public inline fun CounterReset.Companion.with(name: String, value: Int = 0): CounterReset =
	unsafe(
		if (value == 0) name
		else "$name $value"
	)


/** Sets the `counter-reset` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.counterReset(value: CounterReset) {
	property(counterReset, value)
}


/** Sets the `counter-reset` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.counterReset(name: String, value: Int = 0) {
	counterReset(CounterReset.with(name = name, value = value))
}


/** The `counter-reset` CSS property. */
@Suppress("unused")
public inline val CssProperties.counterReset: CssProperty<CounterReset>
	get() = CssProperty.unsafe("counter-reset")
