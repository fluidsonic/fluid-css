@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Size : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: Size
			get() = unsafe("auto")

		@CssDsl
		public inline val maxContent: Size
			get() = unsafe("max-content")

		@CssDsl
		public inline val minContent: Size
			get() = unsafe("min-content")


		@CssDsl
		public inline fun fitContent(height: LengthOrPercentage): Size =
			unsafe("fit-content($height)")


		public inline fun unsafe(value: String): Size =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Size, CssVariable<Size>
}
