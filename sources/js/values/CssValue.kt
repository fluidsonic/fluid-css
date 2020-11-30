@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssValue`. */
public external interface CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val inherit: Global
			get() = unsafe("inherit")

		@CssDsl
		public inline val initial: Global
			get() = unsafe("initial")

		@CssDsl
		public inline val unset: Global
			get() = unsafe("unset")


		public inline fun <Value : CssValue> unsafe(value: Double): Value =
			unsafe("$value") // https://youtrack.jetbrains.com/issue/KT-43567


		public inline fun <Value : CssValue> unsafe(value: Int): Value =
			unsafe("$value") // https://youtrack.jetbrains.com/issue/KT-43567


		public inline fun <Value : CssValue> unsafe(value: String): Value =
			value.unsafeCast<Value>()
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
		BackgroundRepeat,
		BackgroundSize,
		Border,
		BorderCollapse,
		BorderColor,
		BorderStyle,
		BorderWidth,
		BoxOffset,
		BoxShadow,
		BoxSizing,
		CaretColor,
		Color,
		Content,
		CounterIncrement,
		CounterReset,
		CssGradient,
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
		LetterSpacing,
		LineHeight,
		ListStyleType,
		Margin,
		Opacity,
		Outline,
		OutlineColor,
		OutlineStyle,
		OutlineWidth,
		Overflow.Axis,
		Padding,
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
		TextOverflow,
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


	public interface DoubleConstructable : IntConstructable
	public interface IntConstructable : CssValue
	public interface StringConstructable : CssValue
}


public inline fun CssValue.asString(): String =
	unsafeCast<String>()


public inline infix fun CssValue.eq(other: CssValue): Boolean =
	asString() == other.asString()


@Suppress("DEPRECATION")
public inline infix fun CssValue?.eq(other: CssValue?): Boolean =
	this?.asString() == other?.asString()


@Suppress("DEPRECATION")
public inline infix fun CssValue?.eq(other: Nothing?): Boolean =
	this == null


public inline infix fun CssValue.ne(other: CssValue): Boolean =
	asString() != other.asString()


@Suppress("DEPRECATION")
public inline infix fun CssValue?.ne(other: CssValue?): Boolean =
	this?.asString() != other?.asString()


@Suppress("DEPRECATION")
public inline infix fun CssValue?.ne(other: Nothing?): Boolean =
	this != null
