@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `background-position-x` value. */
@JsName("0;0")
public external interface BackgroundPositionX : CssValue {

	public companion object;


	/** A named `background-position-x` keyword value. */
	@JsName("0;0")
	public interface Named : BackgroundPositionX

	/** A [BackgroundPositionX] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundPositionX, CssVariable<BackgroundPositionX>
}


/** The CSS `center` background-position-x value. */
@CssDsl
public inline val BackgroundPositionX.Companion.center: BackgroundPositionX.Named
	get() = CssValue.unsafe("center")

/** The CSS `x-end` background-position-x value. */
@CssDsl
public inline val BackgroundPositionX.Companion.end: BackgroundPositionX.Named
	get() = CssValue.unsafe("x-end")

/** The CSS `left` background-position-x value. */
@CssDsl
public inline val BackgroundPositionX.Companion.left: BackgroundPositionX.Named
	get() = CssValue.unsafe("left")

/** The CSS `right` background-position-x value. */
@CssDsl
public inline val BackgroundPositionX.Companion.right: BackgroundPositionX.Named
	get() = CssValue.unsafe("right")

/** The CSS `x-start` background-position-x value. */
@CssDsl
public inline val BackgroundPositionX.Companion.start: BackgroundPositionX.Named
	get() = CssValue.unsafe("x-start")


/** Creates a [BackgroundPositionX] from an unchecked string [value]. */
public inline fun BackgroundPositionX.Companion.unsafe(value: String): BackgroundPositionX =
	CssValue.unsafe(value)


/** Creates a [BackgroundPositionX] backed by a CSS variable with the given [name]. */
public inline fun BackgroundPositionX.Companion.variable(name: String): BackgroundPositionX.Variable =
	CssVariable.unsafe(name)


/** Creates a [BackgroundPositionX] shorthand value. */
public inline fun BackgroundPositionX.Companion.with(align: BackgroundPositionX.Named, offset: LengthOrPercentage): BackgroundPositionX =
	unsafe("$align $offset")


/** Sets the `background-position-x` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(value: BackgroundPositionX) {
	property(backgroundPositionX, value)
}


/** Sets the `background-position-x` CSS property with alignment and offset. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(align: BackgroundPositionX.Named, offset: LengthOrPercentage) {
	backgroundPositionX(BackgroundPositionX.with(align = align, offset = offset))
}


/** The `background-position-x` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundPositionX: CssProperty<BackgroundPositionX>
	get() = CssProperty.unsafe("background-position-x")
