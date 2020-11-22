@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Background : CssValue, Internal {

	public companion object {

		@CssDsl
		public val none: Background = raw("none")


		public fun combine(vararg values: Single): Background =
			when (values.size) {
				1 -> values.first()
				0 -> CssValue.initial
				else -> raw(values.joinToString(","))
			}


		public fun raw(value: String): Background =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(
			color: Color? = null,
			image: CssImage? = null,
			position: BackgroundPosition? = null,
			size: BackgroundSize? = null,
			repeat: BackgroundRepeat? = null,
			attachment: BackgroundAttachment? = null,
			origin: BackgroundOrigin? = null,
			clip: BackgroundClip? = null,
		): Single =
			if (
				color != null ||
				image != null ||
				position != null ||
				size != null ||
				repeat != null ||
				attachment != null ||
				origin != null ||
				clip != null
			)
				GenericValue(buildString {
					if (color != null)
						append(color)

					if (image != null) {
						if (isNotEmpty()) append(" ")
						append(image)
					}
					if (position != null) {
						if (isNotEmpty()) append(" ")
						append(position)
					}
					if (size != null) {
						if (position == null) {
							if (isNotEmpty()) append(" ")
							append("0% 0%")
						}
						append("/")
						append(size)
					}
					if (repeat != null) {
						if (isNotEmpty()) append(" ")
						append(repeat)
					}
					if (attachment != null) {
						if (isNotEmpty()) append(" ")
						append(attachment)
					}
					if (origin != null) {
						if (isNotEmpty()) append(" ")
						append(origin)
						if (clip == null) append(BackgroundClip.borderBox)
					}
					if (clip != null) {
						if (origin == null) {
							if (isNotEmpty()) append(" ")
							append(BackgroundOrigin.paddingBox)
						}
						append(" ")
						append(clip)
					}
				})
			else
				CssValue.initial


		@kotlin.internal.LowPriorityInOverloadResolution
		@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
		public fun with(
			color: Color? = null,
			image: CssImage? = null,
			x: BackgroundPositionX? = null,
			y: BackgroundPositionY? = null,
			size: BackgroundSize? = null,
			repeat: BackgroundRepeat? = null,
			attachment: BackgroundAttachment? = null,
			origin: BackgroundOrigin? = null,
			clip: BackgroundClip? = null,
		): Single =
			with(
				color = color,
				image = image,
				position = when (x != null || y != null) {
					true -> BackgroundPosition.of(x = x, y = y)
					false -> null
				},
				size = size,
				repeat = repeat,
				attachment = attachment,
				origin = origin,
				clip = clip,
			)
	}


	public interface Single : Background


	public interface Variable : Background, CssVariable<Background>
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.background(value: Background) {
	property(background, value)
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.background(value: Background.Single) {
	property(background, value)
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.background(vararg values: Background.Single) {
	background(Background.combine(*values))
}


@CssDsl
public fun CssDeclarationBlockBuilder.background(
	color: Color? = null,
	image: CssImage? = null,
	position: BackgroundPosition? = null,
	size: BackgroundSize? = null,
	repeat: BackgroundRepeat? = null,
	attachment: BackgroundAttachment? = null,
	origin: BackgroundOrigin? = null,
	clip: BackgroundClip? = null,
) {
	background(Background.with(
		color = color,
		image = image,
		position = position,
		size = size,
		repeat = repeat,
		attachment = attachment,
		origin = origin,
		clip = clip,
	))
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public fun CssDeclarationBlockBuilder.background(
	color: Color? = null,
	image: CssImage? = null,
	x: BackgroundPositionX? = null,
	y: BackgroundPositionY? = null,
	size: BackgroundSize? = null,
	repeat: BackgroundRepeat? = null,
	attachment: BackgroundAttachment? = null,
	origin: BackgroundOrigin? = null,
	clip: BackgroundClip? = null,
) {
	background(Background.with(
		color = color,
		image = image,
		x = x,
		y = y,
		size = size,
		repeat = repeat,
		attachment = attachment,
		origin = origin,
		clip = clip,
	))
}


@Suppress("unused")
public val CssProperties.background: CssProperty<Background>
	get() = CssProperty("background")
