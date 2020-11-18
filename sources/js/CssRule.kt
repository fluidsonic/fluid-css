package io.fluidsonic.css


public interface CssRule {

	public val declarations: CssDeclarationBlock
	public val selector: CssSelector


	public interface Hierarchical : CssRule {

		override val declarations: CssDeclarationBlock.Hierarchical
	}


	public companion object {

		public fun default(selector: CssSelector, declarations: CssDeclarationBlock): CssRule =
			Default(declarations = declarations, selector = selector)


		public fun default(selector: CssSelector, declarations: CssDeclarationBlock.Hierarchical): Hierarchical =
			DefaultHierarchical(declarations = declarations, selector = selector)
	}


	private class Default(
		override val declarations: CssDeclarationBlock,
		override val selector: CssSelector,
	) : CssRule {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}


	private class DefaultHierarchical(
		override val declarations: CssDeclarationBlock.Hierarchical,
		override val selector: CssSelector,
	) : Hierarchical {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}
}
