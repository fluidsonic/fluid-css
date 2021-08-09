@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface OutlineWidth : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : OutlineWidth, CssVariable<OutlineWidth>
}


@CssDsl
public inline val OutlineWidth.Companion.medium: OutlineWidth
	get() = unsafe("medium")

@CssDsl
public inline val OutlineWidth.Companion.thin: OutlineWidth
	get() = unsafe("thin")

@CssDsl
public inline val OutlineWidth.Companion.thick: OutlineWidth
	get() = unsafe("thick")


public inline fun OutlineWidth.Companion.unsafe(value: String): OutlineWidth =
	CssValue.unsafe(value)


public inline fun OutlineWidth.Companion.variable(name: String): OutlineWidth.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineWidth(all: OutlineWidth) {
	property(outlineWidth, all)
}

@Suppress("unused")
public inline val CssProperties.outlineWidth: CssProperty<OutlineWidth>
	get() = CssProperty.unsafe("outline-width")
