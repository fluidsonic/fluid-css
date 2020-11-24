@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BackgroundAttachment : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val fixed: BackgroundAttachment
			get() = unsafe("fixed")

		@CssDsl
		public inline val local: BackgroundAttachment
			get() = unsafe("local")

		@CssDsl
		public inline val scroll: BackgroundAttachment
			get() = unsafe("scroll")


		public inline fun unsafe(value: String): BackgroundAttachment =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : BackgroundAttachment, CssVariable<BackgroundAttachment>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundAttachment(value: BackgroundAttachment) {
	property(backgroundAttachment, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundAttachment: CssProperty<BackgroundAttachment>
	get() = CssProperty.unsafe("background-attachment")
