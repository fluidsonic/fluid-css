@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Transform : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Transform, CssVariable<Transform>
}


@CssDsl
public inline val Transform.Companion.none: Transform
	get() = unsafe("none")


public inline fun Transform.Companion.unsafe(value: String): Transform =
	CssValue.unsafe(value)


public inline fun Transform.Companion.variable(name: String): Transform.Variable =
	CssVariable.unsafe(name)


public inline fun Transform.Companion.with(functions: TransformBuilder.() -> Unit): Transform =
	TransformBuilder.build(functions)


@CssDsl
public inline fun CssDeclarationBlockBuilder.transform(value: Transform) {
	property(transform, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.transform(functions: TransformBuilder.() -> Unit) {
	transform(Transform.with(functions))
}


@Suppress("unused")
public inline val CssProperties.transform: CssProperty<Transform>
	get() = CssProperty.unsafe("transform")
