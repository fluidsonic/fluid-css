@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface OutlineWidth : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val medium: OutlineWidth
			get() = unsafe("medium")

		@CssDsl
		public inline val thin: OutlineWidth
			get() = unsafe("thin")

		@CssDsl
		public inline val thick: OutlineWidth
			get() = unsafe("thick")


		public inline fun unsafe(value: String): OutlineWidth =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : OutlineWidth, CssVariable<OutlineWidth>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.outlineWidth(all: OutlineWidth) {
	property(outlineWidth, all)
}

@Suppress("unused")
public inline val CssProperties.outlineWidth: CssProperty<OutlineWidth>
	get() = CssProperty.unsafe("outline-width")
