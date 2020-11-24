@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BackgroundPositionY : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val bottom: Named
			get() = CssValue.unsafe("bottom")

		@CssDsl
		public inline val center: Named
			get() = CssValue.unsafe("center")

		@CssDsl
		public inline val end: Named
			get() = CssValue.unsafe("y-end")

		@CssDsl
		public inline val start: Named
			get() = CssValue.unsafe("y-start")

		@CssDsl
		public inline val top: Named
			get() = CssValue.unsafe("top")


		public inline fun unsafe(value: String): BackgroundPositionY =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(align: Named, offset: LengthOrPercentage): BackgroundPositionY =
			unsafe("$align $offset")
	}


	public interface Named : BackgroundPositionY
	public interface Variable : BackgroundPositionY, CssVariable<BackgroundPositionY>
}


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
