@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundRepeatAxis : BackgroundRepeat {

	public companion object {

		@CssDsl
		public val noRepeat: BackgroundRepeatAxis = raw("no-repeat")

		@CssDsl
		public val repeat: BackgroundRepeatAxis = raw("repeat")

		@CssDsl
		public val round: BackgroundRepeatAxis = raw("round")

		@CssDsl
		public val space: BackgroundRepeatAxis = raw("space")


		public fun raw(value: String): BackgroundRepeatAxis =
			GenericValue(value)
	}
}
