@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssProperty`. */
@JsName("0;0")
@Suppress("unused")
public external interface CssProperty<Value : CssValue> {

	public companion object
}


/** Returns the string representation of this [CssProperty]. */
public inline fun CssProperty<*>.asString(): String =
	unsafeCast<String>()


/** The CSS property name. */
public inline val CssProperty<*>.name: String
	get() = asString()


/** Creates a [CssProperty] from an unchecked [name] string. */
public inline fun <Value : CssValue> CssProperty.Companion.unsafe(name: String): CssProperty<Value> =
	name.unsafeCast<CssProperty<Value>>()


/** The CSS `all` shorthand property. */
@Suppress("unused")
public inline val CssProperties.all: CssProperty<CssValue.Global>
	get() = CssProperty.unsafe("all")
