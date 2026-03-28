@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `border-color` value. */
@JsName("0;0")
public external interface BorderColor : CssValue {

	public companion object;


	/** A single `border-color` value. */
	@JsName("0;0")
	public interface Single : BorderColor {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [BorderColor] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderColor, CssVariable<BorderColor>
}


/** Creates a [BorderColor] applying the same value to all sides. */
public inline fun BorderColor.Companion.all(value: BorderColor.Single): BorderColor =
	value


/** Creates a [BorderColor] value. */
public inline fun BorderColor.Companion.of(vertical: BorderColor.Single, horizontal: BorderColor.Single): BorderColor =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [BorderColor] value. */
public inline fun BorderColor.Companion.of(top: BorderColor.Single, horizontal: BorderColor.Single, bottom: BorderColor.Single): BorderColor =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates a [BorderColor] with individual side values. */
public inline fun BorderColor.Companion.of(
	top: BorderColor.Single,
	right: BorderColor.Single,
	bottom: BorderColor.Single,
	left: BorderColor.Single,
): BorderColor =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [BorderColor] from an unchecked string [value]. */
public inline fun BorderColor.Companion.unsafe(value: String): BorderColor =
	CssValue.unsafe(value)


/** Creates a [BorderColor] backed by a CSS variable with the given [name]. */
public inline fun BorderColor.Companion.variable(name: String): BorderColor.Variable =
	CssVariable.unsafe(name)


/** Creates a [Single] from an unchecked string [value]. */
public inline fun BorderColor.Single.Companion.unsafe(value: String): BorderColor.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun BorderColor.Single.Companion.variable(name: String): BorderColor.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(all: BorderColor) {
	property(borderColor, all)
}


/** Sets the `border-color` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(vertical: BorderColor.Single, horizontal: BorderColor.Single) {
	borderColor(BorderColor.of(vertical = vertical, horizontal = horizontal))
}


/** Sets the `border-color` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(top: BorderColor.Single, horizontal: BorderColor.Single, bottom: BorderColor.Single) {
	borderColor(BorderColor.of(top = top, horizontal = horizontal, bottom = bottom))
}


/** Sets the `border-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(
	top: BorderColor.Single,
	right: BorderColor.Single,
	bottom: BorderColor.Single,
	left: BorderColor.Single,
) {
	borderColor(BorderColor.of(top = top, right = right, bottom = bottom, left = left))
}


/** Sets the `border-color` CSS property. */
@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderColor(
	all: BorderColor.Single? = null,
	vertical: BorderColor.Single? = all,
	horizontal: BorderColor.Single? = all,
	top: BorderColor.Single? = vertical,
	right: BorderColor.Single? = horizontal,
	bottom: BorderColor.Single? = vertical,
	left: BorderColor.Single? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		borderColor(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			borderTopColor(top)
		if (right != null)
			borderRightColor(right)
		if (bottom != null)
			borderBottomColor(bottom)
		if (left != null)
			borderLeftColor(left)
	}
}


/** Sets the `border-bottom-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: BorderColor.Single) {
	property(borderBottomColor, value)
}


/** Sets the `border-left-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: BorderColor.Single) {
	property(borderLeftColor, value)
}


/** Sets the `border-right-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightColor(value: BorderColor.Single) {
	property(borderRightColor, value)
}


/** Sets the `border-top-color` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopColor(value: BorderColor.Single) {
	property(borderTopColor, value)
}


/** The `border-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderColor: CssProperty<BorderColor>
	get() = CssProperty.unsafe("border-color")


/** The `border-bottom-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottomColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-bottom-color")


/** The `border-left-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderLeftColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-left-color")


/** The `border-right-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderRightColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-right-color")


/** The `border-top-color` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTopColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-top-color")
