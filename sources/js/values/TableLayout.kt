@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TableLayout : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: TableLayout = raw("auto")


		@CssDsl
		public val fixed: TableLayout = raw("fixed")


		public fun raw(value: String): TableLayout =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : TableLayout, CssVariable<TableLayout>
}


@CssDsl
public fun CssDeclarationBlockBuilder.tableLayout(value: TableLayout) {
	property(tableLayout, value)
}


@Suppress("unused")
public val CssProperties.tableLayout: CssProperty<TableLayout>
	get() = CssProperty("table-layout")
