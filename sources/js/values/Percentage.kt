@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Percentage :
	FontFace.Stretch,
	LengthOrPercentage,
	Opacity,
	Internal {

	public companion object {

		public fun calc(value: String): Percentage =
			raw("calc($value)")


		public fun of(value: Number): Percentage =
			NumericPercentage.of(value)


		public fun raw(value: String): Percentage =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Percentage, CssVariable<Percentage>
}


public interface NumericPercentage : Percentage {

	public val value: Double


	public companion object {

		public fun of(value: Number): NumericPercentage =
			Default(value.toDouble())
	}


	private class Default(
		override val value: Double,
	) : GenericValue("$value%"), NumericPercentage
}


@CssDsl
public operator fun Percentage.div(other: Number): Percentage =
	when {
		other == 1.0 -> this
		this is NumericPercentage -> when (value) {
			0.0 -> this
			else -> Percentage.of(value / other.toDouble())
		}
		else -> Percentage.calc("($this) / $other")
	}


@CssDsl
public operator fun Percentage.minus(other: Percentage): Percentage =
	when {
		this is NumericPercentage && other is NumericPercentage -> Percentage.of(value - other.value)
		else -> Percentage.calc("($this) - ($other)")
	}


@CssDsl
public operator fun Percentage.times(other: Number): Percentage =
	when {
		other == 1.0 -> this
		this is NumericPercentage -> when (value) {
			0.0 -> this
			else -> Percentage.of(value * other.toDouble())
		}
		else -> Percentage.calc("($this) * $other")
	}


@CssDsl
public operator fun Percentage.plus(other: Percentage): Percentage =
	when {
		this is NumericPercentage && other is NumericPercentage -> Percentage.of(value + other.value)
		else -> Percentage.calc("($this) + ($other)")
	}


@CssDsl
public operator fun Percentage.unaryPlus(): Percentage =
	this


@CssDsl
public operator fun Percentage.unaryMinus(): Percentage =
	this * -1


@CssDsl
public operator fun Number.times(other: Percentage): Percentage =
	other * this


@CssDsl
public val Number.percent: Percentage
	get() = Percentage.of(this)
