@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextRendering : CssValue {

	public companion object {

		public val auth: TextRendering = raw("auto")
		public val optimizeSpeed: TextRendering = raw("optimizeSpeed")
		public val optimizeLegibility: TextRendering = raw("optimizeLegibility")
		public val geometricPrecision: TextRendering = raw("geometricPrecision")


		public fun raw(value: String): TextRendering =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), TextRendering
}


public inline fun CssDeclarationBlockBuilder.textRendering(value: TextRendering) {
	property(CssProperty.textRendering, value)
}


public inline fun CssDeclarationBlockBuilder.textRendering(value: GlobalValue) {
	property(CssProperty.textRendering, value)
}


public inline fun CssDeclarationBlockBuilder.textRendering(value: CustomCssProperty<out TextRendering>) {
	property(CssProperty.textRendering, value)
}


public inline val CssProperty.Companion.textRendering: CssProperty get() = CssProperty("text-rendering")
