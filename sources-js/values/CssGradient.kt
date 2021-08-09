@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// TODO Add builder to support gradients with hints and more color stops.


@JsName("0;0")
public external interface CssGradient : CssImage {

	public companion object;


	@JsName("0;0")
	public interface Direction : CssValue


	@JsName("0;0")
	public interface SideOrCorner : Direction {

		public companion object
	}


	@JsName("0;0")
	public interface Variable : CssGradient, CssVariable<CssGradient>
}


public inline fun CssGradient.Companion.linear(stop1: ColorStop, stop2: ColorStop, vararg additionalStops: ColorStop): CssGradient =
	linear(angle = null, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


public inline fun CssGradient.Companion.linear(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	unsafe(when (angle) {
		null -> "linear-gradient($stop1, $stop2)"
		else -> "linear-gradient($angle, $stop1, $stop2)"
	})


public fun CssGradient.Companion.linear(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	when {
		additionalStops.isEmpty() -> linear(angle = angle, stop1 = stop1, stop2 = stop2)
		else -> {
			var string = "linear-gradient("

			if (angle != null) {
				string += angle
				string += ","
			}

			string += stop1
			string += ","
			string += stop2

			for (stop in additionalStops) {
				string += ","
				string += stop
			}

			string += ")"

			unsafe(string)
		}
	}


public inline fun CssGradient.Companion.unsafe(value: String): CssGradient =
	CssValue.unsafe(value)


public inline fun CssGradient.Companion.variable(name: String): CssGradient.Variable =
	CssVariable.unsafe(name)


public inline val CssGradient.SideOrCorner.Companion.bottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("bottom")

public inline val CssGradient.SideOrCorner.Companion.left: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left")

public inline val CssGradient.SideOrCorner.Companion.leftBottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left bottom")

public inline val CssGradient.SideOrCorner.Companion.leftTop: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left top")

public inline val CssGradient.SideOrCorner.Companion.right: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right")

public inline val CssGradient.SideOrCorner.Companion.rightBottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right bottom")

public inline val CssGradient.SideOrCorner.Companion.rightTop: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right top")

public inline val CssGradient.SideOrCorner.Companion.top: CssGradient.SideOrCorner
	get() = CssValue.unsafe("top")


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	CssGradient.linear(stop1 = stop1, stop2 = stop2)


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(angle = angle, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	CssGradient.linear(angle = angle, stop1 = stop1, stop2 = stop2)
