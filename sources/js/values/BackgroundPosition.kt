@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundPosition : CssValue, Internal {

	public companion object {

		@CssDsl
		public val bottom: BackgroundPosition = raw("bottom")

		@CssDsl
		public val center: BackgroundPosition = raw("center")

		@CssDsl
		public val left: BackgroundPosition = raw("left")

		@CssDsl
		public val right: BackgroundPosition = raw("right")

		@CssDsl
		public val top: BackgroundPosition = raw("top")


		public inline fun of(
			x: BackgroundPositionX,
		): BackgroundPosition =
			raw("$x 50%")


		public inline fun of(
			y: BackgroundPositionY,
		): BackgroundPosition =
			raw("50% $y")


		public inline fun of(
			x: BackgroundPositionX? = null,
			y: BackgroundPositionY? = null,
		): BackgroundPosition =
			raw("${x?.toString() ?: "50%"} ${y?.toString() ?: "50%"}")


		public fun raw(value: String): BackgroundPosition =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
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
	get() = CssProperty("background-position")
