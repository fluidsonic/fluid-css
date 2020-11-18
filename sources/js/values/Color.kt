@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface ColorOrAutoOrGlobal : CssValue
public interface ColorOrGlobal : ColorOrAutoOrGlobal

public interface Color : ColorOrGlobal {

	public companion object {

		public val currentColor: DynamicColor = DynamicColor("currentColor")
		public val transparent: DynamicColor = DynamicColor("transparent")

		public val aliceBlue: NamedColor = NamedColor("aliceblue", 0xF0F8FF.rgb)
		public val antiqueWhite: NamedColor = NamedColor("antiquewhite", 0xFAEBD7.rgb)
		public val aqua: NamedColor = NamedColor("aqua", 0x00FFFF.rgb)
		public val aquamarine: NamedColor = NamedColor("aquamarine", 0x7FFFD4.rgb)
		public val azure: NamedColor = NamedColor("azure", 0xF0FFFF.rgb)
		public val beige: NamedColor = NamedColor("beige", 0xF5F5DC.rgb)
		public val bisque: NamedColor = NamedColor("bisque", 0xFFE4C4.rgb)
		public val black: NamedColor = NamedColor("black", 0x000000.rgb)
		public val blanchedAlmond: NamedColor = NamedColor("blanchedalmond", 0xFFEBCD.rgb)
		public val blue: NamedColor = NamedColor("blue", 0x0000FF.rgb)
		public val blueViolet: NamedColor = NamedColor("blueviolet", 0x8A2BE2.rgb)
		public val brown: NamedColor = NamedColor("brown", 0xA52A2A.rgb)
		public val burlyWood: NamedColor = NamedColor("burlywood", 0xDEB887.rgb)
		public val cadetBlue: NamedColor = NamedColor("cadetblue", 0x5F9EA0.rgb)
		public val chartreuse: NamedColor = NamedColor("chartreuse", 0x7FFF00.rgb)
		public val chocolate: NamedColor = NamedColor("chocolate", 0xD2691E.rgb)
		public val coral: NamedColor = NamedColor("coral", 0xFF7F50.rgb)
		public val cornflowerBlue: NamedColor = NamedColor("cornflowerblue", 0x6495ED.rgb)
		public val cornsilk: NamedColor = NamedColor("cornsilk", 0xFFF8DC.rgb)
		public val crimson: NamedColor = NamedColor("crimson", 0xDC143C.rgb)
		public val cyan: NamedColor = NamedColor("cyan", 0x00FFFF.rgb)
		public val darkBlue: NamedColor = NamedColor("darkblue", 0x00008B.rgb)
		public val darkCyan: NamedColor = NamedColor("darkcyan", 0x008B8B.rgb)
		public val darkGoldenrod: NamedColor = NamedColor("darkgoldenrod", 0xB8860B.rgb)
		public val darkGray: NamedColor = NamedColor("darkgray", 0xA9A9A9.rgb)
		public val darkGreen: NamedColor = NamedColor("darkgreen", 0x006400.rgb)
		public val darkGrey: NamedColor = NamedColor("darkgrey", 0xA9A9A9.rgb)
		public val darkKhaki: NamedColor = NamedColor("darkkhaki", 0xBDB76B.rgb)
		public val darkMagenta: NamedColor = NamedColor("darkmagenta", 0x8B008B.rgb)
		public val darkOliveGreen: NamedColor = NamedColor("darkolivegreen", 0x556B2F.rgb)
		public val darkOrange: NamedColor = NamedColor("darkorange", 0xFF8C00.rgb)
		public val darkOrchid: NamedColor = NamedColor("darkorchid", 0x9932CC.rgb)
		public val darkRed: NamedColor = NamedColor("darkred", 0x8B0000.rgb)
		public val darkSalmon: NamedColor = NamedColor("darksalmon", 0xE9967A.rgb)
		public val darkSeagreen: NamedColor = NamedColor("darkseagreen", 0x8FBC8F.rgb)
		public val darkSlateBlue: NamedColor = NamedColor("darkslateblue", 0x483D8B.rgb)
		public val darkSlateGray: NamedColor = NamedColor("darkslategray", 0x2F4F4F.rgb)
		public val darkSlateGrey: NamedColor = NamedColor("darkslategrey", 0x2F4F4F.rgb)
		public val darkTurquoise: NamedColor = NamedColor("darkturquoise", 0x00CED1.rgb)
		public val darkViolet: NamedColor = NamedColor("darkviolet", 0x9400D3.rgb)
		public val deepPink: NamedColor = NamedColor("deeppink", 0xFF1493.rgb)
		public val deepSkyBlue: NamedColor = NamedColor("deepskyblue", 0x00BFFF.rgb)
		public val dimGray: NamedColor = NamedColor("dimgray", 0x696969.rgb)
		public val dimGrey: NamedColor = NamedColor("dimgrey", 0x696969.rgb)
		public val dodgerBlue: NamedColor = NamedColor("dodgerblue", 0x1E90FF.rgb)
		public val firebrick: NamedColor = NamedColor("firebrick", 0xB22222.rgb)
		public val floralWhite: NamedColor = NamedColor("floralwhite", 0xFFFAF0.rgb)
		public val forestGreen: NamedColor = NamedColor("forestgreen", 0x228B22.rgb)
		public val fuchsia: NamedColor = NamedColor("fuchsia", 0xFF00FF.rgb)
		public val gainsboro: NamedColor = NamedColor("gainsboro", 0xDCDCDC.rgb)
		public val ghostWhite: NamedColor = NamedColor("ghostwhite", 0xF8F8FF.rgb)
		public val gold: NamedColor = NamedColor("gold", 0xFFD700.rgb)
		public val goldenrod: NamedColor = NamedColor("goldenrod", 0xDAA520.rgb)
		public val gray: NamedColor = NamedColor("gray", 0x808080.rgb)
		public val green: NamedColor = NamedColor("green", 0x008000.rgb)
		public val greenYellow: NamedColor = NamedColor("greenyellow", 0xADFF2F.rgb)
		public val grey: NamedColor = NamedColor("grey", 0x808080.rgb)
		public val honeydew: NamedColor = NamedColor("honeydew", 0xF0FFF0.rgb)
		public val hotPink: NamedColor = NamedColor("hotpink", 0xFF69B4.rgb)
		public val indianRed: NamedColor = NamedColor("indianred", 0xCD5C5C.rgb)
		public val indigo: NamedColor = NamedColor("indigo", 0x4B0082.rgb)
		public val ivory: NamedColor = NamedColor("ivory", 0xFFFFF0.rgb)
		public val khaki: NamedColor = NamedColor("khaki", 0xF0E68C.rgb)
		public val lavender: NamedColor = NamedColor("lavender", 0xE6E6FA.rgb)
		public val lavenderBlush: NamedColor = NamedColor("lavenderblush", 0xFFF0F5.rgb)
		public val lawnGreen: NamedColor = NamedColor("lawngreen", 0x7CFC00.rgb)
		public val lemonChiffon: NamedColor = NamedColor("lemonchiffon", 0xFFFACD.rgb)
		public val lightBlue: NamedColor = NamedColor("lightblue", 0xADD8E6.rgb)
		public val lightCoral: NamedColor = NamedColor("lightcoral", 0xF08080.rgb)
		public val lightCyan: NamedColor = NamedColor("lightcyan", 0xE0FFFF.rgb)
		public val lightGoldenrodYellow: NamedColor = NamedColor("lightgoldenrodyellow", 0xFAFAD2.rgb)
		public val lightGray: NamedColor = NamedColor("lightgray", 0xD3D3D3.rgb)
		public val lightGreen: NamedColor = NamedColor("lightgreen", 0x90EE90.rgb)
		public val lightGrey: NamedColor = NamedColor("lightgrey", 0xD3D3D3.rgb)
		public val lightPink: NamedColor = NamedColor("lightpink", 0xFFB6C1.rgb)
		public val lightSalmon: NamedColor = NamedColor("lightsalmon", 0xFFA07A.rgb)
		public val lightSeaGreen: NamedColor = NamedColor("lightseagreen", 0x20B2AA.rgb)
		public val lightSkyBlue: NamedColor = NamedColor("lightskyblue", 0x87CEFA.rgb)
		public val lightSlateGray: NamedColor = NamedColor("lightslategray", 0x778899.rgb)
		public val lightSlateGrey: NamedColor = NamedColor("lightslategrey", 0x778899.rgb)
		public val lightSteelBlue: NamedColor = NamedColor("lightsteelblue", 0xB0C4DE.rgb)
		public val lightYellow: NamedColor = NamedColor("lightyellow", 0xFFFFE0.rgb)
		public val lime: NamedColor = NamedColor("lime", 0x00FF00.rgb)
		public val limeGreen: NamedColor = NamedColor("limegreen", 0x32CD32.rgb)
		public val linen: NamedColor = NamedColor("linen", 0xFAF0E6.rgb)
		public val magenta: NamedColor = NamedColor("magenta", 0xFF00FF.rgb)
		public val maroon: NamedColor = NamedColor("maroon", 0x800000.rgb)
		public val mediumAquamarine: NamedColor = NamedColor("mediumaquamarine", 0x66CDAA.rgb)
		public val mediumBlue: NamedColor = NamedColor("mediumblue", 0x0000CD.rgb)
		public val mediumOrchid: NamedColor = NamedColor("mediumorchid", 0xBA55D3.rgb)
		public val mediumPurple: NamedColor = NamedColor("mediumpurple", 0x9370DB.rgb)
		public val mediumSeaGreen: NamedColor = NamedColor("mediumseagreen", 0x3CB371.rgb)
		public val mediumSlateBlue: NamedColor = NamedColor("mediumslateblue", 0x7B68EE.rgb)
		public val mediumSpringGreen: NamedColor = NamedColor("mediumspringgreen", 0x00FA9A.rgb)
		public val mediumTurquoise: NamedColor = NamedColor("mediumturquoise", 0x48D1CC.rgb)
		public val mediumVioletRed: NamedColor = NamedColor("mediumvioletred", 0xC71585.rgb)
		public val midnightBlue: NamedColor = NamedColor("midnightblue", 0x191970.rgb)
		public val mintCream: NamedColor = NamedColor("mintcream", 0xF5FFFA.rgb)
		public val mistyRose: NamedColor = NamedColor("mistyrose", 0xFFE4E1.rgb)
		public val moccasin: NamedColor = NamedColor("moccasin", 0xFFE4B5.rgb)
		public val navajoWhite: NamedColor = NamedColor("navajowhite", 0xFFDEAD.rgb)
		public val navy: NamedColor = NamedColor("navy", 0x000080.rgb)
		public val oldLace: NamedColor = NamedColor("oldlace", 0xFDF5E6.rgb)
		public val olive: NamedColor = NamedColor("olive", 0x808000.rgb)
		public val oliveDrab: NamedColor = NamedColor("olivedrab", 0x6B8E23.rgb)
		public val orange: NamedColor = NamedColor("orange", 0xFFA500.rgb)
		public val orangeRed: NamedColor = NamedColor("orangered", 0xFF4500.rgb)
		public val orchid: NamedColor = NamedColor("orchid", 0xDA70D6.rgb)
		public val paleGoldenrod: NamedColor = NamedColor("palegoldenrod", 0xEEE8AA.rgb)
		public val paleGreen: NamedColor = NamedColor("palegreen", 0x98FB98.rgb)
		public val paleTurquoise: NamedColor = NamedColor("paleturquoise", 0xAFEEEE.rgb)
		public val paleVioletRed: NamedColor = NamedColor("palevioletred", 0xDB7093.rgb)
		public val papayaWhip: NamedColor = NamedColor("papayawhip", 0xFFEFD5.rgb)
		public val peachPuff: NamedColor = NamedColor("peachpuff", 0xFFDAB9.rgb)
		public val peru: NamedColor = NamedColor("peru", 0xCD853F.rgb)
		public val pink: NamedColor = NamedColor("pink", 0xFFC0CB.rgb)
		public val plum: NamedColor = NamedColor("plum", 0xDDA0DD.rgb)
		public val powderBlue: NamedColor = NamedColor("powderblue", 0xB0E0E6.rgb)
		public val purple: NamedColor = NamedColor("purple", 0x800080.rgb)
		public val rebeccaPurple: NamedColor = NamedColor("rebeccapurple", 0x663399.rgb)
		public val red: NamedColor = NamedColor("red", 0xFF0000.rgb)
		public val rosyBrown: NamedColor = NamedColor("rosybrown", 0xBC8F8F.rgb)
		public val royalBlue: NamedColor = NamedColor("royalblue", 0x4169E1.rgb)
		public val saddleBrown: NamedColor = NamedColor("saddlebrown", 0x8B4513.rgb)
		public val salmon: NamedColor = NamedColor("salmon", 0xFA8072.rgb)
		public val sandyBrown: NamedColor = NamedColor("sandybrown", 0xF4A460.rgb)
		public val seaGreen: NamedColor = NamedColor("seagreen", 0x2E8B57.rgb)
		public val seashell: NamedColor = NamedColor("seashell", 0xFFF5EE.rgb)
		public val sienna: NamedColor = NamedColor("sienna", 0xA0522D.rgb)
		public val silver: NamedColor = NamedColor("silver", 0xC0C0C0.rgb)
		public val skyBlue: NamedColor = NamedColor("skyblue", 0x87CEEB.rgb)
		public val slateBlue: NamedColor = NamedColor("slateblue", 0x6A5ACD.rgb)
		public val slateGray: NamedColor = NamedColor("slategray", 0x708090.rgb)
		public val slateGrey: NamedColor = NamedColor("slategrey", 0x708090.rgb)
		public val snow: NamedColor = NamedColor("snow", 0xFFFAFA.rgb)
		public val springGreen: NamedColor = NamedColor("springgreen", 0x00FF7F.rgb)
		public val steelBlue: NamedColor = NamedColor("steelblue", 0x4682B4.rgb)
		public val tan: NamedColor = NamedColor("tan", 0xD2B48C.rgb)
		public val teal: NamedColor = NamedColor("teal", 0x008080.rgb)
		public val thistle: NamedColor = NamedColor("thistle", 0xD8BFD8.rgb)
		public val tomato: NamedColor = NamedColor("tomato", 0xFF6347.rgb)
		public val turquoise: NamedColor = NamedColor("turquoise", 0x40E0D0.rgb)
		public val violet: NamedColor = NamedColor("violet", 0xEE82EE.rgb)
		public val wheat: NamedColor = NamedColor("wheat", 0xF5DEB3.rgb)
		public val white: NamedColor = NamedColor("white", 0xFFFFFF.rgb)
		public val whiteSmoke: NamedColor = NamedColor("whitesmoke", 0xF5F5F5.rgb)
		public val yellow: NamedColor = NamedColor("yellow", 0xFFFF00.rgb)
		public val yellowGreen: NamedColor = NamedColor("yellowgreen", 0x9ACD32.rgb)
	}
}


public interface ComponentColor : Color {

	public fun withAlpha(alpha: Number): ComponentColor
}


public interface DynamicColor : Color

private class DynamicColorImpl(value: String) : CssValueImpl(value), DynamicColor


// FIXME VariableColor
@Suppress("FunctionName")
public fun DynamicColor(value: String): DynamicColor =
	DynamicColorImpl(value)


public interface HslColor : ComponentColor {

	public val alpha: Number
	public val hue: Number // FIXME Angle
	public val lightness: Percentage
	public val saturation: Percentage


	override fun withAlpha(alpha: Number): HslColor
}

private class HslColorImpl(
	override val alpha: Number,
	override val hue: Number,
	override val lightness: Percentage,
	override val saturation: Percentage,
) : CssValueImpl(hslToString(hue, saturation, lightness, alpha)), HslColor {

	override fun withAlpha(alpha: Number) =
		if (alpha == this.alpha) this
		else HslColorImpl(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)
}


@Suppress("FunctionName")
public fun HslColor(
	hue: Number,
	saturation: Percentage,
	lightness: Percentage,
	alpha: Number = 1,
): HslColor =
	HslColorImpl(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)


public interface NamedColor : ComponentColor {

	public val name: String
	public val rgbColor: RgbColor

	override fun withAlpha(alpha: Number): RgbColor
}

private class NamedColorImpl(
	override val name: String,
	override val rgbColor: RgbColor,
) : CssValueImpl(name), NamedColor {

	override fun withAlpha(alpha: Number) =
		rgbColor.withAlpha(alpha)
}


@Suppress("FunctionName")
public fun NamedColor(name: String, rgbColor: RgbColor): NamedColor =
	NamedColorImpl(name = name, rgbColor = rgbColor)


public interface RgbColor : ComponentColor {

	public val alpha: Number
	public val blue: Int
	public val green: Int
	public val red: Int


	override fun withAlpha(alpha: Number): RgbColor
}

private class RgbColorImpl(
	override val alpha: Number,
	override val blue: Int,
	override val green: Int,
	override val red: Int,
) : CssValueImpl(rgbToString(red, green, blue, alpha)), RgbColor {

	override fun withAlpha(alpha: Number) =
		if (alpha == this.alpha) this
		else RgbColorImpl(alpha = alpha, blue = blue, green = green, red = red)
}


@Suppress("FunctionName")
public fun RgbColor(
	red: Int,
	green: Int,
	blue: Int,
	alpha: Number = 1,
): RgbColor =
	RgbColorImpl(alpha = alpha, blue = blue, green = green, red = red)


public inline fun CssDeclarationBlockBuilder.backgroundColor(value: Color) {
	property(CssProperty.backgroundColor, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundColor(value: ColorOrGlobal) {
	property(CssProperty.backgroundColor, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundColor(value: GlobalValue) {
	property(CssProperty.backgroundColor, value)
}


public inline fun CssDeclarationBlockBuilder.backgroundColor(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.backgroundColor, value)
}


public inline fun CssDeclarationBlockBuilder.color(value: Color) {
	property(CssProperty.color, value)
}


public inline fun CssDeclarationBlockBuilder.color(value: ColorOrGlobal) {
	property(CssProperty.color, value)
}


public inline fun CssDeclarationBlockBuilder.color(value: GlobalValue) {
	property(CssProperty.color, value)
}


public inline fun CssDeclarationBlockBuilder.color(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.color, value)
}


public inline fun CssDeclarationBlockBuilder.fill(value: Color) {
	property(CssProperty.fill, value)
}


public inline fun CssDeclarationBlockBuilder.fill(value: ColorOrGlobal) {
	property(CssProperty.fill, value)
}


public inline fun CssDeclarationBlockBuilder.fill(value: GlobalValue) {
	property(CssProperty.fill, value)
}


public inline fun CssDeclarationBlockBuilder.fill(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.fill, value)
}


public inline fun CssDeclarationBlockBuilder.stroke(value: Color) {
	property(CssProperty.stroke, value)
}


public inline fun CssDeclarationBlockBuilder.stroke(value: ColorOrGlobal) {
	property(CssProperty.stroke, value)
}


public inline fun CssDeclarationBlockBuilder.stroke(value: GlobalValue) {
	property(CssProperty.stroke, value)
}


public inline fun CssDeclarationBlockBuilder.stroke(value: CustomCssProperty<out ColorOrGlobal>) {
	property(CssProperty.stroke, value)
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


public inline val Int.rgb: RgbColor
	get() = rgb(alpha = 1)


public inline fun Int.rgb(alpha: Number): RgbColor =
	RgbColor(
		red = (this shr 16) and 0xFF,
		green = (this shr 8) and 0xFF,
		blue = this and 0xFF,
		alpha = alpha
	)


public inline val Int.rgba: RgbColor
	get() = toLong().rgba


public inline val Long.rgba: RgbColor
	get() = RgbColor(
		red = ((this shr 24) and 0xFF).toInt(),
		green = ((this shr 16) and 0xFF).toInt(),
		blue = ((this shr 8) and 0xFF).toInt(),
		alpha = (this and 0xFF) / 255.0,
	)


public inline val CssProperty.Companion.backgroundColor: CssProperty get() = CssProperty("backgroundColor")
public inline val CssProperty.Companion.color: CssProperty get() = CssProperty("color")
public inline val CssProperty.Companion.fill: CssProperty get() = CssProperty("fill")
public inline val CssProperty.Companion.stroke: CssProperty get() = CssProperty("stroke")
