@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FontWeightOrGlobal : CssValue
public interface FontWeight : FontWeightOrGlobal {

	public companion object {

		public val bold: FontWeight = FontWeight("bold")
		public val bolder: FontWeight = FontWeight("bolder")
		public val lighter: FontWeight = FontWeight("lighter")
		public val normal: FontWeight = FontWeight("normal")
		public val w100: FontWeight = FontWeight("100")
		public val w200: FontWeight = FontWeight("200")
		public val w300: FontWeight = FontWeight("300")
		public val w400: FontWeight = FontWeight("400")
		public val w500: FontWeight = FontWeight("500")
		public val w600: FontWeight = FontWeight("600")
		public val w700: FontWeight = FontWeight("700")
		public val w800: FontWeight = FontWeight("800")
		public val w900: FontWeight = FontWeight("900")
	}
}


private class FontWeightImpl(value: String) : CssValueImpl(value), FontWeight


@Suppress("FunctionName")
public fun FontWeight(value: Number): FontWeight =
	FontWeightImpl(value.toString())


@Suppress("FunctionName")
public fun FontWeight(value: String): FontWeight =
	FontWeightImpl(value)


public inline fun CssDeclarationBlockBuilder.fontWeight(value: FontWeight) {
	property(CssProperty.fontWeight, value)
}


public inline fun CssDeclarationBlockBuilder.fontWeight(value: FontWeightOrGlobal) {
	property(CssProperty.fontWeight, value)
}


public inline fun CssDeclarationBlockBuilder.fontWeight(value: Number) {
	property(CssProperty.fontWeight, value)
}


public inline fun CssDeclarationBlockBuilder.fontWeight(value: GlobalValue) {
	property(CssProperty.fontWeight, value)
}


public inline fun CssDeclarationBlockBuilder.fontWeight(value: CustomCssProperty<out FontWeightOrGlobal>) {
	property(CssProperty.fontWeight, value)
}


public inline val CssProperty.Companion.fontWeight: CssProperty get() = CssProperty("font-weight")
