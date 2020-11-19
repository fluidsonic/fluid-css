@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AnimationName : CssValue.StringConstructable, Internal {

	public companion object {

		@CssDsl
		public val none: AnimationName = raw("none")


		public inline fun of(value: String): AnimationName =
			raw(value)


		public fun raw(value: String): AnimationName =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : AnimationName, CssVariable<AnimationName>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationName(value: AnimationName) {
	property(animationName, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationName(value: String) {
	property(animationName, value)
}


@Suppress("unused")
public inline val CssProperties.animationName: CssProperty<AnimationName>
	get() = CssProperty("animation-name")
