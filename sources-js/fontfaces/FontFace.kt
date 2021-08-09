@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


@JsName("0;0")
public external interface FontFace {

	public val declarations: CssDeclarationBlock


	public companion object;


	@JsName("0;0")
	public interface Display : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface FeatureSettings : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Format : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Source : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Stretch : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Style : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface UnicodeRange : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Variant : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface VariationSettings : CssValue {

		public companion object
	}


	@JsName("0;0")
	public interface Weight : CssValue {

		public companion object
	}
}


public inline fun FontFace.Companion.default(declarations: CssDeclarationBlock): FontFace =
	DefaultFontFace(declarations = declarations)


@CssDsl
public inline val FontFace.Display.Companion.auto: FontFace.Display
	get() = unsafe("auto")

@CssDsl
public inline val FontFace.Display.Companion.block: FontFace.Display
	get() = unsafe("block")

@CssDsl
public inline val FontFace.Display.Companion.fallback: FontFace.Display
	get() = unsafe("fallback")

@CssDsl
public inline val FontFace.Display.Companion.optional: FontFace.Display
	get() = unsafe("optional")

@CssDsl
public inline val FontFace.Display.Companion.swap: FontFace.Display
	get() = unsafe("swap")


public inline fun FontFace.Display.Companion.unsafe(value: String): FontFace.Display =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.Format.Companion.embeddedOpenType: FontFace.Format
	get() = unsafe("embedded-opentype")

@CssDsl
public inline val FontFace.Format.Companion.openType: FontFace.Format
	get() = unsafe("opentype")

@CssDsl
public inline val FontFace.Format.Companion.svg: FontFace.Format
	get() = unsafe("svg")

@CssDsl
public inline val FontFace.Format.Companion.trueType: FontFace.Format
	get() = unsafe("truetype")

@CssDsl
public inline val FontFace.Format.Companion.woff: FontFace.Format
	get() = unsafe("woff")

@CssDsl
public inline val FontFace.Format.Companion.woff2: FontFace.Format
	get() = unsafe("woff2")


public inline fun FontFace.Format.Companion.unsafe(value: String): FontFace.Format =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.FeatureSettings.Companion.normal: FontFace.FeatureSettings
	get() = unsafe("normal")


// FIXME check
public inline fun FontFace.FeatureSettings.Companion.combine(vararg values: FontFace.FeatureSettings): FontFace.FeatureSettings =
	unsafe(values.join())


public inline fun FontFace.FeatureSettings.Companion.set(tag: String, value: Boolean): FontFace.FeatureSettings =
	unsafe("$tag ${if (value) "on" else "off"}")


public inline fun FontFace.FeatureSettings.Companion.et(tag: String, value: Int): FontFace.FeatureSettings =
	unsafe("$tag $value")


public inline fun FontFace.FeatureSettings.Companion.unsafe(value: String): FontFace.FeatureSettings =
	CssValue.unsafe(value)


public inline fun FontFace.Source.Companion.combine(vararg values: FontFace.Source): FontFace.Source =
	unsafe(values.join())


public inline fun FontFace.Source.Companion.local(family: String): FontFace.Source =
	unsafe("local('$family')")


public inline fun FontFace.Source.Companion.unsafe(value: String): FontFace.Source =
	CssValue.unsafe(value)


public inline fun FontFace.Source.Companion.url(url: String, vararg formats: FontFace.Format): FontFace.Source =
	unsafe(buildString {
		append("url('")
		append(url)
		append("')")

		for (format in formats) {
			append(" format('")
			append(format)
			append("')")
		}
	})


@CssDsl
public inline val FontFace.Stretch.Companion.normal: FontFace.Stretch
	get() = unsafe("normal")

@CssDsl
public inline val FontFace.Stretch.Companion.ultraCondensed: FontFace.Stretch
	get() = unsafe("ultra-condensed")

@CssDsl
public inline val FontFace.Stretch.Companion.extraCondensed: FontFace.Stretch
	get() = unsafe("extra-condensed")

@CssDsl
public inline val FontFace.Stretch.Companion.condensed: FontFace.Stretch
	get() = unsafe("condensed")

@CssDsl
public inline val FontFace.Stretch.Companion.semiCondensed: FontFace.Stretch
	get() = unsafe("semi-condensed")

@CssDsl
public inline val FontFace.Stretch.Companion.semiExpanded: FontFace.Stretch
	get() = unsafe("semi-expanded")

@CssDsl
public inline val FontFace.Stretch.Companion.expanded: FontFace.Stretch
	get() = unsafe("expanded")

@CssDsl
public inline val FontFace.Stretch.Companion.extraExpanded: FontFace.Stretch
	get() = unsafe("extra-expanded")

@CssDsl
public inline val FontFace.Stretch.Companion.ultraExpanded: FontFace.Stretch
	get() = unsafe("ultra-expanded")


public inline fun FontFace.Stretch.Companion.range(from: FontFace.Stretch, to: FontFace.Stretch): FontFace.Stretch =
	unsafe("$from $to")


public inline fun FontFace.Stretch.Companion.unsafe(value: String): FontFace.Stretch =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.Style.Companion.normal: FontFace.Style
	get() = unsafe("normal")

@CssDsl
public inline val FontFace.Style.Companion.italic: FontFace.Style
	get() = unsafe("italic")

@CssDsl
public inline val FontFace.Style.Companion.oblique: FontFace.Style
	get() = unsafe("extra-condensed")


@CssDsl
public inline fun FontFace.Style.Companion.oblique(angle: Angle): FontFace.Style =
	unsafe("oblique $angle")


@CssDsl
public inline fun FontFace.Style.Companion.oblique(fromAngle: Angle, toAngle: Angle): FontFace.Style =
	unsafe("oblique $fromAngle $toAngle")


public inline fun FontFace.Style.Companion.unsafe(value: String): FontFace.Style =
	CssValue.unsafe(value)


public inline fun FontFace.UnicodeRange.Companion.unsafe(value: String): FontFace.UnicodeRange =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.Variant.Companion.none: FontFace.Variant
	get() = unsafe("none")

@CssDsl
public inline val FontFace.Variant.Companion.normal: FontFace.Variant
	get() = unsafe("normal")


public inline fun FontFace.Variant.Companion.unsafe(value: String): FontFace.Variant =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.VariationSettings.Companion.normal: FontFace.VariationSettings
	get() = unsafe("normal")


public inline fun FontFace.VariationSettings.Companion.combine(vararg values: FontFace.VariationSettings): FontFace.VariationSettings =
	unsafe(values.join())


public inline fun FontFace.VariationSettings.Companion.set(tag: String, value: Double): FontFace.VariationSettings =
	unsafe("$tag $value")


public inline fun FontFace.VariationSettings.Companion.set(tag: String, value: Int): FontFace.VariationSettings =
	unsafe("$tag $value")


public inline fun FontFace.VariationSettings.Companion.unsafe(value: String): FontFace.VariationSettings =
	CssValue.unsafe(value)


@CssDsl
public inline val FontFace.Weight.Companion.bold: FontFace.Weight
	get() = unsafe("bold")

@CssDsl
public inline val FontFace.Weight.Companion.normal: FontFace.Weight
	get() = unsafe("normal")

@CssDsl
public inline val FontFace.Weight.Companion.w100: FontFace.Weight
	get() = with(100)

@CssDsl
public inline val FontFace.Weight.Companion.w200: FontFace.Weight
	get() = with(200)

@CssDsl
public inline val FontFace.Weight.Companion.w300: FontFace.Weight
	get() = with(300)

@CssDsl
public inline val FontFace.Weight.Companion.w400: FontFace.Weight
	get() = with(400)

@CssDsl
public inline val FontFace.Weight.Companion.w500: FontFace.Weight
	get() = with(500)

@CssDsl
public inline val FontFace.Weight.Companion.w600: FontFace.Weight
	get() = with(600)

@CssDsl
public inline val FontFace.Weight.Companion.w700: FontFace.Weight
	get() = with(700)

@CssDsl
public inline val FontFace.Weight.Companion.w800: FontFace.Weight
	get() = with(800)

@CssDsl
public inline val FontFace.Weight.Companion.w900: FontFace.Weight
	get() = with(900)


public inline fun FontFace.Weight.Companion.range(from: FontFace.Weight, to: FontFace.Weight): FontFace.Weight =
	unsafe("$from $to")


public inline fun FontFace.Weight.Companion.with(value: Double): FontFace.Weight =
	CssValue.unsafe(value)


public inline fun FontFace.Weight.Companion.with(value: Int): FontFace.Weight =
	CssValue.unsafe(value)


public inline fun FontFace.Weight.Companion.unsafe(value: String): FontFace.Weight =
	CssValue.unsafe(value)


@PublishedApi
internal class DefaultFontFace(override val declarations: CssDeclarationBlock) : FontFace {

	override fun toString() =
		CssPrinter.default().print(this)
}
