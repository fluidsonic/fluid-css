@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface PercentageOrAutoOrGlobal : CssValue
public interface PercentageOrAuto : PercentageOrAutoOrGlobal, LengthOrPercentageOrAuto
public interface PercentageOrGlobal : PercentageOrAutoOrGlobal, LengthOrPercentageOrGlobal

public interface Percentage :
	FontFace.Stretch,
	FontSize,
	Height,
	LengthOrPercentage,
	LineHeight,
	Opacity,
	PercentageOrAuto,
	PercentageOrGlobal,
	TextDecorationThickness,
	Width {

	public companion object {

		public val auto: PercentageOrAuto = AutoValue.auto


		public inline fun calc(value: String): Percentage =
			raw("calc($value)")


		public inline fun of(value: Number): Percentage =
			NumericPercentage.of(value)


		public fun raw(value: String): Percentage =
			Default(value)
	}


	private class Default(value: String) : CssValueBase(value), Percentage
}


public interface NumericPercentage : Percentage {

	public val value: Double


	public companion object {

		public fun of(value: Number): NumericPercentage =
			Default(value.toDouble())
	}


	private class Default(
		override val value: Double,
	) : CssValueBase("$value%"), NumericPercentage
}


public operator fun Percentage.div(other: Number): Percentage =
	when {
		other == 1.0 -> this
		this is NumericPercentage -> when (value) {
			0.0 -> this
			else -> Percentage.of(value / other.toDouble())
		}
		else -> Percentage.calc("($this) / $other")
	}


public operator fun Percentage.minus(other: Percentage): Percentage =
	when {
		this is NumericPercentage && other is NumericPercentage -> Percentage.of(value - other.value)
		else -> Percentage.calc("($this) - ($other)")
	}


public operator fun Percentage.times(other: Number): Percentage =
	when {
		other == 1.0 -> this
		this is NumericPercentage -> when (value) {
			0.0 -> this
			else -> Percentage.of(value * other.toDouble())
		}
		else -> Percentage.calc("($this) * $other")
	}


public operator fun Percentage.plus(other: Percentage): Percentage =
	when {
		this is NumericPercentage && other is NumericPercentage -> Percentage.of(value + other.value)
		else -> Percentage.calc("($this) + ($other)")
	}


public inline operator fun Percentage.unaryPlus(): Percentage =
	this


public inline operator fun Percentage.unaryMinus(): Percentage =
	this * -1


public inline operator fun Number.times(other: Percentage): Percentage =
	other * this


public val Number.percent: Percentage get() = Percentage.of(this)
