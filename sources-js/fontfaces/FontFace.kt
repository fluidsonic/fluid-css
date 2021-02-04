package io.fluidsonic.css


public external interface FontFace {

	public val declarations: CssDeclarationBlock


	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		public inline fun default(declarations: CssDeclarationBlock): FontFace =
			DefaultFontFace(declarations = declarations)
	}


	public interface Display : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val auto: Display
				get() = unsafe("auto")

			@CssDsl
			public inline val block: Display
				get() = unsafe("block")

			@CssDsl
			public inline val fallback: Display
				get() = unsafe("fallback")

			@CssDsl
			public inline val optional: Display
				get() = unsafe("optional")

			@CssDsl
			public inline val swap: Display
				get() = unsafe("swap")


			public inline fun unsafe(value: String): Display =
				CssValue.unsafe(value)
		}
	}


	public interface FeatureSettings : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val normal: FeatureSettings
				get() = unsafe("normal")


			// FIXME check
			public inline fun combine(vararg values: FeatureSettings): FeatureSettings =
				unsafe(values.join())


			public inline fun set(tag: String, value: Boolean): FeatureSettings =
				unsafe("$tag ${if (value) "on" else "off"}")


			public inline fun set(tag: String, value: Int): FeatureSettings =
				unsafe("$tag $value")


			public inline fun unsafe(value: String): FeatureSettings =
				CssValue.unsafe(value)
		}
	}


	public interface Format : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val woff: Format
				get() = unsafe("woff")

			@CssDsl
			public inline val woff2: Format
				get() = unsafe("woff2")

			@CssDsl
			public inline val trueType: Format
				get() = unsafe("truetype")

			@CssDsl
			public inline val openType: Format
				get() = unsafe("opentype")

			@CssDsl
			public inline val embeddedOpenType: Format
				get() = unsafe("embedded-opentype")

			@CssDsl
			public inline val svg: Format
				get() = unsafe("svg")


			public inline fun unsafe(value: String): Format =
				CssValue.unsafe(value)
		}
	}


	public interface Source : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun combine(vararg values: Source): Source =
				unsafe(values.join())


			public inline fun local(family: String): Source =
				unsafe("local('$family')")


			public inline fun unsafe(value: String): Source =
				CssValue.unsafe(value)
		}
	}


	public interface Stretch : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val normal: Stretch
				get() = unsafe("normal")

			@CssDsl
			public inline val ultraCondensed: Stretch
				get() = unsafe("ultra-condensed")

			@CssDsl
			public inline val extraCondensed: Stretch
				get() = unsafe("extra-condensed")

			@CssDsl
			public inline val condensed: Stretch
				get() = unsafe("condensed")

			@CssDsl
			public inline val semiCondensed: Stretch
				get() = unsafe("semi-condensed")

			@CssDsl
			public inline val semiExpanded: Stretch
				get() = unsafe("semi-expanded")

			@CssDsl
			public inline val expanded: Stretch
				get() = unsafe("expanded")

			@CssDsl
			public inline val extraExpanded: Stretch
				get() = unsafe("extra-expanded")

			@CssDsl
			public inline val ultraExpanded: Stretch
				get() = unsafe("ultra-expanded")


			public inline fun range(from: Stretch, to: Stretch): Stretch =
				unsafe("$from $to")


			public inline fun unsafe(value: String): Stretch =
				CssValue.unsafe(value)
		}
	}


	public interface Style : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val normal: Style
				get() = unsafe("normal")

			@CssDsl
			public inline val italic: Style
				get() = unsafe("italic")

			@CssDsl
			public inline val oblique: Style
				get() = unsafe("extra-condensed")


			@CssDsl
			public inline fun oblique(angle: Angle): Style =
				unsafe("oblique $angle")


			@CssDsl
			public inline fun oblique(fromAngle: Angle, toAngle: Angle): Style =
				unsafe("oblique $fromAngle $toAngle")


			public inline fun unsafe(value: String): Style =
				CssValue.unsafe(value)
		}
	}


	public interface UnicodeRange : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): UnicodeRange =
				CssValue.unsafe(value)
		}
	}


	public interface Variant : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val none: Variant
				get() = unsafe("none")

			@CssDsl
			public inline val normal: Variant
				get() = unsafe("normal")


			public inline fun unsafe(value: String): Variant =
				CssValue.unsafe(value)
		}
	}


	public interface VariationSettings : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val normal: VariationSettings
				get() = unsafe("normal")


			public inline fun combine(vararg values: VariationSettings): VariationSettings =
				unsafe(values.join())


			public inline fun set(tag: String, value: Double): VariationSettings =
				unsafe("$tag $value")


			public inline fun set(tag: String, value: Int): VariationSettings =
				unsafe("$tag $value")


			public inline fun unsafe(value: String): VariationSettings =
				CssValue.unsafe(value)
		}
	}


	public interface Weight : CssValue {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			@CssDsl
			public inline val bold: Weight
				get() = unsafe("bold")

			@CssDsl
			public inline val normal: Weight
				get() = unsafe("normal")

			@CssDsl
			public inline val w100: Weight
				get() = with(100)

			@CssDsl
			public inline val w200: Weight
				get() = with(200)

			@CssDsl
			public inline val w300: Weight
				get() = with(300)

			@CssDsl
			public inline val w400: Weight
				get() = with(400)

			@CssDsl
			public inline val w500: Weight
				get() = with(500)

			@CssDsl
			public inline val w600: Weight
				get() = with(600)

			@CssDsl
			public inline val w700: Weight
				get() = with(700)

			@CssDsl
			public inline val w800: Weight
				get() = with(800)

			@CssDsl
			public inline val w900: Weight
				get() = with(900)


			public inline fun range(from: Weight, to: Weight): Weight =
				unsafe("$from $to")


			public inline fun with(value: Double): Weight =
				CssValue.unsafe(value)


			public inline fun with(value: Int): Weight =
				CssValue.unsafe(value)


			public inline fun unsafe(value: String): Weight =
				CssValue.unsafe(value)
		}
	}
}


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


@PublishedApi
internal class DefaultFontFace(override val declarations: CssDeclarationBlock) : FontFace {

	override fun toString() =
		CssPrinter.default().print(this)
}
