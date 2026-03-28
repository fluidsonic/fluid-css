@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `background-attachment` value. */
@JsName("0;0")
public external interface BackgroundAttachment : CssValue {

	public companion object;


	/** A [BackgroundAttachment] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundAttachment, CssVariable<BackgroundAttachment>
}


/** The CSS `fixed` background-attachment value. */
@CssDsl
public inline val BackgroundAttachment.Companion.fixed: BackgroundAttachment
	get() = unsafe("fixed")

/** The CSS `local` background-attachment value. */
@CssDsl
public inline val BackgroundAttachment.Companion.local: BackgroundAttachment
	get() = unsafe("local")

/** The CSS `scroll` background-attachment value. */
@CssDsl
public inline val BackgroundAttachment.Companion.scroll: BackgroundAttachment
	get() = unsafe("scroll")


/** Creates a [BackgroundAttachment] from an unchecked string [value]. */
public inline fun BackgroundAttachment.Companion.unsafe(value: String): BackgroundAttachment =
	CssValue.unsafe(value)


/** Creates a [BackgroundAttachment] backed by a CSS variable with the given [name]. */
public inline fun BackgroundAttachment.Companion.variable(name: String): BackgroundAttachment.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-attachment` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundAttachment(value: BackgroundAttachment) {
	property(backgroundAttachment, value)
}


/** The `background-attachment` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundAttachment: CssProperty<BackgroundAttachment>
	get() = CssProperty.unsafe("background-attachment")
