@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `list-style-type` value. */
@JsName("0;0")
public external interface ListStyleType : CssValue {

	public companion object;


	/** A [ListStyleType] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : ListStyleType, CssVariable<ListStyleType>
}


/** The CSS `none` list-style-type value. */
@CssDsl
public inline val ListStyleType.Companion.none: ListStyleType
	get() = unsafe("none")


/** The CSS `circle` list-style-type value. */
@CssDsl
public inline val ListStyleType.Companion.circle: ListStyleType
	get() = unsafe("circle")

/** The CSS `decimal` list-style-type value. */
@CssDsl
public inline val ListStyleType.Companion.decimal: ListStyleType
	get() = unsafe("decimal")

/** The CSS `disc` list-style-type value. */
@CssDsl
public inline val ListStyleType.Companion.disc: ListStyleType
	get() = unsafe("disc")

/** The CSS `square` list-style-type value. */
@CssDsl
public inline val ListStyleType.Companion.square: ListStyleType
	get() = unsafe("square")


/** Creates a [ListStyleType] from an unchecked string [value]. */
public inline fun ListStyleType.Companion.unsafe(value: String): ListStyleType =
	CssValue.unsafe(value)


/** Creates a [ListStyleType] backed by a CSS variable with the given [name]. */
public inline fun ListStyleType.Companion.variable(name: String): ListStyleType.Variable =
	CssVariable.unsafe(name)


/** Sets the `list-style-type` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleType) {
	property(listStyleType, value)
}


/** The `list-style-type` CSS property. */
@Suppress("unused")
public inline val CssProperties.listStyleType: CssProperty<ListStyleType>
	get() = CssProperty.unsafe("list-style-type")
