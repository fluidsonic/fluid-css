@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface AnimationName : CssValue.StringConstructable {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: AnimationName
			get() = unsafe("none")


		public inline fun of(value: String): AnimationName =
			unsafe(value)


		public inline fun unsafe(value: String): AnimationName =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
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
	get() = CssProperty.unsafe("animation-name")
