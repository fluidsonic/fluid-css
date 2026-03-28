@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `background-position-y` value. */
@JsName("0;0")
public external interface BackgroundPositionY : CssValue {

	public companion object;


	/** A named `background-position-y` keyword value. */
	@JsName("0;0")
	public interface Named : BackgroundPositionY

	/** A [BackgroundPositionY] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundPositionY, CssVariable<BackgroundPositionY>
}


/** The CSS `bottom` background-position-y value. */
@CssDsl
public inline val BackgroundPositionY.Companion.bottom: BackgroundPositionY.Named
	get() = CssValue.unsafe("bottom")

/** The CSS `center` background-position-y value. */
@CssDsl
public inline val BackgroundPositionY.Companion.center: BackgroundPositionY.Named
	get() = CssValue.unsafe("center")

/** The CSS `y-end` background-position-y value. */
@CssDsl
public inline val BackgroundPositionY.Companion.end: BackgroundPositionY.Named
	get() = CssValue.unsafe("y-end")

/** The CSS `y-start` background-position-y value. */
@CssDsl
public inline val BackgroundPositionY.Companion.start: BackgroundPositionY.Named
	get() = CssValue.unsafe("y-start")

/** The CSS `top` background-position-y value. */
@CssDsl
public inline val BackgroundPositionY.Companion.top: BackgroundPositionY.Named
	get() = CssValue.unsafe("top")


/** Creates a [BackgroundPositionY] from an unchecked string [value]. */
public inline fun BackgroundPositionY.Companion.unsafe(value: String): BackgroundPositionY =
	CssValue.unsafe(value)


/** Creates a [BackgroundPositionY] backed by a CSS variable with the given [name]. */
public inline fun BackgroundPositionY.Companion.variable(name: String): BackgroundPositionY.Variable =
	CssVariable.unsafe(name)


/** Creates a [BackgroundPositionY] shorthand value. */
public inline fun BackgroundPositionY.Companion.with(align: BackgroundPositionY.Named, offset: LengthOrPercentage): BackgroundPositionY =
	unsafe("$align $offset")


/** Sets the `background-position-y` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionY(value: BackgroundPositionY) {
	property(backgroundPositionY, value)
}


/** Sets the `background-position-y` CSS property with alignment and offset. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionY(align: BackgroundPositionY.Named, offset: LengthOrPercentage) {
	backgroundPositionY(BackgroundPositionY.with(align = align, offset = offset))
}


/** The `background-position-y` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundPositionY: CssProperty<BackgroundPositionY>
	get() = CssProperty.unsafe("background-position-y")
