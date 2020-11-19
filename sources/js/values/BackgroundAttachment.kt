@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BackgroundAttachment : CssValue, Internal {

	public companion object {

		@CssDsl
		public val fixed: BackgroundAttachment = raw("fixed")

		@CssDsl
		public val local: BackgroundAttachment = raw("local")

		@CssDsl
		public val scroll: BackgroundAttachment = raw("scroll")


		public fun raw(value: String): BackgroundAttachment =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : BackgroundAttachment, CssVariable<BackgroundAttachment>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundAttachment(value: BackgroundAttachment) {
	property(backgroundAttachment, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundAttachment: CssProperty<BackgroundAttachment>
	get() = CssProperty("background-attachment")
