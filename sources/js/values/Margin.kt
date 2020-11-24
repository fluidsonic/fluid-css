@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Margin : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: Single
			get() = Single.unsafe("auto")


		public inline fun all(value: Single): Margin =
			value


		public inline fun of(vertical: Single, horizontal: Single): Margin =
			if (vertical eq horizontal)
				all(vertical)
			else
				unsafe("$vertical $horizontal")


		public inline fun of(top: Single, horizontal: Single, bottom: Single): Margin =
			if (top eq bottom)
				of(vertical = top, horizontal = horizontal)
			else
				unsafe("$top $horizontal $bottom")


		public inline fun of(
			top: Single,
			right: Single,
			bottom: Single,
			left: Single,
		): Margin =
			if (left eq right)
				of(top = top, horizontal = left, bottom = bottom)
			else
				unsafe("$top $right $bottom $left")


		public inline fun unsafe(value: String): Margin =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Single : Margin {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : Margin, CssVariable<Margin>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(all: Margin) {
	property(margin, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(vertical: Margin.Single, horizontal: Margin.Single) {
	margin(Margin.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(top: Margin.Single, horizontal: Margin.Single, bottom: Margin.Single) {
	margin(Margin.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.margin(
	top: Margin.Single,
	right: Margin.Single,
	bottom: Margin.Single,
	left: Margin.Single,
) {
	margin(Margin.of(top = top, right = right, bottom = bottom, left = left))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("DEPRECATION", "INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
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


@CssDsl
public inline fun CssDeclarationBlockBuilder.marginBottom(value: Margin.Single) {
	property(marginBottom, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.marginLeft(value: Margin.Single) {
	property(marginLeft, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.marginRight(value: Margin.Single) {
	property(marginRight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.marginTop(value: Margin.Single) {
	property(marginTop, value)
}


@Suppress("unused")
public inline val CssProperties.margin: CssProperty<Margin>
	get() = CssProperty.unsafe("margin")


@Suppress("unused")
public inline val CssProperties.marginBottom: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-bottom")


@Suppress("unused")
public inline val CssProperties.marginLeft: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-left")


@Suppress("unused")
public inline val CssProperties.marginRight: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-right")


@Suppress("unused")
public inline val CssProperties.marginTop: CssProperty<Margin.Single>
	get() = CssProperty.unsafe("margin-top")
