@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssProperty`. */
@JsName("0;0")
@Suppress("unused")
public external interface CssProperty<Value : CssValue> {

	public companion object
}


public inline fun CssProperty<*>.asString(): String =
	unsafeCast<String>()


public inline val CssProperty<*>.name: String
	get() = asString()


public inline fun <Value : CssValue> CssProperty.Companion.unsafe(name: String): CssProperty<Value> =
	name.unsafeCast<CssProperty<Value>>()


@Suppress("unused")
public inline val CssProperties.all: CssProperty<CssValue.Global>
	get() = CssProperty.unsafe("all")
