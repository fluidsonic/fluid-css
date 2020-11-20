@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Resize : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Resize = raw("none")


		@CssDsl
		public val block: Resize = raw("block")

		@CssDsl
		public val both: Resize = raw("both")

		@CssDsl
		public val horizontal: Resize = raw("horizontal")

		@CssDsl
		public val inline: Resize = raw("inline")

		@CssDsl
		public val vertical: Resize = raw("vertical")


		public fun raw(value: String): Resize =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Resize, CssVariable<Resize>
}


@CssDsl
public fun CssDeclarationBlockBuilder.resize(value: Resize) {
	property(resize, value)
}


@Suppress("unused")
public val CssProperties.resize: CssProperty<Resize>
	get() = CssProperty("resize")
