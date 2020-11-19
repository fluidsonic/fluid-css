@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Angle : CssValue, Internal {

	public companion object {

		@CssDsl
		public val zero: Angle = numeric(0, "")


		public inline fun calc(value: String): Angle =
			raw("calc($value)")


		public fun numeric(value: Number, unit: String): Numeric =
			NumericDefault(unit = unit, value = value.toDouble())


		public fun raw(value: String): Angle =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Numeric : Angle {

		public val value: Double
		public val unit: String
	}


	private class NumericDefault(
        override val unit: String,
        override val value: Double,
    ) : GenericValue("$value$unit"), Numeric


	public interface Variable : Angle, CssVariable<Angle>
}


@CssDsl
public operator fun Angle.div(other: Number): Angle =
	when {
		other == 1.0 -> this
		this is Angle.Numeric -> when (value) {
            0.0 -> this
			else -> Angle.numeric(value / other.toDouble(), unit)
		}
		else -> Angle.calc("($this) / $other")
	}


@CssDsl
public operator fun Angle.minus(other: Angle): Angle =
	when {
		this is Angle.Numeric && other is Angle.Numeric && unit == other.unit -> Angle.numeric(value - other.value, unit)
		else -> Angle.calc("($this) - ($other)")
	}


@CssDsl
public operator fun Angle.times(other: Number): Angle =
	when {
		other == 1.0 -> this
		this is Angle.Numeric -> when (value) {
            0.0 -> this
			else -> Angle.numeric(value * other.toDouble(), unit)
		}
		else -> Angle.calc("($this) * $other")
	}


@CssDsl
public operator fun Angle.plus(other: Angle): Angle =
	when {
		this is Angle.Numeric && other is Angle.Numeric && unit == other.unit -> Angle.numeric(value + other.value, unit)
		else -> Angle.calc("($this) + ($other)")
	}


@CssDsl
public inline operator fun Angle.unaryPlus(): Angle =
	this


@CssDsl
public inline operator fun Angle.unaryMinus(): Angle =
	this * -1


@CssDsl
public inline operator fun Number.times(other: Angle): Angle =
	other * this


@CssDsl
public inline val Number.deg: Angle
	get() = Angle.numeric(this, "deg")


@CssDsl
public inline val Number.grad: Angle
	get() = Angle.numeric(this, "grad")


@CssDsl
public inline val Number.rad: Angle
	get() = Angle.numeric(this, "rad")


@CssDsl
public inline val Number.turn: Angle
	get() = Angle.numeric(this, "turn")
