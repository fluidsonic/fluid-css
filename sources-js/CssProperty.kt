@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION"
)

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssProperty`. */
@Suppress("unused")
public external interface CssProperty<Value : CssValue> {

	public companion object {

		public inline fun <Value : CssValue> unsafe(name: String): CssProperty<Value> =
			name.unsafeCast<CssProperty<Value>>()
	}
}


public inline fun CssProperty<*>.asString(): String =
	unsafeCast<String>()


public inline val CssProperty<*>.name: String
	get() = asString()


@Suppress("unused")
public inline val CssProperties.all: CssProperty<CssValue.Global>
	get() = CssProperty.unsafe("all")
