package io.fluidsonic.css


/** A CSS rule consisting of a selector and a declaration block. */
public interface CssRule {

	/** The declarations within this rule. */
	public val declarations: CssDeclarationBlock

	/** The selector that determines which elements this rule applies to. */
	public val selector: CssSelector


	/** A [CssRule] with a hierarchical declaration block that can contain nested rules. */
	public interface Hierarchical : CssRule {

		override val declarations: CssDeclarationBlock.Hierarchical
	}


	public companion object {

		/** Creates a [CssRule] with the given [selector] and [declarations]. */
		public fun default(selector: CssSelector, declarations: CssDeclarationBlock): CssRule =
			Default(declarations = declarations, selector = selector)


		/** Creates a [Hierarchical] rule with the given [selector] and hierarchical [declarations]. */
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
