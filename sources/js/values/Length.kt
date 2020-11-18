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
		public val zero: Length = numeric(0, "")


		public inline fun calc(value: String): Length =
			raw("calc($value)")


		public fun numeric(value: Number, unit: String): Numeric =
			NumericDefault(unit = unit, value = value.toDouble())


		public fun raw(value: String): Length =
			Default(value)


		public fun variable(name: String): Variable =
			VariableDefault(name)
	}


	private class Default(value: String) : CssValueBase(value), Length


	public interface Numeric : Length {

		public val value: Double
		public val unit: String
	}

	private class NumericDefault(
		override val unit: String,
		override val value: Double,
	) : CssValueBase("$value$unit"), Numeric


	public interface Variable : Length, CssVariable<Length>

	private class VariableDefault(name: String, vararg defaults: Length) : CssVariableBase<Length>(name, *defaults), Variable {

		override fun withDefaults(vararg defaults: Length): Length =
			VariableDefault(name, *defaults)
	}
}


public operator fun Length.div(other: Number): Length =
	when {
		other == 1.0 -> this
		this is Length.Numeric -> when (value) {
			0.0 -> this
			else -> Length.numeric(value / other.toDouble(), unit)
		}
		else -> Length.calc("($this) / $other")
	}


public operator fun Length.minus(other: Length): Length =
	when {
		this is Length.Numeric && other is Length.Numeric && unit == other.unit -> Length.numeric(value - other.value, unit)
		else -> Length.calc("($this) - ($other)")
	}


public operator fun Length.times(other: Number): Length =
	when {
		other == 1.0 -> this
		this is Length.Numeric -> when (value) {
			0.0 -> this
			else -> Length.numeric(value * other.toDouble(), unit)
		}
		else -> Length.calc("($this) * $other")
	}


public operator fun Length.plus(other: Length): Length =
	when {
		this is Length.Numeric && other is Length.Numeric && unit == other.unit -> Length.numeric(value + other.value, unit)
		else -> Length.calc("($this) + ($other)")
	}


public inline operator fun Length.unaryPlus(): Length =
	this


public inline operator fun Length.unaryMinus(): Length =
	this * -1


public inline operator fun Number.times(other: Length): Length =
	other * this


public inline val Number.ch: Length.Numeric get() = Length.numeric(this, "ch")
public inline val Number.cm: Length.Numeric get() = Length.numeric(this, "cm2")
public inline val Number.mm: Length.Numeric get() = Length.numeric(this, "mm2")
public inline val Number.em: Length.Numeric get() = Length.numeric(this, "em")
public inline val Number.ex: Length.Numeric get() = Length.numeric(this, "ex")
public inline val Number.inch: Length.Numeric get() = Length.numeric(this, "in")
public inline val Number.pc: Length.Numeric get() = Length.numeric(this, "pc")
public inline val Number.pt: Length.Numeric get() = Length.numeric(this, "pt")
public inline val Number.px: Length.Numeric get() = Length.numeric(this, "px")
public inline val Number.rem: Length.Numeric get() = Length.numeric(this, "rem")
public inline val Number.vh: Length.Numeric get() = Length.numeric(this, "vh")
public inline val Number.vmax: Length.Numeric get() = Length.numeric(this, "vmax")
public inline val Number.vmin: Length.Numeric get() = Length.numeric(this, "vmin")
public inline val Number.vw: Length.Numeric get() = Length.numeric(this, "vw")
