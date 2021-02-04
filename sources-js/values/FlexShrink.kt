@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FlexShrink : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun of(value: Double): FlexShrink =
			CssValue.unsafe(value)


		public inline fun of(value: Int): FlexShrink =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): FlexShrink =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FlexShrink, CssVariable<FlexShrink>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: FlexShrink) {
	property(flexShrink, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Double) {
	property(flexShrink, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexShrink(value: Int) {
	property(flexShrink, value)
}


@Suppress("unused")
public inline val CssProperties.flexShrink: CssProperty<FlexShrink>
	get() = CssProperty.unsafe("flex-shrink")
