@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderWidth : CssValue, Internal {

	public companion object {

		@CssDsl
		public val medium: Single = GenericValue("medium")

		@CssDsl
		public val thin: Single = GenericValue("thin")

		@CssDsl
		public val thick: Single = GenericValue("thick")


		public inline fun all(value: Single): BorderWidth =
			value


		public inline fun of(vertical: Single, horizontal: Single): BorderWidth =
			if (vertical == horizontal)
				all(vertical)
			else
				raw("$vertical $horizontal")


		public inline fun of(top: Single, horizontal: Single, bottom: Single): BorderWidth =
			if (top == bottom)
				of(vertical = top, horizontal = horizontal)
			else
				raw("$top $horizontal $bottom")


		public inline fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): BorderWidth =
			if (left == right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				raw("$top $right $bottom $left")


		public fun raw(value: String): BorderWidth =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : BorderWidth


	public interface Variable : BorderWidth, CssVariable<BorderWidth>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(all: BorderWidth) {
	property(borderWidth, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(vertical: BorderWidth.Single, horizontal: BorderWidth.Single) {
	borderWidth(BorderWidth.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(top: BorderWidth.Single, horizontal: BorderWidth.Single, bottom: BorderWidth.Single) {
	borderWidth(BorderWidth.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderWidth(
	top: BorderWidth.Single,
	right: BorderWidth.Single,
	bottom: BorderWidth.Single,
	left: BorderWidth.Single,
) {
	borderWidth(BorderWidth.of(top = top, right = right, bottom = bottom, left = left))
}


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomWidth(value: BorderWidth.Single) {
	property(borderBottomWidth, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftWidth(value: BorderWidth.Single) {
	property(borderLeftWidth, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightWidth(value: BorderWidth.Single) {
	property(borderRightWidth, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopWidth(value: BorderWidth.Single) {
	property(borderTopWidth, value)
}


@Suppress("unused")
public inline val CssProperties.borderWidth: CssProperty<BorderWidth>
	get() = CssProperty("border-width")


@Suppress("unused")
public inline val CssProperties.borderBottomWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty("border-bottom-width")


@Suppress("unused")
public inline val CssProperties.borderLeftWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty("border-left-width")


@Suppress("unused")
public inline val CssProperties.borderRightWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty("border-right-width")


@Suppress("unused")
public inline val CssProperties.borderTopWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty("border-top-width")
