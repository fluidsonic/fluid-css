@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BorderStyle : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Single = GenericValue("none")


		@CssDsl
		public val dashed: Single = GenericValue("dashed")

		@CssDsl
		public val dotted: Single = GenericValue("dotted")

		@CssDsl
		public val double: Single = GenericValue("double")

		@CssDsl
		public val groove: Single = GenericValue("groove")

		@CssDsl
		public val hidden: Single = GenericValue("hidden")

		@CssDsl
		public val inset: Single = GenericValue("inset")

		@CssDsl
		public val outset: Single = GenericValue("outset")

		@CssDsl
		public val ridge: Single = GenericValue("ridge")

		@CssDsl
		public val solid: Single = GenericValue("solid")


		public fun all(value: Single): BorderStyle =
			value


		public fun of(vertical: Single, horizontal: Single): BorderStyle =
			if (vertical == horizontal)
				all(vertical)
			else
				raw("$vertical $horizontal")


		public fun of(top: Single, horizontal: Single, bottom: Single): BorderStyle =
			if (top == bottom)
				of(vertical = top, horizontal = horizontal)
			else
				raw("$top $horizontal $bottom")


		public fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): BorderStyle =
			if (left == right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				raw("$top $right $bottom $left")


		public fun raw(value: String): BorderStyle =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : BorderStyle


	public interface Variable : BorderStyle, CssVariable<BorderStyle>
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderStyle(all: BorderStyle) {
	property(borderStyle, all)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderStyle(vertical: BorderStyle.Single, horizontal: BorderStyle.Single) {
	borderStyle(BorderStyle.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderStyle(top: BorderStyle.Single, horizontal: BorderStyle.Single, bottom: BorderStyle.Single) {
	borderStyle(BorderStyle.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderStyle(
	top: BorderStyle.Single,
	right: BorderStyle.Single,
	bottom: BorderStyle.Single,
	left: BorderStyle.Single,
) {
	borderStyle(BorderStyle.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.borderStyle(
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


@CssDsl
public fun CssDeclarationBlockBuilder.borderBottomStyle(value: BorderStyle.Single) {
	property(borderBottomStyle, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderLeftStyle(value: BorderStyle.Single) {
	property(borderLeftStyle, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderRightStyle(value: BorderStyle.Single) {
	property(borderRightStyle, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.borderTopStyle(value: BorderStyle.Single) {
	property(borderTopStyle, value)
}


@Suppress("unused")
public val CssProperties.borderStyle: CssProperty<BorderStyle>
	get() = CssProperty("border-style")


@Suppress("unused")
public val CssProperties.borderBottomStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty("border-bottom-style")


@Suppress("unused")
public val CssProperties.borderLeftStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty("border-left-style")


@Suppress("unused")
public val CssProperties.borderRightStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty("border-right-style")


@Suppress("unused")
public val CssProperties.borderTopStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty("border-top-style")
