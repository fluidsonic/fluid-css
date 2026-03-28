@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-rendering` value. */
@JsName("0;0")
public external interface TextRendering : CssValue {

	public companion object;


	/** A [TextRendering] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextRendering, CssVariable<TextRendering>
}


/** The CSS `auto` text-rendering value. */
@CssDsl
public inline val TextRendering.Companion.auth: TextRendering
	get() = unsafe("auto")

/** The CSS `optimizeSpeed` text-rendering value. */
@CssDsl
public inline val TextRendering.Companion.optimizeSpeed: TextRendering
	get() = unsafe("optimizeSpeed")

/** The CSS `optimizeLegibility` text-rendering value. */
@CssDsl
public inline val TextRendering.Companion.optimizeLegibility: TextRendering
	get() = unsafe("optimizeLegibility")

/** The CSS `geometricPrecision` text-rendering value. */
@CssDsl
public inline val TextRendering.Companion.geometricPrecision: TextRendering
	get() = unsafe("geometricPrecision")


/** Creates a [TextRendering] from an unchecked string [value]. */
public inline fun TextRendering.Companion.unsafe(value: String): TextRendering =
	CssValue.unsafe(value)


/** Creates a [TextRendering] backed by a CSS variable with the given [name]. */
public inline fun TextRendering.Companion.variable(name: String): TextRendering.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-rendering` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textRendering(value: TextRendering) {
	property(textRendering, value)
}


/** The `text-rendering` CSS property. */
@Suppress("unused")
public inline val CssProperties.textRendering: CssProperty<TextRendering>
	get() = CssProperty.unsafe("text-rendering")
