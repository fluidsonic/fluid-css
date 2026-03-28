@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `margin` value. */
@JsName("0;0")
public external interface Margin : CssValue {

	public companion object;


	/** A single `margin` value. */
	@JsName("0;0")
	public interface Single : Margin {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [Margin] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Margin, CssVariable<Margin>
}


/** The CSS `auto` margin value. */
@CssDsl
public inline val Margin.Companion.auto: Margin.Single
	get() = Margin.Single.unsafe("auto")


/** Creates a [Margin] applying the same value to all sides. */
public inline fun Margin.Companion.all(value: Margin.Single): Margin =
	value


/** Creates a [Margin] value. */
public inline fun Margin.Companion.of(vertical: Margin.Single, horizontal: Margin.Single): Margin =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [Margin] value. */
public inline fun Margin.Companion.of(top: Margin.Single, horizontal: Margin.Single, bottom: Margin.Single): Margin =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates a [Margin] with individual side values. */
public inline fun Margin.Companion.of(
	top: Margin.Single,
	right: Margin.Single,
	bottom: Margin.Single,
	left: Margin.Single,
): Margin =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [Margin] from an unchecked string [value]. */
public inline fun Margin.Companion.unsafe(value: String): Margin =
	CssValue.unsafe(value)


/** Creates a [Margin] backed by a CSS variable with the given [name]. */
public inline fun Margin.Companion.variable(name: String): Margin.Variable =
	CssVariable.unsafe(name)


/** Sets the `margin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(all: Margin) {
	property(margin, all)
}


/** Sets the `margin` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(vertical: Margin.Single, horizontal: Margin.Single) {
	margin(Margin.of(vertical = vertical, horizontal = horizontal))
}


/** Sets the `margin` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(top: Margin.Single, horizontal: Margin.Single, bottom: Margin.Single) {
	margin(Margin.of(top = top, horizontal = horizontal, bottom = bottom))
}


/** Sets the `margin` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(
	top: Margin.Single,
	right: Margin.Single,
	bottom: Margin.Single,
	left: Margin.Single,
) {
	margin(Margin.of(top = top, right = right, bottom = bottom, left = left))
}


/** Sets the `margin` CSS property. */
@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.margin(
	all: Margin.Single? = null,
	vertical: Margin.Single? = all,
	horizontal: Margin.Single? = all,
	top: Margin.Single? = vertical,
	right: Margin.Single? = horizontal,
	bottom: Margin.Single? = vertical,
	left: Margin.Single? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		margin(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			marginTop(top)
		if (right != null)
			marginRight(right)
		if (bottom != null)
			marginBottom(bottom)
		if (left != null)
			marginLeft(left)
	}
}


/** Creates a [Single] from an unchecked string [value]. */
public inline fun Margin.Single.Companion.unsafe(value: String): Margin.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun Margin.Single.Companion.variable(name: String): Margin.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `margin-bottom` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.marginBottom(value: Margin.Single) {
	property(marginBottom, value)
}


/** Sets the `margin-left` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.marginLeft(value: Margin.Single) {
	property(marginLeft, value)
}


/** Sets the `margin-right` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.marginRight(value: Margin.Single) {
	property(marginRight, value)
}


/** Sets the `margin-top` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.marginTop(value: Margin.Single) {
	property(marginTop, value)
}


/** The `margin` CSS property. */
@Suppress("unused")
public inline val CssProperties.margin: CssProperty<Margin>
	get() = CssProperty.unsafe("margin")


/** The `margin-bottom` CSS property. */
@Suppress("unused")
public inline val CssProperties.marginBottom: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-bottom")


/** The `margin-left` CSS property. */
@Suppress("unused")
public inline val CssProperties.marginLeft: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-left")


/** The `margin-right` CSS property. */
@Suppress("unused")
public inline val CssProperties.marginRight: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-right")


/** The `margin-top` CSS property. */
@Suppress("unused")
public inline val CssProperties.marginTop: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-top")
