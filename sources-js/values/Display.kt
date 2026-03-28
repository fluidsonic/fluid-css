@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `display` value. */
@JsName("0;0")
public external interface Display : CssValue {

	public companion object;


	/** A [Display] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Display, CssVariable<Display>
}


/** The CSS `none` display value. */
@CssDsl
public inline val Display.Companion.none: Display
	get() = unsafe("none")


/** The CSS `block` display value. */
@CssDsl
public inline val Display.Companion.block: Display
	get() = unsafe("block")

/** The CSS `contents` display value. */
@CssDsl
public inline val Display.Companion.contents: Display
	get() = unsafe("contents")

/** The CSS `flex` display value. */
@CssDsl
public inline val Display.Companion.flex: Display
	get() = unsafe("flex")

/** The CSS `flow` display value. */
@CssDsl
public inline val Display.Companion.flow: Display
	get() = unsafe("flow")

/** The CSS `flow-root` display value. */
@CssDsl
public inline val Display.Companion.flowRoot: Display
	get() = unsafe("flow-root")

/** The CSS `grid` display value. */
@CssDsl
public inline val Display.Companion.grid: Display
	get() = unsafe("grid")

/** The CSS `inline` display value. */
@CssDsl
public inline val Display.Companion.inline: Display
	get() = unsafe("inline")

/** The CSS `inline-block` display value. */
@CssDsl
public inline val Display.Companion.inlineBlock: Display
	get() = unsafe("inline-block")

/** The CSS `inline-flex` display value. */
@CssDsl
public inline val Display.Companion.inlineFlex: Display
	get() = unsafe("inline-flex")

/** The CSS `inline-grid` display value. */
@CssDsl
public inline val Display.Companion.inlineGrid: Display
	get() = unsafe("inline-grid")

/** The CSS `inline-list-item` display value. */
@CssDsl
public inline val Display.Companion.inlineListItem: Display
	get() = unsafe("inline-list-item")

/** The CSS `inline-table` display value. */
@CssDsl
public inline val Display.Companion.inlineTable: Display
	get() = unsafe("inline-table")

/** The CSS `list-item` display value. */
@CssDsl
public inline val Display.Companion.listItem: Display
	get() = unsafe("list-item")

/** The CSS `run-in` display value. */
@CssDsl
public inline val Display.Companion.runIn: Display
	get() = unsafe("run-in")

/** The CSS `table` display value. */
@CssDsl
public inline val Display.Companion.table: Display
	get() = unsafe("table")

/** The CSS `table-caption` display value. */
@CssDsl
public inline val Display.Companion.tableCaption: Display
	get() = unsafe("table-caption")

/** The CSS `table-cell` display value. */
@CssDsl
public inline val Display.Companion.tableCell: Display
	get() = unsafe("table-cell")

/** The CSS `table-column` display value. */
@CssDsl
public inline val Display.Companion.tableColumn: Display
	get() = unsafe("table-column")

/** The CSS `table-column-group` display value. */
@CssDsl
public inline val Display.Companion.tableColumnGroup: Display
	get() = unsafe("table-column-group")

/** The CSS `table-footer-group` display value. */
@CssDsl
public inline val Display.Companion.tableFooterGroup: Display
	get() = unsafe("table-footer-group")

/** The CSS `table-header-group` display value. */
@CssDsl
public inline val Display.Companion.tableHeaderGroup: Display
	get() = unsafe("table-header-group")

/** The CSS `table-row` display value. */
@CssDsl
public inline val Display.Companion.tableRow: Display
	get() = unsafe("table-row")

/** The CSS `table-row-group` display value. */
@CssDsl
public inline val Display.Companion.tableRowGroup: Display
	get() = unsafe("table-row-group")


/** Creates a [Display] from an unchecked string [value]. */
public inline fun Display.Companion.unsafe(value: String): Display =
	CssValue.unsafe(value)


/** Creates a [Display] backed by a CSS variable with the given [name]. */
public inline fun Display.Companion.variable(name: String): Display.Variable =
	CssVariable.unsafe(name)


/** Sets the `display` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.display(value: Display) {
	property(display, value)
}


/** The `display` CSS property. */
@Suppress("unused")
public inline val CssProperties.display: CssProperty<Display>
	get() = CssProperty.unsafe("display")
