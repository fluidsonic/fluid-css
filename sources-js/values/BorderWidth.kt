@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border-width` value. */
@JsName("0;0")
public external interface BorderWidth : CssValue {

	public companion object;


	/** A single `border-width` value. */
	@JsName("0;0")
	public interface Single : BorderWidth {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [BorderWidth] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderWidth, CssVariable<BorderWidth>
}


/** The CSS `medium` border-width value. */
@CssDsl
public inline val BorderWidth.Companion.medium: BorderWidth.Single
	get() = CssValue.unsafe("medium")

/** The CSS `thin` border-width value. */
@CssDsl
public inline val BorderWidth.Companion.thin: BorderWidth.Single
	get() = CssValue.unsafe("thin")

/** The CSS `thick` border-width value. */
@CssDsl
public inline val BorderWidth.Companion.thick: BorderWidth.Single
	get() = CssValue.unsafe("thick")


/** Creates a [BorderWidth] applying the same value to all sides. */
public inline fun BorderWidth.Companion.all(value: BorderWidth.Single): BorderWidth =
	value


/** Creates a [BorderWidth] value. */
public inline fun BorderWidth.Companion.of(vertical: BorderWidth.Single, horizontal: BorderWidth.Single): BorderWidth =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [BorderWidth] value. */
public inline fun BorderWidth.Companion.of(top: BorderWidth.Single, horizontal: BorderWidth.Single, bottom: BorderWidth.Single): BorderWidth =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates a [BorderWidth] with individual side values. */
public inline fun BorderWidth.Companion.of(
	top: BorderWidth.Single,
	right: BorderWidth.Single,
	bottom: BorderWidth.Single,
	left: BorderWidth.Single,
): BorderWidth =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [BorderWidth] from an unchecked string [value]. */
public inline fun BorderWidth.Companion.unsafe(value: String): BorderWidth =
	CssValue.unsafe(value)


/** Creates a [BorderWidth] backed by a CSS variable with the given [name]. */
public inline fun BorderWidth.Companion.variable(name: String): BorderWidth.Variable =
	CssVariable.unsafe(name)


/** Creates a [Single] from an unchecked string [value]. */
public inline fun BorderWidth.Single.Companion.unsafe(value: String): BorderWidth.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun BorderWidth.Single.Companion.variable(name: String): BorderWidth.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(all: BorderWidth) {
	property(borderWidth, all)
}


/** Sets the `border-width` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(vertical: BorderWidth.Single, horizontal: BorderWidth.Single) {
	borderWidth(BorderWidth.of(vertical = vertical, horizontal = horizontal))
}


/** Sets the `border-width` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(top: BorderWidth.Single, horizontal: BorderWidth.Single, bottom: BorderWidth.Single) {
	borderWidth(BorderWidth.of(top = top, horizontal = horizontal, bottom = bottom))
}


/** Sets the `border-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(
	top: BorderWidth.Single,
	right: BorderWidth.Single,
	bottom: BorderWidth.Single,
	left: BorderWidth.Single,
) {
	borderWidth(BorderWidth.of(top = top, right = right, bottom = bottom, left = left))
}


/** Sets the `border-width` CSS property. */
@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderWidth(
	all: BorderWidth.Single? = null,
	vertical: BorderWidth.Single? = all,
	horizontal: BorderWidth.Single? = all,
	top: BorderWidth.Single? = vertical,
	right: BorderWidth.Single? = horizontal,
	bottom: BorderWidth.Single? = vertical,
	left: BorderWidth.Single? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderWidth(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopWidth(top)
		if (right != null)
			borderRightWidth(right)
		if (bottom != null)
			borderBottomWidth(bottom)
		if (left != null)
			borderLeftWidth(left)
	}
}


/** Sets the `border-bottom-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: BorderWidth.Single) {
	property(borderBottomWidth, value)
}


/** Sets the `border-left-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: BorderWidth.Single) {
	property(borderLeftWidth, value)
}


/** Sets the `border-right-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: BorderWidth.Single) {
	property(borderRightWidth, value)
}


/** Sets the `border-top-width` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: BorderWidth.Single) {
	property(borderTopWidth, value)
}


/** The `border-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderWidth: CssProperty<BorderWidth>
	get() = CssProperty.unsafe("border-width")


/** The `border-bottom-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottomWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-bottom-width")


/** The `border-left-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderLeftWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-left-width")


/** The `border-right-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderRightWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-right-width")


/** The `border-top-width` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTopWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-top-width")
