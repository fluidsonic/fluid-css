@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `resize` value. */
@JsName("0;0")
public external interface Resize : CssValue {

	public companion object;


	/** A [Resize] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Resize, CssVariable<Resize>
}


/** The CSS `none` resize value. */
@CssDsl
public inline val Resize.Companion.none: Resize
	get() = unsafe("none")


/** The CSS `block` resize value. */
@CssDsl
public inline val Resize.Companion.block: Resize
	get() = unsafe("block")

/** The CSS `both` resize value. */
@CssDsl
public inline val Resize.Companion.both: Resize
	get() = unsafe("both")

/** The CSS `horizontal` resize value. */
@CssDsl
public inline val Resize.Companion.horizontal: Resize
	get() = unsafe("horizontal")

/** The CSS `inline` resize value. */
@CssDsl
public inline val Resize.Companion.inline: Resize
	get() = unsafe("inline")

/** The CSS `vertical` resize value. */
@CssDsl
public inline val Resize.Companion.vertical: Resize
	get() = unsafe("vertical")


/** Creates a [Resize] from an unchecked string [value]. */
public inline fun Resize.Companion.unsafe(value: String): Resize =
	CssValue.unsafe(value)


/** Creates a [Resize] backed by a CSS variable with the given [name]. */
public inline fun Resize.Companion.variable(name: String): Resize.Variable =
	CssVariable.unsafe(name)


/** Sets the `resize` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.resize(value: Resize) {
	property(resize, value)
}


/** The `resize` CSS property. */
@Suppress("unused")
public inline val CssProperties.resize: CssProperty<Resize>
	get() = CssProperty.unsafe("resize")
