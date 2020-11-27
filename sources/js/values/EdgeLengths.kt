@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface EdgeLengths : Margin, Padding {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun all(value: Length): EdgeLengths =
			value.unsafeCast<EdgeLengths>()


		public inline fun of(vertical: Length, horizontal: Length): EdgeLengths =
			if (vertical eq horizontal)
				all(vertical)
			else
				unsafe("$vertical $horizontal")


		public inline fun of(top: Length, horizontal: Length, bottom: Length): EdgeLengths =
			if (top eq bottom)
				of(vertical = top, horizontal = horizontal)
			else
				unsafe("$top $horizontal $bottom")


		public inline fun of(
			top: Length,
			right: Length,
			bottom: Length,
			left: Length,
		): EdgeLengths =
			if (left eq right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				unsafe("$top $right $bottom $left")


		public inline fun unsafe(value: String): EdgeLengths =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : EdgeLengths, CssVariable<EdgeLengths>
}
