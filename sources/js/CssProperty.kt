package io.fluidsonic.css


@Suppress("unused")
public inline class CssProperty<Value : CssValue>(
	public val name: String,
) {

	override fun toString(): String =
		name
}


@Suppress("unused")
public val CssProperties.all: CssProperty<CssValue.Global>
	get() = CssProperty("all")
