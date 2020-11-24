@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FlexGrow : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun of(value: Double): FlexGrow =
			CssValue.unsafe(value)


		public inline fun of(value: Int): FlexGrow =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): FlexGrow =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FlexGrow, CssVariable<FlexGrow>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: FlexGrow) {
	property(flexGrow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Double) {
	property(flexGrow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.flexGrow(value: Int) {
	property(flexGrow, value)
}


@Suppress("unused")
public inline val CssProperties.flexGrow: CssProperty<FlexGrow>
	get() = CssProperty.unsafe("flex-grow")
