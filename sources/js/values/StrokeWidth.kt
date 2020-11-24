@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface StrokeWidth : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun unsafe(value: String): StrokeWidth =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : StrokeWidth, CssVariable<StrokeWidth>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.strokeWidth(value: StrokeWidth) {
	property(strokeWidth, value)
}


@Suppress("unused")
public inline val CssProperties.strokeWidth: CssProperty<StrokeWidth>
	get() = CssProperty.unsafe("stroke-width")
