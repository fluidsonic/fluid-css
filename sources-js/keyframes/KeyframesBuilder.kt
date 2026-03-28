package io.fluidsonic.css


/** DSL builder for constructing [Keyframes] animations. */
@CssDsl
public interface KeyframesBuilder {

	/** Adds a [Keyframe] to the animation being built. */
	public fun frame(value: Keyframe)

	/** Adds a keyframe with the given [key] and [style] declarations. */
	public fun KeyframesBuilder.frame(key: String, style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(Keyframe.default(
			key = key,
			style = with(CssDeclarationBlockBuilder.default().apply(style)) { Unit.build() }
		))
	}

	/** Builds the [Keyframes] from accumulated frames. */
	public fun Unit.build(): Keyframes


	// TODO Move to extension once we have multiple receivers.
	/** Adds a keyframe at this percentage. */
	@CssDsl
	public operator fun Percentage.invoke(style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(key = asString(), style)
	}


	public companion object {

		/** Creates a default [KeyframesBuilder] for an animation with the given [name]. */
		public fun default(name: String): KeyframesBuilder =
			Default(name = name)
	}


	private class Default(private val name: String) : KeyframesBuilder {

		private val frames = arrayOf<Keyframe>()


		override fun frame(value: Keyframe) {
			frames.push(value)
		}


		override fun Unit.build(): Keyframes =
			Keyframes.default(name = name, frames = frames)
	}
}


/** Adds the `from` keyframe. */
@CssDsl
public fun KeyframesBuilder.from(style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "from", style)
}


/** Adds the `to` keyframe. */
@CssDsl
public fun KeyframesBuilder.to(style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "to", style)
}
