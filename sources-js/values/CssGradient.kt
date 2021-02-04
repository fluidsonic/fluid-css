@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// TODO Add builder to support gradients with hints and more color stops.


public external interface CssGradient : CssImage {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun linear(stop1: ColorStop, stop2: ColorStop, vararg additionalStops: ColorStop): CssGradient =
			linear(angle = null, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


		public inline fun unsafe(value: String): CssGradient =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Direction : CssValue


	public interface SideOrCorner : Direction {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline val bottom: SideOrCorner get() = CssValue.unsafe("bottom")

			public inline val left: SideOrCorner get() = CssValue.unsafe("left")

			public inline val leftBottom: SideOrCorner get() = CssValue.unsafe("left bottom")

			public inline val leftTop: SideOrCorner get() = CssValue.unsafe("left top")

			public inline val right: SideOrCorner get() = CssValue.unsafe("right")

			public inline val rightBottom: SideOrCorner get() = CssValue.unsafe("right bottom")

			public inline val rightTop: SideOrCorner get() = CssValue.unsafe("right top")

			public inline val top: SideOrCorner get() = CssValue.unsafe("top")
		}
	}


	public interface Variable : CssGradient, CssVariable<CssGradient>
}


@Suppress("DEPRECATION")
public inline fun CssGradient.Companion.linear(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	unsafe(when (angle) {
		null -> "linear-gradient($stop1, $stop2)"
		else -> "linear-gradient($angle, $stop1, $stop2)"
	})


@Suppress("DEPRECATION")
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
