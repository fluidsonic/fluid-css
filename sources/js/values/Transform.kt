@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Transform : CssValue {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION"
	)
	public companion object {

		@CssDsl
		public inline val none: Transform
			get() = unsafe("none")


		public inline fun unsafe(value: String): Transform =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(functions: TransformBuilder.() -> Unit): Transform =
			TransformBuilder.build(functions)
	}


	public interface Variable : Transform, CssVariable<Transform>
}


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
