@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple


public interface BoxShadowOrGlobal : CssValue
public interface BoxShadow : BoxShadowOrGlobal {

	public companion object {

		public val none: BoxShadow = NoneValue.none
	}
}


private class BoxShadowImpl(
	blurRadius: Length?,
	color: Color?,
	isInset: Boolean,
	offsetX: Length,
	offsetY: Length,
	spreadRadius: Length?,
) :
	CssValueBase(buildString {
		if (isInset)
			append("inset ")

		append(offsetX)
		append(" ")
		append(offsetY)

		if (blurRadius != null) {
			append(" ")
			append(blurRadius)
		}
		if (spreadRadius != null) {
			append(" ")
			append(spreadRadius)
		}
		if (color != null) {
			append(" ")
			append(color)
		}
	}),
	BoxShadow


@Suppress("FunctionName")
public fun BoxShadow(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	isInset: Boolean = false,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
): BoxShadow =
	BoxShadowImpl(
		blurRadius = blurRadius,
		color = color,
		isInset = isInset,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	)


public inline fun CssDeclarationBlockBuilder.boxShadow(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	boxShadow(BoxShadow(
		blurRadius = blurRadius,
		color = color,
		isInset = false,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


public inline fun CssDeclarationBlockBuilder.boxShadowInset(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	boxShadow(BoxShadow(
		blurRadius = blurRadius,
		color = color,
		isInset = true,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadow) {
	property(CssProperty.boxShadow, value)
}


public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadowOrGlobal) {
	property(CssProperty.boxShadow, value)
}


public inline fun CssDeclarationBlockBuilder.boxShadow(value: GlobalValue) {
	property(CssProperty.boxShadow, value)
}


public inline fun CssDeclarationBlockBuilder.boxShadow(value: CustomCssProperty<out BoxShadowOrGlobal>) {
	property(CssProperty.boxShadow, value)
}


public inline val CssProperty.Companion.boxShadow: CssProperty get() = CssProperty("box-shadow")
