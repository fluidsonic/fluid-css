@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border-style` value. */
@JsName("0;0")
public external interface BorderStyle : CssValue {

	public companion object;


	/** A single `border-style` value. */
	@JsName("0;0")
	public interface Single : BorderStyle {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [BorderStyle] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderStyle, CssVariable<BorderStyle>
}


/** The CSS `none` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.none: BorderStyle.Single
	get() = CssValue.unsafe("none")


/** The CSS `dashed` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.dashed: BorderStyle.Single
	get() = CssValue.unsafe("dashed")

/** The CSS `dotted` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.dotted: BorderStyle.Single
	get() = CssValue.unsafe("dotted")

/** The CSS `double` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.double: BorderStyle.Single
	get() = CssValue.unsafe("double")

/** The CSS `groove` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.groove: BorderStyle.Single
	get() = CssValue.unsafe("groove")

/** The CSS `hidden` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.hidden: BorderStyle.Single
	get() = CssValue.unsafe("hidden")

/** The CSS `inset` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.inset: BorderStyle.Single
	get() = CssValue.unsafe("inset")

/** The CSS `outset` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.outset: BorderStyle.Single
	get() = CssValue.unsafe("outset")

/** The CSS `ridge` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.ridge: BorderStyle.Single
	get() = CssValue.unsafe("ridge")

/** The CSS `solid` border-style value. */
@CssDsl
public inline val BorderStyle.Companion.solid: BorderStyle.Single
	get() = CssValue.unsafe("solid")


/** Creates a [BorderStyle] applying the same value to all sides. */
public inline fun BorderStyle.Companion.all(value: BorderStyle.Single): BorderStyle =
	value


/** Creates a [BorderStyle] value. */
public inline fun BorderStyle.Companion.of(vertical: BorderStyle.Single, horizontal: BorderStyle.Single): BorderStyle =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [BorderStyle] value. */
public inline fun BorderStyle.Companion.of(top: BorderStyle.Single, horizontal: BorderStyle.Single, bottom: BorderStyle.Single): BorderStyle =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates a [BorderStyle] with individual side values. */
public inline fun BorderStyle.Companion.of(
	top: BorderStyle.Single,
	right: BorderStyle.Single,
	bottom: BorderStyle.Single,
	left: BorderStyle.Single,
): BorderStyle =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [BorderStyle] from an unchecked string [value]. */
public inline fun BorderStyle.Companion.unsafe(value: String): BorderStyle =
	CssValue.unsafe(value)


/** Creates a [BorderStyle] backed by a CSS variable with the given [name]. */
public inline fun BorderStyle.Companion.variable(name: String): BorderStyle.Variable =
	CssVariable.unsafe(name)


/** Creates a [Single] from an unchecked string [value]. */
public inline fun BorderStyle.Single.Companion.unsafe(value: String): BorderStyle.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun BorderStyle.Single.Companion.variable(name: String): BorderStyle.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(all: BorderStyle) {
	property(borderStyle, all)
}


/** Sets the `border-style` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(vertical: BorderStyle.Single, horizontal: BorderStyle.Single) {
	borderStyle(BorderStyle.of(vertical = vertical, horizontal = horizontal))
}


/** Sets the `border-style` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(top: BorderStyle.Single, horizontal: BorderStyle.Single, bottom: BorderStyle.Single) {
	borderStyle(BorderStyle.of(top = top, horizontal = horizontal, bottom = bottom))
}


/** Sets the `border-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(
	top: BorderStyle.Single,
	right: BorderStyle.Single,
	bottom: BorderStyle.Single,
	left: BorderStyle.Single,
) {
	borderStyle(BorderStyle.of(top = top, right = right, bottom = bottom, left = left))
}


/** Sets the `border-style` CSS property. */
@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderStyle(
	all: BorderStyle.Single? = null,
	vertical: BorderStyle.Single? = all,
	horizontal: BorderStyle.Single? = all,
	top: BorderStyle.Single? = vertical,
	right: BorderStyle.Single? = horizontal,
	bottom: BorderStyle.Single? = vertical,
	left: BorderStyle.Single? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderStyle(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopStyle(top)
		if (right != null)
			borderRightStyle(right)
		if (bottom != null)
			borderBottomStyle(bottom)
		if (left != null)
			borderLeftStyle(left)
	}
}


/** Sets the `border-bottom-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: BorderStyle.Single) {
	property(borderBottomStyle, value)
}


/** Sets the `border-left-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: BorderStyle.Single) {
	property(borderLeftStyle, value)
}


/** Sets the `border-right-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: BorderStyle.Single) {
	property(borderRightStyle, value)
}


/** Sets the `border-top-style` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: BorderStyle.Single) {
	property(borderTopStyle, value)
}


/** The `border-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderStyle: CssProperty<BorderStyle>
	get() = CssProperty.unsafe("border-style")


/** The `border-bottom-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottomStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-bottom-style")


/** The `border-left-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderLeftStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-left-style")


/** The `border-right-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderRightStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-right-style")


/** The `border-top-style` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTopStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-top-style")
