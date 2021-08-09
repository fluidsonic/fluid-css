@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Padding : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : Padding {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : Padding, CssVariable<Padding>
}


@CssDsl
public inline val Padding.Companion.auto: Padding.Single
	get() = Padding.Single.unsafe("auto")


public inline fun Padding.Companion.all(value: Padding.Single): Padding =
	value


public inline fun Padding.Companion.of(vertical: Padding.Single, horizontal: Padding.Single): Padding =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun Padding.Companion.of(top: Padding.Single, horizontal: Padding.Single, bottom: Padding.Single): Padding =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


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


public inline fun Padding.Companion.unsafe(value: String): Padding =
	CssValue.unsafe(value)


public inline fun Padding.Companion.variable(name: String): Padding.Variable =
	CssVariable.unsafe(name)


public inline fun Padding.Single.Companion.unsafe(value: String): Padding.Single =
	CssValue.unsafe(value)


public inline fun Padding.Single.Companion.variable(name: String): Padding.Single.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(all: Padding) {
	property(padding, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(vertical: Padding.Single, horizontal: Padding.Single) {
	padding(Padding.of(vertical = vertical, horizontal = horizontal))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(top: Padding.Single, horizontal: Padding.Single, bottom: Padding.Single) {
	padding(Padding.of(top = top, horizontal = horizontal, bottom = bottom))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.padding(
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


@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingBottom(value: Padding.Single) {
	property(paddingBottom, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingLeft(value: Padding.Single) {
	property(paddingLeft, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingRight(value: Padding.Single) {
	property(paddingRight, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.paddingTop(value: Padding.Single) {
	property(paddingTop, value)
}


@Suppress("unused")
public inline val CssProperties.padding: CssProperty<Padding>
	get() = CssProperty.unsafe("padding")


@Suppress("unused")
public inline val CssProperties.paddingBottom: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-bottom")


@Suppress("unused")
public inline val CssProperties.paddingLeft: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-left")


@Suppress("unused")
public inline val CssProperties.paddingRight: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-right")


@Suppress("unused")
public inline val CssProperties.paddingTop: CssProperty<Padding.Single>
	get() = CssProperty.unsafe("padding-top")
