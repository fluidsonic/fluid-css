package io.fluidsonic.css


public interface AngleOrGlobal : CssValue
public interface Angle : AngleOrGlobal {

	public val value: Double
	public val unit: String


	public operator fun unaryMinus(): Angle


	public companion object {

		public val zero: Angle = Angle(0, "")
	}
}


private class AngleImpl(
	override val value: Double,
	override val unit: String,
) : CssValueBase("$value$unit"), Angle {

	override fun unaryMinus(): Angle =
		if (value == 0.0) this
		else Angle(-value, unit)
}


public fun Angle(value: Number, unit: String): Angle =
	AngleImpl(value.toDouble(), unit)


public inline val Number.deg: Angle get() = Angle(this, "deg")
public inline val Number.grad: Angle get() = Angle(this, "grad")
public inline val Number.rad: Angle get() = Angle(this, "rad")
public inline val Number.turn: Angle get() = Angle(this, "turn")
