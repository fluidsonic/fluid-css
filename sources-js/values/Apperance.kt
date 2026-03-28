@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `appearance` value. */
@JsName("0;0")
public external interface Appearance : CssValue {

	public companion object;


	/** A [Appearance] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Appearance, CssVariable<Appearance>
}


/** The CSS `auto` appearance value. */
@CssDsl
public inline val Appearance.Companion.auto: Appearance
	get() = unsafe("auto")

/** The CSS `none` appearance value. */
@CssDsl
public inline val Appearance.Companion.none: Appearance
	get() = unsafe("none")


/** The CSS `menulist-button` appearance value. */
@CssDsl
public inline val Appearance.Companion.menulistButton: Appearance
	get() = unsafe("menulist-button")

/** The CSS `textfield` appearance value. */
@CssDsl
public inline val Appearance.Companion.textfield: Appearance
	get() = unsafe("textfield")


/** Creates a [Appearance] from an unchecked string [value]. */
public inline fun Appearance.Companion.unsafe(value: String): Appearance =
	CssValue.unsafe(value)


/** Creates a [Appearance] backed by a CSS variable with the given [name]. */
public inline fun Appearance.Companion.variable(name: String): Appearance.Variable =
	CssVariable.unsafe(name)


/** Sets the `appearance` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.appearance(value: Appearance) {
	property(appearance, value)
}


/** The `appearance` CSS property. */
@Suppress("unused")
public inline val CssProperties.appearance: CssProperty<Appearance>
	get() = CssProperty.unsafe("appearance")
