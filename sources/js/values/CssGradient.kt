@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// TODO Add builder to support gradients with hints and more color stops.


public interface CssGradient : CssImage {

	public companion object {

		public fun linear(stop1: ColorStop, stop2: ColorStop, vararg additionalStops: ColorStop): CssGradient =
			linear(angle = null, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


		public fun linear(angle: Direction?, stop1: ColorStop, stop2: ColorStop, vararg additionalStops: ColorStop): CssGradient =
			when {
				angle != null && additionalStops.isEmpty() -> raw("$angle, $stop1, $stop2")
				additionalStops.isEmpty() -> raw("linear-gradient($stop1, $stop2)")
				else -> raw(buildString {
					append("linear-gradient(")

					if (angle != null) {
						append(angle)
						append(",")
					}

					append(stop1)
					append(",")
					append(stop2)

					for (stop in additionalStops) {
						append(",")
						append(stop)
					}

					append(")")
				})
			}


		public fun raw(value: String): CssGradient =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Direction {

		override fun toString(): String
	}


	public enum class SideOrCorner : Direction {

		bottom,
		left,
		leftBottom,
		leftTop,
		right,
		rightBottom,
		rightTop,
		top;


		override fun toString(): String =
			when (this) {
				bottom -> "bottom"
				left -> "left"
				leftBottom -> "left bottom"
				leftTop -> "left top"
				right -> "right"
				rightBottom -> "right bottom"
				rightTop -> "right top"
				top -> "top"
			}
	}


	public interface Variable : CssGradient, CssVariable<CssGradient>
}


@CssDsl
public fun CssDeclarationBlockBuilder.linearGradient(
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


@CssDsl
public fun CssDeclarationBlockBuilder.linearGradient(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(angle = angle, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)
