@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


/** Represents a CSS `@font-face` rule. */
@JsName("0;0")
public external interface FontFace {

	/** The CSS declarations within this font face rule. */
	public val declarations: CssDeclarationBlock


	public companion object;


	/** The `font-display` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Display : CssValue {

		public companion object
	}


	/** The `font-feature-settings` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface FeatureSettings : CssValue {

		public companion object
	}


	/** A font format identifier (e.g. `woff2`, `truetype`). */
	@JsName("0;0")
	public interface Format : CssValue {

		public companion object
	}


	/** The `src` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Source : CssValue {

		public companion object
	}


	/** The `font-stretch` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Stretch : CssValue {

		public companion object
	}


	/** The `font-style` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Style : CssValue {

		public companion object
	}


	/** The `unicode-range` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface UnicodeRange : CssValue {

		public companion object
	}


	/** The `font-variant` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Variant : CssValue {

		public companion object
	}


	/** The `font-variation-settings` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface VariationSettings : CssValue {

		public companion object
	}


	/** The `font-weight` descriptor for a `@font-face` rule. */
	@JsName("0;0")
	public interface Weight : CssValue {

		public companion object
	}
}


/** Creates a [FontFace] with the given [declarations]. */
public inline fun FontFace.Companion.default(declarations: CssDeclarationBlock): FontFace =
	DefaultFontFace(declarations = declarations)


/** The `auto` font display strategy. */
@CssDsl
public inline val FontFace.Display.Companion.auto: FontFace.Display
	get() = unsafe("auto")

/** The `block` font display strategy. */
@CssDsl
public inline val FontFace.Display.Companion.block: FontFace.Display
	get() = unsafe("block")

/** The `fallback` font display strategy. */
@CssDsl
public inline val FontFace.Display.Companion.fallback: FontFace.Display
	get() = unsafe("fallback")

/** The `optional` font display strategy. */
@CssDsl
public inline val FontFace.Display.Companion.optional: FontFace.Display
	get() = unsafe("optional")

/** The `swap` font display strategy. */
@CssDsl
public inline val FontFace.Display.Companion.swap: FontFace.Display
	get() = unsafe("swap")


/** Creates a [FontFace.Display] from an unchecked [value] string. */
public inline fun FontFace.Display.Companion.unsafe(value: String): FontFace.Display =
	CssValue.unsafe(value)


/** The `embedded-opentype` font format. */
@CssDsl
public inline val FontFace.Format.Companion.embeddedOpenType: FontFace.Format
	get() = unsafe("embedded-opentype")

/** The `opentype` font format. */
@CssDsl
public inline val FontFace.Format.Companion.openType: FontFace.Format
	get() = unsafe("opentype")

/** The `svg` font format. */
@CssDsl
public inline val FontFace.Format.Companion.svg: FontFace.Format
	get() = unsafe("svg")

/** The `truetype` font format. */
@CssDsl
public inline val FontFace.Format.Companion.trueType: FontFace.Format
	get() = unsafe("truetype")

/** The `woff` font format. */
@CssDsl
public inline val FontFace.Format.Companion.woff: FontFace.Format
	get() = unsafe("woff")

/** The `woff2` font format. */
@CssDsl
public inline val FontFace.Format.Companion.woff2: FontFace.Format
	get() = unsafe("woff2")


/** Creates a [FontFace.Format] from an unchecked [value] string. */
public inline fun FontFace.Format.Companion.unsafe(value: String): FontFace.Format =
	CssValue.unsafe(value)


/** The `normal` font feature settings value. */
@CssDsl
public inline val FontFace.FeatureSettings.Companion.normal: FontFace.FeatureSettings
	get() = unsafe("normal")


// FIXME check
/** Combines multiple [FontFace.FeatureSettings] values. */
public inline fun FontFace.FeatureSettings.Companion.combine(vararg values: FontFace.FeatureSettings): FontFace.FeatureSettings =
	unsafe(values.join())


/** Sets a font feature [tag] to on or off. */
public inline fun FontFace.FeatureSettings.Companion.set(tag: String, value: Boolean): FontFace.FeatureSettings =
	unsafe("$tag ${if (value) "on" else "off"}")


/** Sets a font feature [tag] to an integer [value]. */
public inline fun FontFace.FeatureSettings.Companion.et(tag: String, value: Int): FontFace.FeatureSettings =
	unsafe("$tag $value")


/** Creates a [FontFace.FeatureSettings] from an unchecked [value] string. */
public inline fun FontFace.FeatureSettings.Companion.unsafe(value: String): FontFace.FeatureSettings =
	CssValue.unsafe(value)


/** Combines multiple [FontFace.Source] values. */
public inline fun FontFace.Source.Companion.combine(vararg values: FontFace.Source): FontFace.Source =
	unsafe(values.join())


/** Creates a `local()` font source referencing an installed [family]. */
public inline fun FontFace.Source.Companion.local(family: String): FontFace.Source =
	unsafe("local('$family')")


/** Creates a [FontFace.Source] from an unchecked [value] string. */
public inline fun FontFace.Source.Companion.unsafe(value: String): FontFace.Source =
	CssValue.unsafe(value)


/** Creates a `url()` font source with optional [formats]. */
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


/** The `normal` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.normal: FontFace.Stretch
	get() = unsafe("normal")

/** The `ultra-condensed` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.ultraCondensed: FontFace.Stretch
	get() = unsafe("ultra-condensed")

/** The `extra-condensed` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.extraCondensed: FontFace.Stretch
	get() = unsafe("extra-condensed")

/** The `condensed` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.condensed: FontFace.Stretch
	get() = unsafe("condensed")

/** The `semi-condensed` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.semiCondensed: FontFace.Stretch
	get() = unsafe("semi-condensed")

/** The `semi-expanded` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.semiExpanded: FontFace.Stretch
	get() = unsafe("semi-expanded")

/** The `expanded` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.expanded: FontFace.Stretch
	get() = unsafe("expanded")

/** The `extra-expanded` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.extraExpanded: FontFace.Stretch
	get() = unsafe("extra-expanded")

/** The `ultra-expanded` font stretch value. */
@CssDsl
public inline val FontFace.Stretch.Companion.ultraExpanded: FontFace.Stretch
	get() = unsafe("ultra-expanded")


/** Creates a font stretch range from [from] to [to]. */
public inline fun FontFace.Stretch.Companion.range(from: FontFace.Stretch, to: FontFace.Stretch): FontFace.Stretch =
	unsafe("$from $to")


/** Creates a [FontFace.Stretch] from an unchecked [value] string. */
public inline fun FontFace.Stretch.Companion.unsafe(value: String): FontFace.Stretch =
	CssValue.unsafe(value)


/** The `normal` font style value. */
@CssDsl
public inline val FontFace.Style.Companion.normal: FontFace.Style
	get() = unsafe("normal")

/** The `italic` font style value. */
@CssDsl
public inline val FontFace.Style.Companion.italic: FontFace.Style
	get() = unsafe("italic")

/** The `oblique` font style value. */
@CssDsl
public inline val FontFace.Style.Companion.oblique: FontFace.Style
	get() = unsafe("extra-condensed")


/** Creates an `oblique` font style with a specific [angle]. */
@CssDsl
public inline fun FontFace.Style.Companion.oblique(angle: Angle): FontFace.Style =
	unsafe("oblique $angle")


/** Creates an `oblique` font style with an angle range from [fromAngle] to [toAngle]. */
@CssDsl
public inline fun FontFace.Style.Companion.oblique(fromAngle: Angle, toAngle: Angle): FontFace.Style =
	unsafe("oblique $fromAngle $toAngle")


/** Creates a [FontFace.Style] from an unchecked [value] string. */
public inline fun FontFace.Style.Companion.unsafe(value: String): FontFace.Style =
	CssValue.unsafe(value)


/** Creates a [FontFace.UnicodeRange] from an unchecked [value] string. */
public inline fun FontFace.UnicodeRange.Companion.unsafe(value: String): FontFace.UnicodeRange =
	CssValue.unsafe(value)


/** The `none` font variant value. */
@CssDsl
public inline val FontFace.Variant.Companion.none: FontFace.Variant
	get() = unsafe("none")

/** The `normal` font variant value. */
@CssDsl
public inline val FontFace.Variant.Companion.normal: FontFace.Variant
	get() = unsafe("normal")


/** Creates a [FontFace.Variant] from an unchecked [value] string. */
public inline fun FontFace.Variant.Companion.unsafe(value: String): FontFace.Variant =
	CssValue.unsafe(value)


/** The `normal` font variation settings value. */
@CssDsl
public inline val FontFace.VariationSettings.Companion.normal: FontFace.VariationSettings
	get() = unsafe("normal")


/** Combines multiple [FontFace.VariationSettings] values. */
public inline fun FontFace.VariationSettings.Companion.combine(vararg values: FontFace.VariationSettings): FontFace.VariationSettings =
	unsafe(values.join())


/** Sets a font variation [tag] to a [Double] [value]. */
public inline fun FontFace.VariationSettings.Companion.set(tag: String, value: Double): FontFace.VariationSettings =
	unsafe("$tag $value")


/** Sets a font variation [tag] to an [Int] [value]. */
public inline fun FontFace.VariationSettings.Companion.set(tag: String, value: Int): FontFace.VariationSettings =
	unsafe("$tag $value")


/** Creates a [FontFace.VariationSettings] from an unchecked [value] string. */
public inline fun FontFace.VariationSettings.Companion.unsafe(value: String): FontFace.VariationSettings =
	CssValue.unsafe(value)


/** The `bold` font weight value. */
@CssDsl
public inline val FontFace.Weight.Companion.bold: FontFace.Weight
	get() = unsafe("bold")

/** The `normal` font weight value. */
@CssDsl
public inline val FontFace.Weight.Companion.normal: FontFace.Weight
	get() = unsafe("normal")

/** Font weight `100` (Thin). */
@CssDsl
public inline val FontFace.Weight.Companion.w100: FontFace.Weight
	get() = with(100)

/** Font weight `200` (Extra Light). */
@CssDsl
public inline val FontFace.Weight.Companion.w200: FontFace.Weight
	get() = with(200)

/** Font weight `300` (Light). */
@CssDsl
public inline val FontFace.Weight.Companion.w300: FontFace.Weight
	get() = with(300)

/** Font weight `400` (Normal). */
@CssDsl
public inline val FontFace.Weight.Companion.w400: FontFace.Weight
	get() = with(400)

/** Font weight `500` (Medium). */
@CssDsl
public inline val FontFace.Weight.Companion.w500: FontFace.Weight
	get() = with(500)

/** Font weight `600` (Semi Bold). */
@CssDsl
public inline val FontFace.Weight.Companion.w600: FontFace.Weight
	get() = with(600)

/** Font weight `700` (Bold). */
@CssDsl
public inline val FontFace.Weight.Companion.w700: FontFace.Weight
	get() = with(700)

/** Font weight `800` (Extra Bold). */
@CssDsl
public inline val FontFace.Weight.Companion.w800: FontFace.Weight
	get() = with(800)

/** Font weight `900` (Black). */
@CssDsl
public inline val FontFace.Weight.Companion.w900: FontFace.Weight
	get() = with(900)


/** Creates a font weight range from [from] to [to]. */
public inline fun FontFace.Weight.Companion.range(from: FontFace.Weight, to: FontFace.Weight): FontFace.Weight =
	unsafe("$from $to")


/** Creates a [FontFace.Weight] from a [Double] [value]. */
public inline fun FontFace.Weight.Companion.with(value: Double): FontFace.Weight =
	CssValue.unsafe(value)


/** Creates a [FontFace.Weight] from an [Int] [value]. */
public inline fun FontFace.Weight.Companion.with(value: Int): FontFace.Weight =
	CssValue.unsafe(value)


/** Creates a [FontFace.Weight] from an unchecked [value] string. */
public inline fun FontFace.Weight.Companion.unsafe(value: String): FontFace.Weight =
	CssValue.unsafe(value)


@PublishedApi
internal class DefaultFontFace(override val declarations: CssDeclarationBlock) : FontFace {

	override fun toString() =
		CssPrinter.default().print(this)
}
