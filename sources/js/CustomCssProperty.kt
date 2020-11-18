package io.fluidsonic.css


// FIXME should derive from CssProperty
public inline class CustomCssProperty<Value : Any>(public val name: String) {

	public fun reference(vararg defaultValues: Value?): String =
		buildString {
			append("var(--")
			append(name)
			for (defaultValue in defaultValues)
				if (defaultValue != null) {
					append(", ")
					append(defaultValue)
				}
			append(")")
		}


	override fun toString(): String =
		"--$name"
}
