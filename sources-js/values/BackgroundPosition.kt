@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-position` value. */
@JsName("0;0")
public external interface BackgroundPosition : CssValue {

	public companion object;


	/** A [BackgroundPosition] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundPosition, CssVariable<BackgroundPosition>
}


/** The CSS `bottom` background-position value. */
@CssDsl
public inline val BackgroundPosition.Companion.bottom: BackgroundPosition
	get() = unsafe("bottom")

/** The CSS `center` background-position value. */
@CssDsl
public inline val BackgroundPosition.Companion.center: BackgroundPosition
	get() = unsafe("center")

/** The CSS `left` background-position value. */
@CssDsl
public inline val BackgroundPosition.Companion.left: BackgroundPosition
	get() = unsafe("left")

/** The CSS `right` background-position value. */
@CssDsl
public inline val BackgroundPosition.Companion.right: BackgroundPosition
	get() = unsafe("right")

/** The CSS `top` background-position value. */
@CssDsl
public inline val BackgroundPosition.Companion.top: BackgroundPosition
	get() = unsafe("top")


/** Creates a [BackgroundPosition] from a horizontal position. */
public inline fun BackgroundPosition.Companion.of(
	x: BackgroundPositionX,
): BackgroundPosition =
	unsafe("$x 50%")


/** Creates a [BackgroundPosition] from a vertical position. */
public inline fun BackgroundPosition.Companion.of(
	y: BackgroundPositionY,
): BackgroundPosition =
	unsafe("50% $y")


/** Creates a [BackgroundPosition] from optional horizontal and vertical positions. */
public inline fun BackgroundPosition.Companion.of(
	x: BackgroundPositionX? = null,
	y: BackgroundPositionY? = null,
): BackgroundPosition =
	when {
		x != null && y != null -> unsafe("$x $y")
		x != null -> of(x = x)
		y != null -> of(y = y)
		else -> unsafe("50% 50%")
	}


/** Creates a [BackgroundPosition] from an unchecked string [value]. */
public inline fun BackgroundPosition.Companion.unsafe(value: String): BackgroundPosition =
	CssValue.unsafe(value)


/** Creates a [BackgroundPosition] backed by a CSS variable with the given [name]. */
public inline fun BackgroundPosition.Companion.variable(name: String): BackgroundPosition.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-position` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(value: BackgroundPosition) {
	property(backgroundPosition, value)
}


/** Sets the `background-position` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(x: BackgroundPositionX) {
	backgroundPosition(BackgroundPosition.of(x = x))
}


/** Sets the `background-position` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(y: BackgroundPositionY) {
	backgroundPosition(BackgroundPosition.of(y = y))
}


/** Sets the `background-position` CSS property with x/y values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(x: BackgroundPositionX, y: BackgroundPositionY) {
	backgroundPosition(BackgroundPosition.of(x = x, y = y))
}


/** The `background-position` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundPosition: CssProperty<BackgroundPosition>
	get() = CssProperty.unsafe("background-position")
