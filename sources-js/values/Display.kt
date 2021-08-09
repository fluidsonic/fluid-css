@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Display : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Display, CssVariable<Display>
}


@CssDsl
public inline val Display.Companion.none: Display
	get() = unsafe("none")


@CssDsl
public inline val Display.Companion.block: Display
	get() = unsafe("block")

@CssDsl
public inline val Display.Companion.contents: Display
	get() = unsafe("contents")

@CssDsl
public inline val Display.Companion.flex: Display
	get() = unsafe("flex")

@CssDsl
public inline val Display.Companion.flow: Display
	get() = unsafe("flow")

@CssDsl
public inline val Display.Companion.flowRoot: Display
	get() = unsafe("flow-root")

@CssDsl
public inline val Display.Companion.grid: Display
	get() = unsafe("grid")

@CssDsl
public inline val Display.Companion.inline: Display
	get() = unsafe("inline")

@CssDsl
public inline val Display.Companion.inlineBlock: Display
	get() = unsafe("inline-block")

@CssDsl
public inline val Display.Companion.inlineFlex: Display
	get() = unsafe("inline-flex")

@CssDsl
public inline val Display.Companion.inlineGrid: Display
	get() = unsafe("inline-grid")

@CssDsl
public inline val Display.Companion.inlineListItem: Display
	get() = unsafe("inline-list-item")

@CssDsl
public inline val Display.Companion.inlineTable: Display
	get() = unsafe("inline-table")

@CssDsl
public inline val Display.Companion.listItem: Display
	get() = unsafe("list-item")

@CssDsl
public inline val Display.Companion.runIn: Display
	get() = unsafe("run-in")

@CssDsl
public inline val Display.Companion.table: Display
	get() = unsafe("table")

@CssDsl
public inline val Display.Companion.tableCaption: Display
	get() = unsafe("table-caption")

@CssDsl
public inline val Display.Companion.tableCell: Display
	get() = unsafe("table-cell")

@CssDsl
public inline val Display.Companion.tableColumn: Display
	get() = unsafe("table-column")

@CssDsl
public inline val Display.Companion.tableColumnGroup: Display
	get() = unsafe("table-column-group")

@CssDsl
public inline val Display.Companion.tableFooterGroup: Display
	get() = unsafe("table-footer-group")

@CssDsl
public inline val Display.Companion.tableHeaderGroup: Display
	get() = unsafe("table-header-group")

@CssDsl
public inline val Display.Companion.tableRow: Display
	get() = unsafe("table-row")

@CssDsl
public inline val Display.Companion.tableRowGroup: Display
	get() = unsafe("table-row-group")


public inline fun Display.Companion.unsafe(value: String): Display =
	CssValue.unsafe(value)


public inline fun Display.Companion.variable(name: String): Display.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.display(value: Display) {
	property(display, value)
}


@Suppress("unused")
public inline val CssProperties.display: CssProperty<Display>
	get() = CssProperty.unsafe("display")
