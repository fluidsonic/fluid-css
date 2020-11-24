@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BackgroundPositionX : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val center: Named
			get() = CssValue.unsafe("center")

		@CssDsl
		public inline val end: Named
			get() = CssValue.unsafe("x-end")

		@CssDsl
		public inline val left: Named
			get() = CssValue.unsafe("left")

		@CssDsl
		public inline val right: Named
			get() = CssValue.unsafe("right")

		@CssDsl
		public inline val start: Named
			get() = CssValue.unsafe("x-start")


		public inline fun unsafe(value: String): BackgroundPositionX =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(align: Named, offset: LengthOrPercentage): BackgroundPositionX =
			unsafe("$align $offset")
	}


	public interface Named : BackgroundPositionX
	public interface Variable : BackgroundPositionX, CssVariable<BackgroundPositionX>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(value: BackgroundPositionX) {
	property(backgroundPositionX, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundPositionX(align: BackgroundPositionX.Named, offset: LengthOrPercentage) {
	backgroundPositionX(BackgroundPositionX.with(align = align, offset = offset))
}


@Suppress("unused")
public inline val CssProperties.backgroundPositionX: CssProperty<BackgroundPositionX>
	get() = CssProperty.unsafe("background-position-x")
