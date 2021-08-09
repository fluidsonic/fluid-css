@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface EdgeLengths : Margin, Padding {

	public companion object;


	@JsName("0;0")
	public interface Variable : EdgeLengths, CssVariable<EdgeLengths>
}


public inline fun EdgeLengths.Companion.all(value: Length): EdgeLengths =
	value.unsafeCast<EdgeLengths>()


public inline fun EdgeLengths.Companion.of(vertical: Length, horizontal: Length): EdgeLengths =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun EdgeLengths.Companion.of(top: Length, horizontal: Length, bottom: Length): EdgeLengths =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


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


public inline fun EdgeLengths.Companion.unsafe(value: String): EdgeLengths =
	CssValue.unsafe(value)


public inline fun EdgeLengths.Companion.variable(name: String): EdgeLengths.Variable =
	CssVariable.unsafe(name)
