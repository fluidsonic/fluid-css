@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextRendering : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextRendering, CssVariable<TextRendering>
}


@CssDsl
public inline val TextRendering.Companion.auth: TextRendering
	get() = unsafe("auto")

@CssDsl
public inline val TextRendering.Companion.optimizeSpeed: TextRendering
	get() = unsafe("optimizeSpeed")

@CssDsl
public inline val TextRendering.Companion.optimizeLegibility: TextRendering
	get() = unsafe("optimizeLegibility")

@CssDsl
public inline val TextRendering.Companion.geometricPrecision: TextRendering
	get() = unsafe("geometricPrecision")


public inline fun TextRendering.Companion.unsafe(value: String): TextRendering =
	CssValue.unsafe(value)


public inline fun TextRendering.Companion.variable(name: String): TextRendering.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textRendering(value: TextRendering) {
	property(textRendering, value)
}


@Suppress("unused")
public inline val CssProperties.textRendering: CssProperty<TextRendering>
	get() = CssProperty.unsafe("text-rendering")
