@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val numericPercentageRegex = RegExp("^\\s*(-?\\d+)%\\s*$", "i")


public external interface Percentage :
	FontFace.Stretch,
	LengthOrPercentage,
	Opacity {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun calc(value: String): Percentage =
			unsafe("calc($value)")


		public inline fun of(value: Double): Percentage =
			CssValue.unsafe("$value%")


		public inline fun of(value: Int): Percentage =
			CssValue.unsafe("$value%")


		public inline fun unsafe(value: String): Percentage =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Percentage, CssVariable<Percentage>
}


@CssDsl
public operator fun Percentage.div(other: Double): Percentage {
	if (other == 1.0)
		return this

	ifNumeric { value ->
		return when (value) {
			0.0 -> this
			else -> Percentage.of(value / other)
		}
	}

	return Percentage.calc("$this / $other")
}


@CssDsl
public operator fun Percentage.div(other: Int): Percentage {
	if (other == 1)
		return this

	ifNumeric { value ->
		return when (value) {
			0.0 -> this
			else -> Percentage.of(value / other)
		}
	}

	return Percentage.calc("$this / $other")
}


@kotlin.internal.InlineOnly
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
private inline fun Percentage.ifNumeric(block: (value: Double) -> Unit) {
	val match = numericPercentageRegex.exec(asString()) ?: return
	val values = match.unsafeCast<Array<String>>()

	block(values[1].toDouble())
}


@CssDsl
public operator fun Percentage.minus(other: Percentage): Percentage {
	ifNumeric { value ->
		other.ifNumeric { otherValue ->
			return Percentage.of(value - otherValue)
		}
	}

	return Percentage.calc("$this - $other")
}


@CssDsl
public operator fun Percentage.times(other: Double): Percentage {
	if (other == 1.0)
		return this

	ifNumeric { value ->
		return when (value) {
			0.0 -> this
			else -> Percentage.of(value * other)
		}
	}

	return Percentage.calc("$this * $other")
}


@CssDsl
public operator fun Percentage.times(other: Int): Percentage {
	if (other == 1)
		return this

	ifNumeric { value ->
		return when (value) {
			0.0 -> this
			else -> Percentage.of(value * other)
		}
	}

	return Percentage.calc("$this * $other")
}


@CssDsl
public operator fun Percentage.plus(other: Percentage): Percentage {
	ifNumeric { value ->
		other.ifNumeric { otherValue ->
			return Percentage.of(value + otherValue)
		}
	}

	return Percentage.calc("$this + $other")
}


@CssDsl
public inline operator fun Percentage.unaryPlus(): Percentage =
	this


@CssDsl
public inline operator fun Percentage.unaryMinus(): Percentage =
	this * -1


@CssDsl
public inline operator fun Double.times(other: Percentage): Percentage =
	other * this


@CssDsl
public inline operator fun Int.times(other: Percentage): Percentage =
	other * this


@CssDsl
public inline val Double.percent: Percentage
	get() = Percentage.of(this)


@CssDsl
public inline val Int.percent: Percentage
	get() = Percentage.of(this)
