@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Background : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : Background {

		public companion object;


		@JsName("0;0")
		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : Background, CssVariable<Background>
}


@CssDsl
public inline val Background.Companion.none: Background
	get() = unsafe("none")


// FIXME check
public inline fun Background.Companion.combine(vararg values: Background.Single): Background =
	when (values.size) {
		1 -> values[0]
		0 -> CssValue.initial
		else -> unsafe(values.join())
	}


public inline fun Background.Companion.unsafe(value: String): Background =
	CssValue.unsafe(value)


public inline fun Background.Companion.variable(name: String): Background.Variable =
	CssVariable.unsafe(name)


@kotlin.internal.LowPriorityInOverloadResolution
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
public inline fun Background.Companion.with(
	color: Color? = null,
	image: CssImage? = null,
	x: BackgroundPositionX? = null,
	y: BackgroundPositionY? = null,
	size: BackgroundSize? = null,
	repeat: BackgroundRepeat? = null,
	attachment: BackgroundAttachment? = null,
	origin: BackgroundOrigin? = null,
	clip: BackgroundClip? = null,
): Background.Single =
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


public inline fun Background.Single.Companion.unsafe(value: String): Background.Single =
	CssValue.unsafe(value)


public inline fun Background.Single.Companion.variable(name: String): Background.Single.Variable =
	CssVariable.unsafe(name)


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
