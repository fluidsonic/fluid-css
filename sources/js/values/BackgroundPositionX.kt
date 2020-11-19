@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundPositionX : CssValue, Internal {

	public companion object {

		@CssDsl
		public val center: Align = GenericValue("center")

		@CssDsl
		public val end: Align = GenericValue("x-end")

		@CssDsl
		public val left: Align = GenericValue("left")

		@CssDsl
		public val right: Align = GenericValue("right")

		@CssDsl
		public val start: Align = GenericValue("x-start")


		public fun raw(value: String): BackgroundPositionX =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(align: Align, offset: LengthOrPercentage): BackgroundPositionX =
			raw("$align $offset")
	}


	public interface Align : BackgroundPositionX


	public interface Variable : BackgroundPositionX, CssVariable<BackgroundPositionX>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(value: BackgroundPositionX) {
	property(backgroundPositionX, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(align: BackgroundPositionX.Align, offset: LengthOrPercentage) {
	backgroundPositionX(BackgroundPositionX.with(align = align, offset = offset))
}


@Suppress("unused")
public inline val CssProperties.backgroundPositionX: CssProperty<BackgroundPositionX>
	get() = CssProperty("background-position-x")
