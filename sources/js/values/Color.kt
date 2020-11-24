@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

import kotlin.js.RegExp


// FIXME support #RRGGBB[AA]
private val colorRegex = RegExp(
	pattern = "^\\s*([a-z]+)\\(\\s*([^,\\)]+)\\s*,\\s*([^,\\)]+)\\s*,\\s*([^,\\)]+)\\s*(,\\s*(\\d+(\\.\\d*)?)\\s*)?\\)\\s*$",
	flags = "i"
)


public external interface Color :
	Background.Single,
	BorderColor.Single,
	CaretColor,
	ColorStop,
	OutlineColor {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val currentColor: Color
			get() = unsafe("currentColor")

		@CssDsl
		public inline val transparent: Color
			get() = unsafe("transparent")


		@CssDsl
		public inline val aliceBlue: Rgb
			get() = 0xF0F8FF.rgb

		@CssDsl
		public inline val antiqueWhite: Rgb
			get() = 0xFAEBD7.rgb

		@CssDsl
		public inline val aqua: Rgb
			get() = 0x00FFFF.rgb

		@CssDsl
		public inline val aquamarine: Rgb
			get() = 0x7FFFD4.rgb

		@CssDsl
		public inline val azure: Rgb
			get() = 0xF0FFFF.rgb

		@CssDsl
		public inline val beige: Rgb
			get() = 0xF5F5DC.rgb

		@CssDsl
		public inline val bisque: Rgb
			get() = 0xFFE4C4.rgb

		@CssDsl
		public inline val black: Rgb
			get() = 0x000000.rgb

		@CssDsl
		public inline val blanchedAlmond: Rgb
			get() = 0xFFEBCD.rgb

		@CssDsl
		public inline val blue: Rgb
			get() = 0x0000FF.rgb

		@CssDsl
		public inline val blueViolet: Rgb
			get() = 0x8A2BE2.rgb

		@CssDsl
		public inline val brown: Rgb
			get() = 0xA52A2A.rgb

		@CssDsl
		public inline val burlyWood: Rgb
			get() = 0xDEB887.rgb

		@CssDsl
		public inline val cadetBlue: Rgb
			get() = 0x5F9EA0.rgb

		@CssDsl
		public inline val chartreuse: Rgb
			get() = 0x7FFF00.rgb

		@CssDsl
		public inline val chocolate: Rgb
			get() = 0xD2691E.rgb

		@CssDsl
		public inline val coral: Rgb
			get() = 0xFF7F50.rgb

		@CssDsl
		public inline val cornflowerBlue: Rgb
			get() = 0x6495ED.rgb

		@CssDsl
		public inline val cornsilk: Rgb
			get() = 0xFFF8DC.rgb

		@CssDsl
		public inline val crimson: Rgb
			get() = 0xDC143C.rgb

		@CssDsl
		public inline val cyan: Rgb
			get() = 0x00FFFF.rgb

		@CssDsl
		public inline val darkBlue: Rgb
			get() = 0x00008B.rgb

		@CssDsl
		public inline val darkCyan: Rgb
			get() = 0x008B8B.rgb

		@CssDsl
		public inline val darkGoldenrod: Rgb
			get() = 0xB8860B.rgb

		@CssDsl
		public inline val darkGray: Rgb
			get() = 0xA9A9A9.rgb

		@CssDsl
		public inline val darkGreen: Rgb
			get() = 0x006400.rgb

		@CssDsl
		public inline val darkGrey: Rgb
			get() = 0xA9A9A9.rgb

		@CssDsl
		public inline val darkKhaki: Rgb
			get() = 0xBDB76B.rgb

		@CssDsl
		public inline val darkMagenta: Rgb
			get() = 0x8B008B.rgb

		@CssDsl
		public inline val darkOliveGreen: Rgb
			get() = 0x556B2F.rgb

		@CssDsl
		public inline val darkOrange: Rgb
			get() = 0xFF8C00.rgb

		@CssDsl
		public inline val darkOrchid: Rgb
			get() = 0x9932CC.rgb

		@CssDsl
		public inline val darkRed: Rgb
			get() = 0x8B0000.rgb

		@CssDsl
		public inline val darkSalmon: Rgb
			get() = 0xE9967A.rgb

		@CssDsl
		public inline val darkSeagreen: Rgb
			get() = 0x8FBC8F.rgb

		@CssDsl
		public inline val darkSlateBlue: Rgb
			get() = 0x483D8B.rgb

		@CssDsl
		public inline val darkSlateGray: Rgb
			get() = 0x2F4F4F.rgb

		@CssDsl
		public inline val darkSlateGrey: Rgb
			get() = 0x2F4F4F.rgb

		@CssDsl
		public inline val darkTurquoise: Rgb
			get() = 0x00CED1.rgb

		@CssDsl
		public inline val darkViolet: Rgb
			get() = 0x9400D3.rgb

		@CssDsl
		public inline val deepPink: Rgb
			get() = 0xFF1493.rgb

		@CssDsl
		public inline val deepSkyBlue: Rgb
			get() = 0x00BFFF.rgb

		@CssDsl
		public inline val dimGray: Rgb
			get() = 0x696969.rgb

		@CssDsl
		public inline val dimGrey: Rgb
			get() = 0x696969.rgb

		@CssDsl
		public inline val dodgerBlue: Rgb
			get() = 0x1E90FF.rgb

		@CssDsl
		public inline val firebrick: Rgb
			get() = 0xB22222.rgb

		@CssDsl
		public inline val floralWhite: Rgb
			get() = 0xFFFAF0.rgb

		@CssDsl
		public inline val forestGreen: Rgb
			get() = 0x228B22.rgb

		@CssDsl
		public inline val fuchsia: Rgb
			get() = 0xFF00FF.rgb

		@CssDsl
		public inline val gainsboro: Rgb
			get() = 0xDCDCDC.rgb

		@CssDsl
		public inline val ghostWhite: Rgb
			get() = 0xF8F8FF.rgb

		@CssDsl
		public inline val gold: Rgb
			get() = 0xFFD700.rgb

		@CssDsl
		public inline val goldenrod: Rgb
			get() = 0xDAA520.rgb

		@CssDsl
		public inline val gray: Rgb
			get() = 0x808080.rgb

		@CssDsl
		public inline val green: Rgb
			get() = 0x008000.rgb

		@CssDsl
		public inline val greenYellow: Rgb
			get() = 0xADFF2F.rgb

		@CssDsl
		public inline val grey: Rgb
			get() = 0x808080.rgb

		@CssDsl
		public inline val honeydew: Rgb
			get() = 0xF0FFF0.rgb

		@CssDsl
		public inline val hotPink: Rgb
			get() = 0xFF69B4.rgb

		@CssDsl
		public inline val indianRed: Rgb
			get() = 0xCD5C5C.rgb

		@CssDsl
		public inline val indigo: Rgb
			get() = 0x4B0082.rgb

		@CssDsl
		public inline val ivory: Rgb
			get() = 0xFFFFF0.rgb

		@CssDsl
		public inline val khaki: Rgb
			get() = 0xF0E68C.rgb

		@CssDsl
		public inline val lavender: Rgb
			get() = 0xE6E6FA.rgb

		@CssDsl
		public inline val lavenderBlush: Rgb
			get() = 0xFFF0F5.rgb

		@CssDsl
		public inline val lawnGreen: Rgb
			get() = 0x7CFC00.rgb

		@CssDsl
		public inline val lemonChiffon: Rgb
			get() = 0xFFFACD.rgb

		@CssDsl
		public inline val lightBlue: Rgb
			get() = 0xADD8E6.rgb

		@CssDsl
		public inline val lightCoral: Rgb
			get() = 0xF08080.rgb

		@CssDsl
		public inline val lightCyan: Rgb
			get() = 0xE0FFFF.rgb

		@CssDsl
		public inline val lightGoldenrodYellow: Rgb
			get() = 0xFAFAD2.rgb

		@CssDsl
		public inline val lightGray: Rgb
			get() = 0xD3D3D3.rgb

		@CssDsl
		public inline val lightGreen: Rgb
			get() = 0x90EE90.rgb

		@CssDsl
		public inline val lightGrey: Rgb
			get() = 0xD3D3D3.rgb

		@CssDsl
		public inline val lightPink: Rgb
			get() = 0xFFB6C1.rgb

		@CssDsl
		public inline val lightSalmon: Rgb
			get() = 0xFFA07A.rgb

		@CssDsl
		public inline val lightSeaGreen: Rgb
			get() = 0x20B2AA.rgb

		@CssDsl
		public inline val lightSkyBlue: Rgb
			get() = 0x87CEFA.rgb

		@CssDsl
		public inline val lightSlateGray: Rgb
			get() = 0x778899.rgb

		@CssDsl
		public inline val lightSlateGrey: Rgb
			get() = 0x778899.rgb

		@CssDsl
		public inline val lightSteelBlue: Rgb
			get() = 0xB0C4DE.rgb

		@CssDsl
		public inline val lightYellow: Rgb
			get() = 0xFFFFE0.rgb

		@CssDsl
		public inline val lime: Rgb
			get() = 0x00FF00.rgb

		@CssDsl
		public inline val limeGreen: Rgb
			get() = 0x32CD32.rgb

		@CssDsl
		public inline val linen: Rgb
			get() = 0xFAF0E6.rgb

		@CssDsl
		public inline val magenta: Rgb
			get() = 0xFF00FF.rgb

		@CssDsl
		public inline val maroon: Rgb
			get() = 0x800000.rgb

		@CssDsl
		public inline val mediumAquamarine: Rgb
			get() = 0x66CDAA.rgb

		@CssDsl
		public inline val mediumBlue: Rgb
			get() = 0x0000CD.rgb

		@CssDsl
		public inline val mediumOrchid: Rgb
			get() = 0xBA55D3.rgb

		@CssDsl
		public inline val mediumPurple: Rgb
			get() = 0x9370DB.rgb

		@CssDsl
		public inline val mediumSeaGreen: Rgb
			get() = 0x3CB371.rgb

		@CssDsl
		public inline val mediumSlateBlue: Rgb
			get() = 0x7B68EE.rgb

		@CssDsl
		public inline val mediumSpringGreen: Rgb
			get() = 0x00FA9A.rgb

		@CssDsl
		public inline val mediumTurquoise: Rgb
			get() = 0x48D1CC.rgb

		@CssDsl
		public inline val mediumVioletRed: Rgb
			get() = 0xC71585.rgb

		@CssDsl
		public inline val midnightBlue: Rgb
			get() = 0x191970.rgb

		@CssDsl
		public inline val mintCream: Rgb
			get() = 0xF5FFFA.rgb

		@CssDsl
		public inline val mistyRose: Rgb
			get() = 0xFFE4E1.rgb

		@CssDsl
		public inline val moccasin: Rgb
			get() = 0xFFE4B5.rgb

		@CssDsl
		public inline val navajoWhite: Rgb
			get() = 0xFFDEAD.rgb

		@CssDsl
		public inline val navy: Rgb
			get() = 0x000080.rgb

		@CssDsl
		public inline val oldLace: Rgb
			get() = 0xFDF5E6.rgb

		@CssDsl
		public inline val olive: Rgb
			get() = 0x808000.rgb

		@CssDsl
		public inline val oliveDrab: Rgb
			get() = 0x6B8E23.rgb

		@CssDsl
		public inline val orange: Rgb
			get() = 0xFFA500.rgb

		@CssDsl
		public inline val orangeRed: Rgb
			get() = 0xFF4500.rgb

		@CssDsl
		public inline val orchid: Rgb
			get() = 0xDA70D6.rgb

		@CssDsl
		public inline val paleGoldenrod: Rgb
			get() = 0xEEE8AA.rgb

		@CssDsl
		public inline val paleGreen: Rgb
			get() = 0x98FB98.rgb

		@CssDsl
		public inline val paleTurquoise: Rgb
			get() = 0xAFEEEE.rgb

		@CssDsl
		public inline val paleVioletRed: Rgb
			get() = 0xDB7093.rgb

		@CssDsl
		public inline val papayaWhip: Rgb
			get() = 0xFFEFD5.rgb

		@CssDsl
		public inline val peachPuff: Rgb
			get() = 0xFFDAB9.rgb

		@CssDsl
		public inline val peru: Rgb
			get() = 0xCD853F.rgb

		@CssDsl
		public inline val pink: Rgb
			get() = 0xFFC0CB.rgb

		@CssDsl
		public inline val plum: Rgb
			get() = 0xDDA0DD.rgb

		@CssDsl
		public inline val powderBlue: Rgb
			get() = 0xB0E0E6.rgb

		@CssDsl
		public inline val purple: Rgb
			get() = 0x800080.rgb

		@CssDsl
		public inline val rebeccaPurple: Rgb
			get() = 0x663399.rgb

		@CssDsl
		public inline val red: Rgb
			get() = 0xFF0000.rgb

		@CssDsl
		public inline val rosyBrown: Rgb
			get() = 0xBC8F8F.rgb

		@CssDsl
		public inline val royalBlue: Rgb
			get() = 0x4169E1.rgb

		@CssDsl
		public inline val saddleBrown: Rgb
			get() = 0x8B4513.rgb

		@CssDsl
		public inline val salmon: Rgb
			get() = 0xFA8072.rgb

		@CssDsl
		public inline val sandyBrown: Rgb
			get() = 0xF4A460.rgb

		@CssDsl
		public inline val seaGreen: Rgb
			get() = 0x2E8B57.rgb

		@CssDsl
		public inline val seashell: Rgb
			get() = 0xFFF5EE.rgb

		@CssDsl
		public inline val sienna: Rgb
			get() = 0xA0522D.rgb

		@CssDsl
		public inline val silver: Rgb
			get() = 0xC0C0C0.rgb

		@CssDsl
		public inline val skyBlue: Rgb
			get() = 0x87CEEB.rgb

		@CssDsl
		public inline val slateBlue: Rgb
			get() = 0x6A5ACD.rgb

		@CssDsl
		public inline val slateGray: Rgb
			get() = 0x708090.rgb

		@CssDsl
		public inline val slateGrey: Rgb
			get() = 0x708090.rgb

		@CssDsl
		public inline val snow: Rgb
			get() = 0xFFFAFA.rgb

		@CssDsl
		public inline val springGreen: Rgb
			get() = 0x00FF7F.rgb

		@CssDsl
		public inline val steelBlue: Rgb
			get() = 0x4682B4.rgb

		@CssDsl
		public inline val tan: Rgb
			get() = 0xD2B48C.rgb

		@CssDsl
		public inline val teal: Rgb
			get() = 0x008080.rgb

		@CssDsl
		public inline val thistle: Rgb
			get() = 0xD8BFD8.rgb

		@CssDsl
		public inline val tomato: Rgb
			get() = 0xFF6347.rgb

		@CssDsl
		public inline val turquoise: Rgb
			get() = 0x40E0D0.rgb

		@CssDsl
		public inline val violet: Rgb
			get() = 0xEE82EE.rgb

		@CssDsl
		public inline val wheat: Rgb
			get() = 0xF5DEB3.rgb

		@CssDsl
		public inline val white: Rgb
			get() = 0xFFFFFF.rgb

		@CssDsl
		public inline val whiteSmoke: Rgb
			get() = 0xF5F5F5.rgb

		@CssDsl
		public inline val yellow: Rgb
			get() = 0xFFFF00.rgb

		@CssDsl
		public inline val yellowGreen: Rgb
			get() = 0x9ACD32.rgb


		@CssDsl
		public inline fun hsl(
			hue: Angle,
			saturation: Percentage,
			lightness: Percentage,
			alpha: Double = 1.0,
		): Hsl =
			CssValue.unsafe(when (alpha) {
				1.0 -> "hsl($hue,$saturation,$lightness)"
				else -> "hsla($hue,$saturation,$lightness,$alpha)"
			})


		@CssDsl
		public inline fun hsl(
			hue: Double,
			saturation: Percentage,
			lightness: Percentage,
			alpha: Double = 1.0,
		): Hsl =
			CssValue.unsafe(when (alpha) {
				1.0 -> "hsl($hue,$saturation,$lightness)"
				else -> "hsla($hue,$saturation,$lightness,$alpha)"
			})


		@CssDsl
		public inline fun hsl(
			hue: Int,
			saturation: Percentage,
			lightness: Percentage,
			alpha: Double = 1.0,
		): Hsl =
			CssValue.unsafe(when (alpha) {
				1.0 -> "hsl($hue,$saturation,$lightness)"
				else -> "hsla($hue,$saturation,$lightness,$alpha)"
			})


		@CssDsl
		public inline fun rgb(
			red: Double,
			green: Double,
			blue: Double,
			alpha: Double = 1.0,
		): Rgb =
			CssValue.unsafe(when (alpha) {
				1.0 -> "rgb($red,$green,$blue)"
				else -> "rgba($red,$green,$blue,$alpha)"
			})


		@CssDsl
		public inline fun rgb(
			red: Int,
			green: Int,
			blue: Int,
			alpha: Double = 1.0,
		): Rgb =
			CssValue.unsafe(when (alpha) {
				1.0 -> "rgb($red,$green,$blue)"
				else -> "rgba($red,$green,$blue,$alpha)"
			})


		@CssDsl
		public inline fun rgb(
			red: Percentage,
			green: Percentage,
			blue: Percentage,
			alpha: Double = 1.0,
		): Rgb =
			CssValue.unsafe(when (alpha) {
				1.0 -> "rgb($red,$green,$blue)"
				else -> "rgba($red,$green,$blue,$alpha)"
			})


		public inline fun unsafe(value: String): Color =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Hsl : WithComponents
	public interface Rgb : WithComponents
	public interface Variable : Color, CssVariable<Color>
	public interface WithComponents : Color
}


public fun <T : Color.WithComponents> T.withAlpha(alpha: Double): T {
	val match = colorRegex.exec(asString()) ?: error("Cannot parse CSS component color value: $this")
	val values = match.unsafeCast<Array<String?>>()

	val type = values[1]!!.toLowerCase()
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
