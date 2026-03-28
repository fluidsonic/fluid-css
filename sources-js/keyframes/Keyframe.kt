package io.fluidsonic.css


/** A single keyframe within a `@keyframes` animation. */
public interface Keyframe {

	/** The keyframe selector (e.g. `from`, `to`, or a percentage). */
	public val key: String

	/** The CSS declarations for this keyframe. */
	public val style: CssDeclarationBlock


	public companion object {

		/** Creates a [Keyframe] with the given [key] and [style]. */
		public fun default(key: String, style: CssDeclarationBlock): Keyframe =
			Default(key = key, style = style)
	}


	private class Default(
		override val key: String,
		override val style: CssDeclarationBlock,
	) : Keyframe {

		override fun toString() =
			CssPrinter.default().print(this)
	}
}
