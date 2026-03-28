@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support 2nd radius w/ builder


/** Represents a CSS `border-radius` value. */
@JsName("0;0")
public external interface BorderRadius : CssValue {

	public companion object;


	/** A single `border-radius` value. */
	@JsName("0;0")
	public interface Single : BorderRadius {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [BorderRadius] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BorderRadius, CssVariable<BorderRadius>
}


/** Creates a [BorderRadius] applying the same value to all sides. */
public inline fun BorderRadius.Companion.all(value: BorderRadius.Single): BorderRadius =
	value


/** Creates a [BorderRadius] value. */
public inline fun BorderRadius.Companion.of(topLeftBottomRight: BorderRadius.Single, topRightBottomLeft: BorderRadius.Single): BorderRadius =
	if (topLeftBottomRight eq topRightBottomLeft)
		all(topLeftBottomRight)
	else
		unsafe("$topLeftBottomRight $topRightBottomLeft")


/** Creates a [BorderRadius] with three values. */
public inline fun BorderRadius.Companion.of(
	topLeft: BorderRadius.Single,
	topRightBottomLeft: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
): BorderRadius =
	if (topLeft eq bottomRight)
		of(topLeftBottomRight = topLeft, topRightBottomLeft = topRightBottomLeft)
	else
		unsafe("$topLeft $topRightBottomLeft $bottomRight")


/** Creates a [BorderRadius] with individual corner values. */
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


/** Creates a [BorderRadius] from an unchecked string [value]. */
public inline fun BorderRadius.Companion.unsafe(value: String): BorderRadius =
	CssValue.unsafe(value)


/** Creates a [BorderRadius] backed by a CSS variable with the given [name]. */
public inline fun BorderRadius.Companion.variable(name: String): BorderRadius.Variable =
	CssVariable.unsafe(name)


/** Creates a [Single] from an unchecked string [value]. */
public inline fun BorderRadius.Single.Companion.unsafe(value: String): BorderRadius.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun BorderRadius.Single.Companion.variable(name: String): BorderRadius.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `border-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(all: BorderRadius) {
	property(borderRadius, all)
}


/** Sets the `border-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(topLeftBottomRight: BorderRadius.Single, topRightBottomLeft: BorderRadius.Single) {
	borderRadius(BorderRadius.of(topLeftBottomRight = topLeftBottomRight, topRightBottomLeft = topRightBottomLeft))
}


/** Sets the `border-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: BorderRadius.Single,
	topRightBottomLeft: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
) {
	borderRadius(BorderRadius.of(topLeft = topLeft, topRightBottomLeft = topRightBottomLeft, bottomRight = bottomRight))
}


/** Sets the `border-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRadius(
	topLeft: BorderRadius.Single,
	topRight: BorderRadius.Single,
	bottomRight: BorderRadius.Single,
	bottomLeft: BorderRadius.Single,
) {
	borderRadius(BorderRadius.of(topLeft = topLeft, topRight = topRight, bottomRight = bottomRight, bottomLeft = bottomLeft))
}


/** Sets the `border-radius` CSS property. */
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


/** Sets the `border-bottom-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomRadius(value: BorderRadius.Single) {
	borderBottomLeftRadius(value)
	borderBottomRightRadius(value)
}


/** Sets the `border-bottom-left-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomLeftRadius(value: BorderRadius.Single) {
	property(borderBottomLeftRadius, value)
}


/** Sets the `border-bottom-right-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderBottomRightRadius(value: BorderRadius.Single) {
	property(borderBottomRightRadius, value)
}


/** Sets the `border-left-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderLeftRadius(value: BorderRadius.Single) {
	borderBottomLeftRadius(value)
	borderTopLeftRadius(value)
}


/** Sets the `border-right-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderRightRadius(value: BorderRadius.Single) {
	borderBottomRightRadius(value)
	borderTopRightRadius(value)
}


/** Sets the `border-top-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopRadius(value: BorderRadius.Single) {
	borderTopLeftRadius(value)
	borderTopRightRadius(value)
}


/** Sets the `border-top-left-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopLeftRadius(value: BorderRadius.Single) {
	property(borderTopLeftRadius, value)
}


/** Sets the `border-top-right-radius` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.borderTopRightRadius(value: BorderRadius.Single) {
	property(borderTopRightRadius, value)
}


/** The `border-radius` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderRadius: CssProperty<BorderRadius>
	get() = CssProperty.unsafe("border-radius")


/** The `border-bottom-left-radius` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottomLeftRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-bottom-left-radius")


/** The `border-bottom-right-radius` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderBottomRightRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-bottom-right-radius")


/** The `border-top-left-radius` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTopLeftRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-top-left-radius")


/** The `border-top-right-radius` CSS property. */
@Suppress("unused")
public inline val CssProperties.borderTopRightRadius: CssProperty<BorderRadius.Single>
	get() = CssProperty.unsafe("border-top-right-radius")
