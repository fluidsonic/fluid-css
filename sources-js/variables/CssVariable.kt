@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION"
)

package io.fluidsonic.css

import kotlin.js.RegExp


private val variableNameRegex = RegExp("^\\s*var\\(\\s*--([^,\\s]+).*\\)\\s*$", "i")


/** Only `String` is a valid subtype of `CssVariable`. */
public external interface CssVariable<Value : CssValue> : CssValue {

	public companion object {

		public inline fun <Value : CssValue, Variable : CssVariable<Value>> unsafe(name: String): Variable =
			"var(--$name)".unsafeCast<Variable>()
	}
}


public inline fun CssVariable<*>.asString(): String =
	unsafeCast<String>()


public val CssVariable<*>.name: String
	get() = variableNameRegex.exec(asString())
		?.let { match -> match.unsafeCast<Array<String?>>()[1] }
		?: error("Invalid CSS variable value: $this")


public inline val CssVariable<*>.propertyName: String
	get() = "--$name"


public fun <Value : CssValue> CssVariable<Value>.toProperty(): CssProperty<Value> =
	CssProperty.unsafe(propertyName)


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
