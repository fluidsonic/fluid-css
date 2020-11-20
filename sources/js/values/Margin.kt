@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Margin : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Single = GenericValue("auto")


		public fun all(value: Single): Margin =
			value


		public fun of(vertical: Single, horizontal: Single): Margin =
			if (vertical == horizontal)
				all(vertical)
			else
				raw("$vertical $horizontal")


		public fun of(top: Single, horizontal: Single, bottom: Single): Margin =
			if (top == bottom)
				of(vertical = top, horizontal = horizontal)
			else
				raw("$top $horizontal $bottom")


		public fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): Margin =
			if (left == right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				raw("$top $right $bottom $left")


		public fun raw(value: String): Margin =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Single : Margin


	public interface Variable : Margin, CssVariable<Margin>
}


@CssDsl
public fun CssDeclarationBlockBuilder.margin(all: Margin) {
	property(margin, all)
}


@CssDsl
public fun CssDeclarationBlockBuilder.margin(vertical: Margin.Single, horizontal: Margin.Single) {
	margin(Margin.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public fun CssDeclarationBlockBuilder.margin(top: Margin.Single, horizontal: Margin.Single, bottom: Margin.Single) {
	margin(Margin.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public fun CssDeclarationBlockBuilder.margin(
	top: Margin.Single,
	right: Margin.Single,
	bottom: Margin.Single,
	left: Margin.Single,
) {
	margin(Margin.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.margin(
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


@CssDsl
public fun CssDeclarationBlockBuilder.marginBottom(value: Margin.Single) {
	property(marginBottom, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.marginLeft(value: Margin.Single) {
	property(marginLeft, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.marginRight(value: Margin.Single) {
	property(marginRight, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.marginTop(value: Margin.Single) {
	property(marginTop, value)
}


@Suppress("unused")
public val CssProperties.margin: CssProperty<Margin>
	get() = CssProperty("margin")


@Suppress("unused")
public val CssProperties.marginBottom: CssProperty<Margin.Single>
	get() = CssProperty("margin-bottom")


@Suppress("unused")
public val CssProperties.marginLeft: CssProperty<Margin.Single>
	get() = CssProperty("margin-left")


@Suppress("unused")
public val CssProperties.marginRight: CssProperty<Margin.Single>
	get() = CssProperty("margin-right")


@Suppress("unused")
public val CssProperties.marginTop: CssProperty<Margin.Single>
	get() = CssProperty("margin-top")
