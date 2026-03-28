@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border-spacing` value. */
@JsName("0;0")
public external interface BorderSpacing : CssValue {

	public companion object;


	/** A single-axis `border-spacing` value. */
	@JsName("0;0")
	public interface Axis : BorderSpacing {

		public companion object;


		/** A [Axis] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	/** A [BorderSpacing] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderSpacing, CssVariable<BorderSpacing>
}


/** Creates a [BorderSpacing] value. */
public inline fun BorderSpacing.Companion.of(horizontal: BorderSpacing.Axis, vertical: BorderSpacing.Axis): BorderSpacing =
	unsafe("$horizontal $vertical")


/** Creates a [BorderSpacing] from an unchecked string [value]. */
public inline fun BorderSpacing.Companion.unsafe(value: String): BorderSpacing =
	CssValue.unsafe(value)


/** Creates a [BorderSpacing] backed by a CSS variable with the given [name]. */
public inline fun BorderSpacing.Companion.variable(name: String): BorderSpacing.Variable =
	CssVariable.unsafe(name)


/** Creates a [Axis] from an unchecked string [value]. */
public inline fun BorderSpacing.Axis.Companion.unsafe(value: String): BorderSpacing.Axis =
	CssValue.unsafe(value)


/** Creates a [Axis] backed by a CSS variable with the given [name]. */
public inline fun BorderSpacing.Axis.Companion.variable(name: String): BorderSpacing.Axis.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-spacing` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderSpacing(value: BorderSpacing) {
	property(borderSpacing, value)
}


/** Sets the `border-spacing` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderSpacing(horizontal: BorderSpacing.Axis, vertical: BorderSpacing.Axis) {
	borderSpacing(BorderSpacing.of(horizontal = horizontal, vertical = vertical))
}


/** The `border-spacing` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderSpacing: CssProperty<BorderSpacing>
	get() = CssProperty.unsafe("border-spacing")
