@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface BoxShadowBuilder {

	@CssDsl
	public fun add(value: BoxShadow.Single)

	public fun Unit.build(): BoxShadow


	public companion object {

		public fun default(): BoxShadowBuilder =
			Default()
	}


	private class Default : BoxShadowBuilder {

		private var value = ""


		override fun add(value: BoxShadow.Single) {
			if (this.value.isNotEmpty())
				this.value += ","

			this.value += value
		}


		override fun Unit.build(): BoxShadow =
			BoxShadow.raw(value)
	}
}


@CssDsl
public fun BoxShadowBuilder.add(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	add(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = false,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}


@CssDsl
public fun BoxShadowBuilder.addInset(
	offsetX: Length = Length.zero,
	offsetY: Length = Length.zero,
	blurRadius: Length? = null,
	spreadRadius: Length? = null,
	color: Color? = null,
) {
	add(BoxShadow.with(
		blurRadius = blurRadius,
		color = color,
		isInset = true,
		offsetX = offsetX,
		offsetY = offsetY,
		spreadRadius = spreadRadius,
	))
}
