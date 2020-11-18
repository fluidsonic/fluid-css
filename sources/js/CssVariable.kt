package io.fluidsonic.css


public interface CssVariable<Value : Any> : CssValue { // FIXME : CssValue -- also -> out ok?

	public val name: String

	public fun withDefaults(vararg defaults: Value): Value
}


public fun CssVariable<*>.toProperty(): CssProperty =
	CssProperty("--$name")


internal abstract class CssVariableBase<Value : Any>(
	override val name: String,
	vararg defaults: Value,
) :
	CssValueBase(
		if (defaults.isEmpty()) "var(--$name)"
		else buildString {
			append("var(--")
			append(name)

			for (default in defaults) {
				append(",")
				append(default)
			}

			append(")")
		}
	),
	CssVariable<Value>
