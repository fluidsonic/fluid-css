@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface ZIndex : CssValue.IntConstructable {

	public companion object;


	@JsName("0;0")
	public interface Variable : ZIndex, CssVariable<ZIndex>
}


@CssDsl
public inline val ZIndex.Companion.auto: ZIndex
	get() = unsafe("auto")


public inline fun ZIndex.Companion.of(value: Int): ZIndex =
	CssValue.unsafe(value)


public inline fun ZIndex.Companion.unsafe(value: String): ZIndex =
	CssValue.unsafe(value)


public inline fun ZIndex.Companion.variable(name: String): ZIndex.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: ZIndex) {
	property(zIndex, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: Int) {
	property(zIndex, value)
}


@Suppress("unused")
public inline val CssProperties.zIndex: CssProperty<ZIndex>
	get() = CssProperty.unsafe("z-index")
