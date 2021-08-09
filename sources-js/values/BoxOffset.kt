@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BoxOffset : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BoxOffset, CssVariable<BoxOffset>
}


@CssDsl
public inline val BoxOffset.Companion.auto: BoxOffset
	get() = unsafe("auto")


public inline fun BoxOffset.Companion.unsafe(value: String): BoxOffset =
	CssValue.unsafe(value)


public inline fun BoxOffset.Companion.variable(name: String): BoxOffset.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.bottom(value: BoxOffset) {
	property(bottom, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.left(value: BoxOffset) {
	property(left, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.right(value: BoxOffset) {
	property(right, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.top(value: BoxOffset) {
	property(top, value)
}


@Suppress("unused")
public inline val CssProperties.bottom: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("bottom")


@Suppress("unused")
public inline val CssProperties.left: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("left")


@Suppress("unused")
public inline val CssProperties.right: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("right")


@Suppress("unused")
public inline val CssProperties.top: CssProperty<BoxOffset>
	get() = CssProperty.unsafe("top")
