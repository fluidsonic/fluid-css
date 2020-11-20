@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BoxOffset : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: BoxOffset = raw("auto")


		public fun raw(value: String): BoxOffset =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BoxOffset, CssVariable<BoxOffset>
}


@CssDsl
public fun CssDeclarationBlockBuilder.bottom(value: BoxOffset) {
	property(bottom, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.left(value: BoxOffset) {
	property(left, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.right(value: BoxOffset) {
	property(right, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.top(value: BoxOffset) {
	property(top, value)
}


@Suppress("unused")
public val CssProperties.bottom: CssProperty<BoxOffset>
	get() = CssProperty("bottom")


@Suppress("unused")
public val CssProperties.left: CssProperty<BoxOffset>
	get() = CssProperty("left")


@Suppress("unused")
public val CssProperties.right: CssProperty<BoxOffset>
	get() = CssProperty("right")


@Suppress("unused")
public val CssProperties.top: CssProperty<BoxOffset>
	get() = CssProperty("top")
