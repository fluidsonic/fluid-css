@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `padding` value. */
@JsName("0;0")
public external interface Padding : CssValue {

	public companion object;


	/** A single `padding` value. */
	@JsName("0;0")
	public interface Single : Padding {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [Padding] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Padding, CssVariable<Padding>
}


/** The CSS `auto` padding value. */
@CssDsl
public inline val Padding.Companion.auto: Padding.Single
	get() = Padding.Single.unsafe("auto")


/** Creates a [Padding] applying the same value to all sides. */
public inline fun Padding.Companion.all(value: Padding.Single): Padding =
	value


/** Creates a [Padding] value. */
public inline fun Padding.Companion.of(vertical: Padding.Single, horizontal: Padding.Single): Padding =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


/** Creates a [Padding] value. */
public inline fun Padding.Companion.of(top: Padding.Single, horizontal: Padding.Single, bottom: Padding.Single): Padding =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


/** Creates a [Padding] with individual side values. */
public inline fun Padding.Companion.of(
	top: Padding.Single,
	right: Padding.Single,
	bottom: Padding.Single,
	left: Padding.Single,
): Padding =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


/** Creates a [Padding] from an unchecked string [value]. */
public inline fun Padding.Companion.unsafe(value: String): Padding =
	CssValue.unsafe(value)


/** Creates a [Padding] backed by a CSS variable with the given [name]. */
public inline fun Padding.Companion.variable(name: String): Padding.Variable =
	CssVariable.unsafe(name)


/** Creates a [Single] from an unchecked string [value]. */
public inline fun Padding.Single.Companion.unsafe(value: String): Padding.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun Padding.Single.Companion.variable(name: String): Padding.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `padding` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(all: Padding) {
	property(padding, all)
}


/** Sets the `padding` CSS property with axis values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(vertical: Padding.Single, horizontal: Padding.Single) {
	padding(Padding.of(vertical = vertical, horizontal = horizontal))
}


/** Sets the `padding` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(top: Padding.Single, horizontal: Padding.Single, bottom: Padding.Single) {
	padding(Padding.of(top = top, horizontal = horizontal, bottom = bottom))
}


/** Sets the `padding` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(
	top: Padding.Single,
	right: Padding.Single,
	bottom: Padding.Single,
	left: Padding.Single,
) {
	padding(Padding.of(top = top, right = right, bottom = bottom, left = left))
}


/** Sets the `padding` CSS property. */
@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.padding(
	all: Padding.Single? = null,
	vertical: Padding.Single? = all,
	horizontal: Padding.Single? = all,
	top: Padding.Single? = vertical,
	right: Padding.Single? = horizontal,
	bottom: Padding.Single? = vertical,
	left: Padding.Single? = horizontal,
) {
	if (top != null && left != null && right != null && bottom != null)
		padding(top = top, right = right, bottom = bottom, left = left)
	else {
		if (top != null)
			paddingTop(top)
		if (right != null)
			paddingRight(right)
		if (bottom != null)
			paddingBottom(bottom)
		if (left != null)
			paddingLeft(left)
	}
}


/** Sets the `padding-bottom` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingBottom(value: Padding.Single) {
	property(paddingBottom, value)
}


/** Sets the `padding-left` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingLeft(value: Padding.Single) {
	property(paddingLeft, value)
}


/** Sets the `padding-right` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingRight(value: Padding.Single) {
	property(paddingRight, value)
}


/** Sets the `padding-top` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingTop(value: Padding.Single) {
	property(paddingTop, value)
}


/** The `padding` CSS property. */
@Suppress("unused")
public inline val CssProperties.padding: CssProperty<Padding>
	get() = CssProperty.unsafe("padding")


/** The `padding-bottom` CSS property. */
@Suppress("unused")
public inline val CssProperties.paddingBottom: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-bottom")


/** The `padding-left` CSS property. */
@Suppress("unused")
public inline val CssProperties.paddingLeft: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-left")


/** The `padding-right` CSS property. */
@Suppress("unused")
public inline val CssProperties.paddingRight: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-right")


/** The `padding-top` CSS property. */
@Suppress("unused")
public inline val CssProperties.paddingTop: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-top")
