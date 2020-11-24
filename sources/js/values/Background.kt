@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Background : CssValue {

	@Suppress(
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION",
		"WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER"
	)
	public companion object {

		@CssDsl
		public inline val none: Background
			get() = unsafe("none")


		// FIXME check
		public inline fun combine(vararg values: Single): Background =
			when (values.size) {
				1 -> values[0]
				0 -> CssValue.initial
				else -> unsafe(values.join())
			}


		public inline fun unsafe(value: String): Background =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		@kotlin.internal.LowPriorityInOverloadResolution
		@Suppress("DEPRECATION", "INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
		public inline fun with(
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


	public interface Single : Background {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : Background, CssVariable<Background>
}


@Suppress("DEPRECATION")
public inline fun Background.Companion.with(
	color: Color? = null,
	image: CssImage? = null,
	position: BackgroundPosition? = null,
	size: BackgroundSize? = null,
	repeat: BackgroundRepeat? = null,
	attachment: BackgroundAttachment? = null,
	origin: BackgroundOrigin? = null,
	clip: BackgroundClip? = null,
): Background.Single =
	if (
		color != null ||
		image != null ||
		position != null ||
		size != null ||
		repeat != null ||
		attachment != null ||
		origin != null ||
		clip != null
	) {
		var string = ""

		if (color != null)
			string += color

		if (image != null) {
			if (string.isNotEmpty()) string += " "
			string += image
		}
		if (position != null) {
			if (string.isNotEmpty()) string += " "
			string += position
		}
		if (size != null) {
			if (position == null) {
				if (string.isNotEmpty()) string += " "
				string += "0% 0%"
			}
			string += "/"
			string += size
		}
		if (repeat != null) {
			if (string.isNotEmpty()) string += " "
			string += repeat
		}
		if (attachment != null) {
			if (string.isNotEmpty()) string += " "
			string += attachment
		}
		if (origin != null) {
			if (string.isNotEmpty()) string += " "
			string += origin
			if (clip == null) string += BackgroundClip.borderBox
		}
		if (clip != null) {
			if (origin == null) {
				if (string.isNotEmpty()) string += " "
				string += BackgroundOrigin.paddingBox
			}
			string += " "
			string += clip
		}

		Background.Single.unsafe(string)
	}
	else
		CssValue.initial


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.background(value: Background) {
	property(background, value)
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.background(value: Background.Single) {
	property(background, value)
}


@CssDsl
@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun CssDeclarationBlockBuilder.background(vararg values: Background.Single) {
	background(Background.combine(*values))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.background(
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
public inline fun CssDeclarationBlockBuilder.background(
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
public inline val CssProperties.background: CssProperty<Background>
	get() = CssProperty.unsafe("background")
