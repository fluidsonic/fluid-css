@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


/** Only `[String, String]` is a valid subtype of `CssDeclaration`. */
@JsName("0;0")
public external interface CssDeclaration {

	public companion object
}


/** Creates a [CssDeclaration] with the given [property] name and [value]. */
public inline fun CssDeclaration.Companion.of(property: String, value: String): CssDeclaration =
	arrayOf(property, value).unsafeCast<CssDeclaration>()


/** The CSS property name of this declaration. */
public inline val CssDeclaration.property: String
	get() = unsafeCast<Array<String>>()[0]


/** The CSS value of this declaration. */
public val CssDeclaration.value: String
	get() = unsafeCast<Array<String>>()[1]
