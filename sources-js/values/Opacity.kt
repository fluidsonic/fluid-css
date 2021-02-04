@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Opacity : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun of(value: Double): Opacity =
			CssValue.unsafe(value)


		public inline fun of(value: Int): Opacity =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): Opacity =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Opacity, CssVariable<Opacity>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Opacity) {
	property(opacity, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Double) {
	property(opacity, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.opacity(value: Int) {
	property(opacity, value)
}


@Suppress("unused")
public inline val CssProperties.opacity: CssProperty<Opacity>
	get() = CssProperty.unsafe("opacity")
