package io.fluidsonic.css


public external interface ColorStop {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun of(color: Color, position: LengthOrPercentage?): ColorStop =
			unsafe("$color $position")


		public inline fun unsafe(value: String): ColorStop =
			CssValue.unsafe(value)
	}
}
