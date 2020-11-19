package io.fluidsonic.css


public interface FontFace {

	public val declarations: CssDeclarationBlock


	public companion object {

		public fun default(declarations: CssDeclarationBlock): FontFace =
			Default(declarations = declarations)
	}


	private class Default(override val declarations: CssDeclarationBlock) : FontFace {

		override fun toString() =
			CssPrinter.default().print(this)
	}


	public interface Display {

		override fun toString(): String


		public companion object {

			public val auto: Display = raw("auto")
			public val block: Display = raw("block")
			public val fallback: Display = raw("fallback")
			public val optional: Display = raw("optional")
			public val swap: Display = raw("swap")


			public fun raw(value: String): Display =
				Default(value)
		}


		private class Default(val value: String) : Display {

			override fun toString(): String =
				value
		}
	}


	public interface FeatureSettings {

		override fun toString(): String


		public companion object {

			public val normal: FeatureSettings = raw("normal")


			public fun combine(vararg values: FeatureSettings): FeatureSettings =
				raw(values.joinToString(","))


			public fun set(tag: String, value: Boolean): FeatureSettings =
				raw("$tag ${if (value) "on" else "off"}")


			public fun set(tag: String, value: Int): FeatureSettings =
				raw("$tag $value")


			public fun raw(value: String): FeatureSettings =
				Default(value)
		}


		private class Default(val value: String) : FeatureSettings {

			override fun toString(): String =
				value
		}
	}


	public interface Format {

		override fun toString(): String


		public companion object {

			public val woff: Format = raw("woff")
			public val woff2: Format = raw("woff2")
			public val trueType: Format = raw("truetype")
			public val openType: Format = raw("opentype")
			public val embeddedOpenType: Format = raw("embedded-opentype")
			public val svg: Format = raw("svg")


			public fun raw(value: String): Format =
				Default(value)
		}


		private class Default(val value: String) : Format {

			override fun toString(): String =
				value
		}
	}


	public interface Source {

		override fun toString(): String


		public companion object {

			public fun combine(vararg values: Source): Source =
				raw(values.joinToString(","))


			public fun local(family: String): Source =
				raw("local('$family')")


			public fun url(url: String, vararg formats: Format): Source =
				raw(buildString {
					append("url('")
					append(url)
					append("')")

					for (format in formats) {
						append(" format('")
						append(format)
						append("')")
					}
				})


			public fun raw(value: String): Source =
				Default(value)
		}


		private class Default(val value: String) : Source {

			override fun toString(): String =
				value
		}
	}


	public interface Stretch {

		override fun toString(): String


		public companion object {

			public val normal: Stretch = raw("normal")
			public val ultraCondensed: Stretch = raw("ultra-condensed")
			public val extraCondensed: Stretch = raw("extra-condensed")
			public val condensed: Stretch = raw("condensed")
			public val semiCondensed: Stretch = raw("semi-condensed")
			public val semiExpanded: Stretch = raw("semi-expanded")
			public val expanded: Stretch = raw("expanded")
			public val extraExpanded: Stretch = raw("extra-expanded")
			public val ultraExpanded: Stretch = raw("ultra-expanded")


			public fun range(from: Stretch, to: Stretch): Stretch =
				raw("$from $to")


			public fun raw(value: String): Stretch =
				Default(value)
		}


		private class Default(val value: String) : Stretch {

			override fun toString(): String =
				value
		}
	}


	public interface Style {

		override fun toString(): String


		public companion object {

			public val normal: Style = raw("normal")
			public val italic: Style = raw("italic")
			public val oblique: Style = raw("extra-condensed")


			public fun oblique(angle: Angle): Style =
				raw("oblique $angle")


			public fun oblique(fromAngle: Angle, toAngle: Angle): Style =
				raw("oblique $fromAngle $toAngle")


			public fun raw(value: String): Style =
				Default(value)
		}


		private class Default(val value: String) : Style {

			override fun toString(): String =
				value
		}
	}


	public interface UnicodeRange {

		override fun toString(): String


		public companion object {

			public fun raw(value: String): UnicodeRange =
				Default(value)
		}


		private class Default(val value: String) : UnicodeRange {

			override fun toString(): String =
				value
		}
	}


	public interface Variant {

		override fun toString(): String


		public companion object {

			public val none: Variant = raw("none")
			public val normal: Variant = raw("normal")


			public fun raw(value: String): Variant =
				Default(value)
		}


		private class Default(val value: String) : Variant {

			override fun toString(): String =
				value
		}
	}


	public interface VariationSettings {

		override fun toString(): String


		public companion object {

			public val normal: VariationSettings = raw("normal")


			public fun combine(vararg values: VariationSettings): VariationSettings =
				raw(values.joinToString(","))


			public fun set(tag: String, value: Number): VariationSettings =
				raw("$tag $value")


			public fun raw(value: String): VariationSettings =
				Default(value)
		}


		private class Default(val value: String) : VariationSettings {

			override fun toString(): String =
				value
		}
	}


	public interface Weight {

		override fun toString(): String


		public companion object {

			public val bold: Weight = raw("bold")
			public val normal: Weight = raw("normal")
			public val w100: Weight = with(100)
			public val w200: Weight = with(200)
			public val w300: Weight = with(300)
			public val w400: Weight = with(400)
			public val w500: Weight = with(500)
			public val w600: Weight = with(600)
			public val w700: Weight = with(700)
			public val w800: Weight = with(800)
			public val w900: Weight = with(900)


			public fun range(from: Weight, to: Weight): Weight =
				raw("$from $to")


			public fun with(value: Number): Weight =
				raw(value.toString())


			public fun raw(value: String): Weight =
				Default(value)
		}


		private class Default(val value: String) : Weight {

			override fun toString(): String =
				value
		}
	}
}
