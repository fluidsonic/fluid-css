@file:Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")

package io.fluidsonic.css


/** Only `[String, String]` is a valid subtype of `CssDeclaration`. */
public external interface CssDeclaration {

	public companion object {

		public inline fun of(property: String, value: String): CssDeclaration =
			arrayOf(property, value).unsafeCast<CssDeclaration>()
	}
}


public inline val CssDeclaration.property: String
	get() = unsafeCast<Array<String>>()[0]


public val CssDeclaration.value: String
	get() = unsafeCast<Array<String>>()[1]
