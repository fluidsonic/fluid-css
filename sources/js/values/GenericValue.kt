package io.fluidsonic.css


internal open class GenericValue(private val value: String) : CssValue.Global {

	init {
		require(value.isNotBlank()) { "CSS value must not be empty or blank." }
	}


	override fun equals(other: Any?) =
		other === this || (other is CssValue && value == other.toString())


	override fun hashCode() =
		value.hashCode()


	override fun toString() =
		value
}
