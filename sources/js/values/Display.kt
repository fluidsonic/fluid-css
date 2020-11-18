@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface DisplayOrGlobal : CssValue
public interface Display : DisplayOrGlobal {

	public companion object {

		public val none: Display = NoneValue.none

		public val block: Display = Display("block")
		public val contents: Display = Display("contents")
		public val flex: Display = Display("flex")
		public val flow: Display = Display("flow")
		public val flowRoot: Display = Display("flow-root")
		public val grid: Display = Display("grid")
		public val inline: Display = Display("inline")
		public val inlineBlock: Display = Display("inline-block")
		public val inlineFlex: Display = Display("inline-flex")
		public val inlineGrid: Display = Display("inline-grid")
		public val inlineListItem: Display = Display("inline-list-item")
		public val inlineTable: Display = Display("inline-table")
		public val listItem: Display = Display("list-item")
		public val runIn: Display = Display("run-in")
		public val table: Display = Display("table")
		public val tableCaption: Display = Display("table-caption")
		public val tableCell: Display = Display("table-cell")
		public val tableColumn: Display = Display("table-column")
		public val tableColumnGroup: Display = Display("table-column-group")
		public val tableFooterGroup: Display = Display("table-footer-group")
		public val tableHeaderGroup: Display = Display("table-header-group")
		public val tableRow: Display = Display("table-row")
		public val tableRowGroup: Display = Display("table-row-group")
	}
}


private class DisplayImpl(value: String) : CssValueBase(value), Display


@Suppress("FunctionName")
public fun Display(value: String): Display =
	DisplayImpl(value)


public inline fun CssDeclarationBlockBuilder.display(value: Display) {
	property(CssProperty.display, value)
}


public inline fun CssDeclarationBlockBuilder.display(value: DisplayOrGlobal) {
	property(CssProperty.display, value)
}


public inline fun CssDeclarationBlockBuilder.display(value: GlobalValue) {
	property(CssProperty.display, value)
}


public inline fun CssDeclarationBlockBuilder.display(value: CustomCssProperty<out DisplayOrGlobal>) {
	property(CssProperty.display, value)
}


public inline val CssProperty.Companion.display: CssProperty get() = CssProperty("display")
