@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BorderColor : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : BorderColor {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : BorderColor, CssVariable<BorderColor>
}


public inline fun BorderColor.Companion.all(value: BorderColor.Single): BorderColor =
	value


public inline fun BorderColor.Companion.of(vertical: BorderColor.Single, horizontal: BorderColor.Single): BorderColor =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun BorderColor.Companion.of(top: BorderColor.Single, horizontal: BorderColor.Single, bottom: BorderColor.Single): BorderColor =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


public inline fun BorderColor.Companion.of(
	top: BorderColor.Single,
	right: BorderColor.Single,
	bottom: BorderColor.Single,
	left: BorderColor.Single,
): BorderColor =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


public inline fun BorderColor.Companion.unsafe(value: String): BorderColor =
	CssValue.unsafe(value)


public inline fun BorderColor.Companion.variable(name: String): BorderColor.Variable =
	CssVariable.unsafe(name)


public inline fun BorderColor.Single.Companion.unsafe(value: String): BorderColor.Single =
	CssValue.unsafe(value)


public inline fun BorderColor.Single.Companion.variable(name: String): BorderColor.Single.Variable =
	CssVariable.unsafe(name)


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
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
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
