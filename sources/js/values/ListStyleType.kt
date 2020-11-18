@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface ListStyleTypeOrGlobal : CssValue
public interface ListStyleType : ListStyleTypeOrGlobal {

	public companion object {

		public val none: ListStyleType = NoneValue.none

		public val circle: ListStyleType = ListStyleType("circle")
		public val decimal: ListStyleType = ListStyleType("decimal")
		public val disc: ListStyleType = ListStyleType("disc")
		public val square: ListStyleType = ListStyleType("square")
	}
}


private class ListStyleTypeImpl(value: String) : CssValueImpl(value), ListStyleType


@Suppress("FunctionName")
public fun ListStyleType(value: String): ListStyleType =
	ListStyleTypeImpl(value)


public inline fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleType) {
	property(CssProperty.listStyleType, value)
}


public inline fun CssDeclarationBlockBuilder.listStyleType(value: ListStyleTypeOrGlobal) {
	property(CssProperty.listStyleType, value)
}


public inline fun CssDeclarationBlockBuilder.listStyleType(value: GlobalValue) {
	property(CssProperty.listStyleType, value)
}


public inline fun CssDeclarationBlockBuilder.listStyleType(value: CustomCssProperty<out ListStyleTypeOrGlobal>) {
	property(CssProperty.listStyleType, value)
}


public inline val CssProperty.Companion.listStyleType: CssProperty get() = CssProperty("list-style-type")
