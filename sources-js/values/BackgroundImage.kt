@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-image` value. */
@JsName("0;0")
public external interface BackgroundImage : Background.Single {

	public companion object;


	/** A [BackgroundImage] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundImage, CssVariable<BackgroundImage>
}


/** The CSS `none` background-image value. */
@CssDsl
public inline val BackgroundImage.Companion.none: BackgroundImage
	get() = unsafe("none")


/** Creates a [BackgroundImage] from an unchecked string [value]. */
public inline fun BackgroundImage.Companion.unsafe(value: String): BackgroundImage =
	CssValue.unsafe(value)


/** Creates a [BackgroundImage] backed by a CSS variable with the given [name]. */
public inline fun BackgroundImage.Companion.variable(name: String): BackgroundImage.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-image` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImage) {
	property(backgroundImage, value)
}


/** The `background-image` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundImage: CssProperty<BackgroundImage>
	get() = CssProperty.unsafe("background-image")
