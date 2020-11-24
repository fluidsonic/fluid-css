@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public external interface BackgroundRepeat : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val noRepeat: BackgroundRepeat
			get() = Axis.noRepeat

		@CssDsl
		public inline val repeat: BackgroundRepeat
			get() = Axis.repeat

		@CssDsl
		public inline val repeatX: BackgroundRepeat
			get() = unsafe("repeat-x")

		@CssDsl
		public inline val repeatY: BackgroundRepeat
			get() = unsafe("repeat-y")

		@CssDsl
		public inline val round: BackgroundRepeat
			get() = Axis.round

		@CssDsl
		public inline val space: BackgroundRepeat
			get() = Axis.space


		public inline fun unsafe(value: String): BackgroundRepeat =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(x: Axis, y: Axis): BackgroundRepeat =
			unsafe("$x $y")
	}


	public interface Axis : BackgroundRepeat {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val noRepeat: Axis
				get() = unsafe("no-repeat")

			@CssDsl
			public inline val repeat: Axis
				get() = unsafe("repeat")

			@CssDsl
			public inline val round: Axis
				get() = unsafe("round")

			@CssDsl
			public inline val space: Axis
				get() = unsafe("space")


			public inline fun unsafe(value: String): Axis =
				CssValue.unsafe(value)
		}
	}


	public interface Variable : BackgroundRepeat, CssVariable<BackgroundRepeat>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeat) {
	property(backgroundRepeat, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(x: BackgroundRepeat.Axis, y: BackgroundRepeat.Axis) {
	backgroundRepeat(BackgroundRepeat.with(x, y))
}


@Suppress("unused")
public inline val CssProperties.backgroundRepeat: CssProperty<BackgroundRepeat>
	get() = CssProperty.unsafe("background-repeat")
