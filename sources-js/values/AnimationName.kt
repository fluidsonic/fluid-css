@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `animation-name` value. */
@JsName("0;0")
public external interface AnimationName : CssValue.StringConstructable {

	public companion object;


	/** A [AnimationName] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : AnimationName, CssVariable<AnimationName>
}


/** The CSS `none` animation-name value. */
@CssDsl
public inline val AnimationName.Companion.none: AnimationName
	get() = unsafe("none")


/** Creates a [AnimationName] value. */
public inline fun AnimationName.Companion.of(value: String): AnimationName =
	unsafe(value)


/** Creates a [AnimationName] from an unchecked string [value]. */
public inline fun AnimationName.Companion.unsafe(value: String): AnimationName =
	CssValue.unsafe(value)


/** Creates a [AnimationName] backed by a CSS variable with the given [name]. */
public inline fun AnimationName.Companion.variable(name: String): AnimationName.Variable =
	CssVariable.unsafe(name)


/** Sets the `animation-name` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationName(value: AnimationName) {
	property(animationName, value)
}


/** Sets the `animation-name` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.animationName(value: String) {
	property(animationName, value)
}


/** The `animation-name` CSS property. */
@Suppress("unused")
public inline val CssProperties.animationName: CssProperty<AnimationName>
	get() = CssProperty.unsafe("animation-name")
