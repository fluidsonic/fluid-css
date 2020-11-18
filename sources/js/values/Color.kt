@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Color :
	CssValue,
	CaretColor {

	public companion object {

		public val currentColor: Color = raw("currentColor")
		public val transparent: Color = raw("transparent")

		public val aliceBlue: Named = named("aliceblue", 0xF0F8FF.rgb)
		public val antiqueWhite: Named = named("antiquewhite", 0xFAEBD7.rgb)
		public val aqua: Named = named("aqua", 0x00FFFF.rgb)
		public val aquamarine: Named = named("aquamarine", 0x7FFFD4.rgb)
		public val azure: Named = named("azure", 0xF0FFFF.rgb)
		public val beige: Named = named("beige", 0xF5F5DC.rgb)
		public val bisque: Named = named("bisque", 0xFFE4C4.rgb)
		public val black: Named = named("black", 0x000000.rgb)
		public val blanchedAlmond: Named = named("blanchedalmond", 0xFFEBCD.rgb)
		public val blue: Named = named("blue", 0x0000FF.rgb)
		public val blueViolet: Named = named("blueviolet", 0x8A2BE2.rgb)
		public val brown: Named = named("brown", 0xA52A2A.rgb)
		public val burlyWood: Named = named("burlywood", 0xDEB887.rgb)
		public val cadetBlue: Named = named("cadetblue", 0x5F9EA0.rgb)
		public val chartreuse: Named = named("chartreuse", 0x7FFF00.rgb)
		public val chocolate: Named = named("chocolate", 0xD2691E.rgb)
		public val coral: Named = named("coral", 0xFF7F50.rgb)
		public val cornflowerBlue: Named = named("cornflowerblue", 0x6495ED.rgb)
		public val cornsilk: Named = named("cornsilk", 0xFFF8DC.rgb)
		public val crimson: Named = named("crimson", 0xDC143C.rgb)
		public val cyan: Named = named("cyan", 0x00FFFF.rgb)
		public val darkBlue: Named = named("darkblue", 0x00008B.rgb)
		public val darkCyan: Named = named("darkcyan", 0x008B8B.rgb)
		public val darkGoldenrod: Named = named("darkgoldenrod", 0xB8860B.rgb)
		public val darkGray: Named = named("darkgray", 0xA9A9A9.rgb)
		public val darkGreen: Named = named("darkgreen", 0x006400.rgb)
		public val darkGrey: Named = named("darkgrey", 0xA9A9A9.rgb)
		public val darkKhaki: Named = named("darkkhaki", 0xBDB76B.rgb)
		public val darkMagenta: Named = named("darkmagenta", 0x8B008B.rgb)
		public val darkOliveGreen: Named = named("darkolivegreen", 0x556B2F.rgb)
		public val darkOrange: Named = named("darkorange", 0xFF8C00.rgb)
		public val darkOrchid: Named = named("darkorchid", 0x9932CC.rgb)
		public val darkRed: Named = named("darkred", 0x8B0000.rgb)
		public val darkSalmon: Named = named("darksalmon", 0xE9967A.rgb)
		public val darkSeagreen: Named = named("darkseagreen", 0x8FBC8F.rgb)
		public val darkSlateBlue: Named = named("darkslateblue", 0x483D8B.rgb)
		public val darkSlateGray: Named = named("darkslategray", 0x2F4F4F.rgb)
		public val darkSlateGrey: Named = named("darkslategrey", 0x2F4F4F.rgb)
		public val darkTurquoise: Named = named("darkturquoise", 0x00CED1.rgb)
		public val darkViolet: Named = named("darkviolet", 0x9400D3.rgb)
		public val deepPink: Named = named("deeppink", 0xFF1493.rgb)
		public val deepSkyBlue: Named = named("deepskyblue", 0x00BFFF.rgb)
		public val dimGray: Named = named("dimgray", 0x696969.rgb)
		public val dimGrey: Named = named("dimgrey", 0x696969.rgb)
		public val dodgerBlue: Named = named("dodgerblue", 0x1E90FF.rgb)
		public val firebrick: Named = named("firebrick", 0xB22222.rgb)
		public val floralWhite: Named = named("floralwhite", 0xFFFAF0.rgb)
		public val forestGreen: Named = named("forestgreen", 0x228B22.rgb)
		public val fuchsia: Named = named("fuchsia", 0xFF00FF.rgb)
		public val gainsboro: Named = named("gainsboro", 0xDCDCDC.rgb)
		public val ghostWhite: Named = named("ghostwhite", 0xF8F8FF.rgb)
		public val gold: Named = named("gold", 0xFFD700.rgb)
		public val goldenrod: Named = named("goldenrod", 0xDAA520.rgb)
		public val gray: Named = named("gray", 0x808080.rgb)
		public val green: Named = named("green", 0x008000.rgb)
		public val greenYellow: Named = named("greenyellow", 0xADFF2F.rgb)
		public val grey: Named = named("grey", 0x808080.rgb)
		public val honeydew: Named = named("honeydew", 0xF0FFF0.rgb)
		public val hotPink: Named = named("hotpink", 0xFF69B4.rgb)
		public val indianRed: Named = named("indianred", 0xCD5C5C.rgb)
		public val indigo: Named = named("indigo", 0x4B0082.rgb)
		public val ivory: Named = named("ivory", 0xFFFFF0.rgb)
		public val khaki: Named = named("khaki", 0xF0E68C.rgb)
		public val lavender: Named = named("lavender", 0xE6E6FA.rgb)
		public val lavenderBlush: Named = named("lavenderblush", 0xFFF0F5.rgb)
		public val lawnGreen: Named = named("lawngreen", 0x7CFC00.rgb)
		public val lemonChiffon: Named = named("lemonchiffon", 0xFFFACD.rgb)
		public val lightBlue: Named = named("lightblue", 0xADD8E6.rgb)
		public val lightCoral: Named = named("lightcoral", 0xF08080.rgb)
		public val lightCyan: Named = named("lightcyan", 0xE0FFFF.rgb)
		public val lightGoldenrodYellow: Named = named("lightgoldenrodyellow", 0xFAFAD2.rgb)
		public val lightGray: Named = named("lightgray", 0xD3D3D3.rgb)
		public val lightGreen: Named = named("lightgreen", 0x90EE90.rgb)
		public val lightGrey: Named = named("lightgrey", 0xD3D3D3.rgb)
		public val lightPink: Named = named("lightpink", 0xFFB6C1.rgb)
		public val lightSalmon: Named = named("lightsalmon", 0xFFA07A.rgb)
		public val lightSeaGreen: Named = named("lightseagreen", 0x20B2AA.rgb)
		public val lightSkyBlue: Named = named("lightskyblue", 0x87CEFA.rgb)
		public val lightSlateGray: Named = named("lightslategray", 0x778899.rgb)
		public val lightSlateGrey: Named = named("lightslategrey", 0x778899.rgb)
		public val lightSteelBlue: Named = named("lightsteelblue", 0xB0C4DE.rgb)
		public val lightYellow: Named = named("lightyellow", 0xFFFFE0.rgb)
		public val lime: Named = named("lime", 0x00FF00.rgb)
		public val limeGreen: Named = named("limegreen", 0x32CD32.rgb)
		public val linen: Named = named("linen", 0xFAF0E6.rgb)
		public val magenta: Named = named("magenta", 0xFF00FF.rgb)
		public val maroon: Named = named("maroon", 0x800000.rgb)
		public val mediumAquamarine: Named = named("mediumaquamarine", 0x66CDAA.rgb)
		public val mediumBlue: Named = named("mediumblue", 0x0000CD.rgb)
		public val mediumOrchid: Named = named("mediumorchid", 0xBA55D3.rgb)
		public val mediumPurple: Named = named("mediumpurple", 0x9370DB.rgb)
		public val mediumSeaGreen: Named = named("mediumseagreen", 0x3CB371.rgb)
		public val mediumSlateBlue: Named = named("mediumslateblue", 0x7B68EE.rgb)
		public val mediumSpringGreen: Named = named("mediumspringgreen", 0x00FA9A.rgb)
		public val mediumTurquoise: Named = named("mediumturquoise", 0x48D1CC.rgb)
		public val mediumVioletRed: Named = named("mediumvioletred", 0xC71585.rgb)
		public val midnightBlue: Named = named("midnightblue", 0x191970.rgb)
		public val mintCream: Named = named("mintcream", 0xF5FFFA.rgb)
		public val mistyRose: Named = named("mistyrose", 0xFFE4E1.rgb)
		public val moccasin: Named = named("moccasin", 0xFFE4B5.rgb)
		public val navajoWhite: Named = named("navajowhite", 0xFFDEAD.rgb)
		public val navy: Named = named("navy", 0x000080.rgb)
		public val oldLace: Named = named("oldlace", 0xFDF5E6.rgb)
		public val olive: Named = named("olive", 0x808000.rgb)
		public val oliveDrab: Named = named("olivedrab", 0x6B8E23.rgb)
		public val orange: Named = named("orange", 0xFFA500.rgb)
		public val orangeRed: Named = named("orangered", 0xFF4500.rgb)
		public val orchid: Named = named("orchid", 0xDA70D6.rgb)
		public val paleGoldenrod: Named = named("palegoldenrod", 0xEEE8AA.rgb)
		public val paleGreen: Named = named("palegreen", 0x98FB98.rgb)
		public val paleTurquoise: Named = named("paleturquoise", 0xAFEEEE.rgb)
		public val paleVioletRed: Named = named("palevioletred", 0xDB7093.rgb)
		public val papayaWhip: Named = named("papayawhip", 0xFFEFD5.rgb)
		public val peachPuff: Named = named("peachpuff", 0xFFDAB9.rgb)
		public val peru: Named = named("peru", 0xCD853F.rgb)
		public val pink: Named = named("pink", 0xFFC0CB.rgb)
		public val plum: Named = named("plum", 0xDDA0DD.rgb)
		public val powderBlue: Named = named("powderblue", 0xB0E0E6.rgb)
		public val purple: Named = named("purple", 0x800080.rgb)
		public val rebeccaPurple: Named = named("rebeccapurple", 0x663399.rgb)
		public val red: Named = named("red", 0xFF0000.rgb)
		public val rosyBrown: Named = named("rosybrown", 0xBC8F8F.rgb)
		public val royalBlue: Named = named("royalblue", 0x4169E1.rgb)
		public val saddleBrown: Named = named("saddlebrown", 0x8B4513.rgb)
		public val salmon: Named = named("salmon", 0xFA8072.rgb)
		public val sandyBrown: Named = named("sandybrown", 0xF4A460.rgb)
		public val seaGreen: Named = named("seagreen", 0x2E8B57.rgb)
		public val seashell: Named = named("seashell", 0xFFF5EE.rgb)
		public val sienna: Named = named("sienna", 0xA0522D.rgb)
		public val silver: Named = named("silver", 0xC0C0C0.rgb)
		public val skyBlue: Named = named("skyblue", 0x87CEEB.rgb)
		public val slateBlue: Named = named("slateblue", 0x6A5ACD.rgb)
		public val slateGray: Named = named("slategray", 0x708090.rgb)
		public val slateGrey: Named = named("slategrey", 0x708090.rgb)
		public val snow: Named = named("snow", 0xFFFAFA.rgb)
		public val springGreen: Named = named("springgreen", 0x00FF7F.rgb)
		public val steelBlue: Named = named("steelblue", 0x4682B4.rgb)
		public val tan: Named = named("tan", 0xD2B48C.rgb)
		public val teal: Named = named("teal", 0x008080.rgb)
		public val thistle: Named = named("thistle", 0xD8BFD8.rgb)
		public val tomato: Named = named("tomato", 0xFF6347.rgb)
		public val turquoise: Named = named("turquoise", 0x40E0D0.rgb)
		public val violet: Named = named("violet", 0xEE82EE.rgb)
		public val wheat: Named = named("wheat", 0xF5DEB3.rgb)
		public val white: Named = named("white", 0xFFFFFF.rgb)
		public val whiteSmoke: Named = named("whitesmoke", 0xF5F5F5.rgb)
		public val yellow: Named = named("yellow", 0xFFFF00.rgb)
		public val yellowGreen: Named = named("yellowgreen", 0x9ACD32.rgb)


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
			Default(value)


		public fun rgb(
			red: Int,
			green: Int,
			blue: Int,
			alpha: Number = 1,
		): Rgb =
			RgbDefault(alpha = alpha, blue = blue, green = green, red = red)


		public fun variable(name: String): Variable =
			VariableDefault(name)
	}


	private class Default(value: String) : CssValueBase(value), Color


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
	) : CssValueBase(hslToString(hue, saturation, lightness, alpha)), Hsl {

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
	) : CssValueBase(name), Named {

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
	) : CssValueBase(rgbToString(red, green, blue, alpha)), Rgb {

		override fun withAlpha(alpha: Number) =
			if (alpha == this.alpha) this
			else RgbDefault(alpha = alpha, blue = blue, green = green, red = red)
	}


	public interface Variable : Color, CssVariable<Color>

	private class VariableDefault(name: String, vararg defaults: Color) : CssVariableBase<Color>(name, *defaults), Variable {

		override fun withDefaults(vararg defaults: Color): Color =
			VariableDefault(name, *defaults)
	}


	public interface WithComponents : Color {

		public fun withAlpha(alpha: Number): WithComponents
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.color(value: Color) {
	property(CssProperty.color, value)
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


public inline val Int.rgb: Color.Rgb
	get() = rgb(alpha = 1)


public inline fun Int.rgb(alpha: Number): Color.Rgb =
	Color.rgb(
		red = (this shr 16) and 0xFF,
		green = (this shr 8) and 0xFF,
		blue = this and 0xFF,
		alpha = alpha
	)


public inline val Int.rgba: Color.Rgb
	get() = toLong().rgba


public inline val Long.rgba: Color.Rgb
	get() = Color.rgb(
		red = ((this shr 24) and 0xFF).toInt(),
		green = ((this shr 16) and 0xFF).toInt(),
		blue = ((this shr 8) and 0xFF).toInt(),
		alpha = (this and 0xFF) / 255.0,
	)


public inline val CssProperty.Companion.color: CssProperty get() = CssProperty("color")
