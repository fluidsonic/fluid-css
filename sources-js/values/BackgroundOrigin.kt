@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundOrigin : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BackgroundOrigin, CssVariable<BackgroundOrigin>
}


@CssDsl
public inline val BackgroundOrigin.Companion.borderBox: BackgroundOrigin
	get() = unsafe("border-box")

@CssDsl
public inline val BackgroundOrigin.Companion.contentBox: BackgroundOrigin
	get() = unsafe("content-box")

@CssDsl
public inline val BackgroundOrigin.Companion.paddingBox: BackgroundOrigin
	get() = unsafe("padding-box")


public inline fun BackgroundOrigin.Companion.unsafe(value: String): BackgroundOrigin =
	CssValue.unsafe(value)


public inline fun BackgroundOrigin.Companion.variable(name: String): BackgroundOrigin.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundOrigin(value: BackgroundOrigin) {
	property(backgroundOrigin, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundOrigin: CssProperty<BackgroundOrigin>
	get() = CssProperty.unsafe("background-origin")
