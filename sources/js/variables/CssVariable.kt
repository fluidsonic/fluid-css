package io.fluidsonic.css


public interface CssVariable<Value : CssValue> : CssValue {

    public val name: String

    override fun equals(other: Any?): Boolean
    override fun hashCode(): Int
    override fun toString(): String
}


public val CssVariable<*>.propertyName: String
    get() = "--$name"


public fun <Value : CssValue> CssVariable<Value>.toProperty(): CssProperty<Value> =
    CssProperty(propertyName)


@Suppress("UNCHECKED_CAST")
public fun <Value> CssVariable<in Value>.withDefaults(vararg defaults: Value): Value where Value : CssValue, Value : Internal =
    GenericValue(when {
        defaults.isEmpty() -> toString()
        else -> buildString {
            append("var(--")
            append(name)

            for (default in defaults) {
                append(",")
                append(default)
            }

            append(")")
        }
    }) as Value // FIXME This isn't safe, for example with `Value = Length.Numeric`.
