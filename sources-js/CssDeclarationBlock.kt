package io.fluidsonic.css


// FIXME find better name -- see https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframesRule
public interface CssDeclarationBlock {

	public val declarations: Array<out CssDeclaration>


	public interface Hierarchical : CssDeclarationBlock {

		public val children: Array<out CssRule>
	}


	public companion object {

		public fun default(declarations: Array<out CssDeclaration>): CssDeclarationBlock =
			Default(declarations = declarations.copyOf())


		public fun default(declarations: Array<out CssDeclaration>, children: Array<out CssRule>): Hierarchical =
			DefaultHierarchical(children = children.copyOf(), declarations = declarations.copyOf())
	}


	private class Default(
		override val declarations: Array<out CssDeclaration>,
	) : CssDeclarationBlock {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}


	private class DefaultHierarchical(
		override val children: Array<out CssRule>,
		override val declarations: Array<out CssDeclaration>,
	) : Hierarchical {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}
}
