package io.fluidsonic.css


public interface Keyframe {

	public val key: String
	public val style: CssDeclarationBlock


	public companion object {

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
