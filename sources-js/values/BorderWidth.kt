@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BorderWidth : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : BorderWidth {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : BorderWidth, CssVariable<BorderWidth>
}


@CssDsl
public inline val BorderWidth.Companion.medium: BorderWidth.Single
	get() = CssValue.unsafe("medium")

@CssDsl
public inline val BorderWidth.Companion.thin: BorderWidth.Single
	get() = CssValue.unsafe("thin")

@CssDsl
public inline val BorderWidth.Companion.thick: BorderWidth.Single
	get() = CssValue.unsafe("thick")


public inline fun BorderWidth.Companion.all(value: BorderWidth.Single): BorderWidth =
	value


public inline fun BorderWidth.Companion.of(vertical: BorderWidth.Single, horizontal: BorderWidth.Single): BorderWidth =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun BorderWidth.Companion.of(top: BorderWidth.Single, horizontal: BorderWidth.Single, bottom: BorderWidth.Single): BorderWidth =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


public inline fun BorderWidth.Companion.of(
	top: BorderWidth.Single,
	right: BorderWidth.Single,
	bottom: BorderWidth.Single,
	left: BorderWidth.Single,
): BorderWidth =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


public inline fun BorderWidth.Companion.unsafe(value: String): BorderWidth =
	CssValue.unsafe(value)


public inline fun BorderWidth.Companion.variable(name: String): BorderWidth.Variable =
	CssVariable.unsafe(name)


public inline fun BorderWidth.Single.Companion.unsafe(value: String): BorderWidth.Single =
	CssValue.unsafe(value)


public inline fun BorderWidth.Single.Companion.variable(name: String): BorderWidth.Single.Variable =
	CssVariable.unsafe(name)


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
	get() = CssProperty.unsafe("border-width")


@Suppress("unused")
public inline val CssProperties.borderBottomWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-bottom-width")


@Suppress("unused")
public inline val CssProperties.borderLeftWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-left-width")


@Suppress("unused")
public inline val CssProperties.borderRightWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-right-width")


@Suppress("unused")
public inline val CssProperties.borderTopWidth: CssProperty<BorderWidth.Single>
	get() = CssProperty.unsafe("border-top-width")
