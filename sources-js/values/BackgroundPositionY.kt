@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BackgroundPositionY : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Named : BackgroundPositionY

	@JsName("0;0")
	public interface Variable : BackgroundPositionY, CssVariable<BackgroundPositionY>
}


@CssDsl
public inline val BackgroundPositionY.Companion.bottom: BackgroundPositionY.Named
	get() = CssValue.unsafe("bottom")

@CssDsl
public inline val BackgroundPositionY.Companion.center: BackgroundPositionY.Named
	get() = CssValue.unsafe("center")

@CssDsl
public inline val BackgroundPositionY.Companion.end: BackgroundPositionY.Named
	get() = CssValue.unsafe("y-end")

@CssDsl
public inline val BackgroundPositionY.Companion.start: BackgroundPositionY.Named
	get() = CssValue.unsafe("y-start")

@CssDsl
public inline val BackgroundPositionY.Companion.top: BackgroundPositionY.Named
	get() = CssValue.unsafe("top")


public inline fun BackgroundPositionY.Companion.unsafe(value: String): BackgroundPositionY =
	CssValue.unsafe(value)


public inline fun BackgroundPositionY.Companion.variable(name: String): BackgroundPositionY.Variable =
	CssVariable.unsafe(name)


public inline fun BackgroundPositionY.Companion.with(align: BackgroundPositionY.Named, offset: LengthOrPercentage): BackgroundPositionY =
	unsafe("$align $offset")


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionY(value: BackgroundPositionY) {
	property(backgroundPositionY, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionY(align: BackgroundPositionY.Named, offset: LengthOrPercentage) {
	backgroundPositionY(BackgroundPositionY.with(align = align, offset = offset))
}


@Suppress("unused")
public inline val CssProperties.backgroundPositionY: CssProperty<BackgroundPositionY>
	get() = CssProperty.unsafe("background-position-y")
