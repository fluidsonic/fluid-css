@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundImage : Background.Single {

	public companion object;


	@JsName("0;0")
	public interface Variable : BackgroundImage, CssVariable<BackgroundImage>
}


@CssDsl
public inline val BackgroundImage.Companion.none: BackgroundImage
	get() = unsafe("none")


public inline fun BackgroundImage.Companion.unsafe(value: String): BackgroundImage =
	CssValue.unsafe(value)


public inline fun BackgroundImage.Companion.variable(name: String): BackgroundImage.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundImage(value: BackgroundImage) {
	property(backgroundImage, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundImage: CssProperty<BackgroundImage>
	get() = CssProperty.unsafe("background-image")
