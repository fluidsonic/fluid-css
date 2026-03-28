@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// TODO Add builder to support gradients with hints and more color stops.


/** Represents a CSS `css-gradient` value. */
@JsName("0;0")
public external interface CssGradient : CssImage {

	public companion object;


	/** A gradient direction value. */
	@JsName("0;0")
	public interface Direction : CssValue


	/** A gradient side or corner direction. */
	@JsName("0;0")
	public interface SideOrCorner : Direction {

		public companion object
	}


	/** A [CssGradient] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : CssGradient, CssVariable<CssGradient>
}


/** Creates a CSS `linear-gradient()` value. */
public inline fun CssGradient.Companion.linear(stop1: ColorStop, stop2: ColorStop, vararg additionalStops: ColorStop): CssGradient =
	linear(angle = null, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


/** Creates a CSS `linear-gradient()` with a direction and two stops. */
public inline fun CssGradient.Companion.linear(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	unsafe(when (angle) {
		null -> "linear-gradient($stop1, $stop2)"
		else -> "linear-gradient($angle, $stop1, $stop2)"
	})


/** Creates a CSS `linear-gradient()` with a direction and multiple stops. */
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


/** Creates a [CssGradient] from an unchecked string [value]. */
public inline fun CssGradient.Companion.unsafe(value: String): CssGradient =
	CssValue.unsafe(value)


/** Creates a [CssGradient] backed by a CSS variable with the given [name]. */
public inline fun CssGradient.Companion.variable(name: String): CssGradient.Variable =
	CssVariable.unsafe(name)


/** The CSS `bottom` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.bottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("bottom")

/** The CSS `left` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.left: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left")

/** The CSS `left bottom` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.leftBottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left bottom")

/** The CSS `left top` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.leftTop: CssGradient.SideOrCorner
	get() = CssValue.unsafe("left top")

/** The CSS `right` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.right: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right")

/** The CSS `right bottom` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.rightBottom: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right bottom")

/** The CSS `right top` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.rightTop: CssGradient.SideOrCorner
	get() = CssValue.unsafe("right top")

/** The CSS `top` side-or-corner value. */
public inline val CssGradient.SideOrCorner.Companion.top: CssGradient.SideOrCorner
	get() = CssValue.unsafe("top")


/** Sets the `linear-gradient` CSS property. */
@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


/** Sets the `linear-gradient` CSS property. */
@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	CssGradient.linear(stop1 = stop1, stop2 = stop2)


/** Sets the `linear-gradient` CSS property. */
@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
	vararg additionalStops: ColorStop,
): CssGradient =
	CssGradient.linear(angle = angle, stop1 = stop1, stop2 = stop2, additionalStops = additionalStops)


/** Sets the `linear-gradient` CSS property. */
@CssDsl
@Suppress("unused")
public inline fun CssDeclarationBlockBuilder.linearGradient(
	angle: CssGradient.Direction?,
	stop1: ColorStop,
	stop2: ColorStop,
): CssGradient =
	CssGradient.linear(angle = angle, stop1 = stop1, stop2 = stop2)
