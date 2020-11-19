@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CssValue {

	override fun equals(other: Any?): Boolean
	override fun hashCode(): Int
	override fun toString(): String


	public companion object {

		@CssDsl
		public val inherit: Global = global("inherit")

		@CssDsl
		public val initial: Global = global("initial")

		@CssDsl
		public val unset: Global = global("unset")


		public fun global(value: String): Global =
			GenericValue(value)


		public inline fun raw(value: String): CssValue =
			global(value)
	}


	public interface Global :
		AlignItems,
		Angle,
		AnimationIterationCount,
		AnimationName,
		AnimationPlayState,
		Appearance,
		Background,
		BackgroundAttachment,
		BackgroundClip,
		BackgroundImage,
		BackgroundOrigin,
		BackgroundPosition,
		BackgroundPositionX.Align,
		BackgroundPositionY.Align,
		BackgroundRepeat,
		BackgroundRepeatAxis,
		BackgroundSize,
		Border,
		BorderCollapse,
		BorderColor.Single,
		BorderStyle.Single,
		BorderWidth.Single,
		BoxOffset,
		BoxShadow.Single,
		BoxSizing,
		CaretColor,
		Color,
		Content,
		CounterIncrement,
		CounterReset,
		CssImage,
		CssUrl,
		Cursor,
		Display,
		Flex,
		FlexBasis,
		FlexDirection,
		FlexGrow,
		FlexShrink,
		FontFamily,
		FontSize,
		FontStyle,
		FontVariantNumeric,
		FontVariantNumericFigure,
		FontVariantNumericFraction,
		FontVariantNumericSpacing,
		FontWeight,
		GridArea,
		GridTemplate,
		GridTemplateRows,
		JustifyContent,
		Length,
		LineHeight,
		ListStyleType,
		Margin.Single,
		Opacity,
		Outline,
		OutlineColor,
		OutlineStyle,
		OutlineWidth,
		Overflow.Axis,
		Padding.Single,
		Percentage,
		PointerEvents,
		Position,
		Resize,
		Size,
		SizeLimit,
		StrokeWidth,
		TableLayout,
		TextAlign,
		TextDecoration,
		TextDecorationLine,
		TextDecorationStyle,
		TextDecorationThickness,
		TextOverflow.Single,
		TextRendering,
		Time,
		TimingFunction,
		Transform,
		TransformOrigin,
		TransformOriginX,
		TransformOriginY,
		Transition.Single,
		UserSelect,
		VerticalAlign,
		Visibility,
		WhiteSpace,
		ZIndex


	public interface IntConstructable : CssValue
	public interface NumberConstructable : IntConstructable
	public interface StringConstructable : CssValue
}
