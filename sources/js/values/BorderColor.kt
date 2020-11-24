@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BorderColor : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun all(value: Single): BorderColor =
			value


		public inline fun of(vertical: Single, horizontal: Single): BorderColor =
			if (vertical eq horizontal)
				all(vertical)
			else
				unsafe("$vertical $horizontal")


		public inline fun of(top: Single, horizontal: Single, bottom: Single): BorderColor =
			if (top eq bottom)
				of(vertical = top, horizontal = horizontal)
			else
				unsafe("$top $horizontal $bottom")


		public inline fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): BorderColor =
			if (left eq right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				unsafe("$top $right $bottom $left")


		public inline fun unsafe(value: String): BorderColor =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Single : BorderColor {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : BorderColor, CssVariable<BorderColor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(all: BorderColor) {
	property(borderColor, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(vertical: BorderColor.Single, horizontal: BorderColor.Single) {
	borderColor(BorderColor.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(top: BorderColor.Single, horizontal: BorderColor.Single, bottom: BorderColor.Single) {
	borderColor(BorderColor.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderColor(
	top: BorderColor.Single,
	right: BorderColor.Single,
	bottom: BorderColor.Single,
	left: BorderColor.Single,
) {
	borderColor(BorderColor.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("DEPRECATION", "INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
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


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomColor(value: BorderColor.Single) {
	property(borderBottomColor, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftColor(value: BorderColor.Single) {
	property(borderLeftColor, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightColor(value: BorderColor.Single) {
	property(borderRightColor, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopColor(value: BorderColor.Single) {
	property(borderTopColor, value)
}


@Suppress("unused")
public inline val CssProperties.borderColor: CssProperty<BorderColor>
	get() = CssProperty.unsafe("border-color")


@Suppress("unused")
public inline val CssProperties.borderBottomColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-bottom-color")


@Suppress("unused")
public inline val CssProperties.borderLeftColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-left-color")


@Suppress("unused")
public inline val CssProperties.borderRightColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-right-color")


@Suppress("unused")
public inline val CssProperties.borderTopColor: CssProperty<BorderColor.Single>
	get() = CssProperty.unsafe("border-top-color")
