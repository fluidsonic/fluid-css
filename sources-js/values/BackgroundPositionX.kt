@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BackgroundPositionX : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Named : BackgroundPositionX

	@JsName("0;0")
	public interface Variable : BackgroundPositionX, CssVariable<BackgroundPositionX>
}


@CssDsl
public inline val BackgroundPositionX.Companion.center: BackgroundPositionX.Named
	get() = CssValue.unsafe("center")

@CssDsl
public inline val BackgroundPositionX.Companion.end: BackgroundPositionX.Named
	get() = CssValue.unsafe("x-end")

@CssDsl
public inline val BackgroundPositionX.Companion.left: BackgroundPositionX.Named
	get() = CssValue.unsafe("left")

@CssDsl
public inline val BackgroundPositionX.Companion.right: BackgroundPositionX.Named
	get() = CssValue.unsafe("right")

@CssDsl
public inline val BackgroundPositionX.Companion.start: BackgroundPositionX.Named
	get() = CssValue.unsafe("x-start")


public inline fun BackgroundPositionX.Companion.unsafe(value: String): BackgroundPositionX =
	CssValue.unsafe(value)


public inline fun BackgroundPositionX.Companion.variable(name: String): BackgroundPositionX.Variable =
	CssVariable.unsafe(name)


public inline fun BackgroundPositionX.Companion.with(align: BackgroundPositionX.Named, offset: LengthOrPercentage): BackgroundPositionX =
	unsafe("$align $offset")


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(value: BackgroundPositionX) {
	property(backgroundPositionX, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(align: BackgroundPositionX.Named, offset: LengthOrPercentage) {
	backgroundPositionX(BackgroundPositionX.with(align = align, offset = offset))
}


@Suppress("unused")
public inline val CssProperties.backgroundPositionX: CssProperty<BackgroundPositionX>
	get() = CssProperty.unsafe("background-position-x")
