@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TableLayout : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: TableLayout
			get() = unsafe("auto")


		@CssDsl
		public inline val fixed: TableLayout
			get() = unsafe("fixed")


		public inline fun unsafe(value: String): TableLayout =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : TableLayout, CssVariable<TableLayout>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.tableLayout(value: TableLayout) {
	property(tableLayout, value)
}


@Suppress("unused")
public inline val CssProperties.tableLayout: CssProperty<TableLayout>
	get() = CssProperty.unsafe("table-layout")
