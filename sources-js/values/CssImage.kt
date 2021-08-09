@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface CssImage :
	BackgroundImage,
	Cursor {

	public companion object;


	@JsName("0;0")
	public interface Variable : CssImage, CssVariable<CssImage>
}


public inline fun CssImage.Companion.unsafe(value: String): CssImage =
	CssValue.unsafe(value)


public inline fun CssImage.Companion.variable(name: String): CssImage.Variable =
	CssVariable.unsafe(name)
