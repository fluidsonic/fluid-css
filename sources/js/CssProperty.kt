package io.fluidsonic.css


public inline class CssProperty(
	public val name: String,
) {

	override fun toString(): String =
		name


	public companion object
}


public val CssProperty.Companion.all: CssProperty get() = CssProperty("all")

