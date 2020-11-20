@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface ZIndex : CssValue.IntConstructable, Internal {

	public companion object {

		@CssDsl
		public val auto: ZIndex = raw("auto")


		public fun of(value: Int): ZIndex =
			raw(value.toString())


		public fun raw(value: String): ZIndex =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : ZIndex, CssVariable<ZIndex>
}


@CssDsl
public fun CssDeclarationBlockBuilder.zIndex(value: ZIndex) {
	property(zIndex, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.zIndex(value: Int) {
	property(zIndex, value)
}


@Suppress("unused")
public val CssProperties.zIndex: CssProperty<ZIndex>
	get() = CssProperty("z-index")
