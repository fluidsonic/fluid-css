@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-origin` value. */
@JsName("0;0")
public external interface BackgroundOrigin : CssValue {

	public companion object;


	/** A [BackgroundOrigin] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundOrigin, CssVariable<BackgroundOrigin>
}


/** The CSS `border-box` background-origin value. */
@CssDsl
public inline val BackgroundOrigin.Companion.borderBox: BackgroundOrigin
	get() = unsafe("border-box")

/** The CSS `content-box` background-origin value. */
@CssDsl
public inline val BackgroundOrigin.Companion.contentBox: BackgroundOrigin
	get() = unsafe("content-box")

/** The CSS `padding-box` background-origin value. */
@CssDsl
public inline val BackgroundOrigin.Companion.paddingBox: BackgroundOrigin
	get() = unsafe("padding-box")


/** Creates a [BackgroundOrigin] from an unchecked string [value]. */
public inline fun BackgroundOrigin.Companion.unsafe(value: String): BackgroundOrigin =
	CssValue.unsafe(value)


/** Creates a [BackgroundOrigin] backed by a CSS variable with the given [name]. */
public inline fun BackgroundOrigin.Companion.variable(name: String): BackgroundOrigin.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-origin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOrigin) {
	property(backgroundOrigin, value)
}


/** The `background-origin` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundOrigin: CssProperty<BackgroundOrigin>
	get() = CssProperty.unsafe("background-origin")
