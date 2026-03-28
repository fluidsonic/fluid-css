@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `z-index` value. */
@JsName("0;0")
public external interface ZIndex : CssValue.IntConstructable {

	public companion object;


	/** A [ZIndex] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : ZIndex, CssVariable<ZIndex>
}


/** The CSS `auto` z-index value. */
@CssDsl
public inline val ZIndex.Companion.auto: ZIndex
	get() = unsafe("auto")


/** Creates a [ZIndex] value. */
public inline fun ZIndex.Companion.of(value: Int): ZIndex =
	CssValue.unsafe(value)


/** Creates a [ZIndex] from an unchecked string [value]. */
public inline fun ZIndex.Companion.unsafe(value: String): ZIndex =
	CssValue.unsafe(value)


/** Creates a [ZIndex] backed by a CSS variable with the given [name]. */
public inline fun ZIndex.Companion.variable(name: String): ZIndex.Variable =
	CssVariable.unsafe(name)


/** Sets the `z-index` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: ZIndex) {
	property(zIndex, value)
}


/** Sets the `z-index` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.zIndex(value: Int) {
	property(zIndex, value)
}


/** The `z-index` CSS property. */
@Suppress("unused")
public inline val CssProperties.zIndex: CssProperty<ZIndex>
	get() = CssProperty.unsafe("z-index")
