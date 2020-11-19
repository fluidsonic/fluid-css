@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LineHeight : CssValue.NumberConstructable, Internal {

	public companion object {

		@CssDsl
		public val normal: LineHeight = raw("normal")


		public inline fun multiple(value: Number): LineHeight =
			raw(value.toString())


		public fun raw(value: String): LineHeight =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : LineHeight, CssVariable<LineHeight>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: LineHeight) {
	property(lineHeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.lineHeight(value: Number) {
	property(lineHeight, value)
}


@Suppress("unused")
public inline val CssProperties.lineHeight: CssProperty<LineHeight>
	get() = CssProperty("line-height")
