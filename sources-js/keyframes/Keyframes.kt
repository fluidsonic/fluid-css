package io.fluidsonic.css


/** Defines a `@keyframes` animation. */
public interface Keyframes {

	/** The individual keyframes of this animation. */
	public val frames: Array<out Keyframe>

	/** The name of this animation. */
	public val name: String


	public companion object {

		/** Creates a [Keyframes] with the given [name] and [frames]. */
		public fun default(name: String, frames: Array<out Keyframe>): Keyframes =
			Default(name = name, frames = frames.copyOf())
	}


	private class Default(
		override val frames: Array<out Keyframe>,
		override val name: String,
	) : Keyframes {

		override fun toString() =
			CssPrinter.default().print(this)
	}
}
