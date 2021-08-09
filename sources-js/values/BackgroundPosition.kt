@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundPosition : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BackgroundPosition, CssVariable<BackgroundPosition>
}


@CssDsl
public inline val BackgroundPosition.Companion.bottom: BackgroundPosition
	get() = unsafe("bottom")

@CssDsl
public inline val BackgroundPosition.Companion.center: BackgroundPosition
	get() = unsafe("center")

@CssDsl
public inline val BackgroundPosition.Companion.left: BackgroundPosition
	get() = unsafe("left")

@CssDsl
public inline val BackgroundPosition.Companion.right: BackgroundPosition
	get() = unsafe("right")

@CssDsl
public inline val BackgroundPosition.Companion.top: BackgroundPosition
	get() = unsafe("top")


public inline fun BackgroundPosition.Companion.of(
	x: BackgroundPositionX,
): BackgroundPosition =
	unsafe("$x 50%")


public inline fun BackgroundPosition.Companion.of(
	y: BackgroundPositionY,
): BackgroundPosition =
	unsafe("50% $y")


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


public inline fun BackgroundPosition.Companion.unsafe(value: String): BackgroundPosition =
	CssValue.unsafe(value)


public inline fun BackgroundPosition.Companion.variable(name: String): BackgroundPosition.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(value: BackgroundPosition) {
	property(backgroundPosition, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(x: BackgroundPositionX) {
	backgroundPosition(BackgroundPosition.of(x = x))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(y: BackgroundPositionY) {
	backgroundPosition(BackgroundPosition.of(y = y))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPosition(x: BackgroundPositionX, y: BackgroundPositionY) {
	backgroundPosition(BackgroundPosition.of(x = x, y = y))
}


@Suppress("unused")
public inline val CssProperties.backgroundPosition: CssProperty<BackgroundPosition>
	get() = CssProperty.unsafe("background-position")
