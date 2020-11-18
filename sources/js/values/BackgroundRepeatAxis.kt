@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundRepeatAxis : CssValue {

	public companion object {

		public val noRepeat: BackgroundRepeatAxis = BackgroundRepeatAxis("no-repeat")
		public val repeat: BackgroundRepeatAxis = BackgroundRepeatAxis("repeat")
		public val round: BackgroundRepeatAxis = BackgroundRepeatAxis("round")
		public val space: BackgroundRepeatAxis = BackgroundRepeatAxis("space")
	}
}


private class BackgroundRepeatAxisImpl(value: String) : CssValueBase(value), BackgroundRepeatAxis


@Suppress("FunctionName")
public fun BackgroundRepeatAxis(value: String): BackgroundRepeatAxis =
	BackgroundRepeatAxisImpl(value)
