package io.fluidsonic.css


// FIXME find better name -- see https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframesRule
public interface CssDeclarationBlock {

	public val declarations: List<CssDeclaration>


	public interface Hierarchical : CssDeclarationBlock {

		public val children: List<CssRule>
	}


	public companion object {

		public fun default(declarations: List<CssDeclaration>): CssDeclarationBlock =
			Default(declarations = declarations.toList())


		public fun default(declarations: List<CssDeclaration>, children: List<CssRule>): Hierarchical =
			DefaultHierarchical(children = children.toList(), declarations = declarations.toList())
	}


	private class Default(
		override val declarations: List<CssDeclaration>,
	) : CssDeclarationBlock {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}


	private class DefaultHierarchical(
		override val children: List<CssRule>,
		override val declarations: List<CssDeclaration>,
	) : Hierarchical {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}
}
