@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Padding : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Single = GenericValue("auto")


		public fun all(value: Single): Padding =
			value


		public fun of(vertical: Single, horizontal: Single): Padding =
			if (vertical == horizontal)
				all(vertical)
			else
				raw("$vertical $horizontal")


		public fun of(top: Single, horizontal: Single, bottom: Single): Padding =
			if (top == bottom)
				of(vertical = top, horizontal = horizontal)
			else
				raw("$top $horizontal $bottom")


		public fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): Padding =
			if (left == right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				raw("$top $right $bottom $left")


		public fun raw(value: String): Padding =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : Padding


	public interface Variable : Padding, CssVariable<Padding>
}


@CssDsl
public fun CssDeclarationBlockBuilder.padding(all: Padding) {
	property(padding, all)
}


@CssDsl
public fun CssDeclarationBlockBuilder.padding(vertical: Padding.Single, horizontal: Padding.Single) {
	padding(Padding.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public fun CssDeclarationBlockBuilder.padding(top: Padding.Single, horizontal: Padding.Single, bottom: Padding.Single) {
	padding(Padding.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public fun CssDeclarationBlockBuilder.padding(
	top: Padding.Single,
	right: Padding.Single,
	bottom: Padding.Single,
	left: Padding.Single,
) {
	padding(Padding.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.padding(
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


@CssDsl
public fun CssDeclarationBlockBuilder.paddingBottom(value: Padding.Single) {
	property(paddingBottom, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.paddingLeft(value: Padding.Single) {
	property(paddingLeft, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.paddingRight(value: Padding.Single) {
	property(paddingRight, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.paddingTop(value: Padding.Single) {
	property(paddingTop, value)
}


@Suppress("unused")
public val CssProperties.padding: CssProperty<Padding>
	get() = CssProperty("padding")


@Suppress("unused")
public val CssProperties.paddingBottom: CssProperty<Padding.Single>
	get() = CssProperty("padding-bottom")


@Suppress("unused")
public val CssProperties.paddingLeft: CssProperty<Padding.Single>
	get() = CssProperty("padding-left")


@Suppress("unused")
public val CssProperties.paddingRight: CssProperty<Padding.Single>
	get() = CssProperty("padding-right")


@Suppress("unused")
public val CssProperties.paddingTop: CssProperty<Padding.Single>
	get() = CssProperty("padding-top")
