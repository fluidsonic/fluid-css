package io.fluidsonic.css


public interface Keyframes {

	public val frames: List<Keyframe>
	public val name: String


	public companion object {

		public fun default(name: String, frames: List<Keyframe>): Keyframes =
			Default(name = name, frames = frames.toList())
	}


	private class Default(
		override val frames: List<Keyframe>,
		override val name: String,
	) : Keyframes {

		override fun toString() =
			CssPrinter.default().print(this)
	}
}
