@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TextRendering : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auth: TextRendering
			get() = unsafe("auto")

		@CssDsl
		public inline val optimizeSpeed: TextRendering
			get() = unsafe("optimizeSpeed")

		@CssDsl
		public inline val optimizeLegibility: TextRendering
			get() = unsafe("optimizeLegibility")

		@CssDsl
		public inline val geometricPrecision: TextRendering
			get() = unsafe("geometricPrecision")


		public inline fun unsafe(value: String): TextRendering =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TextRendering, CssVariable<TextRendering>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textRendering(value: TextRendering) {
	property(textRendering, value)
}


@Suppress("unused")
public inline val CssProperties.textRendering: CssProperty<TextRendering>
	get() = CssProperty.unsafe("text-rendering")
