@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


// FIXME support #RRGGBB[AA]
private val colorRegex = RegExp(
	pattern = "^\\s*([a-z]+)\\(\\s*([^,\\)]+)\\s*,\\s*([^,\\)]+)\\s*,\\s*([^,\\)]+)\\s*(,\\s*(\\d+(\\.\\d*)?)\\s*)?\\)\\s*$",
	flags = "i"
)


@JsName("0;0")
public external interface Color :
	Background.Single,
	BorderColor.Single,
	CaretColor,
	ColorStop,
	OutlineColor {

	public companion object;

	@JsName("0;0")
	public interface Hsl : WithComponents

	@JsName("0;0")
	public interface Rgb : WithComponents

	@JsName("0;0")
	public interface Variable : Color, CssVariable<Color>

	@JsName("0;0")
	public interface WithComponents : Color
}


public fun <T : Color.WithComponents> T.withAlpha(alpha: Double): T {
	val match = colorRegex.exec(asString()) ?: error("Cannot parse CSS component color value: $this")
	val values = match.unsafeCast<Array<String?>>()

	val type = values[1]!!.lowercase()
	return CssValue.unsafe(when (type) {
		"hsl", "hsla" -> {
			val hue = values[2]!!
			val saturation = values[3]!!
			val lightness = values[4]!!

			when (alpha) {
				1.0 -> "hsl($hue,$saturation,$lightness)"
				else -> "hsla($hue,$saturation,$lightness,$alpha)"
			}
		}
		"rgb", "rgba" -> {
			val red = values[2]!!
			val green = values[3]!!
			val blue = values[4]!!

			when (alpha) {
				1.0 -> "rgb($red,$green,$blue)"
				else -> "rgba($red,$green,$blue,$alpha)"
			}
		}
		else ->
			error("Unsupported CSS color type: $type(…)")
	})
}


@CssDsl
public inline val Color.Companion.currentColor: Color
	get() = unsafe("currentColor")

@CssDsl
public inline val Color.Companion.transparent: Color
	get() = unsafe("transparent")


@CssDsl
public inline val Color.Companion.aliceBlue: Color.Rgb
	get() = 0xF0F8FF.rgb

@CssDsl
public inline val Color.Companion.antiqueWhite: Color.Rgb
	get() = 0xFAEBD7.rgb

@CssDsl
public inline val Color.Companion.aqua: Color.Rgb
	get() = 0x00FFFF.rgb

@CssDsl
public inline val Color.Companion.aquamarine: Color.Rgb
	get() = 0x7FFFD4.rgb

@CssDsl
public inline val Color.Companion.azure: Color.Rgb
	get() = 0xF0FFFF.rgb

@CssDsl
public inline val Color.Companion.beige: Color.Rgb
	get() = 0xF5F5DC.rgb

@CssDsl
public inline val Color.Companion.bisque: Color.Rgb
	get() = 0xFFE4C4.rgb

@CssDsl
public inline val Color.Companion.black: Color.Rgb
	get() = 0x000000.rgb

@CssDsl
public inline val Color.Companion.blanchedAlmond: Color.Rgb
	get() = 0xFFEBCD.rgb

@CssDsl
public inline val Color.Companion.blue: Color.Rgb
	get() = 0x0000FF.rgb

@CssDsl
public inline val Color.Companion.blueViolet: Color.Rgb
	get() = 0x8A2BE2.rgb

@CssDsl
public inline val Color.Companion.brown: Color.Rgb
	get() = 0xA52A2A.rgb

@CssDsl
public inline val Color.Companion.burlyWood: Color.Rgb
	get() = 0xDEB887.rgb

@CssDsl
public inline val Color.Companion.cadetBlue: Color.Rgb
	get() = 0x5F9EA0.rgb

@CssDsl
public inline val Color.Companion.chartreuse: Color.Rgb
	get() = 0x7FFF00.rgb

@CssDsl
public inline val Color.Companion.chocolate: Color.Rgb
	get() = 0xD2691E.rgb

@CssDsl
public inline val Color.Companion.coral: Color.Rgb
	get() = 0xFF7F50.rgb

@CssDsl
public inline val Color.Companion.cornflowerBlue: Color.Rgb
	get() = 0x6495ED.rgb

@CssDsl
public inline val Color.Companion.cornsilk: Color.Rgb
	get() = 0xFFF8DC.rgb

@CssDsl
public inline val Color.Companion.crimson: Color.Rgb
	get() = 0xDC143C.rgb

@CssDsl
public inline val Color.Companion.cyan: Color.Rgb
	get() = 0x00FFFF.rgb

@CssDsl
public inline val Color.Companion.darkBlue: Color.Rgb
	get() = 0x00008B.rgb

@CssDsl
public inline val Color.Companion.darkCyan: Color.Rgb
	get() = 0x008B8B.rgb

@CssDsl
public inline val Color.Companion.darkGoldenrod: Color.Rgb
	get() = 0xB8860B.rgb

@CssDsl
public inline val Color.Companion.darkGray: Color.Rgb
	get() = 0xA9A9A9.rgb

@CssDsl
public inline val Color.Companion.darkGreen: Color.Rgb
	get() = 0x006400.rgb

@CssDsl
public inline val Color.Companion.darkGrey: Color.Rgb
	get() = 0xA9A9A9.rgb

@CssDsl
public inline val Color.Companion.darkKhaki: Color.Rgb
	get() = 0xBDB76B.rgb

@CssDsl
public inline val Color.Companion.darkMagenta: Color.Rgb
	get() = 0x8B008B.rgb

@CssDsl
public inline val Color.Companion.darkOliveGreen: Color.Rgb
	get() = 0x556B2F.rgb

@CssDsl
public inline val Color.Companion.darkOrange: Color.Rgb
	get() = 0xFF8C00.rgb

@CssDsl
public inline val Color.Companion.darkOrchid: Color.Rgb
	get() = 0x9932CC.rgb

@CssDsl
public inline val Color.Companion.darkRed: Color.Rgb
	get() = 0x8B0000.rgb

@CssDsl
public inline val Color.Companion.darkSalmon: Color.Rgb
	get() = 0xE9967A.rgb

@CssDsl
public inline val Color.Companion.darkSeagreen: Color.Rgb
	get() = 0x8FBC8F.rgb

@CssDsl
public inline val Color.Companion.darkSlateBlue: Color.Rgb
	get() = 0x483D8B.rgb

@CssDsl
public inline val Color.Companion.darkSlateGray: Color.Rgb
	get() = 0x2F4F4F.rgb

@CssDsl
public inline val Color.Companion.darkSlateGrey: Color.Rgb
	get() = 0x2F4F4F.rgb

@CssDsl
public inline val Color.Companion.darkTurquoise: Color.Rgb
	get() = 0x00CED1.rgb

@CssDsl
public inline val Color.Companion.darkViolet: Color.Rgb
	get() = 0x9400D3.rgb

@CssDsl
public inline val Color.Companion.deepPink: Color.Rgb
	get() = 0xFF1493.rgb

@CssDsl
public inline val Color.Companion.deepSkyBlue: Color.Rgb
	get() = 0x00BFFF.rgb

@CssDsl
public inline val Color.Companion.dimGray: Color.Rgb
	get() = 0x696969.rgb

@CssDsl
public inline val Color.Companion.dimGrey: Color.Rgb
	get() = 0x696969.rgb

@CssDsl
public inline val Color.Companion.dodgerBlue: Color.Rgb
	get() = 0x1E90FF.rgb

@CssDsl
public inline val Color.Companion.firebrick: Color.Rgb
	get() = 0xB22222.rgb

@CssDsl
public inline val Color.Companion.floralWhite: Color.Rgb
	get() = 0xFFFAF0.rgb

@CssDsl
public inline val Color.Companion.forestGreen: Color.Rgb
	get() = 0x228B22.rgb

@CssDsl
public inline val Color.Companion.fuchsia: Color.Rgb
	get() = 0xFF00FF.rgb

@CssDsl
public inline val Color.Companion.gainsboro: Color.Rgb
	get() = 0xDCDCDC.rgb

@CssDsl
public inline val Color.Companion.ghostWhite: Color.Rgb
	get() = 0xF8F8FF.rgb

@CssDsl
public inline val Color.Companion.gold: Color.Rgb
	get() = 0xFFD700.rgb

@CssDsl
public inline val Color.Companion.goldenrod: Color.Rgb
	get() = 0xDAA520.rgb

@CssDsl
public inline val Color.Companion.gray: Color.Rgb
	get() = 0x808080.rgb

@CssDsl
public inline val Color.Companion.green: Color.Rgb
	get() = 0x008000.rgb

@CssDsl
public inline val Color.Companion.greenYellow: Color.Rgb
	get() = 0xADFF2F.rgb

@CssDsl
public inline val Color.Companion.grey: Color.Rgb
	get() = 0x808080.rgb

@CssDsl
public inline val Color.Companion.honeydew: Color.Rgb
	get() = 0xF0FFF0.rgb

@CssDsl
public inline val Color.Companion.hotPink: Color.Rgb
	get() = 0xFF69B4.rgb

@CssDsl
public inline val Color.Companion.indianRed: Color.Rgb
	get() = 0xCD5C5C.rgb

@CssDsl
public inline val Color.Companion.indigo: Color.Rgb
	get() = 0x4B0082.rgb

@CssDsl
public inline val Color.Companion.ivory: Color.Rgb
	get() = 0xFFFFF0.rgb

@CssDsl
public inline val Color.Companion.khaki: Color.Rgb
	get() = 0xF0E68C.rgb

@CssDsl
public inline val Color.Companion.lavender: Color.Rgb
	get() = 0xE6E6FA.rgb

@CssDsl
public inline val Color.Companion.lavenderBlush: Color.Rgb
	get() = 0xFFF0F5.rgb

@CssDsl
public inline val Color.Companion.lawnGreen: Color.Rgb
	get() = 0x7CFC00.rgb

@CssDsl
public inline val Color.Companion.lemonChiffon: Color.Rgb
	get() = 0xFFFACD.rgb

@CssDsl
public inline val Color.Companion.lightBlue: Color.Rgb
	get() = 0xADD8E6.rgb

@CssDsl
public inline val Color.Companion.lightCoral: Color.Rgb
	get() = 0xF08080.rgb

@CssDsl
public inline val Color.Companion.lightCyan: Color.Rgb
	get() = 0xE0FFFF.rgb

@CssDsl
public inline val Color.Companion.lightGoldenrodYellow: Color.Rgb
	get() = 0xFAFAD2.rgb

@CssDsl
public inline val Color.Companion.lightGray: Color.Rgb
	get() = 0xD3D3D3.rgb

@CssDsl
public inline val Color.Companion.lightGreen: Color.Rgb
	get() = 0x90EE90.rgb

@CssDsl
public inline val Color.Companion.lightGrey: Color.Rgb
	get() = 0xD3D3D3.rgb

@CssDsl
public inline val Color.Companion.lightPink: Color.Rgb
	get() = 0xFFB6C1.rgb

@CssDsl
public inline val Color.Companion.lightSalmon: Color.Rgb
	get() = 0xFFA07A.rgb

@CssDsl
public inline val Color.Companion.lightSeaGreen: Color.Rgb
	get() = 0x20B2AA.rgb

@CssDsl
public inline val Color.Companion.lightSkyBlue: Color.Rgb
	get() = 0x87CEFA.rgb

@CssDsl
public inline val Color.Companion.lightSlateGray: Color.Rgb
	get() = 0x778899.rgb

@CssDsl
public inline val Color.Companion.lightSlateGrey: Color.Rgb
	get() = 0x778899.rgb

@CssDsl
public inline val Color.Companion.lightSteelBlue: Color.Rgb
	get() = 0xB0C4DE.rgb

@CssDsl
public inline val Color.Companion.lightYellow: Color.Rgb
	get() = 0xFFFFE0.rgb

@CssDsl
public inline val Color.Companion.lime: Color.Rgb
	get() = 0x00FF00.rgb

@CssDsl
public inline val Color.Companion.limeGreen: Color.Rgb
	get() = 0x32CD32.rgb

@CssDsl
public inline val Color.Companion.linen: Color.Rgb
	get() = 0xFAF0E6.rgb

@CssDsl
public inline val Color.Companion.magenta: Color.Rgb
	get() = 0xFF00FF.rgb

@CssDsl
public inline val Color.Companion.maroon: Color.Rgb
	get() = 0x800000.rgb

@CssDsl
public inline val Color.Companion.mediumAquamarine: Color.Rgb
	get() = 0x66CDAA.rgb

@CssDsl
public inline val Color.Companion.mediumBlue: Color.Rgb
	get() = 0x0000CD.rgb

@CssDsl
public inline val Color.Companion.mediumOrchid: Color.Rgb
	get() = 0xBA55D3.rgb

@CssDsl
public inline val Color.Companion.mediumPurple: Color.Rgb
	get() = 0x9370DB.rgb

@CssDsl
public inline val Color.Companion.mediumSeaGreen: Color.Rgb
	get() = 0x3CB371.rgb

@CssDsl
public inline val Color.Companion.mediumSlateBlue: Color.Rgb
	get() = 0x7B68EE.rgb

@CssDsl
public inline val Color.Companion.mediumSpringGreen: Color.Rgb
	get() = 0x00FA9A.rgb

@CssDsl
public inline val Color.Companion.mediumTurquoise: Color.Rgb
	get() = 0x48D1CC.rgb

@CssDsl
public inline val Color.Companion.mediumVioletRed: Color.Rgb
	get() = 0xC71585.rgb

@CssDsl
public inline val Color.Companion.midnightBlue: Color.Rgb
	get() = 0x191970.rgb

@CssDsl
public inline val Color.Companion.mintCream: Color.Rgb
	get() = 0xF5FFFA.rgb

@CssDsl
public inline val Color.Companion.mistyRose: Color.Rgb
	get() = 0xFFE4E1.rgb

@CssDsl
public inline val Color.Companion.moccasin: Color.Rgb
	get() = 0xFFE4B5.rgb

@CssDsl
public inline val Color.Companion.navajoWhite: Color.Rgb
	get() = 0xFFDEAD.rgb

@CssDsl
public inline val Color.Companion.navy: Color.Rgb
	get() = 0x000080.rgb

@CssDsl
public inline val Color.Companion.oldLace: Color.Rgb
	get() = 0xFDF5E6.rgb

@CssDsl
public inline val Color.Companion.olive: Color.Rgb
	get() = 0x808000.rgb

@CssDsl
public inline val Color.Companion.oliveDrab: Color.Rgb
	get() = 0x6B8E23.rgb

@CssDsl
public inline val Color.Companion.orange: Color.Rgb
	get() = 0xFFA500.rgb

@CssDsl
public inline val Color.Companion.orangeRed: Color.Rgb
	get() = 0xFF4500.rgb

@CssDsl
public inline val Color.Companion.orchid: Color.Rgb
	get() = 0xDA70D6.rgb

@CssDsl
public inline val Color.Companion.paleGoldenrod: Color.Rgb
	get() = 0xEEE8AA.rgb

@CssDsl
public inline val Color.Companion.paleGreen: Color.Rgb
	get() = 0x98FB98.rgb

@CssDsl
public inline val Color.Companion.paleTurquoise: Color.Rgb
	get() = 0xAFEEEE.rgb

@CssDsl
public inline val Color.Companion.paleVioletRed: Color.Rgb
	get() = 0xDB7093.rgb

@CssDsl
public inline val Color.Companion.papayaWhip: Color.Rgb
	get() = 0xFFEFD5.rgb

@CssDsl
public inline val Color.Companion.peachPuff: Color.Rgb
	get() = 0xFFDAB9.rgb

@CssDsl
public inline val Color.Companion.peru: Color.Rgb
	get() = 0xCD853F.rgb

@CssDsl
public inline val Color.Companion.pink: Color.Rgb
	get() = 0xFFC0CB.rgb

@CssDsl
public inline val Color.Companion.plum: Color.Rgb
	get() = 0xDDA0DD.rgb

@CssDsl
public inline val Color.Companion.powderBlue: Color.Rgb
	get() = 0xB0E0E6.rgb

@CssDsl
public inline val Color.Companion.purple: Color.Rgb
	get() = 0x800080.rgb

@CssDsl
public inline val Color.Companion.rebeccaPurple: Color.Rgb
	get() = 0x663399.rgb

@CssDsl
public inline val Color.Companion.red: Color.Rgb
	get() = 0xFF0000.rgb

@CssDsl
public inline val Color.Companion.rosyBrown: Color.Rgb
	get() = 0xBC8F8F.rgb

@CssDsl
public inline val Color.Companion.royalBlue: Color.Rgb
	get() = 0x4169E1.rgb

@CssDsl
public inline val Color.Companion.saddleBrown: Color.Rgb
	get() = 0x8B4513.rgb

@CssDsl
public inline val Color.Companion.salmon: Color.Rgb
	get() = 0xFA8072.rgb

@CssDsl
public inline val Color.Companion.sandyBrown: Color.Rgb
	get() = 0xF4A460.rgb

@CssDsl
public inline val Color.Companion.seaGreen: Color.Rgb
	get() = 0x2E8B57.rgb

@CssDsl
public inline val Color.Companion.seashell: Color.Rgb
	get() = 0xFFF5EE.rgb

@CssDsl
public inline val Color.Companion.sienna: Color.Rgb
	get() = 0xA0522D.rgb

@CssDsl
public inline val Color.Companion.silver: Color.Rgb
	get() = 0xC0C0C0.rgb

@CssDsl
public inline val Color.Companion.skyBlue: Color.Rgb
	get() = 0x87CEEB.rgb

@CssDsl
public inline val Color.Companion.slateBlue: Color.Rgb
	get() = 0x6A5ACD.rgb

@CssDsl
public inline val Color.Companion.slateGray: Color.Rgb
	get() = 0x708090.rgb

@CssDsl
public inline val Color.Companion.slateGrey: Color.Rgb
	get() = 0x708090.rgb

@CssDsl
public inline val Color.Companion.snow: Color.Rgb
	get() = 0xFFFAFA.rgb

@CssDsl
public inline val Color.Companion.springGreen: Color.Rgb
	get() = 0x00FF7F.rgb

@CssDsl
public inline val Color.Companion.steelBlue: Color.Rgb
	get() = 0x4682B4.rgb

@CssDsl
public inline val Color.Companion.tan: Color.Rgb
	get() = 0xD2B48C.rgb

@CssDsl
public inline val Color.Companion.teal: Color.Rgb
	get() = 0x008080.rgb

@CssDsl
public inline val Color.Companion.thistle: Color.Rgb
	get() = 0xD8BFD8.rgb

@CssDsl
public inline val Color.Companion.tomato: Color.Rgb
	get() = 0xFF6347.rgb

@CssDsl
public inline val Color.Companion.turquoise: Color.Rgb
	get() = 0x40E0D0.rgb

@CssDsl
public inline val Color.Companion.violet: Color.Rgb
	get() = 0xEE82EE.rgb

@CssDsl
public inline val Color.Companion.wheat: Color.Rgb
	get() = 0xF5DEB3.rgb

@CssDsl
public inline val Color.Companion.white: Color.Rgb
	get() = 0xFFFFFF.rgb

@CssDsl
public inline val Color.Companion.whiteSmoke: Color.Rgb
	get() = 0xF5F5F5.rgb

@CssDsl
public inline val Color.Companion.yellow: Color.Rgb
	get() = 0xFFFF00.rgb

@CssDsl
public inline val Color.Companion.yellowGreen: Color.Rgb
	get() = 0x9ACD32.rgb


@CssDsl
public inline fun Color.Companion.hsl(
	hue: Angle,
	saturation: Percentage,
	lightness: Percentage,
	alpha: Double = 1.0,
): Color.Hsl =
	CssValue.unsafe(when (alpha) {
		1.0 -> "hsl($hue,$saturation,$lightness)"
		else -> "hsla($hue,$saturation,$lightness,$alpha)"
	})


@CssDsl
public inline fun Color.Companion.hsl(
	hue: Double,
	saturation: Percentage,
	lightness: Percentage,
	alpha: Double = 1.0,
): Color.Hsl =
	CssValue.unsafe(when (alpha) {
		1.0 -> "hsl($hue,$saturation,$lightness)"
		else -> "hsla($hue,$saturation,$lightness,$alpha)"
	})


@CssDsl
public inline fun Color.Companion.hsl(
	hue: Int,
	saturation: Percentage,
	lightness: Percentage,
	alpha: Double = 1.0,
): Color.Hsl =
	CssValue.unsafe(when (alpha) {
		1.0 -> "hsl($hue,$saturation,$lightness)"
		else -> "hsla($hue,$saturation,$lightness,$alpha)"
	})


@CssDsl
public inline fun Color.Companion.rgb(
	red: Double,
	green: Double,
	blue: Double,
	alpha: Double = 1.0,
): Color.Rgb =
	CssValue.unsafe(when (alpha) {
		1.0 -> "rgb($red,$green,$blue)"
		else -> "rgba($red,$green,$blue,$alpha)"
	})


@CssDsl
public inline fun Color.Companion.rgb(
	red: Int,
	green: Int,
	blue: Int,
	alpha: Double = 1.0,
): Color.Rgb =
	CssValue.unsafe(when (alpha) {
		1.0 -> "rgb($red,$green,$blue)"
		else -> "rgba($red,$green,$blue,$alpha)"
	})


@CssDsl
public inline fun Color.Companion.rgb(
	red: Percentage,
	green: Percentage,
	blue: Percentage,
	alpha: Double = 1.0,
): Color.Rgb =
	CssValue.unsafe(when (alpha) {
		1.0 -> "rgb($red,$green,$blue)"
		else -> "rgba($red,$green,$blue,$alpha)"
	})


public inline fun Color.Companion.unsafe(value: String): Color =
	CssValue.unsafe(value)


public inline fun Color.Companion.variable(name: String): Color.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.color(value: Color) {
	property(color, value)
}


@CssDsl
public inline val Int.rgb: Color.Rgb
	get() = rgbWithAlpha(1.0)


@CssDsl
public inline fun Int.rgbWithAlpha(alpha: Double): Color.Rgb =
	Color.rgb(
		red = (this shr 16) and 0xFF,
		green = (this shr 8) and 0xFF,
		blue = this and 0xFF,
		alpha = alpha
	)


@Suppress("unused")
public inline val CssProperties.color: CssProperty<Color>
	get() = CssProperty.unsafe("color")
