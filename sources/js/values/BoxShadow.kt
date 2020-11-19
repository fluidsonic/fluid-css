@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface BoxShadow : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: BoxShadow = raw("none")


		public inline fun build(values: BoxShadowBuilder.() -> Unit): BoxShadow =
			with(BoxShadowBuilder.default().apply(values)) { Unit.build() }


		public fun combine(vararg values: Single): BoxShadow =
			when (values.size) {
				1 -> values.first()
				0 -> CssValue.initial
				else -> raw(values.joinToString(","))
			}


		public fun raw(value: String): BoxShadow =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(
			offsetX: Length = Length.zero,
			offsetY: Length = Length.zero,
			isInset: Boolean = false,
			blurRadius: Length? = null,
			spreadRadius: Length? = null,
			color: Color? = null,
		): Single =
			GenericValue(buildString {
				if (isInset)
					append("inset ")

				append(offsetX)
				append(" ")
				append(offsetY)

				if (blurRadius != null) {
					append(" ")
					append(blurRadius)
				}
				if (spreadRadius != null) {
					if (blurRadius == null) append(" 0")
					append(" ")
					append(spreadRadius)
				}
				if (color != null) {
					append(" ")
					append(color)
				}
			})
	}


	public interface Single : BoxShadow


	public interface Variable : BoxShadow, CssVariable<BoxShadow>
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
	get() = CssProperty("box-shadow")
