@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOriginX : CssValue {

	public companion object {

		public val center: TransformOriginX = TransformOriginX("center")
		public val left: TransformOriginX = TransformOriginX("left")
		public val right: TransformOriginX = TransformOriginX("right")
	}
}


private class TransformOriginXImpl(value: String) : CssValueBase(value), TransformOriginX


@Suppress("FunctionName")
public fun TransformOriginX(value: String): TransformOriginX =
	TransformOriginXImpl(value)
