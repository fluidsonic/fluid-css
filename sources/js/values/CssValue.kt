@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION"
)

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssValue`. */
public external interface CssValue {

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


	public interface Numeric : CssValue {

		public companion object {

			public inline fun <Value : Numeric> unsafe(value: Double): Value =
				unsafe("$value") // https://youtrack.jetbrains.com/issue/KT-43567


			public inline fun <Value : Numeric> unsafe(value: Int): Value =
				unsafe("$value") // https://youtrack.jetbrains.com/issue/KT-43567


			public inline fun <Value : Numeric> unsafe(value: String): Value =
				value.unsafeCast<Value>()
		}
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
		Gap.Axis,
		GridArea,
		GridTemplate,
		GridTemplateRows,
		JustifyContent,
		JustifyItems,
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
		TextTransform,
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
	public interface IntConstructable : Numeric
	public interface StringConstructable : CssValue
}


@CssDsl
public inline fun <Value : CssValue.Numeric> Value.coerceAtLeast(min: Value): Value =
	CssMath.max(this, min)


@CssDsl
public inline fun <Value : CssValue.Numeric> Value.coerceAtMost(max: Value): Value =
	CssMath.min(this, max)


@CssDsl
public inline fun <Value : CssValue.Numeric> Value.coerceIn(min: Value, max: Value): Value =
	CssValue.Numeric.unsafe("max($min,min($this,$max))") // Support for min() and max() is better than clamp() as of December 1, 2020.


public inline fun CssValue.asString(): String =
	unsafeCast<String>()


// Using 'eq' and 'ne' instead of '==' is more efficient because we skip type-checking.
// That in turn allows for compile-time optimizations.

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
