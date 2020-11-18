@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LengthOrPercentageOrAutoOrGlobal : CssValue
public interface LengthOrPercentageOrAuto : LengthOrPercentageOrAutoOrGlobal
public interface LengthOrPercentageOrGlobal : LengthOrPercentageOrAutoOrGlobal

public interface LengthOrPercentage :
	FlexBasis,
	LengthOrPercentageOrAuto,
	LengthOrPercentageOrGlobal,
	StrokeWidth,
	TransformOriginX,
	TransformOriginY,
	VerticalAlign {

	public companion object {

		public inline fun calc(value: String): LengthOrPercentage =
			raw("calc($value)")


		public fun raw(value: String): LengthOrPercentage =
			Default(value)
	}


	private class Default(value: String) : CssValueImpl(value), LengthOrPercentage
}


public operator fun LengthOrPercentage.div(other: Number): LengthOrPercentage =
	when {
		other == 1.0 -> this
		this is Length -> this / other
		this is Percentage -> this / other
		else -> LengthOrPercentage.calc("($this) / $other")
	}


public operator fun LengthOrPercentage.minus(other: LengthOrPercentage): LengthOrPercentage =
	when {
		this is Length && other is Length -> this - other
		this is Percentage && other is Percentage -> this - other
		else -> LengthOrPercentage.calc("($this) - ($other)")
	}


public operator fun LengthOrPercentage.times(other: Number): LengthOrPercentage =
	when {
		other == 1.0 -> this
		this is Length -> this * other
		this is Percentage -> this * other
		else -> LengthOrPercentage.calc("($this) * $other")
	}


public operator fun LengthOrPercentage.plus(other: LengthOrPercentage): LengthOrPercentage =
	when {
		this is Length && other is Length -> this + other
		this is Percentage && other is Percentage -> this + other
		else -> LengthOrPercentage.calc("($this) + ($other)")
	}


public inline operator fun LengthOrPercentage.unaryPlus(): LengthOrPercentage =
	this


public inline operator fun LengthOrPercentage.unaryMinus(): LengthOrPercentage =
	this * -1


public inline operator fun Number.times(other: LengthOrPercentage): LengthOrPercentage =
	other * this
