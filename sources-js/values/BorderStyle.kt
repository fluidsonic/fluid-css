@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BorderStyle : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : BorderStyle {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : BorderStyle, CssVariable<BorderStyle>
}


@CssDsl
public inline val BorderStyle.Companion.none: BorderStyle.Single
	get() = CssValue.unsafe("none")


@CssDsl
public inline val BorderStyle.Companion.dashed: BorderStyle.Single
	get() = CssValue.unsafe("dashed")

@CssDsl
public inline val BorderStyle.Companion.dotted: BorderStyle.Single
	get() = CssValue.unsafe("dotted")

@CssDsl
public inline val BorderStyle.Companion.double: BorderStyle.Single
	get() = CssValue.unsafe("double")

@CssDsl
public inline val BorderStyle.Companion.groove: BorderStyle.Single
	get() = CssValue.unsafe("groove")

@CssDsl
public inline val BorderStyle.Companion.hidden: BorderStyle.Single
	get() = CssValue.unsafe("hidden")

@CssDsl
public inline val BorderStyle.Companion.inset: BorderStyle.Single
	get() = CssValue.unsafe("inset")

@CssDsl
public inline val BorderStyle.Companion.outset: BorderStyle.Single
	get() = CssValue.unsafe("outset")

@CssDsl
public inline val BorderStyle.Companion.ridge: BorderStyle.Single
	get() = CssValue.unsafe("ridge")

@CssDsl
public inline val BorderStyle.Companion.solid: BorderStyle.Single
	get() = CssValue.unsafe("solid")


public inline fun BorderStyle.Companion.all(value: BorderStyle.Single): BorderStyle =
	value


public inline fun BorderStyle.Companion.of(vertical: BorderStyle.Single, horizontal: BorderStyle.Single): BorderStyle =
	if (vertical eq horizontal)
		all(vertical)
	else
		unsafe("$vertical $horizontal")


public inline fun BorderStyle.Companion.of(top: BorderStyle.Single, horizontal: BorderStyle.Single, bottom: BorderStyle.Single): BorderStyle =
	if (top eq bottom)
		of(vertical = top, horizontal = horizontal)
	else
		unsafe("$top $horizontal $bottom")


public inline fun BorderStyle.Companion.of(
	top: BorderStyle.Single,
	right: BorderStyle.Single,
	bottom: BorderStyle.Single,
	left: BorderStyle.Single,
): BorderStyle =
	if (left eq right)
		of(top = top, horizontal = left, bottom = bottom)
	else
		unsafe("$top $right $bottom $left")


public inline fun BorderStyle.Companion.unsafe(value: String): BorderStyle =
	CssValue.unsafe(value)


public inline fun BorderStyle.Companion.variable(name: String): BorderStyle.Variable =
	CssVariable.unsafe(name)


public inline fun BorderStyle.Single.Companion.unsafe(value: String): BorderStyle.Single =
	CssValue.unsafe(value)


public inline fun BorderStyle.Single.Companion.variable(name: String): BorderStyle.Single.Variable =
	CssVariable.unsafe(name)


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
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
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
