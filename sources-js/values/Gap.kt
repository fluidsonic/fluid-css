@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `gap` value. */
@JsName("0;0")
public external interface Gap : CssValue {

	public companion object;


	/** A single-axis `gap` value. */
	@JsName("0;0")
	public interface Axis : Gap {

		public companion object;


		/** A [Axis] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	/** A [Gap] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Gap, CssVariable<Gap>
}


/** Predefined `normal` value. */
@CssDsl
public inline val Gap.Companion.normal: Gap
	get() = Gap.Axis.normal


/** Creates a [Gap] value. */
public inline fun Gap.Companion.of(row: Gap.Axis, column: Gap.Axis): Gap =
	unsafe("$row $column")


/** Creates a [Gap] from an unchecked string [value]. */
public inline fun Gap.Companion.unsafe(value: String): Gap =
	CssValue.unsafe(value)


/** Creates a [Gap] backed by a CSS variable with the given [name]. */
public inline fun Gap.Companion.variable(name: String): Gap.Variable =
	CssVariable.unsafe(name)


/** The CSS `normal` axis value. */
@CssDsl
public inline val Gap.Axis.Companion.normal: Gap.Axis
	get() = unsafe("normal")


/** Creates a [Axis] from an unchecked string [value]. */
public inline fun Gap.Axis.Companion.unsafe(value: String): Gap.Axis =
	CssValue.unsafe(value)


/** Creates a [Axis] backed by a CSS variable with the given [name]. */
public inline fun Gap.Axis.Companion.variable(name: String): Gap.Axis.Variable =
	CssVariable.unsafe(name)


/** Sets the `column-gap` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.columnGap(value: Gap.Axis) {
	property(columnGap, value)
}


/** Sets the `gap` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(value: Gap) {
	property(gap, value)
}


/** Sets the `gap` CSS property with row and column values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(row: Gap.Axis, column: Gap.Axis) {
	gap(Gap.of(row = row, column = column))
}


/** Sets the `row-gap` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.rowGap(value: Gap.Axis) {
	property(rowGap, value)
}


/** The `column-gap` CSS property. */
@Suppress("unused")
public inline val CssProperties.columnGap: CssProperty<Gap>
	get() = CssProperty.unsafe("column-gap")


/** The `gap` CSS property. */
@Suppress("unused")
public inline val CssProperties.gap: CssProperty<Gap>
	get() = CssProperty.unsafe("gap")


/** The `row-gap` CSS property. */
@Suppress("unused")
public inline val CssProperties.rowGap: CssProperty<Gap>
	get() = CssProperty.unsafe("row-gap")
