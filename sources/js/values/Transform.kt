@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Transform : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Transform = raw("none")


		public fun raw(value: String): Transform =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public inline fun with(functions: TransformBuilder.() -> Unit): Transform =
			with(TransformBuilder.default()) {
				functions()
				Unit.build()
			}
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
	get() = CssProperty("transform")
