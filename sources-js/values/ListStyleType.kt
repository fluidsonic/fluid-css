@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface ListStyleType : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: ListStyleType
			get() = unsafe("none")


		@CssDsl
		public inline val circle: ListStyleType
			get() = unsafe("circle")

		@CssDsl
		public inline val decimal: ListStyleType
			get() = unsafe("decimal")

		@CssDsl
		public inline val disc: ListStyleType
			get() = unsafe("disc")

		@CssDsl
		public inline val square: ListStyleType
			get() = unsafe("square")


		public inline fun unsafe(value: String): ListStyleType =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : ListStyleType, CssVariable<ListStyleType>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleType) {
	property(listStyleType, value)
}


@Suppress("unused")
public inline val CssProperties.listStyleType: CssProperty<ListStyleType>
	get() = CssProperty.unsafe("list-style-type")
