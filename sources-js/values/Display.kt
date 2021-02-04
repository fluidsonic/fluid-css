@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Display : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: Display
			get() = unsafe("none")


		@CssDsl
		public inline val block: Display
			get() = unsafe("block")

		@CssDsl
		public inline val contents: Display
			get() = unsafe("contents")

		@CssDsl
		public inline val flex: Display
			get() = unsafe("flex")

		@CssDsl
		public inline val flow: Display
			get() = unsafe("flow")

		@CssDsl
		public inline val flowRoot: Display
			get() = unsafe("flow-root")

		@CssDsl
		public inline val grid: Display
			get() = unsafe("grid")

		@CssDsl
		public inline val inline: Display
			get() = unsafe("inline")

		@CssDsl
		public inline val inlineBlock: Display
			get() = unsafe("inline-block")

		@CssDsl
		public inline val inlineFlex: Display
			get() = unsafe("inline-flex")

		@CssDsl
		public inline val inlineGrid: Display
			get() = unsafe("inline-grid")

		@CssDsl
		public inline val inlineListItem: Display
			get() = unsafe("inline-list-item")

		@CssDsl
		public inline val inlineTable: Display
			get() = unsafe("inline-table")

		@CssDsl
		public inline val listItem: Display
			get() = unsafe("list-item")

		@CssDsl
		public inline val runIn: Display
			get() = unsafe("run-in")

		@CssDsl
		public inline val table: Display
			get() = unsafe("table")

		@CssDsl
		public inline val tableCaption: Display
			get() = unsafe("table-caption")

		@CssDsl
		public inline val tableCell: Display
			get() = unsafe("table-cell")

		@CssDsl
		public inline val tableColumn: Display
			get() = unsafe("table-column")

		@CssDsl
		public inline val tableColumnGroup: Display
			get() = unsafe("table-column-group")

		@CssDsl
		public inline val tableFooterGroup: Display
			get() = unsafe("table-footer-group")

		@CssDsl
		public inline val tableHeaderGroup: Display
			get() = unsafe("table-header-group")

		@CssDsl
		public inline val tableRow: Display
			get() = unsafe("table-row")

		@CssDsl
		public inline val tableRowGroup: Display
			get() = unsafe("table-row-group")


		public inline fun unsafe(value: String): Display =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Display, CssVariable<Display>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.display(value: Display) {
	property(display, value)
}


@Suppress("unused")
public inline val CssProperties.display: CssProperty<Display>
	get() = CssProperty.unsafe("display")
