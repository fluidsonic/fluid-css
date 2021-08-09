@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface AnimationName : CssValue.StringConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : AnimationName, CssVariable<AnimationName>
}


@CssDsl
public inline val AnimationName.Companion.none: AnimationName
	get() = unsafe("none")


public inline fun AnimationName.Companion.of(value: String): AnimationName =
	unsafe(value)


public inline fun AnimationName.Companion.unsafe(value: String): AnimationName =
	CssValue.unsafe(value)


public inline fun AnimationName.Companion.variable(name: String): AnimationName.Variable =
	CssVariable.unsafe(name)


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
