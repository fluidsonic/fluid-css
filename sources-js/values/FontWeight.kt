@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface FontWeight : CssValue.DoubleConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val bold: FontWeight
			get() = unsafe("bold")

		@CssDsl
		public inline val bolder: FontWeight
			get() = unsafe("bolder")

		@CssDsl
		public inline val lighter: FontWeight
			get() = unsafe("lighter")

		@CssDsl
		public inline val normal: FontWeight
			get() = unsafe("normal")

		@CssDsl
		public inline val w100: FontWeight
			get() = unsafe("100")

		@CssDsl
		public inline val w200: FontWeight
			get() = unsafe("200")

		@CssDsl
		public inline val w300: FontWeight
			get() = unsafe("300")

		@CssDsl
		public inline val w400: FontWeight
			get() = unsafe("400")

		@CssDsl
		public inline val w500: FontWeight
			get() = unsafe("500")

		@CssDsl
		public inline val w600: FontWeight
			get() = unsafe("600")

		@CssDsl
		public inline val w700: FontWeight
			get() = unsafe("700")

		@CssDsl
		public inline val w800: FontWeight
			get() = unsafe("800")

		@CssDsl
		public inline val w900: FontWeight
			get() = unsafe("900")


		@CssDsl
		public inline fun of(value: Double): FontWeight =
			CssValue.unsafe(value)


		@CssDsl
		public inline fun of(value: Int): FontWeight =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): FontWeight =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : FontWeight, CssVariable<FontWeight>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: FontWeight) {
	property(fontWeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Double) {
	property(fontWeight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.fontWeight(value: Int) {
	property(fontWeight, value)
}


@Suppress("unused")
public inline val CssProperties.fontWeight: CssProperty<FontWeight>
	get() = CssProperty.unsafe("font-weight")
