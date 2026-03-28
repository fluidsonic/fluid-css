@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-clip` value. */
@JsName("0;0")
public external interface BackgroundClip : CssValue {

	public companion object;


	/** A [BackgroundClip] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundClip, CssVariable<BackgroundClip>
}


/** The CSS `border-box` background-clip value. */
@CssDsl
public inline val BackgroundClip.Companion.borderBox: BackgroundClip
	get() = unsafe("border-box")

/** The CSS `content-box` background-clip value. */
@CssDsl
public inline val BackgroundClip.Companion.contentBox: BackgroundClip
	get() = unsafe("content-box")

/** The CSS `padding-box` background-clip value. */
@CssDsl
public inline val BackgroundClip.Companion.paddingBox: BackgroundClip
	get() = unsafe("padding-box")


/** Creates a [BackgroundClip] from an unchecked string [value]. */
public inline fun BackgroundClip.Companion.unsafe(value: String): BackgroundClip =
	CssValue.unsafe(value)


/** Creates a [BackgroundClip] backed by a CSS variable with the given [name]. */
public inline fun BackgroundClip.Companion.variable(name: String): BackgroundClip.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-clip` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundClip(value: BackgroundClip) {
	property(backgroundClip, value)
}


/** The `background-clip` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundClip: CssProperty<BackgroundClip>
	get() = CssProperty.unsafe("background-clip")
