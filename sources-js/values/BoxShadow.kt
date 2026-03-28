@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NOTHING_TO_INLINE", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package io.fluidsonic.css


/** Represents a CSS `box-shadow` value. */
@JsName("0;0")
public external interface BoxShadow : CssValue {

	public companion object;


	/** A single `box-shadow` value. */
	@JsName("0;0")
	public interface Single : BoxShadow {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [BoxShadow] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : BoxShadow, CssVariable<BoxShadow>
}


/** The CSS `none` box-shadow value. */
@CssDsl
public inline val BoxShadow.Companion.none: BoxShadow
	get() = unsafe("none")


// FIXME check
/** Builds a [BoxShadow] using the given builder [action]. */
public inline fun BoxShadow.Companion.build(values: BoxShadowBuilder.() -> Unit): BoxShadow =
	BoxShadowBuilder.build(values)


// FIXME check
/** Combines multiple [BoxShadow] values. */
public inline fun BoxShadow.Companion.combine(vararg values: BoxShadow.Single): BoxShadow =
	when (values.size) {
		1 -> values[0]
		0 -> CssValue.initial
		else -> unsafe(values.join())
	}


/** Creates a [BoxShadow] from an unchecked string [value]. */
public inline fun BoxShadow.Companion.unsafe(value: String): BoxShadow =
	CssValue.unsafe(value)


/** Creates a [BoxShadow] backed by a CSS variable with the given [name]. */
public inline fun BoxShadow.Companion.variable(name: String): BoxShadow.Variable =
	CssVariable.unsafe(name)


/** Creates a [BoxShadow.Single] value with the given parameters. */
public inline fun BoxShadow.Companion.with(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	isInset: Boolean = false,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
): BoxShadow.Single {
	var string = ""

	if (isInset)
		string += "inset "

	string += offsetX
	string += " "
	string += offsetY

	if (blurRadius != null) {
		string += " "
		string += blurRadius
	}
	if (spreadRadius != null) {
		if (blurRadius == null) string += " 0"
		string += " "
		string += spreadRadius
	}
	if (color != null) {
		string += " "
		string += color
	}

	return BoxShadow.Single.unsafe(string)
}


/** Creates a [Single] from an unchecked string [value]. */
public inline fun BoxShadow.Single.Companion.unsafe(value: String): BoxShadow.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun BoxShadow.Single.Companion.variable(name: String): BoxShadow.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `box-shadow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadow) {
	property(boxShadow, value)
}


/** Sets the `box-shadow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadow.Single) {
	property(boxShadow, value)
}


/** Sets the `box-shadow` CSS property with multiple values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(vararg values: BoxShadow.Single) {
	boxShadow(BoxShadow.combine(*values))
}


/** Sets the `box-shadow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	boxShadow(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = false,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


/** Sets the `box-shadow-inset` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadowInset(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	boxShadow(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = true,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


/** Sets the `box-shadow` CSS property using a builder. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(values: BoxShadowBuilder.() -> Unit) {
	boxShadow(BoxShadow.build(values))
}


/** The `box-shadow` CSS property. */
@Suppress("unused")
public inline val CssProperties.boxShadow: CssProperty<BoxShadow>
	get() = CssProperty.unsafe("box-shadow")
