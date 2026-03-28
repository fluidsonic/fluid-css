@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `transform` value. */
@JsName("0;0")
public external interface Transform : CssValue {

	public companion object;


	/** A [Transform] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Transform, CssVariable<Transform>
}


/** The CSS `none` transform value. */
@CssDsl
public inline val Transform.Companion.none: Transform
	get() = unsafe("none")


/** Creates a [Transform] from an unchecked string [value]. */
public inline fun Transform.Companion.unsafe(value: String): Transform =
	CssValue.unsafe(value)


/** Creates a [Transform] backed by a CSS variable with the given [name]. */
public inline fun Transform.Companion.variable(name: String): Transform.Variable =
	CssVariable.unsafe(name)


/** Creates a [Transform] shorthand value. */
public inline fun Transform.Companion.with(functions: TransformBuilder.() -> Unit): Transform =
	TransformBuilder.build(functions)


/** Sets the `transform` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transform(value: Transform) {
	property(transform, value)
}


/** Sets the `transform` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.transform(functions: TransformBuilder.() -> Unit) {
	transform(Transform.with(functions))
}


/** The `transform` CSS property. */
@Suppress("unused")
public inline val CssProperties.transform: CssProperty<Transform>
	get() = CssProperty.unsafe("transform")
