@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundPositionY : CssValue, Internal {

	public companion object {

		@CssDsl
		public val bottom: Align = GenericValue("bottom")

		@CssDsl
		public val center: Align = GenericValue("center")

		@CssDsl
		public val end: Align = GenericValue("y-end")

		@CssDsl
		public val start: Align = GenericValue("y-start")

		@CssDsl
		public val top: Align = GenericValue("top")


		public fun raw(value: String): BackgroundPositionY =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(align: Align, offset: LengthOrPercentage): BackgroundPositionY =
			raw("$align $offset")
	}


	public interface Align : BackgroundPositionY


	public interface Variable : BackgroundPositionY, CssVariable<BackgroundPositionY>
}


@CssDsl
public fun CssDeclarationBlockBuilder.backgroundPositionY(value: BackgroundPositionY) {
	property(backgroundPositionY, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.backgroundPositionY(align: BackgroundPositionY.Align, offset: LengthOrPercentage) {
	backgroundPositionY(BackgroundPositionY.with(align = align, offset = offset))
}


@Suppress("unused")
public val CssProperties.backgroundPositionY: CssProperty<BackgroundPositionY>
	get() = CssProperty("background-position-y")
