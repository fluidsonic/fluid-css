@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val variableNameRegex = RegExp("^\\s*var\\(\\s*--([^,\\s]+).*\\)\\s*$", "i")


/** Only `String` is a valid subtype of `CssVariable`. */
@JsName("0;0")
public external interface CssVariable<Value : CssValue> : CssValue {

	public companion object;
}


/** Returns the string representation of this [CssVariable] (e.g. `var(--name)`). */
public inline fun CssVariable<*>.asString(): String =
	unsafeCast<String>()


/** The variable name without the `--` prefix. */
public val CssVariable<*>.name: String
	get() = variableNameRegex.exec(asString())
		?.let { match -> match.unsafeCast<Array<String?>>()[1] }
		?: error("Invalid CSS variable value: $this")


/** The CSS custom property name (e.g. `--name`). */
public inline val CssVariable<*>.propertyName: String
	get() = "--$name"


/** Converts this variable to a [CssProperty] using its custom property name. */
public fun <Value : CssValue> CssVariable<Value>.toProperty(): CssProperty<Value> =
	CssProperty.unsafe(propertyName)


/** Returns a `var()` expression with fallback [defaults]. */
@Suppress("UNCHECKED_CAST")
public fun <Value : CssValue> CssVariable<in Value>.withDefaults(vararg defaults: Value): Value =
	when {
		defaults.isEmpty() -> unsafeCast<Value>()
		else -> CssValue.unsafe(buildString {
			append("var(--")
			append(name)

			for (default in defaults) {
				append(",")
				append(default)
			}

			append(")")
		})
	}


/** Creates a [CssVariable] from an unchecked [name] string. */
public inline fun <Value : CssValue, Variable : CssVariable<Value>> CssVariable.Companion.unsafe(name: String): Variable =
	"var(--$name)".unsafeCast<Variable>()
