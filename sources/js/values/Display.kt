@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Display : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Display = raw("none")


		@CssDsl
		public val block: Display = raw("block")

		@CssDsl
		public val contents: Display = raw("contents")

		@CssDsl
		public val flex: Display = raw("flex")

		@CssDsl
		public val flow: Display = raw("flow")

		@CssDsl
		public val flowRoot: Display = raw("flow-root")

		@CssDsl
		public val grid: Display = raw("grid")

		@CssDsl
		public val inline: Display = raw("inline")

		@CssDsl
		public val inlineBlock: Display = raw("inline-block")

		@CssDsl
		public val inlineFlex: Display = raw("inline-flex")

		@CssDsl
		public val inlineGrid: Display = raw("inline-grid")

		@CssDsl
		public val inlineListItem: Display = raw("inline-list-item")

		@CssDsl
		public val inlineTable: Display = raw("inline-table")

		@CssDsl
		public val listItem: Display = raw("list-item")

		@CssDsl
		public val runIn: Display = raw("run-in")

		@CssDsl
		public val table: Display = raw("table")

		@CssDsl
		public val tableCaption: Display = raw("table-caption")

		@CssDsl
		public val tableCell: Display = raw("table-cell")

		@CssDsl
		public val tableColumn: Display = raw("table-column")

		@CssDsl
		public val tableColumnGroup: Display = raw("table-column-group")

		@CssDsl
		public val tableFooterGroup: Display = raw("table-footer-group")

		@CssDsl
		public val tableHeaderGroup: Display = raw("table-header-group")

		@CssDsl
		public val tableRow: Display = raw("table-row")

		@CssDsl
		public val tableRowGroup: Display = raw("table-row-group")


		public fun raw(value: String): Display =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Display, CssVariable<Display>
}


@CssDsl
public fun CssDeclarationBlockBuilder.display(value: Display) {
	property(display, value)
}


@Suppress("unused")
public val CssProperties.display: CssProperty<Display>
	get() = CssProperty("display")
