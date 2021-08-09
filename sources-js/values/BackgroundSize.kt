@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundSize : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Axis : BackgroundSize {

		public companion object


		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	@JsName("0;0")
	public interface Variable : BackgroundSize, CssVariable<BackgroundSize>
}


@CssDsl
public inline val BackgroundSize.Companion.auto: BackgroundSize.Axis
	get() = BackgroundSize.Axis.auto

@CssDsl
public inline val BackgroundSize.Companion.contain: BackgroundSize
	get() = unsafe("contain")

@CssDsl
public inline val BackgroundSize.Companion.cover: BackgroundSize
	get() = unsafe("cover")


public inline fun BackgroundSize.Companion.of(width: BackgroundSize.Axis, height: BackgroundSize.Axis): BackgroundSize =
	unsafe("$width $height")


public inline fun BackgroundSize.Companion.unsafe(value: String): BackgroundSize =
	CssValue.unsafe(value)


public inline fun BackgroundSize.Companion.variable(name: String): BackgroundSize.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline val BackgroundSize.Axis.Companion.auto: BackgroundSize.Axis
	get() = unsafe("auto")


public inline fun BackgroundSize.Axis.Companion.unsafe(value: String): BackgroundSize.Axis =
	CssValue.unsafe(value)


public inline fun BackgroundSize.Axis.Companion.variable(name: String): BackgroundSize.Axis.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(value: BackgroundSize) {
	property(backgroundSize, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(width: BackgroundSize.Axis, height: BackgroundSize.Axis) {
	backgroundSize(BackgroundSize.of(width = width, height = height))
}


@Suppress("unused")
public inline val CssProperties.backgroundSize: CssProperty<BackgroundSize>
	get() = CssProperty.unsafe("background-size")
