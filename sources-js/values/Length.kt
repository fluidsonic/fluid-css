@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val numericLengthRegex = RegExp("^\\s*(-?\\d+)([a-z]+)\\s*$", "i")


@JsName("0;0")
public external interface Length :
	BorderSpacing.Axis,
	BorderWidth.Single,
	LengthOrPercentage,
	LetterSpacing,
	OutlineWidth {

	public companion object;


	@JsName("0;0")
	public interface Variable : Length, CssVariable<Length>
}


@CssDsl
public operator fun Length.div(other: Double): Length {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Length.of(value / other, unit)
		}
	}

	return Length.calc("$this / $other")
}


@CssDsl
public operator fun Length.div(other: Int): Length {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Length.of(value / other, unit)
		}
	}

	return Length.calc("$this / $other")
}


@kotlin.internal.InlineOnly
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
private inline fun Length.ifNumeric(block: (value: Double, unit: String) -> Unit) {
	val match = numericLengthRegex.exec(asString()) ?: return
	val values = match.unsafeCast<Array<String>>()

	block(values[1].toDouble(), values[2])
}


@CssDsl
public operator fun Length.minus(other: Length): Length {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Length.of(value - otherValue, unit)
		}
	}

	return Length.calc("$this - $other")
}


@CssDsl
public operator fun Length.times(other: Double): Length {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Length.of(value * other, unit)
		}
	}

	return Length.calc("$this * $other")
}


@CssDsl
public operator fun Length.times(other: Int): Length {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> Length.of(value * other, unit)
		}
	}

	return Length.calc("$this * $other")
}


@CssDsl
public operator fun Length.plus(other: Length): Length {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return Length.of(value + otherValue, unit)
		}
	}

	return Length.calc("$this + $other")
}


@CssDsl
public inline operator fun Length.unaryPlus(): Length =
	this


@CssDsl
public inline operator fun Length.unaryMinus(): Length =
	this * -1


@CssDsl
public inline val Length.Companion.zero: Length
	get() = unsafe("0")


public inline fun Length.Companion.calc(value: String): Length =
	unsafe("calc($value)")


public inline fun Length.Companion.of(value: Double, unit: String): Length =
	CssValue.unsafe("$value$unit")


public inline fun Length.Companion.of(value: Int, unit: String): Length =
	CssValue.unsafe("$value$unit")


public inline fun Length.Companion.unsafe(value: String): Length =
	CssValue.unsafe(value)


public inline fun Length.Companion.variable(name: String): Length.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline operator fun Double.times(other: Length): Length =
	other * this


@CssDsl
public inline operator fun Int.times(other: Length): Length =
	other * this


@CssDsl
public inline val Double.ch: Length
	get() = Length.of(this, "ch")


@CssDsl
public inline val Double.cm: Length
	get() = Length.of(this, "cm")


@CssDsl
public inline val Double.mm: Length
	get() = Length.of(this, "mm")


@CssDsl
public inline val Double.em: Length
	get() = Length.of(this, "em")


@CssDsl
public inline val Double.ex: Length
	get() = Length.of(this, "ex")


@CssDsl
public inline val Double.inch: Length
	get() = Length.of(this, "in")


@CssDsl
public inline val Double.pc: Length
	get() = Length.of(this, "pc")


@CssDsl
public inline val Double.pt: Length
	get() = Length.of(this, "pt")


@CssDsl
public inline val Double.px: Length
	get() = Length.of(this, "px")


@CssDsl
public inline val Double.rem: Length
	get() = Length.of(this, "rem")


@CssDsl
public inline val Double.vh: Length
	get() = Length.of(this, "vh")


@CssDsl
public inline val Double.vmax: Length
	get() = Length.of(this, "vmax")


@CssDsl
public inline val Double.vmin: Length
	get() = Length.of(this, "vmin")


@CssDsl
public inline val Double.vw: Length
	get() = Length.of(this, "vw")


@CssDsl
public inline val Int.ch: Length
	get() = Length.of(this, "ch")


@CssDsl
public inline val Int.cm: Length
	get() = Length.of(this, "cm")


@CssDsl
public inline val Int.mm: Length
	get() = Length.of(this, "mm")


@CssDsl
public inline val Int.em: Length
	get() = Length.of(this, "em")


@CssDsl
public inline val Int.ex: Length
	get() = Length.of(this, "ex")


@CssDsl
public inline val Int.inch: Length
	get() = Length.of(this, "in")


@CssDsl
public inline val Int.pc: Length
	get() = Length.of(this, "pc")


@CssDsl
public inline val Int.pt: Length
	get() = Length.of(this, "pt")


@CssDsl
public inline val Int.px: Length
	get() = Length.of(this, "px")


@CssDsl
public inline val Int.rem: Length
	get() = Length.of(this, "rem")


@CssDsl
public inline val Int.vh: Length
	get() = Length.of(this, "vh")


@CssDsl
public inline val Int.vmax: Length
	get() = Length.of(this, "vmax")


@CssDsl
public inline val Int.vmin: Length
	get() = Length.of(this, "vmin")


@CssDsl
public inline val Int.vw: Length
	get() = Length.of(this, "vw")
