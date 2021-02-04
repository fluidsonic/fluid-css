package io.fluidsonic.css


public interface Keyframes {

	public val frames: Array<out Keyframe>
	public val name: String


	public companion object {

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
