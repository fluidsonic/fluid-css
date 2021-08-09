@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Gap : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Axis : Gap {

		public companion object;


		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	@JsName("0;0")
	public interface Variable : Gap, CssVariable<Gap>
}


@CssDsl
public inline val Gap.Companion.normal: Gap
	get() = Gap.Axis.normal


public inline fun Gap.Companion.of(row: Gap.Axis, column: Gap.Axis): Gap =
	unsafe("$row $column")


public inline fun Gap.Companion.unsafe(value: String): Gap =
	CssValue.unsafe(value)


public inline fun Gap.Companion.variable(name: String): Gap.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline val Gap.Axis.Companion.normal: Gap.Axis
	get() = unsafe("normal")


public inline fun Gap.Axis.Companion.unsafe(value: String): Gap.Axis =
	CssValue.unsafe(value)


public inline fun Gap.Axis.Companion.variable(name: String): Gap.Axis.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.columnGap(value: Gap.Axis) {
	property(columnGap, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(value: Gap) {
	property(gap, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(row: Gap.Axis, column: Gap.Axis) {
	gap(Gap.of(row = row, column = column))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.rowGap(value: Gap.Axis) {
	property(rowGap, value)
}


@Suppress("unused")
public inline val CssProperties.columnGap: CssProperty<Gap>
	get() = CssProperty.unsafe("column-gap")


@Suppress("unused")
public inline val CssProperties.gap: CssProperty<Gap>
	get() = CssProperty.unsafe("gap")


@Suppress("unused")
public inline val CssProperties.rowGap: CssProperty<Gap>
	get() = CssProperty.unsafe("row-gap")
