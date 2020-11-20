@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LengthOrPercentage :
	BackgroundPositionX,
	BackgroundPositionY,
	BackgroundSize,
	BorderRadius.Single,
	BoxOffset,
	FlexBasis,
	FontSize,
	LineHeight,
	Margin.Single,
	Padding.Single,
	Size,
	SizeLimit,
	StrokeWidth,
	TextDecorationThickness,
	TransformOriginX,
	TransformOriginY,
	VerticalAlign {

	public companion object {

		public fun calc(value: String): LengthOrPercentage =
			raw("calc($value)")


		public fun raw(value: String): LengthOrPercentage =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : LengthOrPercentage, CssVariable<LengthOrPercentage>
}


@CssDsl
public operator fun LengthOrPercentage.div(other: Number): LengthOrPercentage =
	when {
		other == 1.0 -> this
		this is Length -> this / other
		this is Percentage -> this / other
		else -> LengthOrPercentage.calc("($this) / $other")
	}


@CssDsl
public operator fun LengthOrPercentage.minus(other: LengthOrPercentage): LengthOrPercentage =
	when {
		this is Length && other is Length -> this - other
		this is Percentage && other is Percentage -> this - other
		else -> LengthOrPercentage.calc("($this) - ($other)")
	}


@CssDsl
public operator fun LengthOrPercentage.times(other: Number): LengthOrPercentage =
	when {
		other == 1.0 -> this
		this is Length -> this * other
		this is Percentage -> this * other
		else -> LengthOrPercentage.calc("($this) * $other")
	}


@CssDsl
public operator fun LengthOrPercentage.plus(other: LengthOrPercentage): LengthOrPercentage =
	when {
		this is Length && other is Length -> this + other
		this is Percentage && other is Percentage -> this + other
		else -> LengthOrPercentage.calc("($this) + ($other)")
	}


@CssDsl
public operator fun LengthOrPercentage.unaryPlus(): LengthOrPercentage =
	this


@CssDsl
public operator fun LengthOrPercentage.unaryMinus(): LengthOrPercentage =
	this * -1


@CssDsl
public operator fun Number.times(other: LengthOrPercentage): LengthOrPercentage =
	other * this
