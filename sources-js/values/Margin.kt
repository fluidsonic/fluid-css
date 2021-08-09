@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Margin : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : Margin {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : Margin, CssVariable<Margin>
}


@CssDsl
public inline val Margin.Companion.auto: Margin.Single
	get() = Margin.Single.unsafe("auto")


public inline fun Margin.Companion.all(value: Margin.Single): Margin =
	value


public inline fun Margin.Companion.of(vertical: Margin.Single, horizontal: Margin.Single): Margin =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun Margin.Companion.of(top: Margin.Single, horizontal: Margin.Single, bottom: Margin.Single): Margin =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


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


public inline fun Margin.Companion.unsafe(value: String): Margin =
	CssValue.unsafe(value)


public inline fun Margin.Companion.variable(name: String): Margin.Variable =
	CssVariable.unsafe(name)


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


public inline fun Margin.Single.Companion.unsafe(value: String): Margin.Single =
	CssValue.unsafe(value)


public inline fun Margin.Single.Companion.variable(name: String): Margin.Single.Variable =
	CssVariable.unsafe(name)


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
