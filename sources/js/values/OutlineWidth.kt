@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface OutlineWidth : CssValue, Internal {

	public companion object {

		@CssDsl
		public val medium: OutlineWidth = raw("medium")

		@CssDsl
		public val thin: OutlineWidth = raw("thin")

		@CssDsl
		public val thick: OutlineWidth = raw("thick")


		public fun raw(value: String): OutlineWidth =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : OutlineWidth, CssVariable<OutlineWidth>
}


@CssDsl
public fun CssDeclarationBlockBuilder.outlineWidth(all: OutlineWidth) {
	property(outlineWidth, all)
}

@Suppress("unused")
public val CssProperties.outlineWidth: CssProperty<OutlineWidth>
	get() = CssProperty("outline-width")
