@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


private val numericLengthOrPercentageRegex = RegExp("^\\s*(-?\\d+)([a-z]+|%)\\s*$", "i")


@JsName("0;0")
public external interface LengthOrPercentage :
	BackgroundPositionX,
	BackgroundPositionY,
	BackgroundSize.Axis,
	BorderRadius.Single,
	BoxOffset,
	CssValue.Numeric,
	FlexBasis,
	FontSize,
	Gap.Axis,
	LineHeight,
	Margin.Single,
	Padding.Single,
	Size,
	SizeLimit,
	StrokeWidth,
	TextDecorationThickness,
	TransformOriginX,
	TransformOriginY,
	VerticalAlign {

	public companion object;


	@JsName("0;0")
	public interface Variable : LengthOrPercentage, CssVariable<LengthOrPercentage>
}


@CssDsl
public operator fun LengthOrPercentage.div(other: Double): LengthOrPercentage {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> LengthOrPercentage.of(value / other, unit)
		}
	}

	return LengthOrPercentage.calc("$this / $other")
}


@CssDsl
public operator fun LengthOrPercentage.div(other: Int): LengthOrPercentage {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> LengthOrPercentage.of(value / other, unit)
		}
	}

	return LengthOrPercentage.calc("$this / $other")
}


@kotlin.internal.InlineOnly
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
private inline fun LengthOrPercentage.ifNumeric(block: (value: Double, unit: String) -> Unit) {
	val match = numericLengthOrPercentageRegex.exec(asString()) ?: return
	val values = match.unsafeCast<Array<String>>()

	block(values[1].toDouble(), values[2])
}


@CssDsl
public operator fun LengthOrPercentage.minus(other: LengthOrPercentage): LengthOrPercentage {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return LengthOrPercentage.of(value - otherValue, unit)
		}
	}

	return LengthOrPercentage.calc("$this - $other")
}


@CssDsl
public operator fun LengthOrPercentage.times(other: Double): LengthOrPercentage {
	if (other == 1.0)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> LengthOrPercentage.of(value * other, unit)
		}
	}

	return LengthOrPercentage.calc("$this * $other")
}


@CssDsl
public operator fun LengthOrPercentage.times(other: Int): LengthOrPercentage {
	if (other == 1)
		return this

	ifNumeric { value, unit ->
		return when (value) {
			0.0 -> this
			else -> LengthOrPercentage.of(value * other.toDouble(), unit)
		}
	}

	return LengthOrPercentage.calc("$this * $other")
}


@CssDsl
public operator fun LengthOrPercentage.plus(other: LengthOrPercentage): LengthOrPercentage {
	ifNumeric { value, unit ->
		other.ifNumeric { otherValue, otherUnit ->
			if (unit == otherUnit)
				return LengthOrPercentage.of(value + otherValue, unit)
		}
	}

	return LengthOrPercentage.calc("$this + $other")
}


@CssDsl
public inline operator fun LengthOrPercentage.unaryPlus(): LengthOrPercentage =
	this


@CssDsl
public inline operator fun LengthOrPercentage.unaryMinus(): LengthOrPercentage =
	this * -1


public inline fun LengthOrPercentage.Companion.calc(value: String): LengthOrPercentage =
	unsafe("calc($value)")


internal inline fun LengthOrPercentage.Companion.of(value: Double, unit: String): LengthOrPercentage =
	CssValue.unsafe("$value$unit")


internal inline fun LengthOrPercentage.Companion.of(value: Int, unit: String): LengthOrPercentage =
	CssValue.unsafe("$value$unit")


public inline fun LengthOrPercentage.Companion.unsafe(value: String): LengthOrPercentage =
	CssValue.unsafe(value)


public inline fun LengthOrPercentage.Companion.variable(name: String): LengthOrPercentage.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline operator fun Double.times(other: LengthOrPercentage): LengthOrPercentage =
	other * this


@CssDsl
public inline operator fun Int.times(other: LengthOrPercentage): LengthOrPercentage =
	other * this
