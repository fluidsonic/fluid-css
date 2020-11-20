@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Time : CssValue, Internal {

	public companion object {

		@CssDsl
		public val zero: Time = numeric(0, "")


		public fun calc(value: String): Time =
			raw("calc($value)")


		public fun numeric(value: Number, unit: String): Numeric =
			NumericDefault(unit = unit, value = value.toDouble())


		public fun raw(value: String): Time =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Numeric : Time {

		public val value: Double
		public val unit: String
	}


	private class NumericDefault(
		override val unit: String,
		override val value: Double,
	) : GenericValue("$value$unit"), Numeric


	public interface Variable : Time, CssVariable<Time>
}


@CssDsl
public operator fun Time.div(other: Number): Time =
	when {
		other == 1.0 -> this
		this is Time.Numeric -> when (value) {
			0.0 -> this
			else -> Time.numeric(value / other.toDouble(), unit)
		}
		else -> Time.calc("($this) / $other")
	}


@CssDsl
public operator fun Time.minus(other: Time): Time =
	when {
		this is Time.Numeric && other is Time.Numeric && unit == other.unit -> Time.numeric(value - other.value, unit)
		else -> Time.calc("($this) - ($other)")
	}


@CssDsl
public operator fun Time.times(other: Number): Time =
	when {
		other == 1.0 -> this
		this is Time.Numeric -> when (value) {
			0.0 -> this
			else -> Time.numeric(value * other.toDouble(), unit)
		}
		else -> Time.calc("($this) * $other")
	}


@CssDsl
public operator fun Time.plus(other: Time): Time =
	when {
		this is Time.Numeric && other is Time.Numeric && unit == other.unit -> Time.numeric(value + other.value, unit)
		else -> Time.calc("($this) + ($other)")
	}


@CssDsl
public operator fun Time.unaryPlus(): Time =
	this


@CssDsl
public operator fun Time.unaryMinus(): Time =
	this * -1


@CssDsl
public operator fun Number.times(other: Time): Time =
	other * this


@CssDsl
public val Number.s: Time
	get() = Time.numeric(this, "s")


@CssDsl
public val Number.ms: Time
	get() = Time.numeric(this, "ms")
