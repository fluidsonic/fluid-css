@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BorderSpacing : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Axis : BorderSpacing {

		public companion object;


		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	@JsName("0;0")
	public interface Variable : BorderSpacing, CssVariable<BorderSpacing>
}


public inline fun BorderSpacing.Companion.of(horizontal: BorderSpacing.Axis, vertical: BorderSpacing.Axis): BorderSpacing =
	unsafe("$horizontal $vertical")


public inline fun BorderSpacing.Companion.unsafe(value: String): BorderSpacing =
	CssValue.unsafe(value)


public inline fun BorderSpacing.Companion.variable(name: String): BorderSpacing.Variable =
	CssVariable.unsafe(name)


public inline fun BorderSpacing.Axis.Companion.unsafe(value: String): BorderSpacing.Axis =
	CssValue.unsafe(value)


public inline fun BorderSpacing.Axis.Companion.variable(name: String): BorderSpacing.Axis.Variable =
	CssVariable.unsafe(name)


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
