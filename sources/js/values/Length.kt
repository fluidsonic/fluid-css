@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Length :
	BorderWidth.Single,
	LengthOrPercentage,
	LetterSpacing,
	OutlineWidth,
	Internal {

	public companion object {

		@CssDsl
		public val zero: Length = numeric(0, "")


		public fun calc(value: String): Length =
			raw("calc($value)")


		public fun numeric(value: Number, unit: String): Numeric =
			NumericDefault(unit = unit, value = value.toDouble())


		public fun raw(value: String): Length =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Numeric : Length {

		public val value: Double
		public val unit: String
	}

	private class NumericDefault(
		override val unit: String,
		override val value: Double,
	) : GenericValue("$value$unit"), Numeric


	public interface Variable : Length, CssVariable<Length>
}


@CssDsl
public operator fun Length.div(other: Number): Length =
	when {
		other == 1.0 -> this
		this is Length.Numeric -> when (value) {
			0.0 -> this
			else -> Length.numeric(value / other.toDouble(), unit)
		}
		else -> Length.calc("($this) / $other")
	}


@CssDsl
public operator fun Length.minus(other: Length): Length =
	when {
		this is Length.Numeric && other is Length.Numeric && unit == other.unit -> Length.numeric(value - other.value, unit)
		else -> Length.calc("($this) - ($other)")
	}


@CssDsl
public operator fun Length.times(other: Number): Length =
	when {
		other == 1.0 -> this
		this is Length.Numeric -> when (value) {
			0.0 -> this
			else -> Length.numeric(value * other.toDouble(), unit)
		}
		else -> Length.calc("($this) * $other")
	}


@CssDsl
public operator fun Length.plus(other: Length): Length =
	when {
		this is Length.Numeric && other is Length.Numeric && unit == other.unit -> Length.numeric(value + other.value, unit)
		else -> Length.calc("($this) + ($other)")
	}


@CssDsl
public operator fun Length.unaryPlus(): Length =
	this


@CssDsl
public operator fun Length.unaryMinus(): Length =
	this * -1


@CssDsl
public operator fun Number.times(other: Length): Length =
	other * this


@CssDsl
public val Number.ch: Length.Numeric
	get() = Length.numeric(this, "ch")


@CssDsl
public val Number.cm: Length.Numeric
	get() = Length.numeric(this, "cm")


@CssDsl
public val Number.mm: Length.Numeric
	get() = Length.numeric(this, "mm")


@CssDsl
public val Number.em: Length.Numeric
	get() = Length.numeric(this, "em")


@CssDsl
public val Number.ex: Length.Numeric
	get() = Length.numeric(this, "ex")


@CssDsl
public val Number.inch: Length.Numeric
	get() = Length.numeric(this, "in")


@CssDsl
public val Number.pc: Length.Numeric
	get() = Length.numeric(this, "pc")


@CssDsl
public val Number.pt: Length.Numeric
	get() = Length.numeric(this, "pt")


@CssDsl
public val Number.px: Length.Numeric
	get() = Length.numeric(this, "px")


@CssDsl
public val Number.rem: Length.Numeric
	get() = Length.numeric(this, "rem")


@CssDsl
public val Number.vh: Length.Numeric
	get() = Length.numeric(this, "vh")


@CssDsl
public val Number.vmax: Length.Numeric
	get() = Length.numeric(this, "vmax")


@CssDsl
public val Number.vmin: Length.Numeric
	get() = Length.numeric(this, "vmin")


@CssDsl
public val Number.vw: Length.Numeric
	get() = Length.numeric(this, "vw")
