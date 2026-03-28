@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `table-layout` value. */
@JsName("0;0")
public external interface TableLayout : CssValue {

	public companion object;


	/** A [TableLayout] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TableLayout, CssVariable<TableLayout>
}


/** The CSS `auto` table-layout value. */
@CssDsl
public inline val TableLayout.Companion.auto: TableLayout
	get() = unsafe("auto")


/** The CSS `fixed` table-layout value. */
@CssDsl
public inline val TableLayout.Companion.fixed: TableLayout
	get() = unsafe("fixed")


/** Creates a [TableLayout] from an unchecked string [value]. */
public inline fun TableLayout.Companion.unsafe(value: String): TableLayout =
	CssValue.unsafe(value)


/** Creates a [TableLayout] backed by a CSS variable with the given [name]. */
public inline fun TableLayout.Companion.variable(name: String): TableLayout.Variable =
	CssVariable.unsafe(name)


/** Sets the `table-layout` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.tableLayout(value: TableLayout) {
	property(tableLayout, value)
}


/** The `table-layout` CSS property. */
@Suppress("unused")
public inline val CssProperties.tableLayout: CssProperty<TableLayout>
	get() = CssProperty.unsafe("table-layout")
