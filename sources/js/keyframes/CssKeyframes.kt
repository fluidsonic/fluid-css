package io.fluidsonic.css


public interface CssKeyframes {

	public val frames: List<CssKeyframe>
	public val name: String


	public companion object {

		public fun default(name: String, frames: List<CssKeyframe>): CssKeyframes =
			Default(name = name, frames = frames.toList())
	}


	private class Default(
		override val frames: List<CssKeyframe>,
		override val name: String,
	) : CssKeyframes {

		override fun toString() =
			CssPrinter.default().print(this)
	}
}
