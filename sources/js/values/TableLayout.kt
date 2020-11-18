@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TableLayout : CssValue {

	public companion object {

		public val auto: TableLayout = AutoValue.auto

		public val fixed: TableLayout = TableLayout("fixed")
	}
}


private class TableLayoutImpl(value: String) : CssValueImpl(value), TableLayout


@Suppress("FunctionName")
public fun TableLayout(value: String): TableLayout =
	TableLayoutImpl(value)


public inline fun CssDeclarationBlockBuilder.tableLayout(value: TableLayout) {
	property(CssProperty.tableLayout, value)
}


public inline fun CssDeclarationBlockBuilder.tableLayout(value: GlobalValue) {
	property(CssProperty.tableLayout, value)
}


public inline fun CssDeclarationBlockBuilder.tableLayout(value: CustomCssProperty<out TableLayout>) {
	property(CssProperty.tableLayout, value)
}


public inline val CssProperty.Companion.tableLayout: CssProperty get() = CssProperty("table-layout")
