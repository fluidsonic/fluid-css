@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LineHeight : CssValue.NumberConstructable, Internal {

	public companion object {

		@CssDsl
		public val normal: LineHeight = raw("normal")


		public fun multiple(value: Number): LineHeight =
			raw(value.toString())


		public fun raw(value: String): LineHeight =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : LineHeight, CssVariable<LineHeight>
}


@CssDsl
public fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(lineHeight, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.lineHeight(value: Number) {
	property(lineHeight, value)
}


@Suppress("unused")
public val CssProperties.lineHeight: CssProperty<LineHeight>
	get() = CssProperty("line-height")
