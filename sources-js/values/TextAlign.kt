@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextAlign : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TextAlign, CssVariable<TextAlign>
}


@CssDsl
public inline val TextAlign.Companion.center: TextAlign
	get() = unsafe("center")

@CssDsl
public inline val TextAlign.Companion.end: TextAlign
	get() = unsafe("end")

@CssDsl
public inline val TextAlign.Companion.justify: TextAlign
	get() = unsafe("justify")

@CssDsl
public inline val TextAlign.Companion.left: TextAlign
	get() = unsafe("left")

@CssDsl
public inline val TextAlign.Companion.matchParent: TextAlign
	get() = unsafe("match-parent")

@CssDsl
public inline val TextAlign.Companion.right: TextAlign
	get() = unsafe("right")

@CssDsl
public inline val TextAlign.Companion.start: TextAlign
	get() = unsafe("start")


public inline fun TextAlign.Companion.unsafe(value: String): TextAlign =
	CssValue.unsafe(value)


public inline fun TextAlign.Companion.variable(name: String): TextAlign.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textAlign(value: TextAlign) {
	property(textAlign, value)
}


@Suppress("unused")
public inline val CssProperties.textAlign: CssProperty<TextAlign>
	get() = CssProperty.unsafe("text-align")
