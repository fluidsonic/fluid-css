package io.fluidsonic.css


public interface CssValue {

	override fun equals(other: Any?): Boolean
	override fun hashCode(): Int
	override fun toString(): String


	public companion object
}


internal abstract class CssValueImpl(private val value: String) : CssValue {

	init {
		require(value.isNotBlank()) { "CSS value must not be empty or blank." }
	}


	override fun equals(other: Any?) =
		other === this || (other is CssValueImpl && value == other.value)


	override fun hashCode() =
		value.hashCode()


	override fun toString() =
		value
}


@Suppress("FunctionName", "UNCHECKED_CAST")
internal inline fun <Value : CssValue> CssValue(value: String, create: (String) -> Value): Value =
	when (value) {
		"inherit" -> GlobalValue.inherit as Value // FIXME will fail
		"initial" -> GlobalValue.initial as Value
		"unset" -> GlobalValue.unset as Value
		else -> create(value)
	}
