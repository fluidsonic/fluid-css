@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


@JsName("0;0")
public external interface BackgroundRepeat : CssValue {

	public companion object;

	@JsName("0;0")
	public interface Axis : BackgroundRepeat {

		public companion object;


		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	@JsName("0;0")
	public interface Variable : BackgroundRepeat, CssVariable<BackgroundRepeat>
}


@CssDsl
public inline val BackgroundRepeat.Companion.noRepeat: BackgroundRepeat
	get() = BackgroundRepeat.Axis.noRepeat

@CssDsl
public inline val BackgroundRepeat.Companion.repeat: BackgroundRepeat
	get() = BackgroundRepeat.Axis.repeat

@CssDsl
public inline val BackgroundRepeat.Companion.repeatX: BackgroundRepeat
	get() = unsafe("repeat-x")

@CssDsl
public inline val BackgroundRepeat.Companion.repeatY: BackgroundRepeat
	get() = unsafe("repeat-y")

@CssDsl
public inline val BackgroundRepeat.Companion.round: BackgroundRepeat
	get() = BackgroundRepeat.Axis.round

@CssDsl
public inline val BackgroundRepeat.Companion.space: BackgroundRepeat
	get() = BackgroundRepeat.Axis.space


public inline fun BackgroundRepeat.Companion.unsafe(value: String): BackgroundRepeat =
	CssValue.unsafe(value)


public inline fun BackgroundRepeat.Companion.variable(name: String): BackgroundRepeat.Variable =
	CssVariable.unsafe(name)


public inline fun BackgroundRepeat.Companion.with(x: BackgroundRepeat.Axis, y: BackgroundRepeat.Axis): BackgroundRepeat =
	unsafe("$x $y")


@CssDsl
public inline val BackgroundRepeat.Axis.Companion.noRepeat: BackgroundRepeat.Axis
	get() = unsafe("no-repeat")

@CssDsl
public inline val BackgroundRepeat.Axis.Companion.repeat: BackgroundRepeat.Axis
	get() = unsafe("repeat")

@CssDsl
public inline val BackgroundRepeat.Axis.Companion.round: BackgroundRepeat.Axis
	get() = unsafe("round")

@CssDsl
public inline val BackgroundRepeat.Axis.Companion.space: BackgroundRepeat.Axis
	get() = unsafe("space")


public inline fun BackgroundRepeat.Axis.Companion.unsafe(value: String): BackgroundRepeat.Axis =
	CssValue.unsafe(value)


public inline fun BackgroundRepeat.Axis.Companion.variable(name: String): BackgroundRepeat.Axis.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeat) {
	property(backgroundRepeat, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(x: BackgroundRepeat.Axis, y: BackgroundRepeat.Axis) {
	backgroundRepeat(BackgroundRepeat.with(x, y))
}


@Suppress("unused")
public inline val CssProperties.backgroundRepeat: CssProperty<BackgroundRepeat>
	get() = CssProperty.unsafe("background-repeat")
