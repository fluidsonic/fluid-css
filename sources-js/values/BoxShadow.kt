@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface BoxShadow : CssValue {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: BoxShadow
			get() = unsafe("none")


		// FIXME check
		public inline fun build(values: BoxShadowBuilder.() -> Unit): BoxShadow =
			BoxShadowBuilder.build(values)


		// FIXME check
		public inline fun combine(vararg values: Single): BoxShadow =
			when (values.size) {
				1 -> values[0]
				0 -> CssValue.initial
				else -> unsafe(values.join())
			}


		public inline fun unsafe(value: String): BoxShadow =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Single : BoxShadow {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : BoxShadow, CssVariable<BoxShadow>
}


@Suppress("DEPRECATION")
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


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadow) {
	property(boxShadow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(value: BoxShadow.Single) {
	property(boxShadow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(vararg values: BoxShadow.Single) {
	boxShadow(BoxShadow.combine(*values))
}


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


@CssDsl
public inline fun CssDeclarationBlockBuilder.boxShadow(values: BoxShadowBuilder.() -> Unit) {
	boxShadow(BoxShadow.build(values))
}


@Suppress("unused")
public inline val CssProperties.boxShadow: CssProperty<BoxShadow>
	get() = CssProperty.unsafe("box-shadow")
