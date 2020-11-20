@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface ListStyleType : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: ListStyleType = raw("none")


		@CssDsl
		public val circle: ListStyleType = raw("circle")

		@CssDsl
		public val decimal: ListStyleType = raw("decimal")

		@CssDsl
		public val disc: ListStyleType = raw("disc")

		@CssDsl
		public val square: ListStyleType = raw("square")


		public fun raw(value: String): ListStyleType =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : ListStyleType, CssVariable<ListStyleType>
}


@CssDsl
public fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleType) {
	property(listStyleType, value)
}


@Suppress("unused")
public val CssProperties.listStyleType: CssProperty<ListStyleType>
	get() = CssProperty("list-style-type")
