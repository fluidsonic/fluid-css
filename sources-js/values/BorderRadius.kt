@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support 2nd radius w/ builder


@JsName("0;0")
public external interface BorderRadius : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : BorderRadius {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : BorderRadius, CssVariable<BorderRadius>
}


public inline fun BorderRadius.Companion.all(value: BorderRadius.Single): BorderRadius =
	value


public inline fun BorderRadius.Companion.of(topLeftBottomRight: BorderRadius.Single, topRightBottomLeft: BorderRadius.Single): BorderRadius =
	if (topLeftBottomRight eq topRightBottomLeft)
		all(topLeftBottomRight)
	else
		unsafe("$topLeftBottomRight $topRightBottomLeft")


public inline fun BorderRadius.Companion.of(
	topLeft: BorderRadius.Single,
	topRightBottomLeft: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
): BorderRadius =
	if (topLeft eq bottomRight)
		of(topLeftBottomRight = topLeft, topRightBottomLeft = topRightBottomLeft)
	else
		unsafe("$topLeft $topRightBottomLeft $bottomRight")


public inline fun BorderRadius.Companion.of(
	topLeft: BorderRadius.Single,
	topRight: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
	bottomLeft: BorderRadius.Single,
): BorderRadius =
	if (bottomLeft eq topRight)
		of(topLeft = topLeft, topRightBottomLeft = bottomLeft, bottomRight = bottomRight)
	else
		unsafe("$topLeft $topRight $bottomRight $bottomLeft")


public inline fun BorderRadius.Companion.unsafe(value: String): BorderRadius =
	CssValue.unsafe(value)


public inline fun BorderRadius.Companion.variable(name: String): BorderRadius.Variable =
	CssVariable.unsafe(name)


public inline fun BorderRadius.Single.Companion.unsafe(value: String): BorderRadius.Single =
	CssValue.unsafe(value)


public inline fun BorderRadius.Single.Companion.variable(name: String): BorderRadius.Single.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(all: BorderRadius) {
	property(borderRadius, all)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(topLeftBottomRight: BorderRadius.Single, topRightBottomLeft: BorderRadius.Single) {
	borderRadius(BorderRadius.of(topLeftBottomRight = topLeftBottomRight, topRightBottomLeft = topRightBottomLeft))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: BorderRadius.Single,
	topRightBottomLeft: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
) {
	borderRadius(BorderRadius.of(topLeft = topLeft, topRightBottomLeft = topRightBottomLeft, bottomRight = bottomRight))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: BorderRadius.Single,
	topRight: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
	bottomLeft: BorderRadius.Single,
) {
	borderRadius(BorderRadius.of(topLeft = topLeft, topRight = topRight, bottomRight = bottomRight, bottomLeft = bottomLeft))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.borderRadius(
	all: BorderRadius.Single? = null,
	topLeft: BorderRadius.Single? = all,
	topRight: BorderRadius.Single? = all,
	bottomRight: BorderRadius.Single? = all,
	bottomLeft: BorderRadius.Single? = all,
) {
	if (topLeft != null && topRight != null && bottomRight != null && bottomLeft != null)
		borderRadius(topLeft = topLeft, topRight = topRight, bottomRight = bottomRight, bottomLeft = bottomLeft)
	else {
		if (topLeft != null)
			borderTopLeftRadius(topLeft)
		if (topRight != null)
			borderTopRightRadius(topRight)
		if (bottomRight != null)
			borderBottomRightRadius(bottomRight)
		if (bottomLeft != null)
			borderBottomLeftRadius(bottomLeft)
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomRadius(value: BorderRadius.Single) {
	borderBottomLeftRadius(value)
	borderBottomRightRadius(value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomLeftRadius(value: BorderRadius.Single) {
	property(borderBottomLeftRadius, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomRightRadius(value: BorderRadius.Single) {
	property(borderBottomRightRadius, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftRadius(value: BorderRadius.Single) {
	borderBottomLeftRadius(value)
	borderTopLeftRadius(value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightRadius(value: BorderRadius.Single) {
	borderBottomRightRadius(value)
	borderTopRightRadius(value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopRadius(value: BorderRadius.Single) {
	borderTopLeftRadius(value)
	borderTopRightRadius(value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopLeftRadius(value: BorderRadius.Single) {
	property(borderTopLeftRadius, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopRightRadius(value: BorderRadius.Single) {
	property(borderTopRightRadius, value)
}


@Suppress("unused")
public inline val CssProperties.borderRadius: CssProperty<BorderRadius>
	get() = CssProperty.unsafe("border-radius")


@Suppress("unused")
public inline val CssProperties.borderBottomLeftRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-bottom-left-radius")


@Suppress("unused")
public inline val CssProperties.borderBottomRightRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-bottom-right-radius")


@Suppress("unused")
public inline val CssProperties.borderTopLeftRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-top-left-radius")


@Suppress("unused")
public inline val CssProperties.borderTopRightRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-top-right-radius")
