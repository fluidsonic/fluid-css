@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION",
)

package io.fluidsonic.css


public external interface BorderSpacing : CssValue {

	public companion object {

		public inline fun of(horizontal: Axis, vertical: Axis): BorderSpacing =
			unsafe("$horizontal $vertical")


		public inline fun unsafe(value: String): BorderSpacing =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Axis : BorderSpacing {

		public companion object {

			public inline fun unsafe(value: String): Axis =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Axis, CssVariable<Axis>
	}


	public interface Variable : BorderSpacing, CssVariable<BorderSpacing>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderSpacing(value: BorderSpacing) {
	property(borderSpacing, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderSpacing(horizontal: BorderSpacing.Axis, vertical: BorderSpacing.Axis) {
	borderSpacing(BorderSpacing.of(horizontal = horizontal, vertical = vertical))
}


@Suppress("unused")
public inline val CssProperties.borderSpacing: CssProperty<BorderSpacing>
	get() = CssProperty.unsafe("border-spacing")
