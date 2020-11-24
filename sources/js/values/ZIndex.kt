@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface ZIndex : CssValue.IntConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: ZIndex
			get() = unsafe("auto")


		public inline fun of(value: Int): ZIndex =
			CssValue.unsafe(value)


		public inline fun unsafe(value: String): ZIndex =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : ZIndex, CssVariable<ZIndex>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: ZIndex) {
	property(zIndex, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: Int) {
	property(zIndex, value)
}


@Suppress("unused")
public inline val CssProperties.zIndex: CssProperty<ZIndex>
	get() = CssProperty.unsafe("z-index")
