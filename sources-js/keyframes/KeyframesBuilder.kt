package io.fluidsonic.css


@CssDsl
public interface KeyframesBuilder {

	public fun frame(value: Keyframe)

	public fun KeyframesBuilder.frame(key: String, style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(Keyframe.default(
			key = key,
			style = with(CssDeclarationBlockBuilder.default().apply(style)) { Unit.build() }
		))
	}

	public fun Unit.build(): Keyframes


	// TODO Move to extension once we have multiple receivers.
	@CssDsl
	public operator fun Percentage.invoke(style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(key = asString(), style)
	}


	public companion object {

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


@CssDsl
public fun KeyframesBuilder.from(style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "from", style)
}


@CssDsl
public fun KeyframesBuilder.to(style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "to", style)
}
