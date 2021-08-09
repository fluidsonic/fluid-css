@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


@JsName("0;0")
public external interface Content : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Content, CssVariable<Content>
}


@CssDsl
public inline fun Content.Companion.counter(name: String): Content =
	unsafe("counter($name)")


public inline fun Content.Companion.string(value: String): Content =
	unsafe("'$value'") // FIXME escaping


public inline fun Content.Companion.unsafe(value: String): Content =
	CssValue.unsafe(value)


public inline fun Content.Companion.variable(name: String): Content.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: Content) {
	property(content, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: String = "") {
	content(Content.string(value))
}


@Suppress("unused")
public inline val CssProperties.content: CssProperty<Content>
	get() = CssProperty.unsafe("content")
