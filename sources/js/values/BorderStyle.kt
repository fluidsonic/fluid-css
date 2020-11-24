@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BorderStyle : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val none: Single
			get() = CssValue.unsafe("none")


		@CssDsl
		public inline val dashed: Single
			get() = CssValue.unsafe("dashed")

		@CssDsl
		public inline val dotted: Single
			get() = CssValue.unsafe("dotted")

		@CssDsl
		public inline val double: Single
			get() = CssValue.unsafe("double")

		@CssDsl
		public inline val groove: Single
			get() = CssValue.unsafe("groove")

		@CssDsl
		public inline val hidden: Single
			get() = CssValue.unsafe("hidden")

		@CssDsl
		public inline val inset: Single
			get() = CssValue.unsafe("inset")

		@CssDsl
		public inline val outset: Single
			get() = CssValue.unsafe("outset")

		@CssDsl
		public inline val ridge: Single
			get() = CssValue.unsafe("ridge")

		@CssDsl
		public inline val solid: Single
			get() = CssValue.unsafe("solid")


		public inline fun all(value: Single): BorderStyle =
			value


		public inline fun of(vertical: Single, horizontal: Single): BorderStyle =
			if (vertical eq horizontal)
				all(vertical)
			else
				unsafe("$vertical $horizontal")


		public inline fun of(top: Single, horizontal: Single, bottom: Single): BorderStyle =
			if (top eq bottom)
				of(vertical = top, horizontal = horizontal)
			else
				unsafe("$top $horizontal $bottom")


		public inline fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): BorderStyle =
			if (left eq right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				unsafe("$top $right $bottom $left")


		public inline fun unsafe(value: String): BorderStyle =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Single : BorderStyle {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : BorderStyle, CssVariable<BorderStyle>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(all: BorderStyle) {
	property(borderStyle, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(vertical: BorderStyle.Single, horizontal: BorderStyle.Single) {
	borderStyle(BorderStyle.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(top: BorderStyle.Single, horizontal: BorderStyle.Single, bottom: BorderStyle.Single) {
	borderStyle(BorderStyle.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderStyle(
	top: BorderStyle.Single,
	right: BorderStyle.Single,
	bottom: BorderStyle.Single,
	left: BorderStyle.Single,
) {
	borderStyle(BorderStyle.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("DEPRECATION", "INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
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


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomStyle(value: BorderStyle.Single) {
	property(borderBottomStyle, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftStyle(value: BorderStyle.Single) {
	property(borderLeftStyle, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightStyle(value: BorderStyle.Single) {
	property(borderRightStyle, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopStyle(value: BorderStyle.Single) {
	property(borderTopStyle, value)
}


@Suppress("unused")
public inline val CssProperties.borderStyle: CssProperty<BorderStyle>
	get() = CssProperty.unsafe("border-style")


@Suppress("unused")
public inline val CssProperties.borderBottomStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-bottom-style")


@Suppress("unused")
public inline val CssProperties.borderLeftStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-left-style")


@Suppress("unused")
public inline val CssProperties.borderRightStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-right-style")


@Suppress("unused")
public inline val CssProperties.borderTopStyle: CssProperty<BorderStyle.Single>
	get() = CssProperty.unsafe("border-top-style")
