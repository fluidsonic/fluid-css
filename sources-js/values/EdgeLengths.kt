@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `edge-lengths` value. */
@JsName("0;0")
public external interface EdgeLengths : Margin, Padding {

	public companion object;


	/** A [EdgeLengths] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : EdgeLengths, CssVariable<EdgeLengths>
}


/** Creates a [EdgeLengths] applying the same value to all sides. */
public inline fun EdgeLengths.Companion.all(value: Length): EdgeLengths =
	value.unsafeCast<EdgeLengths>()


/** Creates a [EdgeLengths] value. */
public inline fun EdgeLengths.Companion.of(vertical: Length, horizontal: Length): EdgeLengths =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [EdgeLengths] value. */
public inline fun EdgeLengths.Companion.of(top: Length, horizontal: Length, bottom: Length): EdgeLengths =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates [EdgeLengths] with individual side values. */
public inline fun EdgeLengths.Companion.of(
	top: Length,
	right: Length,
	bottom: Length,
	left: Length,
): EdgeLengths =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [EdgeLengths] from an unchecked string [value]. */
public inline fun EdgeLengths.Companion.unsafe(value: String): EdgeLengths =
	CssValue.unsafe(value)


/** Creates a [EdgeLengths] backed by a CSS variable with the given [name]. */
public inline fun EdgeLengths.Companion.variable(name: String): EdgeLengths.Variable =
	CssVariable.unsafe(name)
