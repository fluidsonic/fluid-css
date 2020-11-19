@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Color :
	Background,
	BorderColor.Single,
	OutlineColor,
	CaretColor {

	public companion object {

		@CssDsl
		public val currentColor: Color = raw("currentColor")

		@CssDsl
		public val transparent: Color = raw("transparent")


		@CssDsl
		public val aliceBlue: Named = named("aliceblue", 0xF0F8FF.rgb)

		@CssDsl
		public val antiqueWhite: Named = named("antiquewhite", 0xFAEBD7.rgb)

		@CssDsl
		public val aqua: Named = named("aqua", 0x00FFFF.rgb)

		@CssDsl
		public val aquamarine: Named = named("aquamarine", 0x7FFFD4.rgb)

		@CssDsl
		public val azure: Named = named("azure", 0xF0FFFF.rgb)

		@CssDsl
		public val beige: Named = named("beige", 0xF5F5DC.rgb)

		@CssDsl
		public val bisque: Named = named("bisque", 0xFFE4C4.rgb)

		@CssDsl
		public val black: Named = named("black", 0x000000.rgb)

		@CssDsl
		public val blanchedAlmond: Named = named("blanchedalmond", 0xFFEBCD.rgb)

		@CssDsl
		public val blue: Named = named("blue", 0x0000FF.rgb)

		@CssDsl
		public val blueViolet: Named = named("blueviolet", 0x8A2BE2.rgb)

		@CssDsl
		public val brown: Named = named("brown", 0xA52A2A.rgb)

		@CssDsl
		public val burlyWood: Named = named("burlywood", 0xDEB887.rgb)

		@CssDsl
		public val cadetBlue: Named = named("cadetblue", 0x5F9EA0.rgb)

		@CssDsl
		public val chartreuse: Named = named("chartreuse", 0x7FFF00.rgb)

		@CssDsl
		public val chocolate: Named = named("chocolate", 0xD2691E.rgb)

		@CssDsl
		public val coral: Named = named("coral", 0xFF7F50.rgb)

		@CssDsl
		public val cornflowerBlue: Named = named("cornflowerblue", 0x6495ED.rgb)

		@CssDsl
		public val cornsilk: Named = named("cornsilk", 0xFFF8DC.rgb)

		@CssDsl
		public val crimson: Named = named("crimson", 0xDC143C.rgb)

		@CssDsl
		public val cyan: Named = named("cyan", 0x00FFFF.rgb)

		@CssDsl
		public val darkBlue: Named = named("darkblue", 0x00008B.rgb)

		@CssDsl
		public val darkCyan: Named = named("darkcyan", 0x008B8B.rgb)

		@CssDsl
		public val darkGoldenrod: Named = named("darkgoldenrod", 0xB8860B.rgb)

		@CssDsl
		public val darkGray: Named = named("darkgray", 0xA9A9A9.rgb)

		@CssDsl
		public val darkGreen: Named = named("darkgreen", 0x006400.rgb)

		@CssDsl
		public val darkGrey: Named = named("darkgrey", 0xA9A9A9.rgb)

		@CssDsl
		public val darkKhaki: Named = named("darkkhaki", 0xBDB76B.rgb)

		@CssDsl
		public val darkMagenta: Named = named("darkmagenta", 0x8B008B.rgb)

		@CssDsl
		public val darkOliveGreen: Named = named("darkolivegreen", 0x556B2F.rgb)

		@CssDsl
		public val darkOrange: Named = named("darkorange", 0xFF8C00.rgb)

		@CssDsl
		public val darkOrchid: Named = named("darkorchid", 0x9932CC.rgb)

		@CssDsl
		public val darkRed: Named = named("darkred", 0x8B0000.rgb)

		@CssDsl
		public val darkSalmon: Named = named("darksalmon", 0xE9967A.rgb)

		@CssDsl
		public val darkSeagreen: Named = named("darkseagreen", 0x8FBC8F.rgb)

		@CssDsl
		public val darkSlateBlue: Named = named("darkslateblue", 0x483D8B.rgb)

		@CssDsl
		public val darkSlateGray: Named = named("darkslategray", 0x2F4F4F.rgb)

		@CssDsl
		public val darkSlateGrey: Named = named("darkslategrey", 0x2F4F4F.rgb)

		@CssDsl
		public val darkTurquoise: Named = named("darkturquoise", 0x00CED1.rgb)

		@CssDsl
		public val darkViolet: Named = named("darkviolet", 0x9400D3.rgb)

		@CssDsl
		public val deepPink: Named = named("deeppink", 0xFF1493.rgb)

		@CssDsl
		public val deepSkyBlue: Named = named("deepskyblue", 0x00BFFF.rgb)

		@CssDsl
		public val dimGray: Named = named("dimgray", 0x696969.rgb)

		@CssDsl
		public val dimGrey: Named = named("dimgrey", 0x696969.rgb)

		@CssDsl
		public val dodgerBlue: Named = named("dodgerblue", 0x1E90FF.rgb)

		@CssDsl
		public val firebrick: Named = named("firebrick", 0xB22222.rgb)

		@CssDsl
		public val floralWhite: Named = named("floralwhite", 0xFFFAF0.rgb)

		@CssDsl
		public val forestGreen: Named = named("forestgreen", 0x228B22.rgb)

		@CssDsl
		public val fuchsia: Named = named("fuchsia", 0xFF00FF.rgb)

		@CssDsl
		public val gainsboro: Named = named("gainsboro", 0xDCDCDC.rgb)

		@CssDsl
		public val ghostWhite: Named = named("ghostwhite", 0xF8F8FF.rgb)

		@CssDsl
		public val gold: Named = named("gold", 0xFFD700.rgb)

		@CssDsl
		public val goldenrod: Named = named("goldenrod", 0xDAA520.rgb)

		@CssDsl
		public val gray: Named = named("gray", 0x808080.rgb)

		@CssDsl
		public val green: Named = named("green", 0x008000.rgb)

		@CssDsl
		public val greenYellow: Named = named("greenyellow", 0xADFF2F.rgb)

		@CssDsl
		public val grey: Named = named("grey", 0x808080.rgb)

		@CssDsl
		public val honeydew: Named = named("honeydew", 0xF0FFF0.rgb)

		@CssDsl
		public val hotPink: Named = named("hotpink", 0xFF69B4.rgb)

		@CssDsl
		public val indianRed: Named = named("indianred", 0xCD5C5C.rgb)

		@CssDsl
		public val indigo: Named = named("indigo", 0x4B0082.rgb)

		@CssDsl
		public val ivory: Named = named("ivory", 0xFFFFF0.rgb)

		@CssDsl
		public val khaki: Named = named("khaki", 0xF0E68C.rgb)

		@CssDsl
		public val lavender: Named = named("lavender", 0xE6E6FA.rgb)

		@CssDsl
		public val lavenderBlush: Named = named("lavenderblush", 0xFFF0F5.rgb)

		@CssDsl
		public val lawnGreen: Named = named("lawngreen", 0x7CFC00.rgb)

		@CssDsl
		public val lemonChiffon: Named = named("lemonchiffon", 0xFFFACD.rgb)

		@CssDsl
		public val lightBlue: Named = named("lightblue", 0xADD8E6.rgb)

		@CssDsl
		public val lightCoral: Named = named("lightcoral", 0xF08080.rgb)

		@CssDsl
		public val lightCyan: Named = named("lightcyan", 0xE0FFFF.rgb)

		@CssDsl
		public val lightGoldenrodYellow: Named = named("lightgoldenrodyellow", 0xFAFAD2.rgb)

		@CssDsl
		public val lightGray: Named = named("lightgray", 0xD3D3D3.rgb)

		@CssDsl
		public val lightGreen: Named = named("lightgreen", 0x90EE90.rgb)

		@CssDsl
		public val lightGrey: Named = named("lightgrey", 0xD3D3D3.rgb)

		@CssDsl
		public val lightPink: Named = named("lightpink", 0xFFB6C1.rgb)

		@CssDsl
		public val lightSalmon: Named = named("lightsalmon", 0xFFA07A.rgb)

		@CssDsl
		public val lightSeaGreen: Named = named("lightseagreen", 0x20B2AA.rgb)

		@CssDsl
		public val lightSkyBlue: Named = named("lightskyblue", 0x87CEFA.rgb)

		@CssDsl
		public val lightSlateGray: Named = named("lightslategray", 0x778899.rgb)

		@CssDsl
		public val lightSlateGrey: Named = named("lightslategrey", 0x778899.rgb)

		@CssDsl
		public val lightSteelBlue: Named = named("lightsteelblue", 0xB0C4DE.rgb)

		@CssDsl
		public val lightYellow: Named = named("lightyellow", 0xFFFFE0.rgb)

		@CssDsl
		public val lime: Named = named("lime", 0x00FF00.rgb)

		@CssDsl
		public val limeGreen: Named = named("limegreen", 0x32CD32.rgb)

		@CssDsl
		public val linen: Named = named("linen", 0xFAF0E6.rgb)

		@CssDsl
		public val magenta: Named = named("magenta", 0xFF00FF.rgb)

		@CssDsl
		public val maroon: Named = named("maroon", 0x800000.rgb)

		@CssDsl
		public val mediumAquamarine: Named = named("mediumaquamarine", 0x66CDAA.rgb)

		@CssDsl
		public val mediumBlue: Named = named("mediumblue", 0x0000CD.rgb)

		@CssDsl
		public val mediumOrchid: Named = named("mediumorchid", 0xBA55D3.rgb)

		@CssDsl
		public val mediumPurple: Named = named("mediumpurple", 0x9370DB.rgb)

		@CssDsl
		public val mediumSeaGreen: Named = named("mediumseagreen", 0x3CB371.rgb)

		@CssDsl
		public val mediumSlateBlue: Named = named("mediumslateblue", 0x7B68EE.rgb)

		@CssDsl
		public val mediumSpringGreen: Named = named("mediumspringgreen", 0x00FA9A.rgb)

		@CssDsl
		public val mediumTurquoise: Named = named("mediumturquoise", 0x48D1CC.rgb)

		@CssDsl
		public val mediumVioletRed: Named = named("mediumvioletred", 0xC71585.rgb)

		@CssDsl
		public val midnightBlue: Named = named("midnightblue", 0x191970.rgb)

		@CssDsl
		public val mintCream: Named = named("mintcream", 0xF5FFFA.rgb)

		@CssDsl
		public val mistyRose: Named = named("mistyrose", 0xFFE4E1.rgb)

		@CssDsl
		public val moccasin: Named = named("moccasin", 0xFFE4B5.rgb)

		@CssDsl
		public val navajoWhite: Named = named("navajowhite", 0xFFDEAD.rgb)

		@CssDsl
		public val navy: Named = named("navy", 0x000080.rgb)

		@CssDsl
		public val oldLace: Named = named("oldlace", 0xFDF5E6.rgb)

		@CssDsl
		public val olive: Named = named("olive", 0x808000.rgb)

		@CssDsl
		public val oliveDrab: Named = named("olivedrab", 0x6B8E23.rgb)

		@CssDsl
		public val orange: Named = named("orange", 0xFFA500.rgb)

		@CssDsl
		public val orangeRed: Named = named("orangered", 0xFF4500.rgb)

		@CssDsl
		public val orchid: Named = named("orchid", 0xDA70D6.rgb)

		@CssDsl
		public val paleGoldenrod: Named = named("palegoldenrod", 0xEEE8AA.rgb)

		@CssDsl
		public val paleGreen: Named = named("palegreen", 0x98FB98.rgb)

		@CssDsl
		public val paleTurquoise: Named = named("paleturquoise", 0xAFEEEE.rgb)

		@CssDsl
		public val paleVioletRed: Named = named("palevioletred", 0xDB7093.rgb)

		@CssDsl
		public val papayaWhip: Named = named("papayawhip", 0xFFEFD5.rgb)

		@CssDsl
		public val peachPuff: Named = named("peachpuff", 0xFFDAB9.rgb)

		@CssDsl
		public val peru: Named = named("peru", 0xCD853F.rgb)

		@CssDsl
		public val pink: Named = named("pink", 0xFFC0CB.rgb)

		@CssDsl
		public val plum: Named = named("plum", 0xDDA0DD.rgb)

		@CssDsl
		public val powderBlue: Named = named("powderblue", 0xB0E0E6.rgb)

		@CssDsl
		public val purple: Named = named("purple", 0x800080.rgb)

		@CssDsl
		public val rebeccaPurple: Named = named("rebeccapurple", 0x663399.rgb)

		@CssDsl
		public val red: Named = named("red", 0xFF0000.rgb)

		@CssDsl
		public val rosyBrown: Named = named("rosybrown", 0xBC8F8F.rgb)

		@CssDsl
		public val royalBlue: Named = named("royalblue", 0x4169E1.rgb)

		@CssDsl
		public val saddleBrown: Named = named("saddlebrown", 0x8B4513.rgb)

		@CssDsl
		public val salmon: Named = named("salmon", 0xFA8072.rgb)

		@CssDsl
		public val sandyBrown: Named = named("sandybrown", 0xF4A460.rgb)

		@CssDsl
		public val seaGreen: Named = named("seagreen", 0x2E8B57.rgb)

		@CssDsl
		public val seashell: Named = named("seashell", 0xFFF5EE.rgb)

		@CssDsl
		public val sienna: Named = named("sienna", 0xA0522D.rgb)

		@CssDsl
		public val silver: Named = named("silver", 0xC0C0C0.rgb)

		@CssDsl
		public val skyBlue: Named = named("skyblue", 0x87CEEB.rgb)

		@CssDsl
		public val slateBlue: Named = named("slateblue", 0x6A5ACD.rgb)

		@CssDsl
		public val slateGray: Named = named("slategray", 0x708090.rgb)

		@CssDsl
		public val slateGrey: Named = named("slategrey", 0x708090.rgb)

		@CssDsl
		public val snow: Named = named("snow", 0xFFFAFA.rgb)

		@CssDsl
		public val springGreen: Named = named("springgreen", 0x00FF7F.rgb)

		@CssDsl
		public val steelBlue: Named = named("steelblue", 0x4682B4.rgb)

		@CssDsl
		public val tan: Named = named("tan", 0xD2B48C.rgb)

		@CssDsl
		public val teal: Named = named("teal", 0x008080.rgb)

		@CssDsl
		public val thistle: Named = named("thistle", 0xD8BFD8.rgb)

		@CssDsl
		public val tomato: Named = named("tomato", 0xFF6347.rgb)

		@CssDsl
		public val turquoise: Named = named("turquoise", 0x40E0D0.rgb)

		@CssDsl
		public val violet: Named = named("violet", 0xEE82EE.rgb)

		@CssDsl
		public val wheat: Named = named("wheat", 0xF5DEB3.rgb)

		@CssDsl
		public val white: Named = named("white", 0xFFFFFF.rgb)

		@CssDsl
		public val whiteSmoke: Named = named("whitesmoke", 0xF5F5F5.rgb)

		@CssDsl
		public val yellow: Named = named("yellow", 0xFFFF00.rgb)

		@CssDsl
		public val yellowGreen: Named = named("yellowgreen", 0x9ACD32.rgb)


		@CssDsl
		public fun hsl(
			hue: Number,
			saturation: Percentage,
			lightness: Percentage,
			alpha: Number = 1,
		): Hsl =
			HslDefault(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)


		public fun named(name: String, rgbColor: Rgb): Named =
			NamedDefault(name = name, rgbColor = rgbColor)


		public fun raw(value: String): Color =
			GenericValue(value)


		@CssDsl
		public fun rgb(
			red: Int,
			green: Int,
			blue: Int,
			alpha: Number = 1,
		): Rgb =
			RgbDefault(alpha = alpha, blue = blue, green = green, red = red)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Hsl : WithComponents {

		public val alpha: Number
		public val hue: Number // FIXME Angle
		public val lightness: Percentage
		public val saturation: Percentage


		override fun withAlpha(alpha: Number): Hsl
	}

	private class HslDefault(
		override val alpha: Number,
		override val hue: Number,
		override val lightness: Percentage,
		override val saturation: Percentage,
	) : GenericValue(hslToString(hue, saturation, lightness, alpha)), Hsl {

		override fun withAlpha(alpha: Number) =
			if (alpha == this.alpha) this
			else HslDefault(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)
	}


	public interface Named : WithComponents {

		public val name: String
		public val rgbColor: Rgb

		override fun withAlpha(alpha: Number): Rgb
	}

	private class NamedDefault(
		override val name: String,
		override val rgbColor: Rgb,
	) : GenericValue(name), Named {

		override fun withAlpha(alpha: Number) =
			rgbColor.withAlpha(alpha)
	}


	public interface Rgb : WithComponents {

		public val alpha: Number
		public val blue: Int
		public val green: Int
		public val red: Int


		override fun withAlpha(alpha: Number): Rgb
	}

	private class RgbDefault(
		override val alpha: Number,
		override val blue: Int,
		override val green: Int,
		override val red: Int,
	) : GenericValue(rgbToString(red, green, blue, alpha)), Rgb {

		override fun withAlpha(alpha: Number) =
			if (alpha == this.alpha) this
			else RgbDefault(alpha = alpha, blue = blue, green = green, red = red)
	}


	public interface Variable : Color, CssVariable<Color>


	public interface WithComponents : Color {

		public fun withAlpha(alpha: Number): WithComponents
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.color(value: Color) {
	property(color, value)
}


private fun hslToString(hue: Number, saturation: Percentage, lightness: Percentage, alpha: Number) = buildString {
	val alpha = alpha.toDouble().coerceIn(0.0 .. 1.0)

	if (alpha < 1) append("hsla(")
	else append("hsl(")

	append(hue)
	append(",")
	append(saturation)
	append(",")
	append(lightness)

	if (alpha < 1) {
		append(",")
		append(alpha)
	}

	append(")")
}


private fun rgbToString(red: Int, green: Int, blue: Int, alpha: Number) = buildString {
	val alpha = alpha.toDouble().coerceIn(0.0 .. 1.0)

	if (alpha < 1) append("rgba(")
	else append("rgb(")

	append(red)
	append(",")
	append(green)
	append(",")
	append(blue)

	if (alpha < 1) {
		append(",")
		append(alpha)
	}

	append(")")
}


@CssDsl
public inline val Int.rgb: Color.Rgb
	get() = rgb(alpha = 1)


@CssDsl
public inline fun Int.rgb(alpha: Number): Color.Rgb =
	Color.rgb(
		red = (this shr 16) and 0xFF,
		green = (this shr 8) and 0xFF,
		blue = this and 0xFF,
		alpha = alpha
	)


@CssDsl
public inline val Int.rgba: Color.Rgb
	get() = toLong().rgba


@CssDsl
public inline val Long.rgba: Color.Rgb
	get() = Color.rgb(
		red = ((this shr 24) and 0xFF).toInt(),
		green = ((this shr 16) and 0xFF).toInt(),
		blue = ((this shr 8) and 0xFF).toInt(),
		alpha = (this and 0xFF) / 255.0,
	)


@Suppress("unused")
public inline val CssProperties.color: CssProperty<Color>
	get() = CssProperty("color")
