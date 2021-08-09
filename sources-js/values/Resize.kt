@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Resize : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Resize, CssVariable<Resize>
}


@CssDsl
public inline val Resize.Companion.none: Resize
	get() = unsafe("none")


@CssDsl
public inline val Resize.Companion.block: Resize
	get() = unsafe("block")

@CssDsl
public inline val Resize.Companion.both: Resize
	get() = unsafe("both")

@CssDsl
public inline val Resize.Companion.horizontal: Resize
	get() = unsafe("horizontal")

@CssDsl
public inline val Resize.Companion.inline: Resize
	get() = unsafe("inline")

@CssDsl
public inline val Resize.Companion.vertical: Resize
	get() = unsafe("vertical")


public inline fun Resize.Companion.unsafe(value: String): Resize =
	CssValue.unsafe(value)


public inline fun Resize.Companion.variable(name: String): Resize.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.resize(value: Resize) {
	property(resize, value)
}


@Suppress("unused")
public inline val CssProperties.resize: CssProperty<Resize>
	get() = CssProperty.unsafe("resize")
