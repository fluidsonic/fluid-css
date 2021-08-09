@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TableLayout : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : TableLayout, CssVariable<TableLayout>
}


@CssDsl
public inline val TableLayout.Companion.auto: TableLayout
	get() = unsafe("auto")


@CssDsl
public inline val TableLayout.Companion.fixed: TableLayout
	get() = unsafe("fixed")


public inline fun TableLayout.Companion.unsafe(value: String): TableLayout =
	CssValue.unsafe(value)


public inline fun TableLayout.Companion.variable(name: String): TableLayout.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.tableLayout(value: TableLayout) {
	property(tableLayout, value)
}


@Suppress("unused")
public inline val CssProperties.tableLayout: CssProperty<TableLayout>
	get() = CssProperty.unsafe("table-layout")
