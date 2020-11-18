package io.fluidsonic.css


public interface TimeOrGlobal : CssValue
public interface Time : TimeOrGlobal {

	public val value: Double
	public val unit: String


	public companion object
}


private class TimeImpl(
	override val value: Double,
	override val unit: String,
) : CssValueBase("$value$unit"), Time


public fun Time(value: Number, unit: String): Time =
	TimeImpl(value.toDouble(), unit)


public inline val Number.s: Time get() = Time(this, "s")
public inline val Number.ms: Time get() = Time(this, "ms")
