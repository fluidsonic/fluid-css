@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface SizeLimit : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val maxContent: SizeLimit
			get() = unsafe("max-content")

		@CssDsl
		public inline val minContent: SizeLimit
			get() = unsafe("min-content")

		@CssDsl
		public inline val none: SizeLimit
			get() = unsafe("none")


		@CssDsl
		public inline fun fitContent(height: LengthOrPercentage): SizeLimit =
			unsafe("fit-content($height)")


		public inline fun unsafe(value: String): SizeLimit =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : SizeLimit, CssVariable<SizeLimit>
}
