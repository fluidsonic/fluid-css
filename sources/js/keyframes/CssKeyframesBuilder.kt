@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface CssKeyframesBuilder {

	public fun frame(value: CssKeyframe)

	public fun CssKeyframesBuilder.frame(key: String, style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(CssKeyframe.default(
			key = key,
			style = with(CssDeclarationBlockBuilder.default().apply(style)) { Unit.build() }
		))
	}

	public fun Unit.build(): CssKeyframes


	// TODO Move to extension once we have multiple receivers.
	@CssDsl
	public operator fun Percentage.invoke(style: CssDeclarationBlockBuilder.() -> Unit) {
		frame(key = toString(), style)
	}


	public companion object {

		public fun default(name: String): CssKeyframesBuilder =
			Default(name = name)
	}


	private class Default(private val name: String) : CssKeyframesBuilder {

		private val frames = mutableListOf<CssKeyframe>()


		override fun frame(value: CssKeyframe) {
			frames += value
		}


		override fun Unit.build(): CssKeyframes =
			CssKeyframes.default(name = name, frames = frames)
	}
}


@CssDsl
public inline fun CssKeyframesBuilder.from(noinline style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "from", style)
}


@CssDsl
public inline fun CssKeyframesBuilder.to(noinline style: CssDeclarationBlockBuilder.() -> Unit) {
	frame(key = "to", style)
}
