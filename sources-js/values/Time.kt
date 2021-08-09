@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val numericTimeRegex = RegExp("^\\s*(-?\\d+)([a-z]+)\\s*$", "i")


@JsName("0;0")
public external interface Time :
	CssGradient.Direction,
	CssValue.Numeric {

	public companion object;


	@JsName("0;0")
	public interface Variable : Time, CssVariable<Time>
}


@CssDsl
public operator fun Time.div(other: Double): Time {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Time.of(value / other, unit)
		}
	}

	return Time.calc("$this / $other")
}


@CssDsl
public operator fun Time.div(other: Int): Time {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Time.of(value / other, unit)
		}
	}

	return Time.calc("$this / $other")
}


@kotlin.internal.InlineOnly
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
private inline fun Time.ifNumeric(block: (value: Double, unit: String) -> Unit) {
	val match = numericTimeRegex.exec(asString()) ?: return
	val values = match.unsafeCast<Array<String>>()

	block(values[1].toDouble(), values[2])
}


@CssDsl
public operator fun Time.minus(other: Time): Time {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Time.of(value - otherValue, unit)
		}
	}

	return Time.calc("$this - $other")
}


@CssDsl
public operator fun Time.times(other: Double): Time {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Time.of(value * other, unit)
		}
	}

	return Time.calc("$this * $other")
}


@CssDsl
public operator fun Time.times(other: Int): Time {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Time.of(value * other, unit)
		}
	}

	return Time.calc("$this * $other")
}


@CssDsl
public operator fun Time.plus(other: Time): Time {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Time.of(value + otherValue, unit)
		}
	}

	return Time.calc("$this + $other")
}


@CssDsl
public inline operator fun Time.unaryPlus(): Time =
	this


@CssDsl
public inline operator fun Time.unaryMinus(): Time =
	this * -1


@CssDsl
public inline val Time.Companion.zero: Time
	get() = unsafe("0")


public inline fun Time.Companion.calc(value: String): Time =
	unsafe("calc($value)")


public inline fun Time.Companion.of(value: Double, unit: String): Time =
	CssValue.unsafe("$value$unit")


public inline fun Time.Companion.of(value: Int, unit: String): Time =
	CssValue.unsafe("$value$unit")


public inline fun Time.Companion.unsafe(value: String): Time =
	CssValue.unsafe(value)


public inline fun Time.Companion.variable(name: String): Time.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline operator fun Double.times(other: Time): Time =
	other * this


@CssDsl
public inline operator fun Int.times(other: Time): Time =
	other * this


@CssDsl
public inline val Double.s: Time
	get() = Time.of(this, "s")


@CssDsl
public inline val Double.ms: Time
	get() = Time.of(this, "ms")


@CssDsl
public inline val Int.s: Time
	get() = Time.of(this, "s")


@CssDsl
public inline val Int.ms: Time
	get() = Time.of(this, "ms")
