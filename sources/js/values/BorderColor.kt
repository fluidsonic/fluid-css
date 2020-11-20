@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderColor : CssValue, Internal {

	public companion object {

		public fun all(value: Single): BorderColor =
			value


		public fun of(vertical: Single, horizontal: Single): BorderColor =
			if (vertical == horizontal)
				all(vertical)
			else
				raw("$vertical $horizontal")


		public fun of(top: Single, horizontal: Single, bottom: Single): BorderColor =
			if (top == bottom)
				of(vertical = top, horizontal = horizontal)
			else
				raw("$top $horizontal $bottom")


		public fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): BorderColor =
			if (left == right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				raw("$top $right $bottom $left")


		public fun raw(value: String): BorderColor =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : BorderColor


	public interface Variable : BorderColor, CssVariable<BorderColor>
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderColor(all: BorderColor) {
	property(borderColor, all)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderColor(vertical: BorderColor.Single, horizontal: BorderColor.Single) {
	borderColor(BorderColor.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderColor(top: BorderColor.Single, horizontal: BorderColor.Single, bottom: BorderColor.Single) {
	borderColor(BorderColor.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderColor(
	top: BorderColor.Single,
	right: BorderColor.Single,
	bottom: BorderColor.Single,
	left: BorderColor.Single,
) {
	borderColor(BorderColor.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.borderColor(
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


@CssDsl
public fun CssDeclarationBlockBuilder.borderBottomColor(value: BorderColor.Single) {
	property(borderBottomColor, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderLeftColor(value: BorderColor.Single) {
	property(borderLeftColor, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderRightColor(value: BorderColor.Single) {
	property(borderRightColor, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderTopColor(value: BorderColor.Single) {
	property(borderTopColor, value)
}


@Suppress("unused")
public val CssProperties.borderColor: CssProperty<BorderColor>
	get() = CssProperty("border-color")


@Suppress("unused")
public val CssProperties.borderBottomColor: CssProperty<BorderColor.Single>
	get() = CssProperty("border-bottom-color")


@Suppress("unused")
public val CssProperties.borderLeftColor: CssProperty<BorderColor.Single>
	get() = CssProperty("border-left-color")


@Suppress("unused")
public val CssProperties.borderRightColor: CssProperty<BorderColor.Single>
	get() = CssProperty("border-right-color")


@Suppress("unused")
public val CssProperties.borderTopColor: CssProperty<BorderColor.Single>
	get() = CssProperty("border-top-color")
