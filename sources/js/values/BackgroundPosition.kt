@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundPosition : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val bottom: BackgroundPosition
			get() = unsafe("bottom")

		@CssDsl
		public inline val center: BackgroundPosition
			get() = unsafe("center")

		@CssDsl
		public inline val left: BackgroundPosition
			get() = unsafe("left")

		@CssDsl
		public inline val right: BackgroundPosition
			get() = unsafe("right")

		@CssDsl
		public inline val top: BackgroundPosition
			get() = unsafe("top")


		public inline fun of(
			x: BackgroundPositionX,
		): BackgroundPosition =
			unsafe("$x 50%")


		public inline fun of(
			y: BackgroundPositionY,
		): BackgroundPosition =
			unsafe("50% $y")


		@Suppress("DEPRECATION")
		public inline fun of(
			x: BackgroundPositionX? = null,
			y: BackgroundPositionY? = null,
		): BackgroundPosition =
			when {
				x != null && y != null -> unsafe("$x $y")
				x != null -> of(x = x)
				y != null -> of(y = y)
				else -> unsafe("50% 50%")
			}


		public inline fun unsafe(value: String): BackgroundPosition =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundPosition, CssVariable<BackgroundPosition>
}


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
