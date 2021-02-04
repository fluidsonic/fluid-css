@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Resize : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: Resize
			get() = unsafe("none")


		@CssDsl
		public inline val block: Resize
			get() = unsafe("block")

		@CssDsl
		public inline val both: Resize
			get() = unsafe("both")

		@CssDsl
		public inline val horizontal: Resize
			get() = unsafe("horizontal")

		@CssDsl
		public inline val inline: Resize
			get() = unsafe("inline")

		@CssDsl
		public inline val vertical: Resize
			get() = unsafe("vertical")


		public inline fun unsafe(value: String): Resize =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Resize, CssVariable<Resize>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.resize(value: Resize) {
	property(resize, value)
}


@Suppress("unused")
public inline val CssProperties.resize: CssProperty<Resize>
	get() = CssProperty.unsafe("resize")
