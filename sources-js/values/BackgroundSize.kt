@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


/** Represents a CSS `background-size` value. */
@JsName("0;0")
public external interface BackgroundSize : CssValue {

	public companion object;


	/** A single-axis `background-size` value. */
	@JsName("0;0")
	public interface Axis : BackgroundSize {

		public companion object


		/** A [Axis] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Axis, CssVariable<Axis>
	}


	/** A [BackgroundSize] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BackgroundSize, CssVariable<BackgroundSize>
}


/** Predefined `auto` value. */
@CssDsl
public inline val BackgroundSize.Companion.auto: BackgroundSize.Axis
	get() = BackgroundSize.Axis.auto

/** The CSS `contain` background-size value. */
@CssDsl
public inline val BackgroundSize.Companion.contain: BackgroundSize
	get() = unsafe("contain")

/** The CSS `cover` background-size value. */
@CssDsl
public inline val BackgroundSize.Companion.cover: BackgroundSize
	get() = unsafe("cover")


/** Creates a [BackgroundSize] value. */
public inline fun BackgroundSize.Companion.of(width: BackgroundSize.Axis, height: BackgroundSize.Axis): BackgroundSize =
	unsafe("$width $height")


/** Creates a [BackgroundSize] from an unchecked string [value]. */
public inline fun BackgroundSize.Companion.unsafe(value: String): BackgroundSize =
	CssValue.unsafe(value)


/** Creates a [BackgroundSize] backed by a CSS variable with the given [name]. */
public inline fun BackgroundSize.Companion.variable(name: String): BackgroundSize.Variable =
	CssVariable.unsafe(name)


/** The CSS `auto` axis value. */
@CssDsl
public inline val BackgroundSize.Axis.Companion.auto: BackgroundSize.Axis
	get() = unsafe("auto")


/** Creates a [Axis] from an unchecked string [value]. */
public inline fun BackgroundSize.Axis.Companion.unsafe(value: String): BackgroundSize.Axis =
	CssValue.unsafe(value)


/** Creates a [Axis] backed by a CSS variable with the given [name]. */
public inline fun BackgroundSize.Axis.Companion.variable(name: String): BackgroundSize.Axis.Variable =
	CssVariable.unsafe(name)


/** Sets the `background-size` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(value: BackgroundSize) {
	property(backgroundSize, value)
}


/** Sets the `background-size` CSS property with width and height values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundSize(width: BackgroundSize.Axis, height: BackgroundSize.Axis) {
	backgroundSize(BackgroundSize.of(width = width, height = height))
}


/** The `background-size` CSS property. */
@Suppress("unused")
public inline val CssProperties.backgroundSize: CssProperty<BackgroundSize>
	get() = CssProperty.unsafe("background-size")
