@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface LengthOrAutoOrGlobal : CssValue
public interface LengthOrAuto : LengthOrAutoOrGlobal, LengthOrPercentageOrAuto
public interface LengthOrGlobal : LengthOrAutoOrGlobal, LengthOrPercentageOrGlobal

public interface Length :
	BorderWidth,
	FontSize,
	Height,
	LengthOrAuto,
	LengthOrGlobal,
	LengthOrPercentage,
	LineHeight,
	TextDecorationThickness,
	Width {


	public companion object {

		public val auto: LengthOrAuto = AutoValue.auto
		public val zero: Length = of(0, "")


		public inline fun calc(value: String): Length =
			raw("calc($value)")


		public inline fun of(value: Number, unit: String): Length =
			NumericLength.of(value, unit)


		public fun raw(value: String): Length =
			Default(value)
	}


	private class Default(value: String) : CssValueImpl(value), Length
}


public interface NumericLength : Length {

	public val value: Double
	public val unit: String


	public companion object {

		public fun of(value: Number, unit: String): NumericLength =
			Default(value.toDouble(), unit)
	}


	private class Default(
		override val value: Double,
		override val unit: String,
	) : CssValueImpl("$value$unit"), NumericLength
}


public operator fun Length.div(other: Number): Length =
	when {
		other == 1.0 -> this
		this is NumericLength -> when (value) {
			0.0 -> this
			else -> Length.of(value / other.toDouble(), unit)
		}
		else -> Length.calc("($this) / $other")
	}


public operator fun Length.minus(other: Length): Length =
	when {
		this is NumericLength && other is NumericLength && unit == other.unit -> Length.of(value - other.value, unit)
		else -> Length.calc("($this) - ($other)")
	}


public operator fun Length.times(other: Number): Length =
	when {
		other == 1.0 -> this
		this is NumericLength -> when (value) {
			0.0 -> this
			else -> Length.of(value * other.toDouble(), unit)
		}
		else -> Length.calc("($this) * $other")
	}


public operator fun Length.plus(other: Length): Length =
	when {
		this is NumericLength && other is NumericLength && unit == other.unit -> Length.of(value + other.value, unit)
		else -> Length.calc("($this) + ($other)")
	}


public inline operator fun Length.unaryPlus(): Length =
	this


public inline operator fun Length.unaryMinus(): Length =
	this * -1


public inline operator fun Number.times(other: Length): Length =
	other * this


public inline val Number.ch: Length get() = Length.of(this, "ch")
public inline val Number.cm: Length get() = Length.of(this, "cm2")
public inline val Number.mm: Length get() = Length.of(this, "mm2")
public inline val Number.em: Length get() = Length.of(this, "em")
public inline val Number.ex: Length get() = Length.of(this, "ex")
public inline val Number.inch: Length get() = Length.of(this, "in")
public inline val Number.pc: Length get() = Length.of(this, "pc")
public inline val Number.pt: Length get() = Length.of(this, "pt")
public inline val Number.px: Length get() = Length.of(this, "px")
public inline val Number.rem: Length get() = Length.of(this, "rem")
public inline val Number.vh: Length get() = Length.of(this, "vh")
public inline val Number.vmax: Length get() = Length.of(this, "vmax")
public inline val Number.vmin: Length get() = Length.of(this, "vmin")
public inline val Number.vw: Length get() = Length.of(this, "vw")
