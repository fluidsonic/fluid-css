@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface CaretColor : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : CaretColor, CssVariable<CaretColor>
}


@CssDsl
public inline val CaretColor.Companion.auto: CaretColor
	get() = unsafe("auto")


public inline fun CaretColor.Companion.unsafe(value: String): CaretColor =
	CssValue.unsafe(value)


public inline fun CaretColor.Companion.variable(name: String): CaretColor.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.caretColor(all: CaretColor) {
	property(caretColor, all)
}


@Suppress("unused")
public inline val CssProperties.caretColor: CssProperty<CaretColor>
	get() = CssProperty.unsafe("caret-color")
