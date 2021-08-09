@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val numericAngleRegex = RegExp("^\\s*(-?\\d+)([a-z]+)\\s*$", "i")


@JsName("0;0")
public external interface Angle :
	CssGradient.Direction,
	CssValue.Numeric {

	public companion object;


	@JsName("0;0")
	public interface Numeric : Angle

	@JsName("0;0")
	public interface Variable : Angle, CssVariable<Angle>
}


@CssDsl
public operator fun Angle.div(other: Double): Angle {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Angle.of(value / other, unit)
		}
	}

	return Angle.calc("$this / $other")
}


@CssDsl
public operator fun Angle.div(other: Int): Angle {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Angle.of(value / other, unit)
		}
	}

	return Angle.calc("$this / $other")
}


@kotlin.internal.InlineOnly
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
private inline fun Angle.ifNumeric(block: (value: Double, unit: String) -> Unit) {
	val match = numericAngleRegex.exec(asString()) ?: return
	val values = match.unsafeCast<Array<String>>()

	block(values[1].toDouble(), values[2])
}


@CssDsl
public operator fun Angle.minus(other: Angle): Angle {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Angle.of(value - otherValue, unit)
		}
	}

	return Angle.calc("$this - $other")
}


@CssDsl
public operator fun Angle.times(other: Double): Angle {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Angle.of(value * other, unit)
		}
	}

	return Angle.calc("$this * $other")
}


@CssDsl
public operator fun Angle.times(other: Int): Angle {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Angle.of(value * other, unit)
		}
	}

	return Angle.calc("$this * $other")
}


@CssDsl
public operator fun Angle.plus(other: Angle): Angle {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Angle.of(value + otherValue, unit)
		}
	}

	return Angle.calc("$this + $other")
}


@CssDsl
public inline operator fun Angle.unaryPlus(): Angle =
	this


@CssDsl
public inline operator fun Angle.unaryMinus(): Angle =
	this * -1


@CssDsl
public inline val Angle.Companion.zero: Angle
	get() = unsafe("0")


public inline fun Angle.Companion.calc(value: String): Angle =
	unsafe("calc($value)")


public inline fun Angle.Companion.of(value: Double, unit: String): Angle.Numeric =
	CssValue.unsafe("$value$unit")


public inline fun Angle.Companion.of(value: Int, unit: String): Angle.Numeric =
	CssValue.unsafe("$value$unit")


public inline fun Angle.Companion.unsafe(value: String): Angle =
	CssValue.unsafe(value)


public inline fun Angle.Companion.variable(name: String): Angle.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline operator fun Double.times(other: Angle): Angle =
	other * this


@CssDsl
public inline operator fun Int.times(other: Angle): Angle =
	other * this


@CssDsl
public inline val Double.deg: Angle
	get() = Angle.of(this, "deg")


@CssDsl
public inline val Double.grad: Angle
	get() = Angle.of(this, "grad")


@CssDsl
public inline val Double.rad: Angle
	get() = Angle.of(this, "rad")


@CssDsl
public inline val Double.turn: Angle
	get() = Angle.of(this, "turn")


@CssDsl
public inline val Int.deg: Angle
	get() = Angle.of(this, "deg")


@CssDsl
public inline val Int.grad: Angle
	get() = Angle.of(this, "grad")


@CssDsl
public inline val Int.rad: Angle
	get() = Angle.of(this, "rad")


@CssDsl
public inline val Int.turn: Angle
	get() = Angle.of(this, "turn")
