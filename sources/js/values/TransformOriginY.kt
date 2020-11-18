@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOriginY : CssValue {

	public companion object {

		public val center: TransformOriginY = TransformOriginY("center")
		public val bottom: TransformOriginY = TransformOriginY("bottom")
		public val top: TransformOriginY = TransformOriginY("top")
	}
}


private class TransformOriginYImpl(value: String) : CssValueImpl(value), TransformOriginY


@Suppress("FunctionName")
public fun TransformOriginY(value: String): TransformOriginY =
	TransformOriginYImpl(value)
