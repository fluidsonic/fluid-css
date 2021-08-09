@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundClip : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BackgroundClip, CssVariable<BackgroundClip>
}


@CssDsl
public inline val BackgroundClip.Companion.borderBox: BackgroundClip
	get() = unsafe("border-box")

@CssDsl
public inline val BackgroundClip.Companion.contentBox: BackgroundClip
	get() = unsafe("content-box")

@CssDsl
public inline val BackgroundClip.Companion.paddingBox: BackgroundClip
	get() = unsafe("padding-box")


public inline fun BackgroundClip.Companion.unsafe(value: String): BackgroundClip =
	CssValue.unsafe(value)


public inline fun BackgroundClip.Companion.variable(name: String): BackgroundClip.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClip) {
	property(backgroundClip, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundClip: CssProperty<BackgroundClip>
	get() = CssProperty.unsafe("background-clip")
