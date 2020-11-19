@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextRendering : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auth: TextRendering = raw("auto")

		@CssDsl
		public val optimizeSpeed: TextRendering = raw("optimizeSpeed")

		@CssDsl
		public val optimizeLegibility: TextRendering = raw("optimizeLegibility")

		@CssDsl
		public val geometricPrecision: TextRendering = raw("geometricPrecision")


		public fun raw(value: String): TextRendering =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TextRendering, CssVariable<TextRendering>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textRendering(value: TextRendering) {
	property(textRendering, value)
}


@Suppress("unused")
public inline val CssProperties.textRendering: CssProperty<TextRendering>
	get() = CssProperty("text-rendering")
